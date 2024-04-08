package ex01;

class calculo{
	
	public double calculoValorCompra(int numero_macas_compradas)
	{
		double valor_unidade;
		if(numero_macas_compradas >= 12){
			valor_unidade = 1.0;
		}else{
			valor_unidade = 1.3;
		}
		
		return numero_macas_compradas * valor_unidade;
	}
	
	public double calculoProducao(int numero_caixas)
	{
		int valor_caixa = 59;
		int valor_total = numero_caixas * valor_caixa;
		double valor_custo = valor_total * 0.05;
	
		return valor_total - valor_custo;
	}
}