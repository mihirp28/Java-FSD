package com.jap.textanalyzer;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextAnalyzerTest {

    LinkedList linkedList;
    final String filePath = "src/main/resources/daffodils.txt";
    TextAnalyzer textAnalyzer ;
    Word word;
@BeforeEach
    void setUp(){
    linkedList = new LinkedList();
    textAnalyzer = new TextAnalyzer();
    word = new Word("hello",1);

}
@AfterEach
    void tearDown()
{
    linkedList = null;
    textAnalyzer = null;
    word = null;
}

@Test
    public void givenWordObjectDisplayInDesiredFormat()
{
    String expected = "Word{word='hello', wordOccurance=1}";
    assertEquals(expected,word.toString());
}

@Test
    public void givenNoNodesInLinkedListCheckIfIsEmpty()
{
    assertTrue(linkedList.isEmpty());
    assertEquals(0,linkedList.getSize());
}
@Test
    public void whenNodesInsertedInALinkedListCheckIfNotEmpty()
{
    linkedList.addNode("hello");
    linkedList.addNode("good");
    linkedList.addNode("day");
    assertFalse(linkedList.isEmpty());
    assertEquals(3,linkedList.getSize());
}

@Test
    public void givenSameWordCheckIfOccuranceUpdatedIsTrue()
{
    linkedList.addNode("hello");
    linkedList.addNode("hello");
    assertTrue(linkedList.updateOccurance("hello"));

}
@Test
    public void givenALinkedListFindTheSizeOfTheLinkedList()
{
    linkedList = textAnalyzer.readAndParseFile("src/main/resources/daffodils.txt");
    assertFalse(linkedList.isEmpty());
    assertEquals(104,linkedList.getSize());
}




}
