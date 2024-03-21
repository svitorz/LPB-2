package Exercicio2;

import javax.swing.JOptionPane;

class PrincipalDisciplina {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina();

        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Selecione qual tipo de média você deseja calcular:"
                                                                    + "\nMédia Simples - Digite 1"
                                                                    + "\nMédia Ponderada - Digite 2:"));
            if(escolha == 1){
            JOptionPane.showMessageDialog(null, "A média simples é: " +
                disciplina.media(
                    Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1:")),
                    Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2:")),
                    Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 3:"))
                ));
            } else {
                JOptionPane.showMessageDialog(null, "A média ponderada é: " +
                    disciplina.media(
                        Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1:")),
                        Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2:")),
                        Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 3:")),
                        Integer.parseInt(JOptionPane.showInputDialog("Insira o peso 1:")),
                        Integer.parseInt(JOptionPane.showInputDialog("Insira o peso 2:")),
                        Integer.parseInt(JOptionPane.showInputDialog("Insira o peso 3:"))
                    ));
            }       
    }
}
