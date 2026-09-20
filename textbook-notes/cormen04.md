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
    +

## 4.1
## 4.2
## 4.3
## 4.4
