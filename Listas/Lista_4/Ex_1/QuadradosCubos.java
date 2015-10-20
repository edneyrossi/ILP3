public class QuadradosCubos 
{
	public void CalculoQuadradoCubos()
	{
		int i = 0;
		for (i = 1; i <= 15; i++)
		{	
			System.out.println("|"+i+"\t|"+Math.pow(i,2)+"\t|"+Math.pow(i, 3)+"\t|");
		}
		
	}
}