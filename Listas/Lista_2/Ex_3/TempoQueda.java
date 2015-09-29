// Esta é a classe com o método que irá receber os dados

public class TempoQueda 

// Ao invés de resolver tudo dentro da classe principal, aqui faremos separado.
// Poderia ter feito tudo dentro de um único arquivo, basta usar funções, assim como na linguagem C ou C++
// Veja que o método CalculoQuedaLivre funciona como uma função, assim como visto em Estrutura De Dados em C++

{
	public TempoQueda tempoQueda;
	public double distancia = 0;
	public double CalculoQuedaLivre(double distancia)
	{
		return Math.sqrt((distancia * 2 / 9.8));				
	}
}