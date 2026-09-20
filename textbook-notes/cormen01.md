## 1 The Role of Algorithms in Computing
+ What are algorithms?
+ Why is the study of algorithms worthwhile?
+ What is the role of algorithms relative to other technologies used in computers?

### 1.1 Algorithms

+ An _algorithm_ is
  + any well-defined computational procedure 
  + that takes some value, or set of values, as _input_ and 
  + produces some value, or set of values, as _output_
  + in a _finite_ amount of time.
+ Algorithm is a tool for solving a well specified computational problem.
+ Instance of a problem, a particular input.
+ An algorithm for a computational problem is _correct_ if, for every problem instance provided as input,
+ it _halts_ - finishes its computing in finite time and outputs the correct solution to the problem instance.
+ A correct algorithm _solves_ the given computational problem.

+ What kinds of problems are solved by algorithms?
  + The Human Genome Project uses dynamic programming heavily.
  + With the help of clever algorithms sites on the internet are able to manage and manipulate large volume of data.
  + Public-key cryptography and digital signatures are based on numerical algorithms and number theory.
  + Resource management tasks employ linear programming algorithms.
  +  and this list may go on...
+ Data structure - is a way to store and organize data in order to facilitate access and modifications
+ Using appropriate data structures is an important part of algorithm design.
+ No single data structure works well for all cases, you should know the limitations of each one...

+ Important to learn techniques of algorithm design and analysis so that you can develop algorithms on your own
+ There are some problems, for which we know of no algorithm that runs in a reasonable amount of time.
+ NP-complete problems
  + no efficient algorithm for an NP-complete problem has ever been found.
  + nobody has ever proven that an efficient algorithm for one cannot exist.
  + if an efficient algorithm exists for any one of them, then efficient algorithms exist for all of them.
  + several NP-complete problems are similar, but not identical, to problems for which we do know of efficient algorithms.
  + how a small change to the problem statement can cause a big change to the efficiency of the best known algorithm!
  + we should know about NP-complete problems because some of them arise surprisingly often in real applications.
+ Alternative computing models
  + parallel algorithms
  + online algorithms

### 1.2 Algorithms as technology

+ If computers were infinitely fast and computer memory were free, would you have any reason to study algorithms?
+ Yes, you would still like to be certain that your solution method terminates and does so with the correct answer.
+ Efficiency time/memory
+ Different algorithms that solve the same problems may differ dramatically in their efficiency
+ These differences can be much more significant than differences due to hardware and software...
+ We should consider algorithms as technology
