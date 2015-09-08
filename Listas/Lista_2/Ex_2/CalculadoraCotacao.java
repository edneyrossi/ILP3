public class CalculadoraCotacao 
{
	public float real = 0;
	public float cotacao_dolar = 0;
	public float conversao = 0;
	public CalculaDolar calculaDolar;
	public void Calcular()
	{
		conversao = real/cotacao_dolar;
		System.out.println("US$ = "+conversao);
	}

}
