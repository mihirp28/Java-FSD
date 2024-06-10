package com.jap.textanalyzer;

public class Node {
//Declare word and node objects for left and right - recursive data types
public Word word;
public Node left,right;
public String item;


public Node(String str) {
	item = str;
}

// Declare a parameterized constructor that take only word object as the parameter

// Declare a no-arg constructor
public Node() {

}
public Node(Word word) {
    this.word = word;
    this.left = null;
    this.right = null;
}
public Node left(){
    if(left!=null){
        return left;
    }
    return null;
}
public Node right(){
    if(right!=null){
        return right;
    }
    return null;
}
public boolean hasLeft(){
    if(left!=null){
        return true;
    }
    return false;
}
public boolean hasRight(){
    if(right!=null){
        return true;
    }
    return false;
}
public boolean isInternal(){
    if(right!=null || left!=null){
        return true;
    }
    return false;
}
public boolean isExternal(){
    if(right==null && left==null){
        return true;
    }
    return false;
}
public Node insertLeft(Node newLeftChild){
    if(left==null){
        left = newLeftChild;
    }
    return left;
}
public Node insertRight(Node newRightChild){
    if(right==null){
        right = newRightChild;
    }
    return right;
}
}