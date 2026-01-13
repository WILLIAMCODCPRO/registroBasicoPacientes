package Controlador;

import static Controlador.Registrar.p1;
import static Controlador.Registrar.p2;
import static Controlador.Registrar.p3;
import static Controlador.Registrar.p4;
import static Controlador.Separar.separarTelefonos;


public class Mostrar {
    public static void mostarPacientesRegistrados() {
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
}
