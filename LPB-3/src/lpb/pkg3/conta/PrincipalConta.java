package conta;

public class PrincipalConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        
        conta.saldo=1000.00;
        
        System.out.println("Saldo antigo: " + conta.saldo);

        conta.depositar(500.50);
        
        System.out.println("Saldo atualizado: " + conta.saldo);

        conta.sacar(750.00);

        System.out.println("Saldo atualizado após o saque: " + conta.saldo);
    }
}
