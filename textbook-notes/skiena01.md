## Skiena, Chapter 1 - Introduction to Algorithm Design

### What is an algorithm?
+ An _algorithm_ is a procedure to accomplish a specific task.
+ An algorithm is the idea behind any reasonable computer program.
+ An algorithm must solve a general, well-specified _problem_.
+ An algorithmic problem is specified by describing
  + the complete set of _instances_ it must work on (its _input_)
  + and its _output_ after running on one of these instances.
+ An _algorithm_ is a procedure that takes any of the possible input instances and transforms it to the desired output.
+ There can be more than one algorithm that solves an algorithmic problem.
+ Example:
  + Problem: Sorting.
  + Input: A sequence of $n$ keys $a_1, ..., a_n$.
  + Output: The permutation of the input sequence such that $a'_1 \leq a'_2 \leq ... \leq a'_{n-1} \leq a'_n$.
  + An instance of a sorting problem might be _{Mike, Bob, Sally, Jill, Jan}_ or _{154, 245, 568, 324, 654, 324}_
  + Algorithms that solve the problem: insertion sort, merge sort etc.
+ There are three desirable properties of algorithms, not necessarily achievable simultaneously:
  + **correctness** (this chapter is about)
  + efficiency
  + ease of implementation
+ Correctness of an algorithm requires a _proof_ of correctness
+ Proof is an explanation why an algorithm must take every instance of the problem to the desired result.
+ "it's obvious!" never suffices as a proof of correctness.

### 1.1 Robot Tour Optimization
+ Spoiler: _Traveling Salesman Problem_
+ _Problem_: **Robot Tour Optimization**
+ _Input_: A set $S$ of $n$ points in the plane.
+ _Output_: What is the shortest cycle tour that visits each point in the set $S$?
+ Wrong Attempt 1: NearestNeighbor($P$)
+ Wrong Attempt 2: ClosestPair($P$)
+ Correct Attempt: OptimalTSP($P$)
+ There is a fundamental difference between
  + algorithms, procedures that always produce a correct result and 
  + heuristics, which may usually do a good job but provide no guarantee of correctness.

### 1.2 Selecting the Right Jobs
+ _Problem_: Movie Scheduling Problem
+ _Input_: A set $I$ of $n$ intervals on the line.
+ _Output_: What is the largest subset of mutually non-overlapping intervals that can be selected from $I$?
+ EarliestJobFirst($I$)
+ ExhaustiveScheduling($I$)
+ OptimalScheduling($I$)
+ Reasonable-looking algorithms can easily be incorrect.
+ Algorithm correctness is a property that must be carefully demonstrated.

### 1.3 Reasoning about Correctness
+ We need tools to distinguish correct algorithms from incorrect ones, the primary one of which is called a _proof_.
  1. There is a clear, precise statement of what you are trying to prove.
  2. There is a set of assumptions of things that are taken to be true, and hence can be used as part of the proof.
  3. There is a chain of reasoning that takes you from these assumptions to the statement you are trying to prove (_QED_).

#### 1.3.1 Problems and Properties
+ Ask the wrong question and you will get the wrong answer.
+ Problem specifications have two parts:
  1. the set of allowed inputs
  2. the required properties of the output
+ An important and honorable technique in algorithm design is to
  + narrow the set of allowable instances until there is a correct and efficient algorithm.
+ Two common traps when specifying the output requirements:
  1. asking an ill-defined question e.g. the _best_ route without defining what the _best_ means.
     + _shortest route in total distance_
     + _fastest route_
     + _the route minimizing the number of turns_ 
  2. creating compound goals makes it very hard to reason about and solve
     + _Find the shortest route from a to b that doesn't use more than twice as many turns as necessary_.

#### 1.3.2 Expressing Algorithms
+ The three most common forms of algorithmic notation:
  1. human language - the most natural but least precise programming language
  2. pseudocode - a programming language that never complains about syntax errors (happy median)
  3. a real programming language - precise but the most difficult to write
+ All three methods are useful because there is a natural tradeoff between greater ease of expression and precision.
+ The heart of any algorithm is an idea.
+ If your idea is not clearly revealed when you express an algorithm, then you are using too low-level a notation to describe it.

#### 1.3.3 Demonstrating Incorrectness
+ The best way to prove that an algorithm is _incorrect_ is to produce an instance on which it yields an incorrect answer.
+ Such instances are called _counterexamples_.
+ Good counterexamples are _simple_ and _verifiable_.
  + Think small
  + Think exhaustively.
  + Hunt for the weaknesses.
  + Go for a tie.
  + Seek extremes.
+ Searching for counterexamples is the best way to disprove the correctness of a heuristic.
+ **Stop and Think: Greedy Movie Stars?**

### 1.4 Induction and Recursion
+ Failure to find a counterexample to a given algorithm does not mean the algorithm is correct.
+ _Mathematical induction_ is often a method of choice.
+ Recursion is mathematical induction in action.
+ A computer scientist is a mathematician who only knows how to prove things by induction.
+ Example
  + insertion sort, an incremental algorithm
  + the reason it is correct can be shown inductively.
+ Mathematical induction is usually the right way to verify the correctness of a recursive or incremental insertion algorithm.

### 1.5 Modeling the Problem
+ Modeling is the art of formulating your application in terms of precisely described, well-understood problems.
+ Proper modeling is the key to applying algorithmic design techniques to real-world problems.
+ Proper modeling can eliminate the need to design or even implement algorithms, by relating your application to what has been done before.
+ Real-world applications involve real-world objects.
+ Most algorithms, however, are designed to work on rigorously defined abstract structures.
+ To exploit the algorithms literature, you must learn to describe your problem abstractly, in terms of procedures on such fundamental structures.

#### 1.5.1 Combinatorial Objects
+ Permutations
+ Subsets
+ Trees
+ Graphs
+ Points
+ Polygons
+ Strings
+ Modeling is only the first step in designing an algorithm for a problem.
+ Modeling your application in terms of well-defined structures and algorithms is the most important single step towards a solution.

#### 1.5.2 Recursive Objects
+ Learning to think recursively is learning to look for big things that are made from smaller things of exactly the same type as the big thing.
+ Recursive structures occur everywhere in the algorithmic world.
+ Permutations
+ Subsets
+ Trees
+ Graphs
+ Points
+ Polygons
+ Strings
+ Recursive descriptions of objects require both:
  + decomposition rules and
  + _basis cases_, namely the specification of the smallest and simplest objects where the decomposition stops.

### 1.6 Proof by Contradiction
+ The basic scheme of a contradiction argument is as follows:
  + Assume that the hypothesis (the statement you want to prove) is false.
  + Develop some logical consequences of this assumption.
  + Show that one consequence is demonstrably false, thereby showing that the assumption is incorrect and the hypothesis is true.
+ Example: Euclid's proof that there are an infinite number of prime numbers.

### 1.7 About the War Stories
+ Real-world case studies.

### 1.8 War Story: Psychic Modeling
+ A real case with Lotto.
+ Make sure that you model your problem correctly before trying to solve it.
+ In our case, we came up with a reasonable model, but didn't work hard enough to validate it before we started to program.

### 1.9 Estimation
+ When you don't know the right answer, the best thing to do is guess.
+ Principled guessing is called estimation.
+ Estimation problems are best solved through some kind of logical reasoning process, typically a mix of principled calculations and analogies.

### 1.10 Exercises
