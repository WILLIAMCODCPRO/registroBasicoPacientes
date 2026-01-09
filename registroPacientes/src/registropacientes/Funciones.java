package registropacientes;

import java.util.Scanner;

public class Funciones {

    static Paciente p1 = null;
    static Paciente p2 = null;
    static Paciente p3 = null;
    static Paciente p4 = null;

    static Scanner emilia = new Scanner(System.in);

    static void mostrarMenuPrincipal() {
        System.out.println("1 Registrar paciente");
        System.out.println("2 Mostrar pacientes registrados");
        System.out.println("3 Atender paciente");
        System.out.println("4 Eliminar Usuario");
        System.out.println("5 Salir");
    }

    static int pedirOpcion(int opcionUsuario) {
        System.out.println("Selecciona una opcion");
        opcionUsuario = emilia.nextInt();
        return opcionUsuario;
    }

    static void registarPaciente() {
        System.out.println("Nombre Paciente");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Documento Paciente");
        String documento = new Scanner(System.in).nextLine();
        System.out.println("Edad Paciente");
        int edad = new Scanner(System.in).nextInt();
        System.out.println("Motivo de la consulta del Paciente");
        String motivo = new Scanner(System.in).nextLine();
        System.out.println("Telefonos Paciente");
        String telefono = new Scanner(System.in).nextLine();

        if (p1 == null) {
            p1 = new Paciente(nombre, documento, edad, motivo, telefono);
        } else {
            if (p2 == null) {
                p2 = new Paciente(nombre, documento, edad, motivo, telefono);
            } else {
                if (p3 == null) {
                    p3 = new Paciente(nombre, documento, edad, motivo, telefono);
                } else {
                    if (p4 == null) {
                        p4 = new Paciente(nombre, documento, edad, motivo, telefono);
                    } else {
                        System.out.println("Ya no hay mas cupos");
                    }
                }
            }
        }

    }

    static void mostarPacientesRegistrados() {
        System.out.println(p1.getNombre());
    }

}
