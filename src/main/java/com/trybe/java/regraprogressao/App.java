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

    for (int i = 1; i <= activities; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");

      String activityName = sc.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");

      String valueActivity = sc.nextLine();


    }

  }
}