import java.util.Scanner;
public class OrdenaVetor {



	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);	
		int a, b, r;
		
		System.out.println("leia n1");
		a = in.nextInt();
		
		System.out.println("leia n2");
		b = in.nextInt();
		
		System.out.println("Resultado soma  "+ soma(a,b) );
		System.out.println("Resultado subtracao "+subtrai(a,b));
		System.out.println("Resultado multiplicacao "+multiplica(a,b));
		System.out.println("Resultado divisão "+divide(a,b));

	}

	static int soma(int n1, int n2) {
		int r = n1+n2;
		return r;
		
	}
	
	static int subtrai(int n1, int n2) {
		int r = n1-n2;
		return r;
		
	}
	
	static int multiplica(int n1, int n2) {
		int r = n1*n2;
		return r;
		
	}
	static double divide(double n1, double n2) {
		double r = n1/n2;
		return r;
		
	}
	

}
