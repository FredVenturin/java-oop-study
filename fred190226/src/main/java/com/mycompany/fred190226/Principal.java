/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fred190226;
import java.util.Scanner;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a agencia da conta 1:");
        int agencia = sc.nextInt();
        
        System.out.println("Digite o número da conta 1:");
        int numero = sc.nextInt();
        
        System.out.println("Digite o saldo da conta 1:");
        double saldo = sc.nextDouble();
        
        System.out.println("Digite o limite da conta 1:");
        double limite = sc.nextDouble();
        

        Conta c1 = new Conta(agencia,numero,saldo, limite); 
        Conta c2 = new Conta(); 

        c1.creditar(500.0);  
        c1.debitar(80.0);
        c1.transferir(c2, 1000);
        
        

        System.out.println("Saldo final c1: " + c1.getSaldo());
        System.out.println("Saldo final c2: " + c2.getSaldo());
    }
}
