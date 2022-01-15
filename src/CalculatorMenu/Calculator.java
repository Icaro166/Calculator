package CalculatorMenu;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		boolean finalizado = false;
		final Scanner scanner = new Scanner(System.in);

		Integer number;
		while (!finalizado) {
			try {
				double firstNumber = 0;
				double secondNumber = 0;
				double result = 0;

				System.out.println("  MENU ");
				System.out.println("1-Somar");
				System.out.println("2-Subtrair");
				System.out.println("3-Multiplicar");
				System.out.println("4-Dividir");
				System.out.println("5-Sair");
				number = scanner.nextInt();

				if (number < 5 && number > 0) {
					System.out.printf("Informe o primeiro valor: ");
					firstNumber = scanner.nextDouble();
					System.out.printf("Informe o primeiro valor: ");
					secondNumber = scanner.nextDouble();
				}

				switch (number) {
				case 1:
					result = firstNumber + secondNumber;
					System.out.println("O resultado da soma foi igual a " + result);
					break;

				case 2:
					result = firstNumber - secondNumber;
					System.out.println("O resultado da subtração foi: " + result);
					break;
				case 3:
					result = firstNumber * secondNumber;
					System.out.println("O resultado da multiplicação foi: " + result);
					break;
				case 4:
					if (firstNumber == 0 || secondNumber == 0) {
						System.out.println("Essa divisão é impossivel!");
						break;
					}
					result = firstNumber / secondNumber;
					System.out.println("O resultado da divisão foi: " + result);
					break;
				case 5:
					finalizado = true;
					System.out.println("Você saiu.");
					break;
				default:
					System.out.println("Opção inválida.");
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("Ocorreu um erro!" + "" + " Tente novamente usando número!");
			}
		}
	}
}
