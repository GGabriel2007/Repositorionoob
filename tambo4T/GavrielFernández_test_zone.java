package test_zones;

import java.util.*;

public class GavrielFernández_test_zone {

	public static void main(String[] args) {

		class gabriel_testzone {

			//SCANNER
			Scanner tec1 = new Scanner(System.in);
			Scanner tec2 = new Scanner(System.in);

			//ARRAY
			int casillas = 30;
			String ciudad[] = new String[casillas];
			int tambos[] = new int[casillas * 2];
			int posx[] = new int[casillas];
			int posy[] = new int[casillas];
			int centro[] = new int[casillas];

			//VAREABLES
			int activo = 1, opcion = 0, entradaposy = 0, entradaposx = 0, entradatambos = 0, entradacentro, entrada1 = 0; String entradaciudad;

			//MENU
				while (activo == 1) {
					System.out.println("_MENU_");
					System.out.println("(1)| Añadir Ciudad");
					System.out.println("(2)| Eliminar Ciudad");
					System.out.println("(3)| Buscar Ciudad");
					System.out.println("(0)| Volver");
					opcion = tec1.nextInt();

					//OPCIONES: REGISTRAR / ELIMINAR / INSPECCIONAR / TERMINAR PROCESO
					switch (opcion) {

						//REGISTRAR CIUDAD
					case 1:
						System.out.println("Elija una casilla:");
						for (int veces = 0 ; veces < casillas ; veces++) {
							System.out.println("("+ veces +"): "+ ciudad[veces]);
						}
						opcion = tec1.nextInt();
							//vvv_ENTRADA DE DATOS_vvv
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
								//vvv_GUARDADO DE SATOS_vvv
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

						//ELIMINAR REGISTRO
					case 2:

						//vvv_BUSQUEDA DE CIUDADES_vvv
						System.out.println("Elija una casilla:");
						for (int veces = 0 ; veces < casillas ; veces++) {
							System.out.println("("+ veces +"): "+ ciudad[veces]);
						}

						//vvv_ELIMINACION DE REGISTRO_vvv
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

						//BUSQUEDA DE REGISTRO
					case 3:
						System.out.println("Elija una casilla:");
						for (int veces = 0 ; veces < casillas ; veces++) {
							System.out.println("("+ veces +"): "+ ciudad[veces]);

							//vvv_MUESTRA DE DATOS_vvv
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

						//TERMINAR PROCESO DE REGISTRO DE CIUDADES
					case 0:
						activo = 0;
						break;
					default:
						System.out.println("_OPCION INVALIDA_");
						break;
					}
				}
			}
		}
	}
}
