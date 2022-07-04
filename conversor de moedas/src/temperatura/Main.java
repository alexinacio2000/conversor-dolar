
package temperatura;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
     
		
		char resp;
		
		do {
			System.out.print("Digite o valor em Dólar: ");
			double C = sc.nextDouble();
			double F = C * 5.32;
			System.out.printf("A quantia referente a esse valor em BRL é: %.2f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
	}

}
