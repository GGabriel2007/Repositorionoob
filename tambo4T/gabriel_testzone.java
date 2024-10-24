package test_zone;

import java.util.*;

public class gabriel_testzone {

	public static void main(String[] args) {

		Scanner tec1 = new Scanner(System.in);
		Scanner tec2 = new Scanner(System.in);

		// COMFIGURACION DE VARIABLES
		int casillas = 50;

		String ciudad[] = new String[casillas];
		int tambos[] = new int[casillas * 2];
		int posx[] = new int[casillas];
		int posy[] = new int[casillas];
		int centro[] = new int[casillas];


		int activo = 1, opcion = 0, entradaposy = 0, entradaposx = 0, entradatambos = 0, entradacentro, entrada1 = 0; String entradadep, entradaciudad;

		while (activo == 1) {
			//MENU--------------------------------------------------------------------------------------------
			System.out.println("_MENU_");
			System.out.println("(1)| Registrar Ciudad");
			System.out.println("(2)| Eliminar registro");
			System.out.println("(3)| Buscar Registro");
			System.out.println("(0)| Volver");
			opcion = tec1.nextInt();

			//REGISTRAR CIUDAD--------------------------------------------------------------------------------
			switch (opcion) {
			case 1:
				System.out.println("Elija una casilla:");
				for (int veces = 0 ; veces < casillas ; veces++) {
					System.out.println("("+ veces +"): "+ ciudad[veces]);
				}
				opcion = tec1.nextInt();
				if (ciudad[opcion] != "null") {
					System.out.println("Ingrese nombre:");
					ciudad[opcion] = tec2.nextLine();
					System.out.println("Ingrese posicion: (X)");
					posx[opcion] = tec1.nextInt();
					System.out.println("Ingrese posicion: (Y)");
					posy[opcion] = tec2.nextInt();
					System.out.println("Ingrese cantidad de centros de pasteurización:");
					centro[opcion] = tec1.nextInt();
					System.out.println("Ingresar numero de tambos:");
					tambos[opcion] = tec1.nextInt();
					
				}
				break;

				//ELIMINAR REGISTRO---------------------------------------------------------------------------------
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

				//BUSCAR REGISTRO-------------------------------------------------------------
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
				}  //-------------------------------------------------------------------------------------------
				break;
			case 0:
				activo = 0;
			break;

			default:
				System.out.println("_OPCION INVALIDA_");
				break;
			}
		}}}
