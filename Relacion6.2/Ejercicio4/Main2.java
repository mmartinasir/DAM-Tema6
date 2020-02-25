package Ejercicio4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {
		File file = new File("./Relacion6.2/Ejercicio4/fichero.txt");
		Scanner read = new Scanner(file);
		Scanner input = new Scanner(System.in);
		String palabra = "";
		String palabraEnFichero = "";
		int contador = 0;

		System.out.println("Escriba la palabra que desea contar en el fichero");
		palabra = input.next();

		while (read.hasNext()) {
			palabraEnFichero = read.next();
			if (palabraEnFichero.equals(palabra)) {
				contador++;
			}
		}

		System.out.println("La palabra "+palabra+" está escriba " + contador + " veces en el fichero");
		read.close();
		input.close();

	}

}
