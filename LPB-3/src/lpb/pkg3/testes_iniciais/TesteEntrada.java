/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes_iniciais;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 * Faça um programa que receba uma entrada e mostre na tela se a opção 
 * foi masculina ou feminina. Utilizar JOptionPane
*/
public class TesteEntrada {
    public static void main(String[] args) {
        String genero;
//        String resultado = "A opção escolhida foi ";
//        
//        genero = String.valueOf(JOptionPane.showInputDialog("Insira seu gênero: M - Masculino ou F - Feminino."));
//    
//        if(genero.equalsIgnoreCase("M"))
//        {
//            resultado += "Masculino!";
//        }else{
//            resultado += "Feminino!";
//        }
//        JOptionPane.showMessageDialog(null, resultado);

        genero = String.valueOf(JOptionPane.showInputDialog("Digite o sexo: "));
        
        if((genero.equalsIgnoreCase("feminino")) || (genero.equalsIgnoreCase("masculino")))
        {
            JOptionPane.showMessageDialog(null, "Você escolheu a opção: " + genero);
        }else{
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}
