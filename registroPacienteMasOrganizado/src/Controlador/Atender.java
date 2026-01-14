package Controlador;



import java.util.Scanner;


public class Atender {
    public static void atenderPasiente() {
        if (GuardarDatos.p1 == null && GuardarDatos.p2 == null && GuardarDatos.p3 == null && GuardarDatos.p4 == null) {
            System.out.println("No hay pacientes que atender");
            return;
        }

        System.out.println("¿Cual pasiente qeuieres atender");

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

        int atender = new Scanner(System.in).nextInt();
        if (atender == 1) {
            GuardarDatos.p1.setEstado("atendido");
        }

        if (atender == 2) {
           GuardarDatos.p2.setEstado("atendido");
        }

        if (atender == 3) {
            GuardarDatos.p3.setEstado("atendido");
        }

        if (atender == 4) {
           GuardarDatos.p4.setEstado("atendido");
        }
    }
}
