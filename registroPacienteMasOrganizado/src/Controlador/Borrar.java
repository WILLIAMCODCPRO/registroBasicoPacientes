package Controlador;


import java.util.Scanner;


public class Borrar {
     public static void borrarPasiente() {
        if (GuardarDatos.p1 == null && GuardarDatos.p2 == null && GuardarDatos.p3 == null && GuardarDatos.p4 == null) {
            System.out.println("No hay pacientes que borrar");
            return;
        }

        System.out.println("¿Cual pasiente qeuieres borrar?");

        if (GuardarDatos.p1 != null) {
            System.out.println("-----------------------");
            System.out.println("1 " + GuardarDatos.p1.getNombre());
            System.out.println("-----------------------");
        }

        if (GuardarDatos.p2 != null) {
            System.out.println("-----------------------");
            System.out.println("2 " + GuardarDatos.p2.getNombre());
            System.out.println("-----------------------");
        }

        if (GuardarDatos.p3 != null) {
            System.out.println("-----------------------");
            System.out.println("3 " + GuardarDatos.p3.getNombre());
            System.out.println("-----------------------");
        }

        if (GuardarDatos.p4 != null) {
            System.out.println("-----------------------");
            System.out.println("4 " + GuardarDatos.p4.getNombre());
            System.out.println("-----------------------");
        }

        int borrar = new Scanner(System.in).nextInt();
        if (borrar == 1) {
            GuardarDatos.p1 = null;
        }

        if (borrar == 2) {
            GuardarDatos.p2 = null;
        }

        if (borrar == 3) {
            GuardarDatos.p3 = null;
        }

        if (borrar == 4) {
            GuardarDatos.p4 = null;
        }
    }

    
}
