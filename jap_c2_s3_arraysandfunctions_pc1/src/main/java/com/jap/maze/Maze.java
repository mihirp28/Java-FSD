package com.jap.maze;

public class Maze {

    // This method builds the character maze from the given integer maze
    public char[][] buildMaze(int[][] maze)
    {	
    	
          // use the below declaration
         char[][] mazeChar = new char[maze[0].length][maze[0].length];
         for(int i = 0;i<maze.length;i++) {
        	 for(int j =0;j<maze[i].length;j++) {
        		 if(maze[i][j] == 1) {
        			 mazeChar[i][j] = '‡';
        		 }
        		 if(maze[i][j] == 3) {
        			 mazeChar[i][j] = 'S';
        		 }
        		 if(maze[i][j] == 4) {
        			 mazeChar[i][j] = 'E';
        		 }
        		 if(maze[i][j] == 0) {
        			 mazeChar[i][j] = ' ';
        		 }
        	 }
         }

        return mazeChar;
    }
    
    public static boolean isValidMove(char[][] mazeChar,int i,int j) {
    	if( i>=0 && i < mazeChar.length &&  j>=0 && j<mazeChar[i].length) {
    		return mazeChar[i][j] == ' ' || mazeChar[i][j] == 'S';
    	}
    	return false;
    }
    //Solve the given maze by using recursion
    
 
    
    public boolean solve(char[][] mazeChar,int i, int j) {
    	if(mazeChar[i][j] == 'E') {
    		return true;
    	}
    	if(isValidMove(mazeChar, i, j)) {
    		mazeChar[i][j] = '-';
    		boolean returnValue = solve(mazeChar, i+1, j);
    		
    		if(!returnValue) {
    			returnValue = solve(mazeChar, i, j+1);
    		}
    		if(!returnValue) {
    			returnValue = solve(mazeChar, i, j-1);
    		}
    		if(!returnValue) {
    			returnValue = solve(mazeChar, i-1, j);
    		}
    		return returnValue;
    	}
    	
        return false;
    }
    
    //This method prints the maze like a grid
    public void printMaze(char[][] mazeChar)
    {
    	for(int i=0;i<mazeChar.length;i++) {
    		for(int j =0 ;j<mazeChar[i].length;j++) {
    			System.out.print(mazeChar[i][j]+" ");
    		}
    		System.out.println();
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

        System.out.println("The maze skeleton");
        System.out.println("-----------------");
        // Print the maze
        // Call the method - printMaze(mazeChar);

        System.out.println("The solved maze skeleton");
        System.out.println("-----------------");
        // Solve the maze
        // Call the method - Start from 'S' which is at position (0,1) in the mazeChar array
        // solve(mazeChar,0,1);

        // Print the maze
        // Call the method - printMaze(mazeChar);
    }

}