import java.util.Scanner;

public class Ciudad {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int eo1 = 1;
		if (eo1 == 1) {
			
			String cd0 = null, cd1 = null, cd2 = null, cd3 = null, cd4 = null, cd5 = null, cd6 = null, cd7 = null, cd8 = null, cd9 = null, cd10 = null;
			//ciudad X pos
			double ciudadx0 = 0, ciudadx1 = 0, ciudadx2 = 0, ciudadx3 = 0, ciudadx4 = 0, ciudadx5 = 0, ciudadx6 = 0, ciudadx7 = 0, ciudadx8 = 0, ciudadx9 = 0, ciudadx10 = 0;
			//ciudad Y pos
			double ciudady0, ciudady1 = 0, ciudady2 = 0, ciudady3 = 0, ciudady4 = 0, ciudady5 = 0, ciudady6 = 0, ciudady7 = 0, ciudady8 = 0, ciudady9 = 0, ciudady10 = 0;
			//ciudad names
			String ciudadn0 = "Vacio", ciudadn1 = "Vacio", ciudadn2 = "Vacio", ciudadn3 = "Vacio", ciudadn4 = "Vacio", ciudadn5 = "Vacio", ciudadn6 = "Vacio", ciudadn7 = "Vacio", ciudadn8 = "Vacio", ciudadn9 = "Vacio", ciudadn10 = "Vacio";
			//ciudad option/s
			int co1 = 11, co2 = 11, co3 = 11;
			
			
			//hud
			//cambiar eo1 va a anclar el codigo a otro.
			while (co1 == 1) {
				System.out.println("Eliga una opcion:");
				System.out.println("|(1)  Registrar / Editar ciudad");
				System.out.println("|(2)  Eliminar ciudad");
				System.out.println("|(3)  Buscar Ciudad");
				System.out.println("|(4)  Regresar");
				co1 = teclado.nextInt();
				System.out.println("");
				
				//Options chosen
				
				//ciudad Deleter
				
				if (co2 == 2) {
					
					System.out.println("¿Que casilla va a Eliminar?:");
					System.out.println("");
					
					System.out.println("|(1)  "+ ciudadn1);
					System.out.println("|(2)  "+ ciudadn2);
					System.out.println("|(3)  "+ ciudadn3);
					System.out.println("|(4)  "+ ciudadn4);
					System.out.println("|(5)  "+ ciudadn5);
					System.out.println("|(6)  "+ ciudadn6);
					System.out.println("|(7)  "+ ciudadn7);
					System.out.println("|(8)  "+ ciudadn8);
					System.out.println("|(9)  "+ ciudadn9);
					System.out.println("|(10) "+ ciudadn10);
					System.out.println("|(0)  Cancel");
					co2 = teclado.nextInt();
					System.out.println("");
					
					
					if (co2 == 1) {
						ciudadx1 = 0;
						ciudady1 = 0;
						ciudadn1 = "vacio";
						cd1 = null;
						System.out.println("Ciudad Eliminada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 2) {
						ciudadx2 = 0;
						ciudady2 = 0;
						ciudadn2 = "vacio";
						cd2 = null;
						System.out.println("Ciudad Eliminada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 3) {
						ciudadx3 = 0;
						ciudady3 = 0;
						ciudadn3 = "vacio";
						cd3 = null;
						System.out.println("Ciudad Eliminada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 4) {
						ciudadx4 = 0;
						ciudady4 = 0;
						ciudadn4 = "vacio";
						cd4 = null;
						System.out.println("Ciudad Eliminada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 5) {
						ciudadx5 = 0;
						ciudady5 = 0;
						ciudadn5 = "vacio";
						cd5 = null;
						System.out.println("Ciudad Eliminada");
						System.out.println("");
						co2 = 11;
						}
					
					if (co2 == 6) {
						ciudadx6 = 0;
						ciudady6 = 0;
						ciudadn6 = "vacio";
						cd6 = null;
						System.out.println("Ciudad Eliminada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 7) {
						ciudadx7 = 0;
						ciudady7 = 0;
						ciudadn7 = "vacio";
						cd7 = null;
						System.out.println("Ciudad Eliminada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 8) {
						ciudadx8 = 0;
						ciudady8 = 0;
						ciudadn8 = "vacio";
						cd8 = null;
						System.out.println("Ciudad Eliminada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 9) {
						ciudadx9 = 0;
						ciudady9 = 0;
						ciudadn9 = "vacio";
						cd9 = null;
						System.out.println("Ciudad Eliminada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 10) {
						ciudadx10 = 0;
						ciudady10 = 0;
						ciudadn10 = "vacio";
						cd10 = null;
						System.out.println("Ciudad Eliminada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 0) {
						System.out.println("Eliminacion cancelada");
						System.out.println("");
						co2 = 11;
					}
					
					
				}
				
				// ciudad Registrer
				
				if (co1 == 1) {
					System.out.println("Nombre: ");
					ciudadn0 = teclado.nextLine();
					ciudadn0 = teclado.nextLine();
					
					System.out.println("Posición (X): ");
					ciudadx0 = teclado.nextDouble();
					
					System.out.println("Posición (Y): ");
					ciudady0 = teclado.nextDouble();
					
					System.out.println("Ingrese departamento: ");
					cd0 = teclado.nextLine();
					cd0 = teclado.nextLine();
					
					System.out.println("¿En que casilla se va a registrar?:");
					System.out.println("");
					
					System.out.println("|(1)  "+ ciudadn1);
					System.out.println("|(2)  "+ ciudadn2);
					System.out.println("|(3)  "+ ciudadn3);
					System.out.println("|(4)  "+ ciudadn4);
					System.out.println("|(5)  "+ ciudadn5);
					System.out.println("|(6)  "+ ciudadn6);
					System.out.println("|(7)  "+ ciudadn7);
					System.out.println("|(8)  "+ ciudadn8);
					System.out.println("|(9)  "+ ciudadn9);
					System.out.println("|(10) "+ ciudadn10);
					System.out.println("|(0)  Cancel");
					co2 = teclado.nextInt();
					System.out.println("");
					
					
					if (co2 == 1) {
						ciudadx1 = ciudadx0;
						ciudady1 = ciudady0;
						ciudadn1 = ciudadn0;
						cd1 = cd0;
						System.out.println("Ciudad Registrada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 2) {
						ciudadx2 = ciudadx0;
						ciudady2 = ciudady0;
						ciudadn2 = ciudadn0;
						cd2 = cd0;
						System.out.println("Ciudad Registrada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 3) {
						ciudadx3 = ciudadx0;
						ciudady3 = ciudady0;
						ciudadn3 = ciudadn0;
						cd3 = cd0;
						System.out.println("Ciudad Registrada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 4) {
						ciudadx4 = ciudadx0;
						ciudady4 = ciudady0;
						ciudadn4 = ciudadn0;
						cd4 = cd0;
						System.out.println("Ciudad Registrada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 5) {
						ciudadx5 = ciudadx0;
						ciudady5 = ciudady0;
						ciudadn5 = ciudadn0;
						cd5 = cd0;
						System.out.println("Ciudad Registrada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 6) {
						ciudadx6 = ciudadx0;
						ciudady6 = ciudady0;
						ciudadn6 = ciudadn0;
						cd6 = cd0;
						System.out.println("Ciudad Registrada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 7) {
						ciudadx7 = ciudadx0;
						ciudady7 = ciudady0;
						ciudadn7 = ciudadn0;
						cd7 = cd0;
						System.out.println("Ciudad Registrada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 8) {
						ciudadx8 = ciudadx0;
						ciudady8 = ciudady0;
						ciudadn8 = ciudadn0;
						cd8 = cd0;
						System.out.println("Ciudad Registrada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 9) {
						ciudadx9 = ciudadx0;
						ciudady9 = ciudady0;
						ciudadn9 = ciudadn0;
						cd9 = cd0;
						System.out.println("Ciudad Registrada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 10) {
						ciudadx10 = ciudadx0;
						ciudady10 = ciudady0;
						ciudadn10 = ciudadn0;
						cd10 = cd0;
						System.out.println("Ciudad Registrada");
						System.out.println("");
						co2 = 11;
					}
					
					if (co2 == 0) {
						System.out.println("Registro cancelado");
						System.out.println("");
						co2 = 11;
					}
					
					//ciudad check
					
				}
				
				if (co1 == 3) {
					System.out.println("¿Que casilla desea revisar?:");
					System.out.println("");
					
					System.out.println("|(1)  "+ ciudadn1);
					System.out.println("|(2)  "+ ciudadn2);
					System.out.println("|(3)  "+ ciudadn3);
					System.out.println("|(4)  "+ ciudadn4);
					System.out.println("|(5)  "+ ciudadn5);
					System.out.println("|(6)  "+ ciudadn6);
					System.out.println("|(7)  "+ ciudadn7);
					System.out.println("|(8)  "+ ciudadn8);
					System.out.println("|(9)  "+ ciudadn9);
					System.out.println("|(10) "+ ciudadn10);
					System.out.println("|(0)  Cancel");
					co2 = teclado.nextInt();
					System.out.println("");
					
					if (co2 == 1) {
						System.out.println("nombre: "+ ciudadn1 +" | Departamento: "+ cd1 +"");
						System.out.println("Posicion: "+ ciudadx1 +", "+ ciudady1 +".");
						
					}
					
					if (co2 == 2) {
						System.out.println("nombre: "+ ciudadn2 +" | Departamento: "+ cd2 +"");
						System.out.println("Posicion: "+ ciudadx2 +", "+ ciudady2 +".");
						
					}
					
					if (co2 == 3) {
						System.out.println("nombre: "+ ciudadn3 +" | Departamento: "+ cd3 +"");
						System.out.println("Posicion: "+ ciudadx3 +", "+ ciudady3 +".");
						
					}
					
					if (co2 == 4) {
						System.out.println("nombre: "+ ciudadn4 +" | Departamento: "+ cd4 +"");
						System.out.println("Posicion: "+ ciudadx4 +", "+ ciudady4 +".");
						
					}
					
					if (co2 == 5) {
						System.out.println("nombre: "+ ciudadn5 +" | Departamento: "+ cd5 +"");
						System.out.println("Posicion: "+ ciudadx5 +", "+ ciudady5 +".");
						
					}
					
					if (co2 == 6) {
						System.out.println("nombre: "+ ciudadn6 +" | Departamento: "+ cd6 +"");
						System.out.println("Posicion: "+ ciudadx6 +", "+ ciudady6 +".");
						
					}
					
					if (co2 == 7) {
						System.out.println("nombre: "+ ciudadn7 +" | Departamento: "+ cd7 +"");
						System.out.println("Posicion: "+ ciudadx7 +", "+ ciudady7 +".");
						
					}
					
					if (co2 == 8) {
						System.out.println("nombre: "+ ciudadn8 +" | Departamento: "+ cd8 +"");
						System.out.println("Posicion: "+ ciudadx8 +", "+ ciudady8 +".");
						
					}
					
					if (co2 == 9) {
						System.out.println("nombre: "+ ciudadn9 +" | Departamento: "+ cd9+"");
						System.out.println("Posicion: "+ ciudadx9 +", "+ ciudady9 +".");
						
					}
					if (co2 == 10) {
						System.out.println("nombre: "+ ciudadn10 +" | Departamento: "+ cd10 +"");
						System.out.println("Posicion: "+ ciudadx10 +", "+ ciudady10 +".");
						
					}
					
					if (co2 == 0) {
						System.out.println("");
					}
					
					System.out.println("");
					
				}
				
				if (co1 == 4) {
				eo1= 0;
				System.out.println("");
				}
			
			
			}
				
			
		}
		
		

	}
}
	