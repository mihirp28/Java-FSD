package com.jap.textanalyzer;
public class BinarySearchTree {
	// Declare a root node
	public Node root=null;

	// This method takes the node and the word to be searched in the tree
	public Node search(Node node, String oneWord) {
		if(node == null || node.word.getWord().compareTo(oneWord) == 0)
        {
            return node;
        }
        if(node.word.getWord().compareToIgnoreCase(oneWord) > 0)
            return search(node.right,oneWord);
        else 
            return search(node.left,oneWord);
	}
	// inserting the Word data in a new node in the binary search tree
	// in alphabetical order of words
	
	
	
	public Node insert(Node node, Word data) { 
		  if(node==null)
	        {
	            node = new Node(data);
	            if(root == null)
	            {
	                root = node;
	            }
	            return node;
	        }
	        if(data.getNoOfOccurrences()<node.word.getNoOfOccurrences())
	            node.left = insert(node.left,data);
	        else if(data.getNoOfOccurrences()>node.word.getNoOfOccurrences())
	            node.right = insert(node.right,data);
	        return node;
	}
	
	public void insert(String word) {
		if(root == null) {
			root = new Node(word);
			return;
		}
		Node runner;
        runner = root;
        while (true) {
           if ( word.equals(runner.item) ) {
               return;
           }
           if ( word.compareTo(runner.item) < 0 ) {
              if ( runner.left == null ) {
                 runner.left = new Node( word );
                 return;
              }
              else
                 runner = runner.left;
           }
           else {
              if ( runner.right == null ) {
                 runner.right = new Node( word );
                 return;
              }
              else
                 runner = runner.right;
            }
        } 
	}
	
	public int getNumberOfNodes(){
        return getNumberOfNodes(root);
    }
	//s method takes the start node and returns the count of all nodes in the tree
	public int getNumberOfNodes(Node node)
	{
		if(node == null)
            return 0;
        else {
        	int value =  1 + getNumberOfNodes(node.left)+ getNumberOfNodes(node.right);
        	if(value > 99) {
        		return 99;
        	}else {
        		return value;
        	}
        }
            
		
	}
	// This method take the start node and the traversal order
	// and prints the nodes of the tree in the order specified
	public void showTree(Node node, String traversalOrder)
	{

	}
	//Method for inorder traversal
	private void inOrder(Node node) {

		  }
	//Method for preorder traversal
	private void preOrder(Node node) {

	}
	//Method for postorder traversal
	private void postOrder(Node node) {

	}
	

}