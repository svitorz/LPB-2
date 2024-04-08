package ex01;

import javax.swing.JOptionPane;

class PrincipalCalculo{
	
	
	public static void main (String[] args){
		Calculo calculo = new Calculo();
		
		JOptionPane.showMessageDialog("O valor da compra de maçãs é " + calculo.calculoValorCompra(
			Integet.parseInt(JOptionPane.showIputDialog("Insira o número de maças compradas: "))
		));
		
		JOptionPane.showMessageDialog("O valor da produção é " + calculo.calculoProducao(
			Integer.parseInt(JOptionPane.showInputDialog("Insira o número de caixas de laranja vendidas: ")
		));
	}
	
}