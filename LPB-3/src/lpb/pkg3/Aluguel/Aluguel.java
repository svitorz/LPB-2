package Aluguel;

import javax.swing.JOptionPane;

public class Aluguel {
    public double calculoAluguel(double valor_taxa){
        double valor_aluguel = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do aluguel: "));
        
        return (valor_aluguel * (1+(valor_taxa / 100)));
    }

    public void retornoAluguel(double valor_aluguel, double valor_taxa){
        double novo_valor = valor_aluguel  * (1+(valor_taxa/100));
        JOptionPane.showMessageDialog(null, "O valor do aluguel com aumento é: " + novo_valor);
    } 
}
