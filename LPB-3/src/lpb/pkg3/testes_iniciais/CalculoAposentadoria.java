    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes_iniciais;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 * Considere a seguinte informação a respeito da aposentadoria.
 * Para se aposentar por idadem as mulheres precisam ter atingido 60 anos e os homens 65.
 * Já na aposentadoria por tempo de contribuição o tempo minimo exigido é de 30 anos oara mulheres
 * e 35 para homens. Com base nessas informações elabore uma classe que receba a idade de uma pessoa,
 * o sexo e a quantidade de anos de contribuição.
 * A partir das informações calcule a quantidade de anos que faltam de contribuição para se aposentar ou então emita uma mensagem
 * "Você já tem direito a aposentadoria"
 */
public class CalculoAposentadoria {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
            calcular(
                    String.valueOf(JOptionPane.showInputDialog("insira o gênero: ")),
                    Integer.parseInt(JOptionPane.showInputDialog("Insira a idade: ")),
                    Integer.parseInt(JOptionPane.showInputDialog("Insira o tempo de contribuição:"))
                ));
    }

    private static String calcular(String sexo, int idade, int contribuicao) {
        if(sexo.equalsIgnoreCase("masculino")){
            if((idade >= 65) || (contribuicao >= 35)){
                return "Você já tem direito a aposentadoria";
            }else{
                return "Você ainda não tem direito a aposentadoria";
            }
        } else if(sexo.equalsIgnoreCase("feminino")){
            if((idade >= 60) || (contribuicao >= 30)){
                return "Você já tem direito a aposentadoria";
            }else{
                return "Você ainda não tem direito a aposentadoria";
            }
        }else{
            return "Valor inserido inválido";
        }
    }
}
