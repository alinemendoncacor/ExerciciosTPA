import java.util.Scanner;
public class ComparaTexto {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite o nome: ");
		nome = in.next();
		
		if (nome.equalsIgnoreCase("aline")){
			System.out.println("nome correto");
		}else {
			System.out.println("nome errado");
		}


	}

}