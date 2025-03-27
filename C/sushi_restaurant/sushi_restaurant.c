#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>
#include <stdlib.h>

#define BUFFER_SIZE 5  // Number of sushi pieces that can be placed on the conveyor belt
#define MAX_ITEMS 20   // Total number of sushi pieces to be made

typedef struct {
    int sushi[BUFFER_SIZE];  // Sushi buffer
    int in;                  // Position to put sushi
    int out;                // Position to take sushi
    sem_t empty;           // Semaphore for counting empty slots
    sem_t full;            // Semaphore for counting filled slots
    pthread_mutex_t mutex; // Mutex lock
} SushiBuffer;

SushiBuffer buffer;

void initBuffer() {
    buffer.in = 0;
    buffer.out = 0;
    sem_init(&buffer.empty, 0, BUFFER_SIZE);
    sem_init(&buffer.full, 0, 0);
    pthread_mutex_init(&buffer.mutex, NULL);
}

void *chef(void *arg) {
    int sushi_count = 0;

    while (sushi_count < MAX_ITEMS) {
        // Wait for empty slot
        sem_wait(&buffer.empty);
        pthread_mutex_lock(&buffer.mutex);

        // Make sushi
        int sushi_type = rand() % 5 + 1; // 5 different types of sushi (1-5)
        buffer.sushi[buffer.in] = sushi_type;
        printf("Chef made sushi #%d (Type: %d)\n", sushi_count + 1, sushi_type);

        buffer.in = (buffer.in + 1) % BUFFER_SIZE;
        sushi_count++;

        pthread_mutex_unlock(&buffer.mutex);
        sem_post(&buffer.full);

        // Sushi preparation takes some time
        usleep(rand() % 500000 + 500000); // 0.5-1 second
    }
    return NULL;
}

void *customer(void *arg) {
    int eaten_count = 0;

    while (eaten_count < MAX_ITEMS) {
        // Wait for sushi
        sem_wait(&buffer.full);
        pthread_mutex_lock(&buffer.mutex);

        // Take sushi
        int sushi_type = buffer.sushi[buffer.out];
        printf("Customer ate sushi (Type: %d)\n", sushi_type);

        buffer.out = (buffer.out + 1) % BUFFER_SIZE;
        eaten_count++;

        pthread_mutex_unlock(&buffer.mutex);
        sem_post(&buffer.empty);

        // Eating takes some time
        usleep(rand() % 1000000 + 1000000); // 1-2 seconds
    }
    return NULL;
}

int main() {
    pthread_t chef_thread, customer_thread;

    // Initialize random seed
    srand(time(NULL));

    // Initialize buffer
    initBuffer();

    // Create chef and customer threads
    pthread_create(&chef_thread, NULL, chef, NULL);
    pthread_create(&customer_thread, NULL, customer, NULL);

    // Wait for threads to finish
    pthread_join(chef_thread, NULL);
    pthread_join(customer_thread, NULL);

    // Cleanup resources
    sem_destroy(&buffer.empty);
    sem_destroy(&buffer.full);
    pthread_mutex_destroy(&buffer.mutex);

    printf("Restaurant is closed!\n");
    return 0;
}
