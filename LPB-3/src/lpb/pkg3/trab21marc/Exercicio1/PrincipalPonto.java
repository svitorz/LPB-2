package Exercicio1;

import javax.swing.JOptionPane;

public class PrincipalPonto {
	public static void main(String[] args) {
		Ponto ponto = new Ponto();

		JOptionPane.showMessageDialog(null, "A distância entre os pontos é: " + ponto.calculoEuclidiano(
			Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X1:")),
			Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X2:")),
			Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y1:")),
			Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y2:"))
		));
	}
}
