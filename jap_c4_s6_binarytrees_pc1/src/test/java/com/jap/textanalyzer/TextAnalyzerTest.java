package com.jap.textanalyzer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextAnalyzerTest {
    TextAnalyzer textAnalyzer;
    BinarySearchTree binarySearchTree;
    @BeforeEach
    void setUp()
    {
        textAnalyzer = new TextAnalyzer();
        binarySearchTree = new BinarySearchTree();
    }

    @AfterEach
    void tearDown()
    {
        textAnalyzer = null;
        binarySearchTree = null;
    }

    @Test
    public void givenFileNameReadAndReturnBinarySearchTreeAndCountOfNodes()
    {
        binarySearchTree = textAnalyzer.readWordFile("daffodils.txt");
        assertEquals(99,binarySearchTree.getNumberOfNodes(binarySearchTree.root));
    }
}
