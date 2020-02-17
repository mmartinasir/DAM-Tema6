package Ejercicio1;

public class Triangulo {
	public static int numLados = 3;
	private int lado1;
	private int lado2;
	private int lado3;

	// Builders

	Triangulo() {
		lado1 = 1;
		lado2 = 1;
		lado3 = 1;
	}

	Triangulo(int a, int b, int c) throws TrianguloIlegalException {
		if (a + b > c) {
			lado1 = a;
			lado2 = b;
			lado3 = c;
		} else {
			if (a + c > b) {
				lado1 = a;
				lado2 = b;
				lado3 = c;
			} else {
				if (b + c > a) {
					lado1 = a;
					lado2 = b;
					lado3 = c;
				} else {
					throw new TrianguloIlegalException("Argumentos ilegales");
				}
			}
		}
	}

	// Getters and Setters

	public static int getNumLados() {
		return numLados;
	}

	public static void setNumLados(int numLados) {
		Triangulo.numLados = numLados;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		if (lado1 > 0)
			this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		if (lado2 > 0)
			this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		if (lado3 > 0)
			this.lado3 = lado3;
	}

	// Métodos del Triangulo

	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
	}

	public int calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}
}
