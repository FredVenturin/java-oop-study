/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fred190226;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {

        Conta conta = new Conta(1000.0); 

        conta.creditar(500.0);  
        conta.debitar(200.0);   

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
