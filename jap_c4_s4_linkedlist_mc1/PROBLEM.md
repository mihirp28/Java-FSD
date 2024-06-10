# Challenge Statement: Text Analyzer 

**Making lists is a routine activity in our daily lives. During the week we may make a list of
things to be purchased over the weekend. Or it may be a list of people we wish to invite for dinner.
In its simplest form a list consists of a series of items ordered sequentially.**

A simple list of names could look like:
- Michael Jackson
- Tracy Chapman
- Taylor Swift
- Paul McCartney
- A.P.J. Abdul Kalam 

**In this challenge you will use singly linked lists to implement a Text Analyzer.
In the current age of word processors, it is so simple to look at the bottom of the screen and
immediately come to know how many words we have typed in our document. Or how many characters we have used.

How exactly is this done ? You will find out some of the basic building blocks for yourself as you tackle this challenge.**

#### Task 1 – 
Design a class called **Word** that can be used to store details of a word that is read from a text file.
Apart from the word itself, the class should have an attribute to store the number of times the same word
occurs in the file. Define appropriate constructors and getter & setter methods for this class.

#### Task 2 – 
This task involves reading a text file and creating a word list by using a singly linked list data
structure. Your word list will consist of objects of the type Word defined in Task 1.
You should take care to ensure that no word is repeated in the list. Instead, if a word that already exists
in the list is found, simply increment the word count. 

- Read the file using the method **readAndParseFile(String fileName)** present in **TextAnalyzer** class

Once, you have read all the words in the file,
use a method called **showWordList()** in the **LinkedList** class to show all the words that have been found 
along with their frequency.

#### Task 3 - 
Notice in the output displayed in Task 2, that the words are not shown in any specific order.
Now refactor your program so that the word list is constructed in such a way that the words are
placed in descending order of their occurances.

**showFrequentWords()** method in the **LinkedList** class

