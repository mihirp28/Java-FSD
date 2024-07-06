package com.jap.filedemo;

import java.io.*;

public class ReadWriteFile {

    public static void main(String[] args) {
   ReadWriteFile readWriteFile = new ReadWriteFile();
        try {
            readWriteFile.readDataFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //create object of Readers and writers
    public void readDataFromFile() throws IOException {

	FileReader fileReader=new FileReader("input.txt");
BufferedReader rd=new BufferedReader(fileReader);
String data=rd.readLine();
FileWriter  out=null;

String []arr =data.split(",");
String str="";
for(int i=0; i<arr.length;i++) {
 str+=arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
str=str+",";
}
//System.out.print(str);

String outputString = str.substring(0,str.length()-1); //to remove last ,

try {
	out=new FileWriter("output.txt");
	out.write(outputString);
}
catch(Exception e) {
	e.printStackTrace();
}
finally {
	out.flush();
	out.close();
}


    }
}
