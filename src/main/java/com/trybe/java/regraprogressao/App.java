package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int activities = Integer.parseInt(sc.nextLine());

    int sum = 0;

    for (int i = 1; i <= activities; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");

      String activityName = sc.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");

      String valueActivity = sc.nextLine();
      System.out.println(
          "Digite a nota obtida para " + activityName + ":");

      int gradeOfActivity = Integer.parseInt(sc.nextLine());

      int checkSum = sum += Integer.parseInt(valueActivity);

      if (checkSum != 100) {
        System.out.println("A soma dos pesos é diferente de 100!");
      }


    }

  }
}