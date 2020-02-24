package Ejercicio3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException, InputMismatchException {

		File file = new File("/./Relacion6.2/Ejercicio3/primos.dat");
		PrintWriter output = new PrintWriter(file);
		Scanner input = new Scanner(System.in);
		int primo1 = 0;
		int primo2 = 0;
		boolean esPrimo = true;

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("ERROR: No se pudo crear el fichero");
			}
		}

		try {
			do {
				System.out.println("Escriba el primer número del rango");
				primo1 = input.nextInt();
				System.out.println("Escriba el segundo número del rango");
				primo2 = input.nextInt();
				if (primo2 > primo1) {
					System.out.println("ERROR: El primer número no puede ser menor que el segundo");
				}

			} while (primo2 > primo1);
		} catch (InputMismatchException e) {
			System.out.println("ERROR: No ha introducido un número. Por favor inténtelo de nuevo");
		}

		for (int i = primo1; i < primo2; i++) {
			for (int j = i; j < primo2; j++) {
				if (i % j == 0) {
					esPrimo = false;
				}
			}
			if (esPrimo) {
				output.println(i);
			}
		}
	}

}
