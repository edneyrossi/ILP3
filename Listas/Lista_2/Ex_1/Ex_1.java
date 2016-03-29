public class Ex_1
{
	public static void main(String[] args)
	{
		int a =3;
		int b =5;
		int c = 8;
		int d = a * (b + c * 3) - 7;
		int e = a - b - c;
		
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);

		a = a + 1;
		b = (4 * a + 1)/ 10;
		c = (4 * a + 1) % 10;

		System.out.println("\n"+a+" "+b+" "+c+" "+d+" "+e);	
	}
}
/*
Resposta do exercício:
Saída:
run:
3 5 8 80 -10

4 1 7 80 -10
CONSTRUÍDO COM SUCESSO (tempo total: 0 segundos)
*/
