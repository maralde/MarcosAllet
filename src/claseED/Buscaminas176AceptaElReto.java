package claseED;

import java.util.Scanner;

public class Buscaminas176AceptaElReto {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		

		System.out.println("Numero de columnas: ");
		int columnas = tec.nextInt();
		System.out.println("Numero filas: ");
		int filas = tec.nextInt();
		tec.nextLine();
		String[][] tablero = new String[columnas][filas];
		for (int i = 0; i < columnas; i++) {
			for (int j = 0; j < filas; j++) {
				System.out.println("Zona " + (i+1) + " " + (j) + ": ");
				tablero[i][j] = tec.next();
			}
		}
		int minas = calcularMinas(tablero);
		System.out.println("Numeros minas: " + minas);
	}

	public static int calcularMinas(String[][] n){
		String mina = "*";
		String nomina = "-";
		int contTotal = 0;
		int cont;
		for (int i = 1; i < n.length -1; i++) {
			for (int j = 1; j < n[0].length -1; j++) {
				cont = 0;
				for (int x = i-1, xv2 = i+1; x <= xv2; x++) {
					for (int y = j-1, yv2 = j+1; y <= yv2; y++) {
						if(n[i][j].equals(nomina) && n[x][y].equals(mina)){
							cont++;
						}
					}
				}
				if(cont >= 6){
					contTotal++;
				}
			}
		}
		return contTotal;
			
		}

}
