# crackingTheCodeInterview

Common coding puzzles + problems in cracking the code interview book 

* **1 :  Reverse a String**
* **2 :  Palindrome**
* **3 :  Reverse an integer**
* **4 :  Anagram**
* **5 :  Fizz Buzz**
* **6 :  Splitting the array to chunks**
* **7 :  Printing Hashes in Steps**
* **8 :  Matrix Spirals**

# Thinking in Time complexity on the above problems :

**Understanding and analysing run time complexity  for above algorithms.**

* **Constant -- O(1)**

    * Processing time doesn't depend on input , it's constant.

* **Linear -- O(n)**

    * Processing time is proportional to input or collection , like iterating array once.

* **Logarithmic  -- O(logn)**

    * Processing time is slightly less relative to input collection.

      For example ; linear search is the basic search operation one can perform it's equal to collection length or slightly less than length.

* **Quadratic  -- O(n^2)**

   * Processing time is Quadratic. meaning every element in collection or input to be compared to every other element.

* **Quasi Linear  -- O(nlogn)**

   * Doubling input doesn't exactly double the iteration work , it's slightly less than comparing every element with other element.
     Sorting problems

* **Exponential -- O(2^n)**

   *If you add a single element to collection the processing power required doubles.


**9 :  Fibonacci Series**

  * Recursion and memoization (Dynamic programming) .


**Data Structures**

* Queue

    * **Concept** : First in First Out ( F.I.F.O)

    * **Implementation :**

         * New entry will be added in the oth index and element will be removed from the last index
         * Array list comes handy for a queue implementation , but thinking from the runtime complexity every addition
               at oth index require a shift on the existing array elements so can cause performance issues as size increases
         * Linked list indeed will be better for high queue size as the time complexity required for adding a new element is constant
               and doesn't require a complete shift.

* Stack

    * **Concept** : Last in First Out ( L.I.F.O)

    * **Implementation :**

         * New entry will be added as the last index in push and same element will be popped on the request.
         * Easy is practical example is the Action stack CTRL+Z and CTRL+Y in most of the tools.
         * Stack is implemented using linked list here ; how ever even an array is fine for the implementation as last element is popped always.