# 04 Divide-and-Conquer

+ The divide-and-conquer method is a powerful strategy for designing asymptotically efficient algorithms.
+ For divide-and-conquer, you solve a given problem (instance) recursively.
+ If the problem is small enough - **the base case** - you just solve it directly without recursing.
+ Otherwise - **the recursive case** - you perform three characteristic steps:
    + **Divide** the problem into one or more subproblems that are smaller instances of the same problem.
    + **Conquer** the subproblems by solving them recursively.
    + **Combine** the subproblem solutions to form a solution to the original problem.

+ **Recurrences**
    + A **recurrence** is an equation that describes a function in terms of its value on other, typically smaller, argument.
    + base case
    + recursive case
    + well-defined recurrence
    + ill-defined recurrence
+ **Algorithmic recurrences**
    + Recurrences that describe the running times of divide-and-conquer algorithms.
    + A recurrence $T(n)$ is algorithmic if, for every sufficiently large threshold constant $n_0 > 0$, the following two properties hold:
        - $T(n)=\Theta(n)$, for all $n < n_0$
        - Every path of recursion terminates in a defined base case within a finite number of recursive invocations.
+ **Conventions for recurrences**
    + _Whenever a recurrence is stated without an explicit base case, we assume that the recurrence is algorithmic._
    + we use $O$-notation to express inequalities, such as $T(n) \leq 2T(n/2) + \Theta(n)$
    + we use $\Omega$-notation to express inequalities, such as $T(n) \geq 2T(n/2) + \Theta(n)$
+ **Divide-and-conquer and recurrences**
  + This chapter analyzes two divide-and-conquer algorithms for multiplying $n \times n$ matrices.
  + Matrix multiplication problem:
    + Naive 3-loop algorithm: $T(n) = \Theta(n)$
    + The first recursive algorithm : $T(n) = 8T(n/2)+\Theta(1) = \Theta(n^3)$
    + V. Strassen's Recursive algorithm : $T(n) = 7T(n/2)+\Theta(n^2) = \Theta(n^{\log_2{7}}) = \Theta(n^{2.81})$
  + D&C may divide a problem into unequal sizes: $T(n) = T(n/3) + T(2n/3) + \Theta(n) = \Theta(n\log_2{n})$
  + Another example from Ch9: $T(n) = T(n/5) + T(7n/10) + \Theta(n) = \Theta(n)$
  + Another example, recursive linear search: $T(n) = T(n-1) + \Theta(1) = \Theta(n)$
  + The vast majority of efficient divide-and-conquer algorithms solve subproblems that are _a constant fraction of
    the size of the original problem_, which is where we'll focus our efforts.
+ **Solving Recurrences**
  + **substitution method**
    + you guess the form of a bound and then use mathematical induction to prove your guess correct and solve for constants.
  + **recursion tree method**
    + models the recurrence as a tree, solve the recurrence, you determine the costs at each level and add them up
  + **master method**
    + provides bounds for recurrences of the form: $T(n) = aT(n/b) + f(n)$, $a>0$ and $b>1$, $f(n)$ is a given "driving" function
    + the easiest, when it applies
  + **Akra-Bazzi method**
    + is a general method for solving divide-and-conquer recurrences
    + involves calculus, it can be used to attack more complicated recurrences than those addressed by the master method

## 4.1 Multiplying Square Matrices
## 4.2 Strassen's Algorithm
## 4.3 Substitution method
## 4.4 Recursion tree method
## 4.5 Master method
## 4.6 proof of master theorem
## 4.7 Akra-Bazzi recurrences
