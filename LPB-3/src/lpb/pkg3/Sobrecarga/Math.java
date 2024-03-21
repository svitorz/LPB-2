package Sobrecarga;

import javax.crypto.interfaces.DHPublicKey;
import javax.swing.JOptionPane;

public class Math {
    /* 
     * A sivrecarga de um método é uma situação em que o nome de o método é o
     * mesmo mas há diferenças na lista de parâmetros (assinatura do método)
     * ou no tipo do retorno.
     */

     public int somar(int n1, int n2)
     {
        return (n1 + n2);
     }

     /* agora vamos somar 3 valores com o mesmo nome do método */
     public int somar(int n1, int n2, int n3){
        return (n1 + n2 + n3);
     }

     double dividir(Double n1, double n2){
        if(n2 != 0){
            return n1 / n2;
        }
        return 0;
     }

     void dividir(){
        double n1,n2, resultado; 
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
        if(n2 != 0){
            resultado = n1 / n2;
            JOptionPane.showMessageDialog(null, "O resultado da divisão é " + resultado);
        }else{
            JOptionPane.showMessageDialog(null, "Divisão por zero.");
        }
    }
} 