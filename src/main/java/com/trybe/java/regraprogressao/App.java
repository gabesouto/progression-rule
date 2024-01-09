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
    int valueGrades = 0;

    for (int i = 1; i <= activities; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String activityName = sc.nextLine();

      System.out.println("Digite o peso da atividade " + i + ":");
      int valueActivity = Integer.parseInt(sc.nextLine());

      System.out.println("Digite a nota obtida para " + activityName + ":");
      int gradeOfActivity = Integer.parseInt(sc.nextLine());

      sum += valueActivity;

      valueGrades += valueActivity * gradeOfActivity;
    }

    // Verifica se a soma dos pesos é 100
    if (sum != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
      return; // Encerra o programa se a soma dos pesos não for 100
    }

    double result = (double) valueGrades / sum; // Calcula a média ponderada

    if (result >= 85) {
      System.out.println("Parabéns! Você alcançou " + result + "%"
          + " E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, " + result
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}