## 2 Getting Started

### 2.1 Insertion sort

+ insertion sort is an efficient algorithm for sorting a small number of elements.
+ Loop invariants and the correctness of insertion sort
  + loop invariant
    + **Initialization**: It is true prior to the first iteration of the loop. 
    + **Maintenance**: If it is true before an iteration of the loop, it remains true before the next iteration.
    + **Termination**: The loop terminates, and when it terminates, the invariant, usually along with the reason that the loop terminated, gives us a useful property that helps show that the algorithm is correct.


### 2.2 Analysing algorithms
+ _Analyzing_ an algorithm has come to mean predicting the resources that the algorithm requires.
+ Assume a generic one-processor, random-access machine (RAM) model of computation.
+ Analysis of insertion sort
  + problem -> input size
  + running time of an algorithm on a particular input is the number of instructions and data accesses executed.
  + quadratic function $T(n) = an^2 + bn + c$

+ worst-case and average-case analysis
  + worst-case gives an upper bound on the running time for any input, a guarantee the algorithm never takes any longer.
  + and average-case is often roughly as bad as the worst case... used in probabilistic analysis in Chapter 5 of Cormen.
+ order of growth is another simplifying abstraction
  + order of growth = rate of growth
  + theta-notation for order of growth (Cormen, Skiena)
  + tilde-notation for order of growth (Sedgewick)

### 2.3. Designing Algorithms
+ we can choose from a wide range of algorithm design techniques
+ insertion sort - incremental method
+ divide-and conquer (usually recursive)
+ decrease-and-conquer
+ etc

#### 2.3.1 The divide-and-conquer method
+ merge sort

#### 2.3.2 Analyzing the divide-and-conquer algorithms
+ recurrence equation, recurrence
+ recursion tree

