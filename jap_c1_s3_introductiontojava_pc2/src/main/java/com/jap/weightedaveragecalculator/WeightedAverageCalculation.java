package com.jap.weightedaveragecalculator;

import java.util.Scanner;

public class WeightedAverageCalculation {

  // Function accepts academic scores as input parameters and outputs the overall
  // weighted average percentage of an individual.
  //Calculate the Overall Percentage

  public float averageCalculation(int assignmentScore, int projectScore, int quizScore, int midTermScore,
      int finalExamScore) {

      float assignmentScore1 = assignmentScore*0.1f ;
      float projectScore1 = projectScore* 0.35f;
      float quizScore1 = quizScore*0.1f;
      float midTermScore1 = midTermScore*0.15f;
      float finalExamScore1 = finalExamScore*0.3f;
     float overallPercentage =(assignmentScore1+projectScore1+quizScore1+midTermScore1+finalExamScore1);
      return overallPercentage;
  }

}
