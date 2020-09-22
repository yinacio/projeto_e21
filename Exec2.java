
public class Exec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vet = new int[10];
		int j=0;
		boolean teste = true;
				
				
		for (int i = 0; i < vet.length; i++) {
			do {
				if (j%2 != 0) {
					vet[i] = j;
					teste = false;
					j++;
				}else {
					j++;
				}
			} while (teste);
			teste = true;
			System.out.print("|" + vet[i]);
		}

		System.exit(0);
	
	}

}


