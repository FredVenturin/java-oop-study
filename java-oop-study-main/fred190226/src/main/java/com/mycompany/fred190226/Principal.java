/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fred190226;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        
        int [] agencia = new int[2];
        int [] numero = new int[2];
        double [] saldo = new double[2];
        double [] limite = new double[2];
        Conta [] contas = new Conta[2];
        
        for (int i = 0; i < numero.length; i++){
            agencia[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da conta " + (i+1)+ ":", agencia[i]));
        
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta "+ (i+1)+ ":", agencia[i]));

            saldo[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta "+ (i+1)+ ":", agencia[i]));

            limite[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta "+ (i+1)+ ":", agencia[i]));
            
            contas[i] = new Conta(agencia[i],numero[i],saldo[i], limite[i]);
            
        }
        
        
        
        double valorCred = Double.parseDouble(JOptionPane.showInputDialog("Digite valor a ser creditado em c1: "));
        double valorDeb = Double.parseDouble(JOptionPane.showInputDialog("Digite valor a ser debitado em c1: "));
        double valorTransf = Double.parseDouble(JOptionPane.showInputDialog("Digite valor a ser transferido: "));
        

        contas[0].creditar(valorCred);
        contas[0].debitar(valorDeb);
        contas[0].transferir(contas[1], valorTransf);
        
        JOptionPane.showMessageDialog(null, contas[0].getSaldoDisponivel());
        
        

        System.out.println("Saldo final c1: " + contas[0].getSaldo());
        System.out.println("Saldo final c2: " + contas[1].getSaldo());
    }
}
