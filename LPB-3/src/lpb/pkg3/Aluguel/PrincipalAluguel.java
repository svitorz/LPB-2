package Aluguel;

import javax.swing.JOptionPane;

public class PrincipalAluguel {
    public static void main(String[] args) {
        Aluguel aluguel = new Aluguel();
        
        JOptionPane.showMessageDialog(null, "Primeiro o método com passagem de um parâmetros: ");
        double calc_aluguel = aluguel.calculoAluguel(10.00);
        JOptionPane.showMessageDialog(null, calc_aluguel);

        JOptionPane.showMessageDialog(null, "Agora o método com passagem de dois parâmetros");
        aluguel.retornoAluguel(1000.00, 10.00);
    }
}