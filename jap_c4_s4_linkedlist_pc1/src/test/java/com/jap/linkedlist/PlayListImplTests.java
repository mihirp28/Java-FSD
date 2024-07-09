package com.jap.linkedlist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayListImplTests {
    PlayList playList = null;
    PlayListImpl playListImpl = null;
    @BeforeEach
    public void setUp() {

        playList = new PlayList();
        playListImpl = new PlayListImpl();
    }

    @AfterEach
    public void tearDown() {
        playList = null;
        playListImpl = null;
    }

    @Test
    public void givenFileNameReadSongsAndReturnAPlayList()
    {
        try {
            playList = playListImpl.readSongList("songlist.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(9,playList.getTheNumberOfSongs(new Node()));
    }
}
