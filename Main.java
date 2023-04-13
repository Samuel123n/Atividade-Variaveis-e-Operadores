package JavaTech;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o salario");
		float salario = leia.nextFloat();

		System.out.println("Digite o abono");
		float abono = leia.nextFloat();

		float novoSalario = salario + abono;

		System.out.printf("Novo salario: %.2f%n", novoSalario);

	}

}
