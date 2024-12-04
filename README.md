Description

This project demonstrates the Quicksort algorithm implemented in Haskell (functional programming) and Java (imperative programming). The key differences between the two implementations reflect the distinct paradigms of the languages:
Paradigm:

Haskell follows a purely functional paradigm. The Quicksort Implementation is recursive, works on immutable lists, and avoids any in-place modifications.
Java is imperative. The algorithm operates on mutable arrays, uses loops, and modifies the data directly during execution.

Recursion vs. Loops:

In Haskell, recursion is the primary mechanism for iteration. List comprehensions are used to partition the data based on the pivot.
In Java, iteration is done through explicit for loops for partitioning and swapping elements.

Data Handling:

Haskell: The input list remains unaltered, and the function returns a new sorted list. This immutability is intrinsic to functional programming.
Java: The input array is sorted in-place using mutable state, which is typical in imperative programming.

Requirements/Commands

  Haskell:
		Used online compiler.
	Java:
		Requires JDK (Java development kit)
		Visual studio code

Functional vs. Imperative Paradigm

Haskell is purely functional, focusing on recursion and immutability. The Quicksort algorithm processes data recursively with list comprehensions and returns new lists without modifying the input.
Java is imperative, using loops and mutable arrays to sort the data in-place.

Parameter Passing Techniques

Haskell: Uses immutable data structures. Parameters are passed as values, and the function does not alter them.
Java: Employs pass-by-value for references. Arrays are mutable, and changes made inside the function affect the original data.

Scoping

Haskell: Scoping is limited to function definitions and let bindings within expressions.
Java: Scoping is block-level, with explicit class and method structures defining variable lifetimes.

The main difference between these two implementations of Quicksort is that Haskell adheres to the functional programming paradigm, emphasizing immutability and recursion, while Java follows the imperative paradigm, modifying data in place and relying on loops.
