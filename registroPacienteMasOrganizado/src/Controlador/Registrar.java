package Controlador;
import static Controlador.PedirDatos.pedirOpcion;
import static Controlador.Validacion.validarNumero;
import Modelo.Paciente;
import java.util.Scanner;

public class Registrar {
    
    public static Paciente p1 = null;
    public static Paciente p2 = null;
    public static Paciente p3 = null;
    public static Paciente p4 = null;
     public static void registrarPaciente() {
        System.out.println("Nombre Paciente");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Documento Paciente");
        int documento = validarNumero();
        System.out.println("Edad Paciente");
        int edad = validarNumero();
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
}
