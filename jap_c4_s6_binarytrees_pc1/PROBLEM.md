## Practice Statement - TextAnalyzer v2.0

**In this challenge, we will use a binary search tree data structure to implement a better Text Analyzer. Earlier you may have used a linked list for this purpose, but search operations on large, linked lists can become inefficient. A binary search tree delivers much better performance, this will be noticed while tackling this challenge.**

**Task 1** – Design a class called Word, that can be used to store details of a word that is read from a text file. Apart from the word itself, the class should have an attribute to store the number of times the same word occurs in the file. Define appropriate constructors, getter and setter methods for this class. You may reuse the class that you had created earlier for this purpose.

**Task 2** – This task involves creating an appropriate model for the binary search tree. Identify the classes that you will have to define so that the required binary search tree can be constructed.

**Task 3** - This task involves reading a text file and storing all the words in the memory using a binary search tree data structure as per the class definitions created.
Insert the binary search tree in alphabetical order of the words. Implement a strategy to ensure that the same word is not added more than once in the tree. Instead, the frequency count of the word should be stored along with it. After the first instance, if the word is encountered again, in the input file, then only its count should be incremented at the node where the word has been previously added in the tree.

**Task 4** - Once, you have read all the words in the file `daffodils.txt`, use a method called `showTree(Node node,String traversalOrder)` to show all the words that have been found using the pre-order, in order and the post order traversal parameter have been passed to the method.