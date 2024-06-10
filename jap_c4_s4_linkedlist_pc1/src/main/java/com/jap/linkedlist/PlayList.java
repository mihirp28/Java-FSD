package com.jap.linkedlist;

public class PlayList {

    // Define the startPtr of the linked list
	private Node head;
    //insert a song at the beginning of the doubly linked list
	
    public Node insertASong(Song data)
    {	
    	Node node = new Node(data);
    	node.next = head;
    	node.prev = null;
    	if(head!=null) {
    		head.prev = node;
    	}
    	head = node;
    	return node;

    }
   
    
    // count the total number of songs in the playlist
    public int getTheNumberOfSongs(Node current){
    	int count = 0;
    	current = head;
    	Node last = null;
    	while(current!=null) {
    		count++;
    		last = current;
    		current = current.next;
    	}
    	return count;

   }
    
  
   // Given the name of a song delete from the play list and return deleted or Nothing to delete message to the user
    public String deleteASong(String song)
    {	
       String out = "song deleted";
       Node node = head;
       if(node.next == null) {
    	   node = null;
    	   return out;
       }
       while(node!=null) {
    	   if(node.next!=null) {
    		   if(node.next.getData().getSongName().equalsIgnoreCase(song)) {
    			   if(node.next.next!=null) {
    				   node = node.next.next;
    				   node.prev = node.prev.prev;
    			   }
    			   return out;
    		   }
    	   }
    	   node = node.next;
       }

       return "Nothing to delete";

    }
    

    // specify the direction in which traversal happens and call appropriate methods for forward and reverse traversal
    // of the linked list
    public void traverseThePlayList(Direction direction)
    {
    	
    }

    // Traverse through the playlist in the forward direction
    private void forwardTraversal()
    {

    }

    // Traverse through the play list in the reverse direction
    private void reverseTraversal()
    {


    }
   
}