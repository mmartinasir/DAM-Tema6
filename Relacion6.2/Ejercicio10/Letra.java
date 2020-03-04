package Ejercicio10;

public class Letra {
	
	//Attributes
	private char letra;
	private int cantidad;
	private Letra letraSiguiente;

	//Builders
	public Letra(char letra) {
		this.letra = letra;
		this.cantidad = 1;
	}

	//Getters and Setters
	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Letra getLetraSiguiente() {
		return letraSiguiente;
	}

	public void setLetraSiguiente(Letra letraSiguiente) {
		this.letraSiguiente = letraSiguiente;
	}

	@Override
	public String toString() {
		String result = "";
		result = result+"Letra: "+this.letra;
		result = result+" Cantidad: "+this.cantidad;
		result = result+"\n";
		return result;
	}
	
	
	
	

}
