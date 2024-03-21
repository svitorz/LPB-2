package Exercicio2;

public class Disciplina {
    public double media(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }

    public double media(double nota1,double nota2, double nota3, int peso1, int peso2, int peso3){
        return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
    }
}