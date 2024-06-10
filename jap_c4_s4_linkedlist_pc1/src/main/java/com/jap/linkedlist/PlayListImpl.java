package com.jap.linkedlist;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PlayListImpl {
    private PlayList songList = new PlayList();
    
    public PlayList readSongList(String fileName) throws IOException
    {
    	FileReader reader = new FileReader(fileName);
    	String line;
    	try (Scanner sc = new Scanner(reader)) {
			while(sc.hasNextLine()) {
				Song song = new Song();
				line=sc.nextLine();
				String[] songData = line.split(",");
				String songName = songData[0].trim();
				String songDuration = songData[1].trim();
				song.setSongName(songName);
				song.setSongDuration(songDuration);
				songList.insertASong(song);
			}
		}
    	return songList;
    }

}