import java.util.Random;

public class Exec5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rdNum = new Random();
		int[] vet = new int[40];
		int conta = 0;
		
		for ( int i = 0; i < vet.length; i++ ) {
			vet[i] = rdNum.nextInt(100);
			System.out.print("|" + vet[i]);
		}
		
		
		System.out.println("");
		
		for ( int i = 0; i < vet.length; i++ ) {
			if (vet[i]%2 == 0)
				conta++;
		}
		
		System.out.println("Há " + conta + " números pares no vetor");

	}

}
