package test_zone;

import java.util.*;

public class ciudad_Result {

	Scanner teclado1 = new Scanner(System.in);
	Scanner teclado2 = new Scanner(System.in);
	
	int entrada1 = 0, casillas = 10, opcion = Integer.MAX_VALUE;
	String entrada2 = "null";
	
	int numero_de_centros[] = new int[casillas];
	int numero_de_tambos[] = new int[casillas * 10];
	int ciudad[] = new int[casillas];
	String nombre_de_tambos[] = new String[casillas * 10];
	String departamento[] = new String[casillas];
	String centros[] = new String[casillas * 3];
	
	
	public static void main(String[] args) {
		ciudad_Result cr = new ciudad_Result();
		cr.menu();
		
	}
	////////////////////////////////////////////////////
	public void menu() {
		do {
			System.out.println("___MENU___");
			System.out.println("(1)| Buscar ciudad.");
			System.out.println("(2)| Registrar ciudad.");
			System.out.println("(3)| Eliminar ciudad.");
			System.out.println("(4)| Atras.");
			System.out.println();
			opcion = teclado1.nextInt();
		
		
			switch (opcion) {
			case 1:
				buscar();
				break;
			case 2:
				registrar();
				break;
			case 3:
				eliminar();
				break;
			case 4:
				main(centros);
				break;
			default:
				System.out.println("_OPCION INVALIDA_");
				break;
			}
		} while (opcion > 4 || opcion < 1);
		
	}
	////////////////////////////////////////////////////
	public void buscar() {
		
	}
	////////////////////////////////////////////////////
	public void registrar() {
		
	}
	////////////////////////////////////////////////////
	public void eliminar() {
}
}