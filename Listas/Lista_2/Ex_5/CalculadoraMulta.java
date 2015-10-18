import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraMulta 

{
	public CalculaMulta calculaMulta;
	
	public void EntradaDados() 
	{
		int timeid = 0, jogadorid = 0, cartao_amarelo = 0, cartao_vermelho = 0;
		boolean sucesso = true;
		Scanner lerbufferteclado = new Scanner(System.in);
		
		do
		{
			try
			{				
				System.out.println("\n***** >>> Cálculo Multa Cartão <<< *****\n");
				System.out.println("\n************** >>> CBF <<< *************\n");
				
				System.out.println("\nInsira o id do Time:\n->\n");
				timeid = lerbufferteclado.nextInt();
				System.out.println("\nInsira o id do Jogador:\n->\n");
				jogadorid = lerbufferteclado.nextInt();
				System.out.println("\nInsira o nº de cartões amarelos\n->\n");
				cartao_amarelo = lerbufferteclado.nextInt();
				System.out.println("\nInsira o nº de cartões vermelhos\n->\n");
				cartao_vermelho = lerbufferteclado.nextInt();
				
				sucesso = false;
				
				limpatela();
				
				ValorMulta(cartao_amarelo, cartao_vermelho);
			}
			catch (InputMismatchException erro1)
			{
				limpatela();
				System.err.println("Insira somente inteiros!!!\nLetras são proibidas!!!\n\nConsulte a documentação.\n");
				lerbufferteclado.nextLine();
			}
		}
		while(sucesso);
	}
	
	private void ValorMulta (int cartao_amarelo, int cartao_vermelho)
	{
		double multa_total = 0;
		multa_total = (cartao_amarelo * 1000.20) + (cartao_vermelho * 4523.75);
		System.out.println("\n\nMulta à pagar R$ "+multa_total);		 
	}
	
	//Inicio Funcao Limpa Tela
	
			private static void limpatela()
			{
				int n;
				for (n = 0; n < 100; n++)
				{
					System.out.println("\n\n\n\n\n\n\n\n\n\n");
				}
			}

}