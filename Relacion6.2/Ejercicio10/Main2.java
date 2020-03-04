package Ejercicio10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {
		
		String fichero = "";
		File file;
		Scanner input = new Scanner(System.in);
		Scanner read;
		String linea = "";
		char letra;
		ListaDeLetras lista = new ListaDeLetras();
		
		System.out.println("Escriba la ruta del fichero que desea leer");
		fichero = input.nextLine();
		file = new File(fichero);
		read = new Scanner(file);
		
		while (read.hasNext()) {
			linea = read.nextLine();
			
			for (int i = 0; i < linea.length(); i++) {
				letra = linea.charAt(i);
				if (lista.exists(letra)) {
					lista.aumentarCantidad(letra);
				} else {
					Letra letra2 = new Letra(letra);
					lista.add(letra2);
				}
			}
		}
		
		System.out.println(lista);
		
		read.close();
		input.close();
		

	}

}
