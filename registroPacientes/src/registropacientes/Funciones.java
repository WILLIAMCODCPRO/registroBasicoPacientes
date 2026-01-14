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
        System.out.println("4 Eliminar Paciente");
        System.out.println("5 Salir");
    }

    static int pedirOpcion() {
        System.out.println("Selecciona una opcion");
        int opcionUsuario = emilia.nextInt();
        return opcionUsuario;
    }
    
    static int pedirNumero() {
        while (true) {
            try {
                int numero = 0;
                do {
                    numero = new Scanner(System.in).nextInt();
                    if (numero < 0) {
                        System.out.println("El dato no pude ser un numero negativo");
                        System.out.println("Vuelve a ingresar el dato");
                    } else {
                        if (numero == 0) {
                            System.out.println("El dato no pude ser 0");
                            System.out.println("Vuelve a ingresar el dato");
                        }
                    }
                } while (numero <= 0);
                return numero;
            } catch (Exception e) {
                System.out.println("El valor debe ser un numero");
                System.out.println("Porfavor introdusca el dato denuevo");
            }
        }
    }
    
    
    static void registarPaciente() {
        System.out.println("Nombre Paciente");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Documento Paciente");
        int documento = pedirNumero();
        System.out.println("Edad Paciente");
        int edad = pedirNumero();
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
    
    static StringBuilder separarTelefonos(String telefono){
        StringBuilder listaTelefonos = new StringBuilder();
        for (int i = 0; i < telefono.split(",").length; i++) {
            listaTelefonos.append("Telefono ").append(i+1).append(":").append( telefono.split(",")[i]).append(" ");
        }
        
        return listaTelefonos;
    }

    static void mostarPacientesRegistrados() {
        if (p1 == null && p2 == null && p3 == null && p4 == null) {
            System.out.println("Aun no hay pacientes resgistrados");
        }

        if (p1 != null) {
            System.out.println("-----------------------");
            System.out.println("Nombre: " + p1.getNombre());
            System.out.println("Documento: " + p1.getDocumento());
            System.out.println("Edad: " + p1.getEdad());
            System.out.println("Motivo de la consulta: " + p1.getMotivoConsulta());
            System.out.println("Telefonos: " + separarTelefonos(p1.getTelefonos()));
            System.out.println("Tipo de paciente: " + p1.getTipoPaciente());
            System.out.println("Estado: " + p1.getEstado());
            System.out.println("-----------------------");
        }

        if (p2 != null) {
            System.out.println("-----------------------");
            System.out.println("Nombre: " + p2.getNombre());
            System.out.println("Documento: " + p2.getDocumento());
            System.out.println("Edad: " + p2.getEdad());
            System.out.println("Motivo de la consulta: " + p2.getMotivoConsulta());
            System.out.println("Telefonos: " + separarTelefonos(p2.getTelefonos()));
            System.out.println("Tipo de paciente: " + p2.getTipoPaciente());
            System.out.println("Estado: " + p2.getEstado());
            System.out.println("-----------------------");
        }

        if (p3 != null) {
            System.out.println("-----------------------");
            System.out.println("Nombre: " + p3.getNombre());
            System.out.println("Documento: " + p3.getDocumento());
            System.out.println("Edad: " + p3.getEdad());
            System.out.println("Motivo de la consulta: " + p3.getMotivoConsulta());
            System.out.println("Telefonos: " + separarTelefonos(p3.getTelefonos()));
            System.out.println("Tipo de paciente: " + p3.getTipoPaciente());
            System.out.println("Estado: " + p3.getEstado());
            System.out.println("-----------------------");
        }

        if (p4 != null) {
            System.out.println("-----------------------");
            System.out.println("Nombre: " + p4.getNombre());
            System.out.println("Documento: " + p4.getDocumento());
            System.out.println("Edad: " + p4.getEdad());
            System.out.println("Motivo de la consulta: " + p4.getMotivoConsulta());
            System.out.println("Telefonos: " + separarTelefonos(p4.getTelefonos()));
            System.out.println("Tipo de paciente: " + p4.getTipoPaciente());
            System.out.println("Estado: " + p4.getEstado());
            System.out.println("-----------------------");
        }

    }

    static void borrarPasiente() {
        if (p1 == null && p2 == null && p3 == null && p4 == null) {
            System.out.println("No hay pacientes que borrar");
            return;
        }

        System.out.println("¿Cual pasiente qeuieres borrar?");

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

        int borrar = new Scanner(System.in).nextInt();
        if (borrar == 1) {
            p1 = null;
        }

        if (borrar == 2) {
            p2 = null;
        }

        if (borrar == 3) {
            p3 = null;
        }

        if (borrar == 1) {
            p4 = null;
        }
    }
    
    static void atenderPasiente() {
        if (p1 == null && p2 == null && p3 == null && p4 == null) {
            System.out.println("No hay pacientes que atender");
            return;
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
