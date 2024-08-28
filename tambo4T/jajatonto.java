package tmbo4t;

import java.util.Scanner;

public class jajatonto {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Scanner tec2 = new Scanner(System.in);

        //variables:
        String tdd, tdc;
        int opcion1, opcion2;
        String departamento0, departamento1, departamento2, departamento3, departamento4, departamento5, departamento6, departamento7, departamento8, departamento9, departamento12, departamento13, departamento14, departamento15, departamento16, departamento17, departamento18, departamento19;
        String ciudadn0 = "Vacio", ciudadn1= "Vacio",ciudadn2 = "Vacio", ciudadn3, ciudadn4, ciudadn5, ciudadn6, ciudadn7, ciudadn8, ciudadn9, ciudadn10, ciudadn11, ciudadn12, ciudadn13, ciudadn14, ciudadn15, ciudadn17, ciudadn18, ciudadn19;
		int ciudadid0 = 0, ciudadid1 = 0, ciudadid2 = 0, ciudadid3 = 0,ciudadid4 = 0, ciudadid5 = 0, ciudadid6 = 0, ciudadid7 = 0, ciudadid8 = 0, ciudadid9 = 0, ciudadid10 = 0, ciudadid9 = 0, ciudadid11 = 0, ciudadid9 = 0, ciudadid12 = 0, ciudadid9 = 0, ciudadid13 = 0, ciudadid9 = 0, ciudadid14 = 0, ciudadid9 = 0, ciudadid15 = 0, ciudadid9 = 0, ciudadid16 = 0, ciudadid9 = 0, ciudadid17 = 0, ciudadid9 = 0, ciudadid18 = 0, ciudadid9 = 0, ciudadid19 = 0;

        //Menu
        System.out.println("Ingrese una opcion:");
        System.out.println("1. Registrar ciudad.");
        System.out.println("2. Eliminar ciudad");
        System.out.println("3. Buscar ciudad");
        System.out.println("4. Regresar");
        System.out.println(" ");
        opcion1 = tec.nextInt();

        //eliminar ciudad
        switch (opcion1) {
            case 1:
                break;

            case 2:
                System.out.println("Ingrese un departamento:");
                System.out.println("1. Montevideo");
                System.out.println("2. Artigas");
                System.out.println("3. Canelones");
                System.out.println("4. Cerro Largo");
                System.out.println("5. Colonia");
                System.out.println("6. Durazno");
                System.out.println("7. Flores");
                System.out.println("8. Florida");
                System.out.println("9. Lavalleja");
                System.out.println("10. Maldonado");
                System.out.println("11. Paysandú");
                System.out.println("12. Río Negro");
                System.out.println("13. Rivera");
                System.out.println("14. Rocha");
                System.out.println("15. Salto");
                System.out.println("16. San José");
                System.out.println("17. Soriano");
                System.out.println("18. Tacuarembó");
                System.out.println("19. Treinta y Tres");
                tdc = tec2.nextLine();
                opcion2 = Integer.parseInt(tdc);
                switch (opcion2) {
                    case 1:
                        System.out.println("¿Que ciudad desea eliminar?");
						if (!ciudadn1.equals("vacio") && departamento1 == 1){
							System.out.println("|("+ciudadid1+") "+ciudadn1);
						}

                        if (!ciudadn2.equals("vacio") && departamento2 == 1){
							System.out.println("|("+ciudadid2+") "+ciudadn2);
						}

                        if (!ciudadn3.equals("vacio") && departamento3 == 1){
							System.out.println("|("+ciudadid3+") "+ciudadn3);
						}

                        if (!ciudadn4.equals("vacio") && departamento4 == 1){
							System.out.println("|("+ciudadid4+") "+ciudadn4);
						}

                        if (!ciudadn5.equals("vacio") && departamento5
                         == 1){
							System.out.println("|("+ciudadid5+") "+ciudadn5);
						}
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }

        tec.close();
        tec2.close();
    }

    public class ciudad {
        Scanner tec1 = new Scanner(System.in);
        Scanner tec2 = new Scanner(System.in);
    }
}
