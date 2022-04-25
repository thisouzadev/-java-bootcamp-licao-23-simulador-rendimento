package com.trybe.acc.java;

import java.time.LocalDateTime;

public class SimuladorRendimento {
  /**
   * Função do readme.
   *
   */
  public static void main(String[] args) {
    SimuladorRendimento obj = new SimuladorRendimento();
    double inicial = 500;
    double objetivo = 5000;
    System.out.println("Com " + inicial + " seu rendimento será " + objetivo + " no ano "
        + obj.simularRendimentoAnos(inicial, objetivo));
  }

  /**
   * Função utilizada para resolução da atividade.
   *
   */
  public int simularRendimentoAnos(double inicial, double objetivo) {
    double rendimentoAnual = 0.10;
    LocalDateTime now = LocalDateTime.now();
    int anoAtual = now.getYear();
    int totalDeAnos = 0;
    do {
      inicial = inicial + (inicial * rendimentoAnual);
      totalDeAnos++;
    } while (inicial < objetivo);
    anoAtual = anoAtual + totalDeAnos;

    return anoAtual;
  }
}
