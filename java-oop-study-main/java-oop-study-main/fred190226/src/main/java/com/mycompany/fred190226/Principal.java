/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fred190226;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Conta> contas = new ArrayList<>();
        int select = -1;
        double valorCred;
        double valorDeb;
        double valorTransf;
        int i = 0;
        
        while(select != 0){
            
            select = Integer.parseInt(JOptionPane.showInputDialog("Menu?\n Opcao (1): Criar conta.\nOpcao (2): Creditar\n Opcao (3): Debitar\n Opcao (4): Transferir\n Opcao (5): Vizualizar saldo \nOpcao (0): Encerrar programa. "));
            
            if (select == 1){
                int agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da conta " + (i+1)+ ":"));
        
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta "+ (i+1)+ ":"));

                double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta "+ (i+1)+ ":" ));

                double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta "+ (i+1)+ ":"));
                
                Conta novaConta = new Conta(agencia, numero, saldo, limite);
                contas.add(novaConta);
                i++;
            
            } 
            
            else if(select ==2){
                String listaContas = "";
                for(int j = 0; j < contas.size(); j++){
                    listaContas += (j+1) + " - Conta número " + contas.get(j).getNumero() + "\n";
                }
               
                JOptionPane.showMessageDialog(null, listaContas, "Contas disponíveis", JOptionPane.INFORMATION_MESSAGE);
                 
                int accIndex = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta que deseja selecionar:")) - 1;
                valorCred = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a creditar:"));
              
                contas.get(accIndex).creditar(valorCred);
                
            }
            
            else if(select ==3){
                String listaContas = "";
                for(int j = 0; j < contas.size(); j++){
                    listaContas += (j+1) + " - Conta número " + contas.get(j).getNumero() + "\n";
                }
               
                JOptionPane.showMessageDialog(null, listaContas, "Contas disponíveis", JOptionPane.INFORMATION_MESSAGE);
                 
                int accIndex = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta que deseja selecionar:")) - 1;
                valorDeb = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a debitar:"));
              
                contas.get(accIndex).creditar(valorDeb);
            }
            
            else if(select ==4){
                String listaContas = "";
                for(int j = 0; j < contas.size(); j++){
                    listaContas += (j+1) + " - Conta número " + contas.get(j).getNumero() + "\n";
                }

                JOptionPane.showMessageDialog(null, listaContas, "Contas disponíveis", JOptionPane.INFORMATION_MESSAGE);

                int origem = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta de origem:")) - 1;
                int destino = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta de destino:")) - 1;
                valorTransf = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a transferir:"));

                contas.get(origem).transferir(contas.get(destino), valorTransf);
            }
            
            else if(select ==5){
                String texto = "";

                for(int j = 0; j < contas.size(); j++){
                    if(contas.get(j) != null){
                        texto += "Conta " + (j+1) + "\n";
                        texto += "Agencia: " + contas.get(j).getAgencia() + "\n";
                        texto += "Numero: " + contas.get(j).getNumero() + "\n";
                        texto += "Saldo: " + contas.get(j).getSaldo() + "\n\n";
                    }
                }

                JOptionPane.showMessageDialog(null, texto);
            }
                        
            else if(select == 0){
                System.out.println("Encerrando Programa...");
                break;

            }
 
        }
    

       
    }
}
