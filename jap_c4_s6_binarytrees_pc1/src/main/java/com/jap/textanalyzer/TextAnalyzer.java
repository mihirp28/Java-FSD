package com.jap.textanalyzer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextAnalyzer {

	// This method takes the file name as a parameter and returns the binary search tree
	// Read the file and populate the binary search tree
	public BinarySearchTree readWordFile(String fileName)
	{
		Map<String, Integer> hashMap = new HashMap<>();
		BinarySearchTree bst = new BinarySearchTree();
	        try {
				FileReader reader = new FileReader(fileName);
				String line;
				try (Scanner sc = new Scanner(reader)) {
					while(sc.hasNextLine()) {
						line = sc.nextLine();
						if(line.split(" ")[0]!="") {
							String[] li = line.split(" ");
							for(String word:li) {
								word = word.trim().replace(",","").replace(".", "").replace(";","").replace(":", "").toLowerCase();
								Integer integer = hashMap.get(word);
								if(integer == null) {
									bst.insert(word);
									hashMap.put(word, 1);
								}else {
									
									hashMap.put(word, integer+1);
								}
								
							}
							
						}					
					}
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	        return bst;
	}
}