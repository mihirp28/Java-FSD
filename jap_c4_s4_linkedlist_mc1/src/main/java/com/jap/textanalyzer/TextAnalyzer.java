package com.jap.textanalyzer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TextAnalyzer {

// This method reads a file and inserts the file data into the linked list
    public LinkedList readAndParseFile(String filePath) {

        LinkedList linkedList = new LinkedList();
        try {
			FileReader reader = new FileReader(filePath);
			String line;
			try (Scanner sc = new Scanner(reader)) {
				while(sc.hasNextLine()) {
					line = sc.nextLine();
					if(line.split(" ")[0]!="") {
						String[] li = line.split(" ");
						for(String word:li) {
							word = word.trim().replaceAll(",","").replace(".", "").replace(";","").replace(":", "").toLowerCase();
							linkedList.addNode(word);
						}
					}					
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        return linkedList;
    }
}