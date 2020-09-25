package com.duoTech;

public class ContaCorrente {
  private static double saldo;
  private static String nomeCorrentista;
  private static String nroConta;

  public ContaCorrente(double saldo, String nome, String conta) {
    this.saldo = saldo;
    this.nomeCorrentista = nome;
    this.nroConta = conta;
  }

    public String getNumeroConta(){
      return nroConta;
    }

    public String getNomeCorrentista(){
      return nomeCorrentista;
    }
    public double getSaldo(){
      return saldo;
    }
    public String getCategoria(){}
    public boolean deposito(double valor){}
    public boolean retirada(double valor){}
}
