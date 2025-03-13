import java.util.Locale;
import java.util.Scanner;

public class exercicio1_sozinho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorHoras, salário;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHoras = sc.nextDouble();
		
		
		salário = horas * valorHoras;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salário);
		
		sc.close();
	}

}
