
package conta;

/**
 *
 * @author Aluno
 */
public class Conta {
    
    Double saldo;
    
    public void depositar(Double valor){
        saldo += valor;
    }

    public void sacar(Double valor){
        if (saldo >= valor) {
            saldo -= valor;
        }else{
            System.out.println("Você não possui saldo suficiente para realizar este saque!");
        }
    }
}
