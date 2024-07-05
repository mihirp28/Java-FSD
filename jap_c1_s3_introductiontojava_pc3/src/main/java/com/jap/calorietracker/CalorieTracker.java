package com.jap.calorietracker;


public class CalorieTracker {

    //This function takes the calories burnt by the activities and the calorie intake in a day
    // and returns the weight lost by Anne

    public int weightLostInAMonth(int cycling,int running,int swimming,int calorieIntake)
    {
        // write logic here
    	int calorieBurnt=((cycling*8 + swimming*8 + running*8) -(calorieIntake*30))/1000;
if (calorieBurnt >=0)
{
	return calorieBurnt;
		
}
else {
	return 0;
}
    }


    public static void main(String[] args) {
        CalorieTracker ct = new CalorieTracker();
        System.out.println("Weight lost by Anne in a month is : "+ct.weightLostInAMonth(300,200,500,2000)+" pounds");

    }
}
