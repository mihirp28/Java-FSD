package com.jap.maze;

public class Maze {
    // This method builds the character maze from the given integer maze
    public char[][] buildMaze(int[][] maze)
    {
        // When building the character maze from the integer array make sure the below is verified
        // 1 - is an obstacle - represented by the ascii symbol '‡'
        // 0 - is the space - represented as a blank character ' '
        // S - entry point
        // E - exit point

        // declare the character array that will be returned
        // use the below declaration
         char[][] mazeChar = new char[maze.length][maze[0].length];
         for(int i=0;i<maze.length;i++) {
        	 for(int j=0;j<maze[i].length;j++) {
        		 switch(maze[i][j]) {
        		 case 1:mazeChar[i][j]='‡';break;
        		 case 0:mazeChar[i][j]=' ';break;
        		 case 3:mazeChar[i][j]='S';break;
        		 case 4:mazeChar[i][j]='E';break;
        		 
        		 }
        		
        		 
        	 }
         }
         return mazeChar;
    }
    //This method prints the maze like a grid
    public void printMaze(char[][] mazeChar)
    {
    	for(int i=0;i<mazeChar.length;i++) {
       	 for(int j=0;j<mazeChar[i].length;j++) {
       		 System.out.print(mazeChar[i][j]+" ");
       		 
       	 }
       	 System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        //Declare the integer 2D array that needs to be passed to the method to build the maze
         int[][] maze = {
                {1,3,1,1,1,1,1,1,1,1,1,1,1},
                {1,0,1,0,1,0,1,0,0,0,0,0,1},
                {1,0,1,0,0,0,1,0,1,1,1,0,1},
                {1,0,0,0,1,1,1,0,0,0,0,0,1},
                {1,0,1,0,0,0,0,0,1,1,1,0,1},
                {1,0,1,0,1,1,1,0,1,0,0,0,1},
                {1,0,1,0,1,0,0,0,1,1,1,0,1},
                {1,0,1,0,1,1,1,0,1,0,1,0,1},
                {1,0,0,0,0,0,0,0,0,0,1,4,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1}};

        char mazeChar[][];
        Maze mazeObj = new Maze();
        // Call the method - buildMaze(maze);
        mazeChar=mazeObj.buildMaze(maze);

        System.out.println("The maze skeleton");
        System.out.println("-----------------");
        // Print the maze
        // Call the method - printMaze(mazeChar);
        mazeObj.printMaze(mazeChar);


    }

}