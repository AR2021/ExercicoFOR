import java.util.Scanner;

public class Nome10 {

	public static void main(String[] args) {
		//um programa, usando For,que mostre seu nome 10 vezes na tela;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite seu nome :");
		String nome = ler.nextLine();
		int x = 0;
		for(x = 0; x<10; x++) {
			System.out.println(nome);
		}
		ler.close();
		
		
		
	}

}
