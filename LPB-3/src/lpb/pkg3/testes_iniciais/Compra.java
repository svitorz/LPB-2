package testes_iniciais;

import javax.swing.JOptionPane;

/**
 * Faça um programa que calcule o que deve ser pago por um produto,
 * considerando um preço normal da etiqueta e a escolha da condição de pagamento. Utilize códigos
 * da tabela a seguir para ler qual condição de pagamento escolhida e efetuar o calculo adequado
 * CÓDIGO DE CONDIÇÃO DE PAGAMENTO
 * 1) A vista no dinheiro, desconto de 12%;
 * 2) A vista no cartão de crédito desconto de 5%
 * 3)Em duas vezes, preço normal da etiqueta sem juros.
 * 4)Em três, preço normal da etiqueta mais juros de 8%
 */
public class Compra {     
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Os métodos de pagamento disponpiveis são: \n"+
                                            "Á vista no dinheiro (v). \n"+
                                            "A vista no cartão de crédito (vc). \n"+
                                            "Em duas vezes no cartão(dv).\n"+
                                            "Em três vezes no cartão(tv)."
                                    );
        JOptionPane.showMessageDialog(null,
            CalcularValor(
                Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto: ")),
                String.valueOf(JOptionPane.showInputDialog("Insira o método de pagamento:"))
            )
        );
    }

    public static String CalcularValor(Double valor, String metodo)
    {
        double valorI = valor;
        switch (metodo) {
            case "v":
                valor -= valor*0.12;
                break;
            case "vc":
                valor -= valor*0.05;;
            case "dv":
                valor += 0;
            case "tv":
                valor += valor*0.08;
            default:
                valor += 0;
                break;
        }
        // if(metodo.equalsIgnoreCase("v")){
        //     valor -= valor*0.12;
        // }else if (metodo.equalsIgnoreCase("vc")) {
        //     valor -= valor*0.05;
        // }else if (metodo.equalsIgnoreCase("dv")) {
        //     valor += 0;
        // }else if(metodo.equalsIgnoreCase("tv")){
        //     valor += valor*0.08;
        // }
        return "O valor do produto é R$"+ valorI +" e o valor a ser pago é "+valor;
    }
}
