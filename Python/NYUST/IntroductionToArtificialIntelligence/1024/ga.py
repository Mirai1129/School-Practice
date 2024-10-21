import random
from typing import List, Tuple, Optional

import numpy as np


class GeneticAlgorithm:
    def __init__(
            self,
            pop_size: int,  # Population size
            generations: int,  # Number of generations for the algorithm
            mutation_rate: float,  # Gene mutation rate
            crossover_rate: float,  # Gene crossover rate
            tournament_size: int,  # Tournament size for selection
            elitism: bool,  # Whether to apply elitism strategy
            random_seed: Optional[int],  # Random seed for reproducibility
    ):
        # Students need to set the algorithm parameters
        self.pop_size = pop_size
        self.generations = generations
        self.mutation_rate = mutation_rate
        self.crossover_rate = crossover_rate
        self.tournament_size = tournament_size
        self.elitism = elitism

        if random_seed is not None:
            random.seed(random_seed)
            np.random.seed(random_seed)

    def _init_population(self, M: int, N: int) -> List[List[int]]:
        """
        Initialize the population and generate random individuals, ensuring that every student is assigned at least one task.
        :param M: Number of students
        :param N: Number of tasks
        :return: Initialized population
        """
        # TODO: Initialize individuals based on the number of students M and number of tasks N
        population = []
        for _ in range(self.pop_size):
            # Create an individual where each task is randomly assigned to a student
            individual = [random.randint(0, M - 1) for _ in range(N)]
            population.append(individual)
        return population

    def _fitness(self, individual: List[int], student_times: np.ndarray) -> float:
        """
        Fitness function: calculate the fitness value of an individual.
        :param individual: Individual
        :param student_times: Time required for each student to complete each task
        :return: Fitness value
        """
        # TODO: Design a fitness function to compute the fitness value of the allocation plan
        total_time = 0
        for task_idx, student_idx in enumerate(individual):
            total_time += student_times[student_idx][task_idx]
        return total_time  # Lower total time means better fitness

    def _selection(self, population: List[List[int]], fitness_scores: List[float]) -> List[int]:
        """
        Use tournament selection to choose parents for crossover.
        :param population: Current population
        :param fitness_scores: Fitness scores for each individual
        :return: Selected parent
        """
        # TODO: Use tournament selection to choose parents based on fitness scores
        tournament = random.sample(list(zip(population, fitness_scores)), self.tournament_size)
        # Select the individual with the lowest fitness score (since we want to minimize time)
        best_individual = min(tournament, key=lambda x: x[1])[0]
        return best_individual

    def _crossover(self, parent1: List[int], parent2: List[int], M: int) -> Tuple[List[int], List[int]]:
        """
        Crossover: generate two offspring from two parents.
        :param parent1: Parent 1
        :param parent2: Parent 2
        :param M: Number of students
        :return: Generated offspring
        """
        # TODO: Complete the crossover operation to generate two offspring
        if random.random() > self.crossover_rate:
            return parent1, parent2  # No crossover; return parents as offspring

        crossover_point = random.randint(1, len(parent1) - 1)
        offspring1 = parent1[:crossover_point] + parent2[crossover_point:]
        offspring2 = parent2[:crossover_point] + parent1[crossover_point:]
        return offspring1, offspring2

    def _mutate(self, individual: List[int], M: int) -> List[int]:
        """
        Mutation operation: randomly change some genes (task assignments) of the individual.
        :param individual: Individual
        :param M: Number of students
        :return: Mutated individual
        """
        # TODO: Implement the mutation operation to randomly modify genes
        for task_idx in range(len(individual)):
            if random.random() < self.mutation_rate:
                # Mutate this gene (reassign the task to a different random student)
                individual[task_idx] = random.randint(0, M - 1)
        return individual

    def __call__(self, M: int, N: int, student_times: np.ndarray) -> Tuple[List[int], int]:
        """
        Execute the genetic algorithm and return the optimal solution (allocation plan) and its total time cost.
        :param M: Number of students
        :param N: Number of tasks
        :param student_times: Time required for each student to complete each task
        :return: Optimal allocation plan and total time cost
        """
        # TODO: Complete the genetic algorithm process, including initialization, selection, crossover, mutation, and elitism strategy
        # 1. Initialize population
        population = self._init_population(M, N)

        for generation in range(self.generations):
            # 2. Calculate fitness for the population
            fitness_scores = [self._fitness(individual, student_times) for individual in population]

            # 3. Apply elitism (carry the best individual to the next generation)
            if self.elitism:
                best_individual = min(population, key=lambda ind: self._fitness(ind, student_times))
                next_population = [best_individual]
            else:
                next_population = []

            # 4. Generate new population through selection, crossover, and mutation
            while len(next_population) < self.pop_size:
                # Selection
                parent1 = self._selection(population, fitness_scores)
                parent2 = self._selection(population, fitness_scores)

                # Crossover
                offspring1, offspring2 = self._crossover(parent1, parent2, M)

                # Mutation
                offspring1 = self._mutate(offspring1, M)
                offspring2 = self._mutate(offspring2, M)

                # Add offspring to the next population
                next_population.append(offspring1)
                if len(next_population) < self.pop_size:
                    next_population.append(offspring2)

            # Replace the old population with the new one
            population = next_population

        # 5. Find the best individual in the final population
        best_individual = min(population, key=lambda ind: self._fitness(ind, student_times))
        total_time = self._fitness(best_individual, student_times)

        return best_individual, int(total_time)


