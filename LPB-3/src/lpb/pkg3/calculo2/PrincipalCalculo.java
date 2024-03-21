package calculo2;

import javax.swing.JOptionPane;

public class PrincipalCalculo{
	
	public static void main(String[] args){
		Calculo calculo = new Calculo();

		JOptionPane.showMessageDialog(null,
					Calculo(
							Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"))
						)
				);
	}
}
