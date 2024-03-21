package automovel;
/**
 * @author svitorz
 */
public class Carro {
    String marca, modelo, estado; // estado: ligado ou desligado.
    double velocidade;

    public void ligarCarro()
    {
        if (estado.equalsIgnoreCase("desligado")) {
            estado = "ligado";
        }else{
            System.out.println("Carro já ligado");
        }
    }
    
    public void desligarCarro()
    {
        if(
            (estado.equalsIgnoreCase("ligado"))
            &&
            (velocidade==0)
            ){
            estado = "desligado";
        }else{
            System.out.println("O carro já está desligado!");
        }    
    }


    public void acelerarCarro(){
        if ((estado.equalsIgnoreCase("ligado"))) 
        {
            if (velocidade<80) {
                velocidade += 10;
            }else{
                System.out.println("Velocidade limite atingida");
            }
        }
        else
        {
            System.out.println("O carro está desligado");
        }
    }

    public void desacelerarCarro(){
        if(estado.equals("ligado")&&velocidade > 0){
            velocidade -= 10;
        }
    }
}
