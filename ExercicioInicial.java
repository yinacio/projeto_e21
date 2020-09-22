import java.util.Random;

public class ExercicioInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Um programa que leia um vetor de 20 posições
		// Gerar um novo vetor de 20 posições como os valores sendo a metade da primeiro
		// vetor
		// Caso o valor do vetor 1 seja menor que 5 o valor do segundo será igual a 0

		int[] vet1 = new int[20];
		float[] vet2 = new float[20];
		Random numAleatorio = new Random();

		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = numAleatorio.nextInt(20);
			System.out.print("|" + vet1[i]);
		}
		System.out.println("");

		for (int i = 0; i < vet2.length; i++) {
			switch (vet1[i]) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				vet2[i] = 0;
				break;
			default:
				vet2[i] = vet1[i]/2;

			}
			
			System.out.print("|" + vet2[i]);

		}
	}

}
