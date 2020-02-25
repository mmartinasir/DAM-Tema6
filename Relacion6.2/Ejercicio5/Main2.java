package Ejercicio5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("./Relacion6.2/Ejercicio5/fichero.txt");
		Scanner read = new Scanner(file);
		//Caracteres, palabras y líneas (en ese orden)
		int[] contador = new int[3];
		String palabra = "";
		
		while (read.hasNext()) {
			palabra = read.next();
			for (int i = 0; i < palabra.length(); i++) {
				if (palabra.charAt(i) != ' ') {
					contador[0]++;
				}
			}
		}
		
		System.out.println("Hay "+contador[0]+" carácteres en el fichero");
		
		read.close();

	}

}
