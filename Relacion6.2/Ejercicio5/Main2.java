package Ejercicio5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {

		File file = new File("./Relacion6.2/Ejercicio5/fichero.txt");
		Scanner read = new Scanner(file);
		// Caracteres, palabras y líneas (en ese orden)
		int[] contador = new int[3];
		// Atributo al que se le asignará cada palabra del fichero
		String palabra = "";

		while (read.hasNext()) {
			// Contador de palabras
			contador[1]++;
			
			palabra = read.next();
			// Contador de carácteres
			for (int i = 0; i < palabra.length(); i++) {
				if (palabra.charAt(i) != ' ') {
					contador[0]++;
				}
			}
		}
		
		//Contador de líneas
		Scanner readLines = new Scanner(file);
		while (readLines.hasNext()) {
			if (readLines.nextLine() != null) {
				contador[2]++;
			}
		}


		System.out.println("Hay " + contador[0] + " carácteres en el fichero");
		System.out.println("Hay " + contador[1] + " palabras en el fichero");
		System.out.println("Hay "+contador[2]+" líneas en el fichero");

		read.close();
		readLines.close();

	}

}
