package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 1;
		
		try {
			Triangulo prueba = new Triangulo(a,b,c);
		} catch (TrianguloIlegalException e) {
			System.out.println("No se puede");
		}

	}

}
