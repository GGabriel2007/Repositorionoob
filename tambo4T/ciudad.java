package test_zone;

import java.util.*;

public class gabriel_testzone {

	public static void main(String[] args) {

		Scanner tec1 = new Scanner(System.in);
		Scanner tec2 = new Scanner(System.in);

		// COMFIGURACION DE VARIABLES
		int casillas = 30;

		String ciudad[] = new String[casillas];
		int tambos[] = new int[casillas * 2];
		int posx[] = new int[casillas];
		int posy[] = new int[casillas];
		int centro[] = new int[casillas];


		int activo = 1, opcion = 0, entradaposy = 0, entradaposx = 0, entradatambos = 0, entradacentro, entrada1 = 0; String entradaciudad;

		while (activo == 1) {
			//MENU
			System.out.println("_MENU_");
			System.out.println("(1)| Añadir Ciudad");
			System.out.println("(2)| Eliminar Ciudad");
			System.out.println("(3)| Buscar Ciudad");
			System.out.println("(0)| Volver");
			opcion = tec1.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Elija una casilla:");
				for (int veces = 0 ; veces < casillas ; veces++) {
					System.out.println("("+ veces +"): "+ ciudad[veces]);
				}
				opcion = tec1.nextInt();
				if (ciudad[opcion] != "null") {
					System.out.println("Ingrese nombre:");
					entradaciudad = tec2.nextLine();
					System.out.println("Ingrese posicion: (X)");
					entradaposx = tec1.nextInt();
					System.out.println("Ingrese posicion: (Y)");
					entradaposy = tec2.nextInt();
					System.out.println("Ingrese cantidad de centros de pasteurización:");
					entradacentro = tec1.nextInt();
					System.out.println("Ingresar numero de tambos:");
					entradatambos = tec1.nextInt();

					System.out.println("...");
					ciudad[opcion] = entradaciudad;
					tambos[opcion] = entradatambos;
					posy[opcion] = entradaposy;
					posx[opcion] = entradaposx;
					centro[opcion] = entradacentro;
					System.out.println("");
					System.out.println("_DATOS GUARDADOS_");
					System.out.println();
				} else {
					System.out.println("_OPCION INVALIDA_");
				}
				break;

			case 2:
				System.out.println("Elija una casilla:");
				for (int veces = 0 ; veces < casillas ; veces++) {
					System.out.println("("+ veces +"): "+ ciudad[veces]);
				}
				opcion = tec1.nextInt();

				if (ciudad[opcion] == "null") {
					System.out.println("_OPCION INVALIDA_");
				} else {
					System.out.println("...");
					ciudad[opcion] = "null";
					tambos[opcion] = 0;
					posy[opcion] = 0;
					posx[opcion] = 0;
					centro[opcion] = 0;
					System.out.println("");
					System.out.println("_DATOS ELIMINADOS_");
					System.out.println();
				}
				break;

			case 3:
				System.out.println("Elija una casilla:");
				for (int veces = 0 ; veces < casillas ; veces++) {
					System.out.println("("+ veces +"): "+ ciudad[veces]);
				}
				opcion = tec1.nextInt();

				if (ciudad[opcion] == "null") {
					System.out.println("_OPCION INVALIDA_");
				} else {
					System.out.println("Ciudad: "+ ciudad[opcion]);
					System.out.println("Posicion: (X:-"+ posx[opcion] +", Y:-"+ posy[opcion] +")");
					System.out.println("Numero de centros: "+ centro[opcion]);
					System.out.println("Numero de tambos: "+ tambos[opcion]);
					System.out.println("...");
				}
				break;
			case 0:
				activo = 0;
			break;

			default:
				System.out.println("_OPCION INVALIDA_");
				break;
			}
		}

	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public class ciudad {

	}

}
