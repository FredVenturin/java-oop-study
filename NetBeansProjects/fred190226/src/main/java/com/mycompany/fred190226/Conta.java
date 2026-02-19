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

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public void transferir(Conta destino, double valor){
        debitar(valor);
        destino.creditar(valor);
    }
    
    
    public void creditar(double valor) {
        saldo += valor;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
