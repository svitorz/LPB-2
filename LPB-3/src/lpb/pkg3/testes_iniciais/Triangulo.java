package testes_iniciais;

import javax.swing.JOptionPane;
/**
 * author @svitorz
 * Faça um programa que leia os três lados de um triângulo 
 * e escreva se o triangulo é acutângulo, retângulo ou obtusângulo.
 * triângulo retângulo: possui um ângulo reto (90°)
 * triângulo obtusângulo: possui um ângulo obtuso (maior que 90°)
 * triângulo acutângulo: possui três ângulos agudos (menor que 90°)
 */
public class Triangulo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, 
            CalculoTriangulo(
                Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de um dos lados do triângulo: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de mais um dos lados do triangulo: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do último lado do triângulo: "))
        ));
    }

    public static String CalculoTriangulo(int v1, int v2, int v3) 
    {
        String mensagem = "O triângulo é do tipo ";
        if((v1 == 90) || (v2 == 90) || (v3 == 90)){
            mensagem += "Retângulo"; 
        }else if((v1 > 90) || (v2 > 90) || (v3 >90)){
            mensagem += "Obtusângulo";
        }else if ((v1 <90) && (v2 < 90) && (v3 <90)) {
            mensagem = "Acutângulo";
        }else{
            mensagem = "Tipo de triângulo inválido";
        }
        return mensagem;
    }
}
