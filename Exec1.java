import java.util.Random;
import java.util.Scanner;

public class Exec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vet1 = new int[12];
		Random rdNum = new Random();
		Scanner entradaPosicao = new Scanner(System.in);
		int valor1, valor2;
		
		
		for (int i = 0; i <vet1.length; i++) {
			vet1[i] = rdNum.nextInt(20);
			System.out.print("|" + vet1[i]);
		}
		
		System.out.println("");
		System.out.println("Informe duas posições do vetor: ");
		valor1 = entradaPosicao.nextInt();
		valor2 = entradaPosicao.nextInt();
		
		System.out.println("A soma dos valores entrados na posição informada é: " + ((vet1[valor1-1])+vet1[valor2-1]));
		
		
		entradaPosicao.close();
		System.exit(0);

	}

}
