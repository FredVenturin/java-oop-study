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

    private double saldo, limite;
    private int agencia, numero;
    
    public Conta(int agencia, int numero, double valor){
        this.agencia = agencia;
        this.numero = numero;
        saldo += valor;
    }
    
    public Conta(){
    
    }
    public void transferir(Conta destino, double valor){
        debitar(valor);
        destino.creditar(valor);
    }
    
    
    public void creditar(double valor) {
        saldo += valor;
    }

    public void debitar(double valor) {
        if (valor > saldo){
            System.out.println("ERRO: Seu saldo não pode ser menor que a ação de debitar.");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    
    public int getAgencia(){
        return agencia;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
}
