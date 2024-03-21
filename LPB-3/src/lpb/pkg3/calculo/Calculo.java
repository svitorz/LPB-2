package calculo;

import javax.swing.JOptionPane;

/* 
 * @author svitorz
 */
public class Calculo {
    double valor1, valor2, resultado;
    int opcao;

    public double soma(double valor1, double valor2)
    {
        this.valor1 = valor1;
        this.valor2=valor2;
        this.resultado = this.valor1 + this.valor2; 
        return resultado;
    }

    public void ecolheOpcao(int opcao){
        this.opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite: "+
                                                                    "\n 1 - Soma"+
                                                                    "\n2 - Diferença"+
                                                                    "\n3 - Divisão"+
                                                                    "\n4 - Multiplicação"));
    }
	
    public void escolheCalculo(){
    	if(this.opcao==1){
		JOptionPane.showMessageDialog(null, "O valor da soma é" +soma(this.valor1,this.valor2));
	}
    } 
}
