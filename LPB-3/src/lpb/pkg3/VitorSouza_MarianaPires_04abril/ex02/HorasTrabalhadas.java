pacote ex02;

class HorasTrabalhadas{
	
	public double calculoHorasTrabalhadas(int numero_horas_trabalhadas, int salario_por_hora)
	{
		int valor_total;
		
		if (numero_horas_trabalhadas > 40){
			// numero de horas extras
			int horas_extras_trabalhadas = numero_horas_trabalhadas - 40;
			
			// valor das horas extras trabalhadas
			valor_total += horas_extras_trabalhadas * (salario_por_hora * 0.5);	
		}
		
		valor_total += numero_horas_trabalhadas * salario_por_hora;
		
		return valor_total;
		
	}
}