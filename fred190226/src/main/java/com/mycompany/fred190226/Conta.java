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
    private double saldo_disponivel;
    private int agencia;
    private int numero;

    public Conta(int agencia, int numero, double saldoInicial, double limite) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldoInicial;
        this.limite = limite;
        atualizarSaldoDisponivel();
    }

    public Conta() {
    }
    
    private void atualizarSaldoDisponivel() {
        saldo_disponivel = saldo + limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoDisponivel() {
        return saldo + limite;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setLimite(double limite) {
        this.limite = limite;
        atualizarSaldoDisponivel();
    }

    public double getLimite() {
        return limite;
    }
    
    public void transferir(Conta destino, double valor) {
        if (debitar(valor)) {
            destino.creditar(valor);
        }
    }

    public void creditar(double valor) {
        saldo += valor;
        atualizarSaldoDisponivel();
    }

    public boolean debitar(double valor) {
        if (valor > saldo_disponivel) {
            System.out.println("ERRO: Saldo insuficiente.");
            return false;
        }
        saldo -= valor;
        atualizarSaldoDisponivel();
        return true;
    }
    
}
