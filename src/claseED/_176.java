package claseED;

import java.util.Scanner;

public class _176 {
	public static void main(String[] args) {
		//Este es el ejercicio 176, introduces las columnas y las filas del tablero, se va introduciendo signo a signo y sale el resultado que se pide
		//Abrir comandos para efectuar prueba
		Scanner tec = new Scanner(System.in);

		int columnas = tec.nextInt();
		int filas = tec.nextInt();
		String[][] tablero = new String[filas][columnas];
		tec.nextLine();
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = tec.nextLine();
			}
		}
		System.out.println(hayMuchasMinas(tablero));

	}

	public static int hayMuchasMinas(String[][] v) {
		int cont = 0;
		int cont_total = 0;

		for (int i = 1; i < v.length - 1; i++) {
			for (int j = 1; j < v[0].length - 1; j++) {
				cont = 0;
				for (int k = i - 1; k <= i + 1; k++) {
					for (int k2 = j - 1; k2 <= j + 1; k2++) {
						if (v[i][j].equals("-") && v[k][k2].equals("*")) {
							cont++;
						}
					}
				}
				if (cont >= 6) {
					cont_total++;
				}
			}
		}
		return cont_total;
	}
}
