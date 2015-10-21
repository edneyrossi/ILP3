import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraMedia 
{
	public void EntradaDados()
	{
		Scanner lerbufferteclado = new Scanner(System.in);
		boolean sucesso = true;
		double notas_6[] = new double[6];
		int i = 0;
		int j = 1;
		
		do
		{
			try
			{
				System.out.println("\t>>>>> Placar Notas Ginástica <<<<<\n");
				System.out.println("\t>>>>> 6 Notas 4 Efetivas <<<<<\n\n\n\n");
				for(; i < 6; i++)
				{
					System.out.println("\nDigite a nota "+j);
					notas_6[i] = lerbufferteclado.nextDouble();
					if(notas_6[i] < 0)
					{
						System.err.println("\nA nota será convertida para o valor positivo!!!");
						notas_6[i] = TrataNotaNegativa(notas_6,i);
					}
					else if (notas_6[i] > 10)
					{
						System.err.println("\nA notas maiores que 10 serão atribuídos 10!!!");
						notas_6[i] = TrataNotaMaiorQueDez(notas_6,i);
					}
					j++;
				}
				sucesso = false;
				limpatela();
				NotaEfetiva(notas_6, i);
			}
			catch (InputMismatchException erro1)
			{
				limpatela();
				System.err.println("\n\nDigite as notas corretamente!!!\n\nSomente números positivos\n\n\n!!!");
				lerbufferteclado.nextLine();				
			}
		}
		while(sucesso);
	}
	
	//Início Funcao Limpa Tela
	
	private static void limpatela()
	{
		int n;
		for (n = 0; n < 100; n++)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n");
		}
	}
	
	private double TrataNotaNegativa(double []nota_corrige, int indice_corrige)
	{
		double valor_corrige = 0;
		nota_corrige[indice_corrige] = nota_corrige[indice_corrige] * -1;
		valor_corrige = nota_corrige[indice_corrige];
		return valor_corrige;
	}
	
	private double TrataNotaMaiorQueDez(double []nota_corrige, int indice_corrige)
	{
		double valor_corrige = 0;				
		nota_corrige[indice_corrige] = 10;
		valor_corrige = nota_corrige[indice_corrige];
		return valor_corrige;
	}
	
	private void NotaEfetiva(double[]nota_final, int indice_arranjo)
	{
		int i = 0; 
		double media = 0; 
		double maior_nota = 0; 
		double menor_nota = 0;
		
		maior_nota = nota_final[i];
		menor_nota = nota_final[i];
		
		for(;i < indice_arranjo; i++)
		{
			if(nota_final[i] > maior_nota)
			{
				maior_nota = nota_final[i];
			}
			else if(nota_final[i] < menor_nota)
			{
				menor_nota = nota_final[i];
			}		
		}
		i = 0;
		for(; i < indice_arranjo; i++)
		{
			media += nota_final[i];				
		}	
		media = media - (maior_nota + menor_nota);
		media = media / 4;
		
		limpatela();
		System.out.println("\t Média atleta = "+media);		
	}

}