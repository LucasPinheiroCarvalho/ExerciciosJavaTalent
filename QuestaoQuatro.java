
public class QuestaoQuatro {
	public static double valorTotalPago(double valor1, double quantidade1, double valor2, double quantidade2, double porcentagemIPI) {
		return valor1*quantidade1 + valor2*quantidade2*(porcentagemIPI/100 + 1); 	
	}
	
}
