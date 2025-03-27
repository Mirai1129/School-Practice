#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>
#include <unistd.h>
#include <time.h>


#define BUF_SIZE 12

int In = 0;
int Out = 0;

//delay函數 用來模擬忽快忽慢的行程
void delay() {
    float mTime;
    //亂數取1~3000
    mTime = (rand() % 3000) + 1;
    clock_t goal = mTime + clock();
    while (goal > clock());
}

// 子執行緒函數，消費者行程
void *child() {

    //子執行緒工作，無限迴圈
    while (1) {
        delay();
        while (In == Out) {
            printf("Out:Empty, and Wait...\n");
            //等待兩秒
            sleep(2);
        }
        //NextConsumedItem = Buffer[out];
        //印出目前位置
        printf("In:%d out:%d\n", In, Out);
        //Out++,滿了會回到0最多到11
        Out = (Out + 1) % BUF_SIZE;
    }
    pthread_exit(NULL); // 離開子執行緒
}

// 主程式，生產者行程
int main() {
    pthread_t t; // 宣告 pthread 變數
    pthread_create(&t, NULL, child, NULL); // 建立子執行緒

    // 主執行緒工作，無限迴圈
    while (1) {
        delay();
        while (((In + 1) % BUF_SIZE) == Out) {
            printf("In:Full, and Wait...\n");
            //等待兩秒
            sleep(2);
        }
        //Buffer[In] = NextProducerItem; 因模擬省略
        //印出目前位置
        printf("In:%d out:%d\n", In, Out);
        //In++,滿了會回到0最多到11
        In = (In + 1) % BUF_SIZE;
    }

    pthread_join(t, NULL); // 等待子執行緒執行完成
    return 0;
}
