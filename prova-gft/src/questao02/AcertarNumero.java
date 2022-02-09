package questao02;

import java.util.Random;
import java.util.Scanner;

public class AcertarNumero {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero;
		int tentativa;
		boolean sorte = false;

		Random random = new Random();
		numero = random.nextInt(10);

		do {
			System.out.println("Adivinhe o numero de 0 a 10: ");
			tentativa = entrada.nextInt();

			if (tentativa == numero) {
				System.out.println("Parabeeeeeéns!!! Você acertou :D");
				sorte = true;
			} else {
				System.out.println("Que pena!! Você errou :( Tente novamente!");
				sorte = false;
			}

		} while (sorte == false);

		entrada.close();

	}

}
