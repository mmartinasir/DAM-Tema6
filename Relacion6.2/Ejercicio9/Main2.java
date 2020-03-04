package Ejercicio9;

import java.io.File;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		File file;
		String directorio = "";
		Scanner input = new Scanner(System.in);

		System.out.println("Escriba la ruta absoluta donde desee crear el directorio");
		directorio = input.nextLine();
		file = new File(directorio);

		if (file.mkdir()) {
			System.out.println("Directorio creado con éxito");
		} else {
			System.out.println("ERROR: El directorio ya existe");
		}

	}

}
