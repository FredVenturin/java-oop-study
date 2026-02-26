/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fred190226;

/**
 *
 * @author alunolab13
 */


public class Conta {

    private double saldo;
    private double limite;
    private int agencia;
    private int numero;

    public Conta(int agencia, int numero, double saldoInicial, double limite) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoDisponivel() {
        return saldo + limite;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void transferir(Conta destino, double valor) {
        if (debitar(valor)) {
            destino.creditar(valor);
        }
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public boolean debitar(double valor) {
        if (valor > getSaldoDisponivel()) {
            System.out.println("ERRO: Saldo insuficiente.");
            return false;
        }

        saldo -= valor;
        return true;
    }
}
