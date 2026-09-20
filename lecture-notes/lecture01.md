# Lecture01: Introduction to Design and Analysis of Algorithms
### Konstantin Latuta (let's meet)

### What Is an Algorithm?

#### Informal Definition
> An algorithm is a finite sequence of well-defined steps for solving a computational problem.
An algorithm has:
+ Input — what we are given
+ Output — what we want to obtain
+ Steps — precise=unambiguous operations that transform input into output
+ Termination — eventually, the process stops (finite), halts, terminates, finishes

#### Example 1:
+ Problem: Find duplicates in a sequence of numbers.
+ Algorithm 1: Compare all pairs. $T(n)=n^2$
+ Algorithm 2: Sort and compare adjacent pairs. $T(n) = n\log n$ 
+ Algorithm 3: Insert all elements into hash table. $T(n) = n$

#### Example 2:
+ Problem: Given a list of numbers. Sort them in increasing order.
+ Algorithm 1: insertion sorts. $T(n)=n^2$
+ Algorithm 2: merge sort. $T(n)=n\log n$

### Why study Algorithms?

+ to become a professional software engineer
+ to pass technical job interviews in Google/Meta/Amazon/Apple/Tesla
+ to win competitive programming contest (IOI/ICPC/Codeforces.com ...)
+ develop problem solving skills ...
+ good for your brain
+ for fun!

### What is Design?
a creative magic step ...

#### Design Techniques
1. brute-force, naive algorithms
2. divide-and-conquer: mergesort/quicksort
3. dynamic programming ...
4. greedy methods..
5. graph algorithms...
6. string algorithms...
7. backtracking, branch and bound methods
   ...

#### "Algorithm" to Design Algorithm
1. Problem: description of the input specifications and the desired output
2. Model the problem
3. Design Algorithm (creative magical step)
3. Prove Correctness
    + incorrect/approximate solution = heuristic
    + successful testing is an evidence != proof
4. Analyze Time/Space Complexity, Scalability, Simplicity etc.
5. Implement the Algorithm (we use Java)
6. Test the implementation

### What is analysis?
1. RAM (Random Access Machine) assumption
2. Asymptotic notations:
    + order of growth: $T(n) = \Theta(f(n))$ by Cormen, Skiena, Roughgarden
    + order of growth: $T(n) \sim f(n)$    by Sedgewick

### What is Correctness and Proofs approaches.
+ mathematical/logical reasoning
+ proof by induction (loop invariants, recurrences)
+ proof by contradiction ...
+ ...

#### NP-hard, NP-complete problems
+ Traveling Salesman Problem (TSP)
+ Tractability

### Road map for the class.

#### Topics
1. Introduction to Design and Analysis of Algorithms
2. Asymptotic Analysis and Correctness
3. Divide-and-Conquer, Master theorem
4. Data Structures: Array, Linked List, Stack, Queue, Deque, Heap
5. Data Structures: Hashing, Trees, Tries

6. Graphs: Disjoin Set Union, Minimum Spanning Trees
7. Graphs: Strongest Connected Components, Topological sort
8. Dynamic Programming
9. Strings: Knuth-Morris-Pratt etc.
10. Strings: Suffix Arrays etc.

#### Grading Policy

Quiz1 20% (Moodle Quiz Activity)
Assignment 1 20%
Assignment 2 20%
Midterm exam 40% (Moodle Quiz Activity)

Quiz2 20% (Moodle Quiz Activity)
Assignment 3 20%
Assignment 4 20%
Endterm exam 40% (Moodle Quiz Activity)

Final Exam (Moodle Quiz Activity)

### References:
+ Cormen Leisorson Ch1 Ch2          Big-Oh notation
+ Steven H. Skiena Ch1 Ch2 Ch13
+ Tim Roughgarden Algorithms Illuminated Omnibus Edition
+ Sedgewick Algorithms (Java)  ~tilde notation for rate growth
