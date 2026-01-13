package Controlador;

import static Controlador.Registrar.p1;
import static Controlador.Registrar.p2;
import static Controlador.Registrar.p3;
import static Controlador.Registrar.p4;
import java.util.Scanner;


public class Atender {
    public static void atenderPasiente() {
        if (p1 == null && p2 == null && p3 == null && p4 == null) {
            System.out.println("No hay pacientes que atender");
        }

        System.out.println("¿Cual pasiente qeuieres atender");

        if (p1 != null) {
            System.out.println("-----------------------");
            System.out.println("1 " + p1.getNombre());
            System.out.println("-----------------------");
        }

        if (p2 != null) {
            System.out.println("-----------------------");
            System.out.println("2 " + p2.getNombre());
            System.out.println("-----------------------");
        }

        if (p3 != null) {
            System.out.println("-----------------------");
            System.out.println("3 " + p3.getNombre());
            System.out.println("-----------------------");
        }

        if (p4 != null) {
            System.out.println("-----------------------");
            System.out.println("4 " + p4.getNombre());
            System.out.println("-----------------------");
        }

        int atender = new Scanner(System.in).nextInt();
        if (atender == 1) {
            p1.setEstado("atendido");
        }

        if (atender == 2) {
            p2.setEstado("atendido");
        }

        if (atender == 3) {
            p3.setEstado("atendido");
        }

        if (atender == 4) {
            p4.setEstado("atendido");
        }
    }
}
