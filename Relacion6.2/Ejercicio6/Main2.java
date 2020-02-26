package Ejercicio6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {
		File file = new File("./Relacion6.2/Ejercicio6/fichero.txt");
		File file2 = new File("./Relacion6.2/Ejercicio6/fichero2.txt");
		Scanner read = new Scanner(file);
		Scanner input = new Scanner(System.in);
		String p1 = "";
		String p2 = "";
		String linea = "";
		String linea2 = "";
		String palabra = "";
		int contador = 0;

		// Preguntamos las palabras
		System.out.println("Escriba la palabra que desea sobreescribir");
		p1 = input.next();
		System.out.println("Escriba la palabra sustituta");
		p2 = input.next();

		// Iniciamos la escritura en el fichero 2
		PrintWriter output = new PrintWriter(file2);

		// Empezamos la sustitución
		while (read.hasNext()) {
			linea = read.nextLine();
			contador = 0;
			while (contador < linea.length()) {
				palabra = "";

				if (linea.charAt(contador) == p1.charAt(0)) {
					for (int i = 0; i < p1.length(); i++) {
						if (contador+i < linea.length()) {
							palabra = palabra + linea.charAt(contador + i);
						}
					}
				}
				if (palabra.equals(p1)) {
					output.print(p2);
					if (p1.length() > p2.length()) {
						contador = contador + (p2.length()-p1.length());
					} else {
						contador = contador + (p2.length()+(p2.length()-p1.length()));
					}
				} else {
					output.print(linea.charAt(contador));
					contador++;
				}
			}
			output.println();
		}
		read.close();
		input.close();
		output.close();

		//Sustituimos el fichero original, cambiando los Scanners
		read = new Scanner(file2);
		output = new PrintWriter(file);
		
		while (read.hasNext()) {
			linea = read.nextLine();
			output.println(linea);
		}
		
		file2.delete();
		read.close();
		output.close();
	}
}
