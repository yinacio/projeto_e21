import java.util.Random;

public class Exec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vet1 = new int[16];
		int aux;
		Random rdNum = new Random();
		
		
		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = rdNum.nextInt(100);
			System.out.print("|"+vet1[i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < vet1.length/2; i++) {
			aux=vet1[i];
			vet1[i]=vet1[i+(vet1.length/2)];
			vet1[i+(vet1.length/2)]=aux;
		}
		
		for (int i = 0; i < vet1.length; i++) {
			System.out.print("|" + vet1[i]);
		}
		
		System.exit(0);

	}

}
