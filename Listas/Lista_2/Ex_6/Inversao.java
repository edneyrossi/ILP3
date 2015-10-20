import java.util.Scanner;
import java.util.InputMismatchException;

public class Inversao 
{
	public Inversor inversor;
	
	public void EntradaDados()
	{
		int entrada = 0;
		boolean sucesso = true;
		Scanner lerbufferteclado = new Scanner(System.in);
		do
		{
			try
			{
				System.out.println("### Inversor de número inteiro ###\n\n");
				System.out.println("\n>>>>>>>> Somente centenas <<<<<<<<\n");
				System.out.println("Insira um número inteiro para invertê-lo:\n->\n");
				entrada = lerbufferteclado.nextInt();
				
				sucesso = false;
				limpatela();				
				Manipulador(entrada);
				
			}
			
			catch (InputMismatchException erro1)
			{
				limpatela();
				System.err.println("\nInsira somente inteiros!\nInsira somente centenas de -999 até 999!");
				lerbufferteclado.nextLine();
			}
		}
		while (sucesso);
	}
			
	private void Manipulador (int entrada)
	{
		if (entrada < -999 || entrada > 999)
		{
			entrada = -1;
			System.out.println("\n"+entrada);
		}
		
		else if (entrada < 0)
		{
			entrada = entrada * -1;
			int i = 0;
			int j = 0;
			int armazenador[] =  new int[3];
						  
            while (entrada > 0) 
            {  
            	i = i * 10;  
            	i = entrada % 10;  
            	entrada = entrada / 10;
            	armazenador[j] = i;
            	j++;            		
            }
            
            System.out.printf("\n-");
            for (j = 0; j<=2; j++)
            {
            	System.out.printf(""+armazenador[j]);
            }	
            
		}
		else
		{
			int i = 0;  
			  
            while (entrada > 0) 
            {  
            	i = i * 10;  
            	i = entrada % 10;  
            	entrada = entrada / 10;
            	System.out.printf(""+i);
            }   
              
            
		}
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