package com.jap.linkedlist;

public class Song {
    // Define songName and songDuration as attributes
    private String songName;
    private String songDuration;
    
	public Song() {
	}
	
	public Song(String songName, String songDuration) {
		this.songName = songName;
		this.songDuration = songDuration;
	}
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSongDuration() {
		return songDuration;
	}
	public void setSongDuration(String songDuration) {
		this.songDuration = songDuration;
	}
	@Override
	public String toString() {
		return "Song [songName=" + songName + ", songDuration=" + songDuration + "]";
	}
	
    
}