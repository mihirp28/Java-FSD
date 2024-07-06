package com.jap.marksevaluation;

import java.util.Iterator;

public class OakBridgeSchool
{
    // This function takes as input the marks of all subjects and returns a total marks of each of the students
    public int[] calculateTotalMarks(int [] math,int science[], int[] english, int[] language,int[] social)
    {
    	int n =math.length;
    	int [] totalMarks= new int[n];
    	for(int i=0;i<n;i++)
    	{
    		totalMarks[i]=math[i]+science[i]+english[i]+language[i]+social[i];
    	}
        return totalMarks;
    }
    
    // This function takes as input the total marks of each student and return
    // the average total marks of each student
    public int[] calculateAverageTotalMarks(int[] totalMarks)
    {
    	int n=totalMarks.length;
    
    	int averageTotalMarks[]= new int[n];
    for (int i=0;i<n;i++) {
    	averageTotalMarks[i]=totalMarks[i]/5;	
	}
        return averageTotalMarks;
    }
    
    // This function takes as input the math marks and returns the average score by all students
    public int calculateAverageMathMarks (int[] math)
    {
    	int n= math.length;
    	int sum =0;
    	for (int i=0;i<n;i++) {
    		sum=sum+math[i];
    	}
    	return sum/n;
    }
    
    // This function takes as input the science marks and returns the average score by all students
    public int calculateAverageScienceMarks (int[] science)
    {
    	int n= science.length;
    	int sum =0;
    	for (int i=0;i<n;i++) {
    		sum=sum+science[i];
    	}
    	 return sum/n;   
    	 }
    
    // This function takes as input the social marks and returns the average score by all students
    public int calculateAverageSocialMarks (int[] social)
    {
    	int n= social.length;
    	int sum =0;
    	for (int i=0;i<n;i++) {
    		sum=sum+social[i];
    	}
    	 return sum/n;    
    	 }
    
    // This function takes as input the language marks and returns the average score by all students
    public int calculateAverageLanguageMarks (int[] language)
    {
    	int n= language.length;
    	int sum =0;
    	for (int i=0;i<n;i++) {
    		sum=sum+language[i];
    	}
    	 return sum/n;   
    	 }
    
    // This function takes as input the english marks and returns the average score by all students
    public int calculateAverageEnglishMarks (int[] english)
    {
    	int n= english.length;
    	int sum =0;
    	for (int i=0;i<n;i++) {
    		sum=sum+english[i];
    	}
    	 return sum/n;    
    	 }
    
    // This function takes as input the total marks of each student and the student names
    // and returns the name os the top scorer
    public String findTopScorer(int[] totalMarks,String [] studentNames) {
        //return the name of  the top scorer , extract the name from the studentNames array
    	String temp1;
    	int temp;
    	int n =totalMarks.length;
    	for(int i=0; i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if (totalMarks[i]>totalMarks[j]) {
        			 temp = totalMarks[i];  
        			 totalMarks[i] = totalMarks[j];  
        			 totalMarks[j] = temp; 
        			 
        			 temp1 = studentNames[i];  
        			 studentNames[i] = studentNames[j];  
        			 studentNames[j] = temp1; 
        		}
        	}
//        for (int a:totalMarks) {
//        	System.out.println(a);
//        }
//        for (String a:studentNames) {
//        	System.out.println(a);
//        }   	
    }
    	return studentNames[n-1];
    	}
    
    
    // This function takes as input all the marks in subjects and returns
    // as an array of 1 and 0 the passed and failed student status
    // 1 - pass
    // 0 - fail
    public int[] isPassed(int [] math,int science[], int[] social, int[] language,int[] english)
    {
    	int [] passFailArray= new int[math.length];
	for(int i =0; i<math.length;i++) {
		if(math[i]>=35 && science[i]>=35 && social[i]>=35 && language[i]>=35 && english[i]>=35)
			passFailArray[i]=1;
		else
			passFailArray[i]=0;
	}
    	
        return passFailArray;
    }
    
    // This function takes as input the pass fail status array and student names
    // and returns the names of failed students who need to re appear for the exam
    public String[] listOfStudentsToReAppearForExam(int [] passFailStatus,String studentNames[])
    {
    	int index=0;
    	int count=0;
        for(int i=0;i<passFailStatus.length;i++)
        {
        	if(passFailStatus[i]==0) {
        		count++;
        		//arrFinalPassed[index]=studentNames[i];
        		}
        }
   	 String[] arrFinalFailed=new String[count];

        for(int i=0;i<passFailStatus.length;i++)
        {
        	if(passFailStatus[i]==0) {
        		arrFinalFailed[index]=studentNames[i];
        		index++;
        		//arrFinalPassed[index]=studentNames[i];
        		}
        }
            return arrFinalFailed;
    }
    
    
    // This function takes as input the pass fail status array and student names
    // and returns the names of passed students

    public String[] listOfStudentsPassedTheExam(int [] studentIndex,String studentNames[]){
    	
    	int index=0;
    for(int i=0;i<studentIndex.length;i++)
    {
    	if(studentIndex[i]==1) {
    		//arrFinalPassed[index]=studentNames[i];
    		index++;
    	}
    }
    String[] arrFinalPassed=new String[index];
    int idx=0;
    for(int i=0;i<studentIndex.length;i++) {
    	if(studentIndex[i]==1) {
    		arrFinalPassed[idx]=studentNames[i];
    		idx++;
    	}
    }
        return arrFinalPassed;
    }
    // This function takes as input the average total marks of students
    // and returns the grade accordingly

    public char[] generateGrades(int [] averageTotalMarks)
    {	
    	char [] gradeArray= new char[averageTotalMarks.length];
    	for(int i =0; i<averageTotalMarks.length;i++) {
    		if(averageTotalMarks[i]>=90 && averageTotalMarks[i]<=100)
    			gradeArray[i]='A';
    		if(averageTotalMarks[i]>= 80  && averageTotalMarks[i]<=89)
    			gradeArray[i]='B';
    		if(averageTotalMarks[i] >= 70  && averageTotalMarks[i]<= 79)
    			gradeArray[i]='C';
    		if(averageTotalMarks[i] >= 60  && averageTotalMarks[i]<=69 )
    			gradeArray[i]='D';
    		if(averageTotalMarks[i]>= 50   && averageTotalMarks[i]<=59)
    			gradeArray[i]='E';
    		if(averageTotalMarks[i]<50 )
    			gradeArray[i]='F';
    	}
        return gradeArray;
    }

    //This function takes the total marks of students and roll numbers abd returns the roll nos
    // in sorted order of total marks from smallest score to highest score

    public int[] sortByTotalMarks(int[] totalMarks,int [] rollNos)
    {
    	int temp;
    	int temp1;
    	int n =totalMarks.length;
    	for(int i=0; i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if (totalMarks[i]>totalMarks[j]) {
        			 temp = totalMarks[i];  
        			 totalMarks[i] = totalMarks[j];  
        			 totalMarks[j] = temp; 
        			 
        			 temp1 = rollNos[i];  
        			 rollNos[i] = rollNos[j];  
        			 rollNos[j] = temp1; 
        		}
        	}
    }
        return rollNos;

    }   
}
