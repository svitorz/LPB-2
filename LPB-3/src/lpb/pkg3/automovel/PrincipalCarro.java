package automovel;

public class PrincipalCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "Volkswagen";

        carro.modelo = "Fusca";

        carro.estado = "desligado";

        carro.velocidade = 0;

        carro.ligarCarro();

        carro.acelerarCarro(); 
        carro.acelerarCarro();        
        carro.acelerarCarro();        
        carro.acelerarCarro();        
        carro.acelerarCarro();        
        carro.acelerarCarro();        
        carro.acelerarCarro();        
        carro.acelerarCarro();        
        carro.acelerarCarro();        

        System.out.println("Velocidade atual: " + carro.velocidade);
        
        carro.desacelerarCarro();
        carro.desacelerarCarro();
        carro.desacelerarCarro();
        carro.desligarCarro();

        System.out.println("Velocidade atual: " + carro.velocidade);
    }
}
