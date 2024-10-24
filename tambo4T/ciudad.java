package test_zone;

import java.util.*;

public class cuarto_T {

	public static void main(String[] args) {

		Scanner tec1 = new Scanner(System.in);
		Scanner tec2 = new Scanner(System.in);

		// COMFIGURACION DE VARIABLES
		int casillas = 50;

		String ciudad[] = new String[casillas];
		String[] departamentos = new String[casillas];
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

			switch (opcion) {
				//REGISTRAR CIUDAD--------------------------------------------------------------------------------
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
					int depcount = 1;
					while (depcount == 1) {
						System.out.println("Ingrese departamento / ingrese ´lista´ para ver lista de departamentos.");
						entradadep = tec2.nextLine();
						entradadep = tec2.nextLine();
						if (entradadep.equals("lista") {
							System.out.println("Lista de departamentos:");
							System.out.println("| Artigas");
							System.out.println("| Canelones");
							System.out.println("| Cerro Largo");
							System.out.println("| Colonia");
							System.out.println("| Durazno");
							System.out.println("| Flores");
							System.out.println("| Florida");
							System.out.println("| Lavalleja");
							System.out.println("| Maldonado");
							System.out.println("| Montevideo");
							System.out.println("| Paysandú");
							System.out.println("| Treinta y Tres");
							System.out.println("| Rivera");
							System.out.println("| Rocha");
							System.out.println("| Salto");
							System.out.println("| San José");
							System.out.println("| Soriano");
							System.out.println("| Tacuarembó");
							System.out.println("NOTA: Es recomendable escribir los departamentos con la primera letra mayusculla.");
						} else if (entradadep.equals("Artigas") || entradadep.equals("Canelones") || entradadep.equals("Cerro Largo") || entradadep.equals("Colonia") || entradadep.equals("Durazno") || entradadep.equals("Flores") || entradadep.equals("Florida" || entradadep.equals("Lavalleja") || entradadep.equals("Maldonado") || entradadep.equals("Montevideo") || entradadep.equals("Paysandú") || entradadep.equals("Treinta y Tres") || entradadep.equals("Rivera") || entradadep.equals("Rocha") || entradadep.equals("Salto") || entradadep.equals("San José") || entradadep.equals("Soriano") || entradadep.equals("Tacuarembó")) {
								departamentos[opcion] = entradadep;
								depcount = 0;
							} else {
								System.out.println("_OPCION INVALIDA_");
							}
					}

					System.out.println("...");
					ciudad[opcion] = entradaciudad;
					tambos[opcion] = entradatambos;
					posy[opcion] = entradaposy;
					posx[opcion] = entradaposx;
					centro[opcion] = entradacentro;
					System.out.println("");
					System.out.println("_DATOS GUARDADOS_");
					System.out.println();
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
					departamentos[opcion] = "null";
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
					System.out.println("Departamento: "+ departamentos[opcion]);
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
