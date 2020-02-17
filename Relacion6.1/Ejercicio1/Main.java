package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		int a = 17;
		int b = 20;
		int c = 10;
		
		try {
			Triangulo prueba = new Triangulo(a,b,c);
		} catch (TrianguloIlegalException e) {
			System.out.println("No se puede");
		}

	}

}
