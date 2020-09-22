import java.util.Random;
import java.util.Scanner;

public class Exec4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rdNum = new Random();
		Scanner entradaDados = new Scanner(System.in);
		int[] vet = new int[20];
		int valorEscolhido;
		
		for (int i = 0; i < vet.length; i++ ) {
			vet[i] = rdNum.nextInt(50);
			
			System.out.print("|" + vet[i]);
		}
		
		System.out.println("");
		System.out.println("Informe um valor que vc acha que tem no vetor: ");
		valorEscolhido = entradaDados.nextInt();
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == valorEscolhido) {
				System.out.println("O valor " + valorEscolhido + " foi encontrado na posição " + (i+1) + "!");
			}
		}
		
		entradaDados.close();
		System.exit(0);

	}

}