if __name__ == "__main__":
    def write_output_to_file(problem_num: int, total_time: int, filename: str = "results.txt") -> None:
        """
        Write results to a file and check if the format is correct.
        """
        print(f"Problem {problem_num}: Total time = {total_time}")

        if not isinstance(total_time, int):
            raise ValueError(f"Invalid format for problem {problem_num}. Total time should be an integer.")

        with open(filename, 'a') as file:
            file.write(f"Total time = {total_time}\n")


    # TODO: Define multiple test problems based on the examples and solve them using the genetic algorithm
    # Example problem 1 (define multiple problems based on the given example format)
    # M, N = 2, 3
    # student_times = [[3, 8, 6],
    #                  [5, 2, 7]]

    M1, N1 = 2, 3
    cost1 = [[3, 2, 4],
             [4, 3, 2]]

    M2, N2 = 4, 4
    cost2 = [[5, 4, 6, 7],
             [4, 5, 6, 3],
             [6, 4, 5, 2],
             [3, 2, 4, 5]]

    M3, N3 = 8, 9
    cost3 = [[90, 100, 60, 5, 50, 1, 100, 80, 70],
             [100, 5, 90, 100, 50, 70, 60, 90, 100],
             [50, 1, 100, 70, 90, 60, 80, 100, 4],
             [60, 100, 1, 80, 70, 90, 100, 50, 100],
             [70, 90, 50, 100, 100, 4, 1, 60, 80],
             [100, 60, 100, 90, 80, 5, 70, 100, 50],
             [100, 4, 80, 100, 90, 70, 50, 1, 60],
             [1, 90, 100, 50, 60, 80, 100, 70, 5]]

    M4, N4 = 3, 3
    cost4 = [[2, 5, 6],
             [4, 3, 5],
             [5, 6, 2]]

    M5, N5 = 4, 4
    cost5 = [[4, 5, 1, 6],
             [9, 1, 2, 6],
             [6, 9, 3, 5],
             [2, 4, 5, 2]]

    M6, N6 = 4, 4
    cost6 = [[5, 4, 6, 7],
             [8, 3, 4, 6],
             [6, 7, 3, 8],
             [7, 8, 9, 2]]

    M7, N7 = 4, 4
    cost7 = [[4, 6, 8, 7],
             [7, 3, 6, 8],
             [8, 6, 2, 7],
             [9, 7, 6, 3]]

    M8, N8 = 4, 5
    cost8 = [[8, 6 * 3, 10 * 3, 7 * 3, 9 * 3],
             [8 * 3, 6, 10 * 3, 7 * 3, 9 * 3],
             [8 * 3, 6 * 3, 10, 7 * 3, 9 * 3],
             [8 * 3, 6 * 3, 10 * 3, 7, 9 * 3],
             [8 * 3, 6 * 3, 10 * 3, 7 * 3, 9]]

    M9, N9 = 5, 5
    cost9 = [
        [10, 10, 100, 100, 100],  # Alice
        [12, 100, 100, 12, 12],  # Bob
        [100, 15, 15, 100, 100],  # Charlie
        [11, 100, 11, 100, 100],  # Diana
        [100, 14, 100, 14, 14],  # Evelyn
    ]

    M10, N10 = 9, 10
    cost10 = [[1, 90, 100, 50, 70, 20, 100, 60, 80, 90],
              [100, 10, 1, 100, 60, 80, 70, 100, 50, 90],
              [90, 50, 70, 1, 100, 100, 60, 90, 80, 100],
              [70, 100, 90, 5, 10, 60, 100, 80, 90, 50],
              [50, 100, 100, 90, 20, 4, 80, 70, 60, 100],
              [100, 5, 80, 70, 90, 100, 4, 50, 1, 60],
              [90, 60, 50, 4, 100, 90, 100, 5, 10, 80],
              [100, 70, 90, 100, 4, 60, 1, 90, 100, 5],
              [80, 100, 5, 60, 50, 90, 70, 100, 4, 1]]

    problems = [(M1, N1, np.array(cost1)),
                (M2, N2, np.array(cost2)),
                (M3, N3, np.array(cost3)),
                (M4, N4, np.array(cost4)),
                (M5, N5, np.array(cost5)),
                (M6, N6, np.array(cost6)),
                (M7, N7, np.array(cost7)),
                (M8, N8, np.array(cost8)),
                (M9, N9, np.array(cost9)),
                (M10, N10, np.array(cost10))]

    # Example for GA execution:
    # TODO: Please set the parameters for the genetic algorithm
    ga = GeneticAlgorithm(
        pop_size=1000,  # 族群大小
        generations=2000,  # 世代數
        mutation_rate=0.02,  # 突變機率
        crossover_rate=0.8,  # 交叉機率
        tournament_size=3,  # 錦標賽大小
        elitism=True,  # 使用菁英策略
        random_seed=42  # 隨機種子（可選）
    )

    # Solve each problem and immediately write the results to the file
    for i, (M, N, student_times) in enumerate(problems, 1):
        best_allocation, total_time = ga(M=M, N=N, student_times=student_times)
        write_output_to_file(i, total_time)

    print("Results have been written to results.txt")
