package ex02;

import javax.swing.JOptionPane;

class PrincipalHorastrabalhadas{
	
	public static void main(String args[]){
		HorasTrabalhadas horas = new HorasTrabalhadas();
		
		JOptionPane.showMessageDialog("O valor total : " + horas.calculoHorasTrabalhadas(
			Integer.parseInt(JOptionPane.showInputDialog("Insira o número de horas trabalhadas: ")),
			Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da hora trabalhada: "))
		));
	}	

}