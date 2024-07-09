package com.jap.textanalyzer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BinarySearchTreeTest {
    BinarySearchTree binarySearchTree;
    Word[] words;
    Node node;

    @BeforeEach
    void setUp() {
        binarySearchTree = new BinarySearchTree();
        words = new Word[]{new Word("book", 2), new Word("table", 7), new Word("yard", 1)};
        node = new Node();
    }

    @AfterEach
    void tearDown() {
        binarySearchTree = null;
        words = null;
        node = null;
    }

    @Test
    public void givenWordObjectInsertTreeReturnNoOfOccurences() {
        Node returnedNode1 = binarySearchTree.insert(binarySearchTree.root, new Word("book", 2));
        assertEquals(2, returnedNode1.word.getNoOfOccurrences());
    }

    @Test
    public void givenWordObjectInsertTreeReturnWord() {
        Node returnedNode2 = binarySearchTree.insert(binarySearchTree.root, new Word("table", 4));
        assertEquals("table", returnedNode2.word.getWord());
    }

    @Test
    public void givenNodeAndWordSearchForWordInTree() {
        node.word = new Word("book", 2);
        binarySearchTree.insert(binarySearchTree.root, new Word("book", 2));
        binarySearchTree.insert(binarySearchTree.root, new Word("table", 4));
        assertEquals("book", binarySearchTree.search(node, "book").word.getWord());
        assertNotEquals("look", binarySearchTree.search(node, "book").word.getWord());
    }

    @Test
    public void givenRootNodeTraverseTreeAndReturnNumberOfNodes() {
        binarySearchTree.insert(binarySearchTree.root, new Word("book", 2));
        binarySearchTree.insert(binarySearchTree.root, new Word("table", 4));
        int expectedNoOfNodes = binarySearchTree.getNumberOfNodes(binarySearchTree.root);
        assertEquals(2, expectedNoOfNodes);
    }

}
