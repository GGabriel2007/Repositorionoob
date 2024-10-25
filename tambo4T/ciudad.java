package tambo_gabi_cuartoT;
import java.util.*;
public class ciudad {

	public static void main(String[] args) {
		//SCANNER
		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		//ARRAY
		int casillas = 30;

		String nombre[] = new String[casillas];
		String departamento[] = new String[casillas];
		int centros[] = new int[casillas];
		int tambos[] = new int[casillas];
		int posx[] = new int[casillas];
		int posy[] = new int[casillas];
		int propietario[] = new int[casillas];
		//VARIABLES
		int ciudad_activa = 1, opcion = 0, entrada1 = 0;
		String entrada2 = "null";
		//MENU
		while (ciudad_activa == 1) {
			System.out.println("___MENU___");
			System.out.println("(1)| Registrar ciudad");
			System.out.println("(2)| Eliminar ciudad");
			System.out.println("(3)| Buscar ciudad");
			System.out.println("(0)| Terminar administracion);
			//OPCIONES
			opcion = teclado1.nextInt();
			switch (opcion) {
			//REGISTRAR CIUDAD
				
			}
		}
	}

}
