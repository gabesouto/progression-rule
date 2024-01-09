package com.trybe.java.progressionrule;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Main method.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of activities to register: ");
    int activities = Integer.parseInt(sc.nextLine());

    int sum = 0;
    int valueGrades = 0;

    for (int i = 1; i <= activities; i++) {
      System.out.println("Enter the name of activity " + i + ":");
      String activityName = sc.nextLine();

      System.out.println("Enter the weight of activity " + i + ":");
      int valueActivity = Integer.parseInt(sc.nextLine());

      System.out.println("Enter the grade obtained for " + activityName + ":");
      int gradeOfActivity = Integer.parseInt(sc.nextLine());

      sum += valueActivity;

      valueGrades += valueActivity * gradeOfActivity;
    }

    if (sum != 100) {
      System.out.println("The sum of weights is different from 100!");
      return;
    }

    double result = (double) valueGrades / sum;

    if (result >= 85) {
      System.out.println("Congratulations! You achieved " + result + "%"
          + " and we are pleased to inform you that you have been approved!");
    } else {
      System.out.println(
          "We regret to inform you that, based on your score achieved in this period, " + result
              + "%, you did not reach the minimum score required for your approval.");
    }
  }
}
