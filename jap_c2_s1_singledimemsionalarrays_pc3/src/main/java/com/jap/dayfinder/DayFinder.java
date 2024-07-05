package com.jap.dayfinder;
import java.util.*;  
public class DayFinder {
//The current day of week is taken in int (For Sunday 1, Monday 2, Tuesday 3....Saturday 7)
    public String predictDay(int currentDay, int noOfDaysFromToday)
    {
        String[] days1 = new String[7];
        days1[0] = "Saturday"; 
        days1[1] = "Sunday"; 
        days1[2] = "Monday"; 
        days1[3] = "Tuesday"; 
        days1[4] = "Wednesday"; 
        days1[5] = "Thursday"; 
        days1[6] = "Friday";
        String[] days2 = new String[7];
        days2[0] = "Saturday"; 
        days2[6] = "Sunday"; 
        days2[5] = "Monday"; 
        days2[4] = "Tuesday"; 
        days2[3] = "Wednesday"; 
        days2[2] = "Thursday"; 
        days2[1] = "Friday";
        int d = currentDay+noOfDaysFromToday;
        d = d%7;
        if(d>=0)
        return days1[d];
        
        else{
        d = Math.abs(d);
        return days2[d];
        }
        }




    public static void main(String[] args){
        DayFinder dayFinder = new DayFinder();
        // Accept input of medicine taken day and the next dose to be taken in how many days
        int medicineTakenOn = 0;
        int daysToNextDose = 0;
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the day medicine is taken on : ");
        medicineTakenOn = sc.nextInt();  
        System.out.println("Next dose tobe taken after  : ");
        daysToNextDose = sc.nextInt();  

        // call the method to predict the day the next dose must be taken
        String nextDoseToBeTakenOn = dayFinder.predictDay(medicineTakenOn, daysToNextDose);;
        // display the day
        System.out.println("Your next dose should be taken on :  "+nextDoseToBeTakenOn);
    }

}
