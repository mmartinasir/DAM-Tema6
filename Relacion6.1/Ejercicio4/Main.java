package Ejercicio4;

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println(caracterEn("Inmaculada",10));
		} catch (FueraDeRangoException e) {
			System.out.println(e.getMessage());
		}
	}

	public static char caracterEn(String cad, int pos) throws FueraDeRangoException {
		char[] caracteres = cad.toCharArray();
		if (pos >= cad.length()) {
			throw new FueraDeRangoException("ERROR: La posición elegida está fuera del rango del array");
		} else {
			return caracteres[pos];
		}
	}

}
