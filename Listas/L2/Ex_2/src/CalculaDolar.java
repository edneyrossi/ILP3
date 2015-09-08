public class CalculaDolar 
{
	public static void main(String[] args) 
	{
		CalculadoraCotacao varCalculadoraCotacao1 = new CalculadoraCotacao();
		System.out.println("\n+++ Cotação1 +++\n+++ Real = R$10,00 +++ \n+++ Cotação = 1,00 US$ <=> R$ 2,00 +++\n");
		varCalculadoraCotacao1.real = 10;
		varCalculadoraCotacao1.cotacao_dolar = 2;
		varCalculadoraCotacao1.Calcular();		
	}
}