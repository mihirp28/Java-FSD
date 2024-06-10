package com.jap.salesanalyzer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
This class performs the file reading and stores the data in SalesRecord array
 */
public class SalesAnalysis {
 static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

    // This method reads a file and returns the count of lines in the file
    // omit any headers present in the file
     public int countOfSalesRecords(String fileName){ 
         int recordCount = 0;
         try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
             while (br.readLine() != null) {
                 recordCount++;
             }

         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
         return recordCount-1;
    }
    

    // This method reads a file and adds each line of the file into the corresponding SalesRecord object
    public SalesRecord[] readRecords(String fileName,int recordCount) throws ParseException  {
        SalesRecord[] salesData = new SalesRecord[recordCount];
 
         try (BufferedReader br1 = new BufferedReader(new FileReader(fileName))) {
             br1.readLine();
             int index = 0;
             String line = null;
             while ((line = br1.readLine()) != null) {
                 String[] arr = line.split(",");
                 SalesRecord s = new SalesRecord();
                 s.setCustomer_id(Integer.parseInt(arr[1]));
                 s.setProduct_category(Integer.parseInt(arr[2]));
                 s.setPayment_method(arr[3]);
                 s.setAmount(Double.parseDouble(arr[4]));
                 s.setTime_on_site(Double.parseDouble(arr[5]));
                 s.setClicks_in_site(Integer.parseInt(arr[6]));
           
                
                try {
                 
             
                  s.setDate(sdf.parse(arr[0]));
                  
                  } catch (ParseException e) {
                    e.printStackTrace();
                    throw new ParseException("wrong date format", 0);
                
                 }

                 salesData[index] = s;
                 index++;

             }
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
      

        return salesData;
     }

    public static void main(String[] args) throws ParseException {
        SalesAnalysis salesAnalysis = new SalesAnalysis();
        // read the file purchase_details.csv
        String fileName = "src/main/resources/purchase_details.csv";
        // the count of lines in the file
        
   int count =salesAnalysis.countOfSalesRecords(fileName) ;
  
        //array to hold the sales records
       try {
  SalesRecord[] salesRecords = salesAnalysis.readRecords(fileName,count);
 } catch (ParseException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
 } catch (Throwable e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
 }

       // display the records that have been read from the file
    }
}