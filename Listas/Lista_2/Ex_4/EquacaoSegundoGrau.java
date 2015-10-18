import java.util.InputMismatchException;
import java.util.Scanner; // Aqui chamei a Classe Scanner para poder ler dados do teclado, poderia usar o JOPTIONPANE como na linha abaixo. Usei essa classe pois quero a saída no terminal
//import javax.swing.JOptionPane;

public class EquacaoSegundoGrau 
{
	public static void main(String[] args)
	
	{
		//Inicio Entrada dados
		
		double a_in = 0, b_in = 0, c_in = 0;
		boolean sucesso = true; //tratamento de erro
		Scanner lerbufferteclado = new Scanner(System.in);
		
		//Fim Entrada dados
		
		System.out.println("\n+++ Cálculo Raízes Equação Segundo Grau +++\n");
		
		do
		{
			try
			{
		
				System.out.println("\nEntre com o coeficiente de a (a²):\n-> ");
				a_in = lerbufferteclado.nextDouble();
			
				System.out.println("\nEntre com o coeficiente de b (b):\n-> ");
				b_in = lerbufferteclado.nextDouble();
			
				System.out.println("\nEntre com o coeficiente de c (c):\n-> ");
				c_in = lerbufferteclado.nextDouble();
			
				sucesso = false; // tratamento erro
				
			}
			
			catch (InputMismatchException erro1)
			{
				System.err.println("Insira somente números reais!!!\nLetras são proibidas!!!\n");
				lerbufferteclado.nextLine();
				limpatela();
			}
		}
	while(sucesso);
		
		limpatela(); // Limpar a tela
		
		calculodelta(a_in,b_in,c_in); // chama funcao para calcular delta		
}
	//Inicio funcao delta
		public static void calculodelta(double a, double b, double c)
		{
			double delta_in = 0;
			delta_in = Math.pow(b,2) - 4 * a * c;
			
			if (delta_in < 0)
			{
				System.out.println("\n\n***"+a+"x² "+b+"x "+c+" = 0\n\n***");
				System.out.println("\n\nDelta = "+delta_in);
				System.out.println("\n\nDelta negativo!\n\nNão existe solução no conjunto dos números reais R.");
			}
			else if (delta_in >= 0)
			{
				System.out.println("\n\n*** "+a+"x² "+b+"x "+c+" = 0 ***\n\n");
				System.out.println("\n\nDelta = "+delta_in);
				raizes(delta_in, a, b, c); // chama funcao raizes				
			}
			
						
		}
	//Fim funcao delta
		
	//Inicio funcao raizes
		public static void raizes(double delta_out, double a, double b, double c)
		{
			double x1 = 0, x2 = 0;
			
			x1 = (-b + (Math.sqrt(delta_out))) / (2 * a);
			x2 = (-b - (Math.sqrt(delta_out))) / (2 * a);
			
			System.out.println("\n\nx1 = "+x1);
			System.out.println("\n\nx2 = "+x2);
		}
	//Fim funcao raizes
		
	//Inicio Funcao Limpa Tela
		
		public static void limpatela()
		{
			int n;
			for (n = 0; n < 100; n++)
			{
				System.out.println("\n\n\n\n\n\n\n\n\n\n");
			}
		}
	
}	