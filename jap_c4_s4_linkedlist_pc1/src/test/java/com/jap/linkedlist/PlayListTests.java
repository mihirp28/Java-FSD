package com.jap.linkedlist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PlayListTests {

PlayList playList = null;

    @BeforeEach
    public void setUp() {

        playList = new PlayList();
    }

    @AfterEach
    public void tearDown() {
        playList = null;
    }

    @Test
    public void givenSongObjectInsertToThePlayList(){
        Node node1 = new Node(new Song("One World","00:03:38"));
        Node node2 = playList.insertASong(new Song("One World","00:03:38"));
        assertEquals(node1.getData().getSongName(),node2.getData().getSongName());
    }

    @Test
    public void givenSongNameDeleteFromThePlayList(){
        playList.insertASong(new Song("One World","00:03:38"));
        playList.insertASong(new Song("Money for Nothing","00:02:48"));
        playList.insertASong(new Song("The Man’s Too Strong","00:04:35"));
        assertEquals("song deleted", playList.deleteASong("One World"));
        assertEquals("Nothing to delete", playList.deleteASong("One Voice"));
    }
    @Test
    public void givenAPlayListCountTheNumberOfSongs(){
        playList.insertASong(new Song("One World","00:03:38"));
        playList.insertASong(new Song("Money for Nothing","00:02:48"));
        playList.insertASong(new Song("The Man’s Too Strong","00:04:35"));
        int noOfSongs = playList.getTheNumberOfSongs(new Node());
        assertEquals(3,noOfSongs);
    }




}
