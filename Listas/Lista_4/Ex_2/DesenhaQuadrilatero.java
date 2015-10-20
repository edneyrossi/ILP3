import java.util.Scanner;
import java.util.InputMismatchException;

public class DesenhaQuadrilatero 
{
	public void EntradaDados()
	{
		int n = 0, m = 0;
		boolean sucesso = true;
		Scanner lerbufferteclado = new Scanner (System.in);
		do
		{
			try
			{
				System.out.println("\t########### Quadrilátero ############\n\t");
				System.out.println("\t### Parâmetros por linha e coluna ###\n\t");
				System.out.println("\t### Digite somente números inteiros ###\n\t");
				System.out.println("\n\n\tDigite o número de linhas\n->");
				n = lerbufferteclado.nextInt();
				System.out.println("\n\tDigite o número de colunas\n->");
				m = lerbufferteclado.nextInt();
				
				sucesso = false;
				limpatela();
				
				Ferramenta(n,m);
			}
			
			catch (InputMismatchException erro1)
			{
				limpatela();
				System.err.println("\nInsira somente inteiros!\n");
				lerbufferteclado.nextLine();
			}
		}
		while(sucesso);
	}
	
	private void Ferramenta(int linha, int coluna)
	{
		for (int i = 1; i <= linha; i++)
		{
			System.out.println("");
		
			for (int j = 1; j <= coluna; j++)
			{
				if (i == 1 || linha == i)
				{
					System.out.printf("*");
				}
				else if (j == 1 || coluna == j)
				{
					System.out.printf("*");
				}
				else
				{
					System.out.printf(" ");
				}
			}
		}	
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