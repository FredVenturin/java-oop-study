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

        Conta c1 = new Conta(1000.0); 
        Conta c2 = new Conta(0.0); 

        c1.creditar(500.0);  
        c1.debitar(200.0);
        c1.transferir(c2, 1000);
        
        

        System.out.println("Saldo final c1: " + c1.getSaldo());
        System.out.println("Saldo final c2: " + c2.getSaldo());
    }
}
