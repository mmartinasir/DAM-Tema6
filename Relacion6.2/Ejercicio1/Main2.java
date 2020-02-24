package Ejercicio1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException, InputMismatchException {
		File fichero = new File("./Relacion6.2/Ejercicio1/fichero.txt");
		PrintWriter output = new PrintWriter(fichero);
		Scanner input = new Scanner(System.in);
		int num = 0;

		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				System.out.println("ERROR: No se ha podido crear el fichero.");
			}
		}

		try {
			for (int i = 0; i < 15; i++) {
				System.out.println("Escribe el " + (i + 1) + "º número");
				num = input.nextInt();
				output.println(num);
			}
		} catch (InputMismatchException e) {
			System.out.println("ERROR: No se ha introducido un número. Intentelo de nuevo");
		}

		output.close();
		input.close();

	}

}
