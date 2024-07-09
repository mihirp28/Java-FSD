## Problem Statement : Automating the  Prudence Library Management System for player registration and team allotment

Prudence is a registered public library that allows one to donate/ sell old books. The main aim of Prudence is:

- To promote educational, research, cultural, recreational and informational requirements of students, teachers, researchers and general users 
- To promote reading habits among students.
- To promote literacy and disseminate useful daily information to the people and encourage lifelong learning through its reading materials and resources

Initially, Prudence started with 4 genres. The high-level process was: 

    1. Prudence requires the donated/ sold books to be added in their record
    2. Members visit the Pudence library to get their books added to record and for that they have to fulfill cerain formalities and wait in queue
    3. Based on style of literature and book characteristics, Prudence managers allot a genre for each book

Prudence wants to automate this procedure

The problem to solve for Prudence is to automate the process of adding books to record and genre allocation.

**Proposed Solution**

In the first phase, Prudence should be provided a solution where the members can add their books themselves.
Managers will then be able to allocate the books to their respective genres based on their characteristics.

Following are the classes to be implemented to solve this problem.

**Class Book**

Define the following properties.Properties should be private.

        - bookId : String
        - bookName : String
        - bookAuthor : String
        - bookEdition : String
        - genre : String

Define parameterized constructor to initialize properties: bookId, bookName, bookAuthor, bookEdition

Define Getter for all the properties and setter for genre

Override the toString() method to display Book details

Override the compareTo() method to compare books based on bookId

**Class BookGenre**

        - bookId : String
        - bookGenre : String

Define parameterized constructor to initialize all the properties

Define Getter for all the properties

Override the toString() method to display BookGenre details

Override the compareTo() method to compare books based on bookId

#### Complete the following dao classes as per requirement

**class BookDaoImpl**

Define the following methods :

        +addBook(Book book) : boolean
        +findBook(String bookId) : Book
        +getAllBooks() : List<Book>

**class BookGenreDaoImpl**

Define the following methods :

        +getAllBookGenres(String fileName) : Set<BookGenre>
        +addBookToGenre(BookGenre bookGenre) : boolean
        +getBooksSetByGenre(String genre) : Set<BookGenre>

**enum Genres**

Should have the following constants :

          THRILLER, HORROR, FICTION, ADVENTURE, CRIME 

**Note: Do not modify/delete the csv files present in the src/main/resources folder**

## Instructions
- Instruction for each method is provided in class
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding
 
