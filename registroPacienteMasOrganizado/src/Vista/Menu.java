package Vista;
import Controlador.GuardarDatos;

import static Controlador.Separar.separarTelefonos;

public class Menu {

    static void mostrarMenuPrincipal() {
        System.out.println("1 Registrar paciente");
        System.out.println("2 Mostrar pacientes registrados");
        System.out.println("3 Atender paciente");
        System.out.println("4 Eliminar Paciente");
        System.out.println("5 Salir");
    }

    public static void mostarPacientesRegistrados() {
        if (GuardarDatos.p1 == null && GuardarDatos.p2 == null && GuardarDatos.p3 == null && GuardarDatos.p4 == null) {
            System.out.println("Aun no hay pacientes resgistrados");
        }

        if (GuardarDatos.p1 != null) {
            System.out.println("-----------------------");
            System.out.println("Nombre: " + GuardarDatos.p1.getNombre());
            System.out.println("Documento: " + GuardarDatos.p1.getDocumento());
            System.out.println("Edad: " + GuardarDatos.p1.getEdad());
            System.out.println("Motivo de la consulta: " + GuardarDatos.p1.getMotivoConsulta());
            System.out.println("Telefonos: " + separarTelefonos(GuardarDatos.p1.getTelefonos()));
            System.out.println("Tipo de paciente: " + GuardarDatos.p1.getTipoPaciente());
            System.out.println("Estado: " + GuardarDatos.p1.getEstado());
            System.out.println("-----------------------");
        }

        if (GuardarDatos.p2 != null) {
            System.out.println("-----------------------");
            System.out.println("Nombre: " + GuardarDatos.p2.getNombre());
            System.out.println("Documento: " + GuardarDatos.p2.getDocumento());
            System.out.println("Edad: " + GuardarDatos.p2.getEdad());
            System.out.println("Motivo de la consulta: " + GuardarDatos.p2.getMotivoConsulta());
            System.out.println("Telefonos: " + separarTelefonos(GuardarDatos.p2.getTelefonos()));
            System.out.println("Tipo de paciente: " + GuardarDatos.p2.getTipoPaciente());
            System.out.println("Estado: " + GuardarDatos.p2.getEstado());
            System.out.println("-----------------------");
        }

        if (GuardarDatos.p3 != null) {
            System.out.println("-----------------------");
            System.out.println("Nombre: " + GuardarDatos.p3.getNombre());
            System.out.println("Documento: " + GuardarDatos.p3.getDocumento());
            System.out.println("Edad: " + GuardarDatos.p3.getEdad());
            System.out.println("Motivo de la consulta: " + GuardarDatos.p3.getMotivoConsulta());
            System.out.println("Telefonos: " + separarTelefonos(GuardarDatos.p3.getTelefonos()));
            System.out.println("Tipo de paciente: " + GuardarDatos.p3.getTipoPaciente());
            System.out.println("Estado: " + GuardarDatos.p3.getEstado());
            System.out.println("-----------------------");
        }

        if (GuardarDatos.p4 != null) {
            System.out.println("-----------------------");
            System.out.println("Nombre: " + GuardarDatos.p4.getNombre());
            System.out.println("Documento: " + GuardarDatos.p4.getDocumento());
            System.out.println("Edad: " + GuardarDatos.p4.getEdad());
            System.out.println("Motivo de la consulta: " + GuardarDatos.p4.getMotivoConsulta());
            System.out.println("Telefonos: " + separarTelefonos(GuardarDatos.p4.getTelefonos()));
            System.out.println("Tipo de paciente: " + GuardarDatos.p4.getTipoPaciente());
            System.out.println("Estado: " + GuardarDatos.p4.getEstado());
            System.out.println("-----------------------");
        }

    }

}
