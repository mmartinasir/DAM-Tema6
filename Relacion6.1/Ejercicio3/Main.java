package Ejercicio3;

public class Main {

	public static void main(String[] args) {
		int binario = 101;

		try {
			System.out.println(bin2dec(binario));
		} catch (FormatoBinarioException e) {
			System.out.println("ERROR: El número no es binario");
		}

	}

	public static int bin2dec(int b) throws FormatoBinarioException {
		if (!comprobarBinario(b)) {
			throw new FormatoBinarioException("No es binario");
		}
		
		int aux = 0;
		int result = 0;
		
		while (b != 0) {
			aux = b % 10;
		}

		return result;
	}

	public static boolean comprobarBinario(int i) {
		if (i < 10) {
			if (i == 1 || i == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return (comprobarBinario(i/10) && comprobarBinario(i%10));
		}
	}

}
