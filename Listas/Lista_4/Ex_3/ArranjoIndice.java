import java.util.Scanner;
import java.util.InputMismatchException;

public class ArranjoIndice 
{
	public void EntradaDados()
	{
		boolean sucesso = true;
		Scanner lerbufferteclado = new Scanner(System.in);		
		int t = 0;				
		do
		{
			try
			{
				System.out.println("\t######## Arranjo E Indice ########\n");
				System.out.println("\t>>> Retorna Conteúdo E Indice <<<\n");
				System.out.println("\n\n Digite o quantos números deseja digitar:\n->");
				t = lerbufferteclado.nextInt();
				if(t < 0)
				{
					t = TrataErroTamanhoArrayNegativo(t);
					
				}
				
				limpatela();
				float arranjo[] = new float[t];
				for (int i = 0; i < t; i++)
				{
					System.out.println("\nDigite um número:\n->");
					arranjo[i] = lerbufferteclado.nextFloat();
				}
				sucesso = false;
				limpatela();
				RetornaArranjoIndice(arranjo,t);
			}
			
			
			catch (InputMismatchException erro1)
			{
				limpatela();
				System.err.println("\nInsira somente números!\n");
				lerbufferteclado.nextLine();
			}			
		}
		while(sucesso);				
	}
	
	private void RetornaArranjoIndice(float []arranjo, int indice)
	{
		float maior_numero = 0;
		float indice_maior = 0;
		int i = 0;
		
		maior_numero = arranjo[i];
		indice_maior = i;
				
		for (i = 1; i < indice; i++)
		{			
			if (arranjo[i] > maior_numero)
			{
				maior_numero = arranjo[i];
				indice_maior = i;
			}			
		}
		System.out.println("\nMaior = "+maior_numero);
		System.out.println("\nPosição = "+indice_maior);		
	}
	
	private int TrataErroTamanhoArrayNegativo(int tamanho)
	{
		return tamanho = tamanho * -1;
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
}	