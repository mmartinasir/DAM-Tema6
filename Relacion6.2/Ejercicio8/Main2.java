package Ejercicio8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {
	
		String directorio = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Indique el directorio: ");
		directorio = input.nextLine();
		File file = new File(directorio);
		File subdirectorio;
		File[] files2;
		File[] files = file.listFiles();
		
		System.out.println("Mostrando archivos de la carpeta: ");
		System.out.println();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				subdirectorio = new File(files[i].getAbsolutePath());
				files2 = subdirectorio.listFiles();
				System.out.println("Mostrando archivos del subdirectorio "+files[i].getName());
				for (int j = 0; j < files2.length; j++) {
					System.out.println(" -"+files2[j].getName());
				}
				System.out.println();
			} else {
				System.out.println(files[i].getName());
			}
		}
		
		input.close();
		
	}

}
