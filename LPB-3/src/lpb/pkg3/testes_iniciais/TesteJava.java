package testes_iniciais;

import javax.swing.JOptionPane;

public class TesteJava {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
        calcular(
            String.valueOf(JOptionPane.showInputDialog("Insira seu nome: "))
        ));
    }

    public static String calcular(String nome)
    {
        return "Hello, " + nome + "!";
    }
}
