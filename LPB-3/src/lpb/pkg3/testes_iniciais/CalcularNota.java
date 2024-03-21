/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes_iniciais;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 * Utilizando a classe JOptionPane para a entrada de dados,
 * receba 2 valores para dias provas e um valor para um trabalho.
 * calcule a media aritmetica dos tres valores.
 * se a media foi maior ou igual a 6 o aluno está aprovado.
 * senao reprovado.
 */
public class CalcularNota {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "A situação do aluno é: " +
                calcular(
                Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1:")),
                Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho: "))
                ));
    }

    private static String calcular(double nota1, double nota2, double trabalho) {
        double media = (nota1 + nota2 + trabalho)/3;
        
        if(media >= 6){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}
