package Ejercicio2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {
		File fichero = new File("./Relacion6.2/Ejercicio1/fichero.txt");
		Scanner input = new Scanner(fichero);

		while (input.hasNext()) {
			System.out.println(input.next());
		}

	}

}
