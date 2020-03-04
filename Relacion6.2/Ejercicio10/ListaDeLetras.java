package Ejercicio10;

public class ListaDeLetras {

	// Attributes
	private Letra primero;

	// Builders
	public ListaDeLetras() {
		this.primero = null;
	}

	// Getters and Setters
	public Letra getPrimero() {
		return primero;
	}

	public void setPrimero(Letra primero) {
		this.primero = primero;
	}

	// Methods
	public boolean exists(char c) {
		if (this.primero == null) {
			return false;
		}
		
		Letra aux = this.primero;
		while (aux.getLetra() != c) {
			aux = aux.getLetraSiguiente();
		}

		if (aux.getLetra() == c) {
			return true;
		} else {
			return false;
		}
	}

	public Letra search(Letra l) {
		Letra aux = this.primero;
		while (aux.getLetra() != l.getLetra()) {
			aux = aux.getLetraSiguiente();
		}

		return aux;
	}

	public void add(Letra l) {
		if (this.primero == null) {
			this.primero = l;
		} else {
			Letra aux = l;
			while (aux.getLetraSiguiente() != null) {
				aux = aux.getLetraSiguiente();
			}
			aux.setLetraSiguiente(l);
		}
	}

	public void aumentarCantidad(char l) {
		Letra aux = this.primero;
		while (aux.getLetra() != l) {
			aux = aux.getLetraSiguiente();
		}
		aux.setCantidad(aux.getCantidad() + 1);
	}

}
