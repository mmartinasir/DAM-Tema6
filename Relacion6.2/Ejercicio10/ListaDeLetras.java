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

	//ToString
	@Override
	public String toString() {
		String result = "";
		Letra aux = this.primero;
		while (aux != null) {
			result = result+aux;
			aux = aux.getLetraSiguiente();
		}
		return result;
		
	}

	// Methods
	public boolean exists(char c) {
		if (this.primero == null) {
			return false;
		}
		
		Letra aux = this.primero;
		while (aux != null && aux.getLetra() != c) {
			aux = aux.getLetraSiguiente();
		}

		if (aux == null) {
			return false;
		} else {
			return true;
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
			Letra aux = primero;
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
