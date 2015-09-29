import java.util.InputMismatchException;
import java.util.Scanner; // Aqui chamei a Classe Scanner para poder ler dados do teclado, poderia usar o JOPTIONPANE como na linha abaixo. Usei essa classe pois quero a saída no terminal
//import javax.swing.JOptionPane;

//Aqui é a classe principal onde chamará a calculadora
public class CalculoTempoQueda 
{
	public static void main(String[] args) // Aqui a classe principal
	{
		boolean sucesso = true; // tratamento de erro
		Scanner lerbufferteclado = new Scanner(System.in); // Receber leituras do teclado
		TempoQueda varTempoQueda1 = new TempoQueda(); // Aqui chama o objeto TempoQueda para fazer o cálculo
		
		System.out.println("++++++++++ Cálculo Tempo Queda De Um Objeto ++++++++++\n");
		System.out.println("+++++++ Retornará o tempo da queda em segundos +++++++\n");
		
		
		do // tratamento de erro
		{
			try // tratamento de erro
			{
				System.out.println("\nDigite a altura do objeto em metros (m):\n");
				System.out.println("-> ");
				System.out.println("t = "+varTempoQueda1.CalculoQuedaLivre(varTempoQueda1.distancia = lerbufferteclado.nextDouble())+" s");
				sucesso = false;
			}
			catch (InputMismatchException erro1) // tratamento de erro
			 {
				
				System.out.println("Erro de tipo de variável!\nDigite somente números!");
				lerbufferteclado.nextLine();
			 }
			
		}
		while (sucesso); // tratamento de erro
			
	}

}