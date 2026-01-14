package Controlador;

import Modelo.Paciente;

import java.util.Scanner;

public class Registrar {
    
     public static void registrarPaciente() {
        System.out.println("Nombre Paciente");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Documento Paciente");
        int documento = Validacion.validarNumero();
        System.out.println("Edad Paciente");
        int edad = Validacion.validarNumero();
        System.out.println("Motivo de la consulta del Paciente");
        String motivo = new Scanner(System.in).nextLine();
        System.out.println("Telefonos Paciente");
        String telefono = new Scanner(System.in).nextLine();

        if (GuardarDatos.p1 == null) {
            GuardarDatos.p1 = new Paciente(nombre, documento, edad, motivo, telefono);
        } else {
            if (GuardarDatos.p2 == null) {
                GuardarDatos.p2 = new Paciente(nombre, documento, edad, motivo, telefono);
            } else {
                if (GuardarDatos.p3 == null) {
                    GuardarDatos.p3 = new Paciente(nombre, documento, edad, motivo, telefono);
                } else {
                    if (GuardarDatos.p4 == null) {
                        GuardarDatos.p4 = new Paciente(nombre, documento, edad, motivo, telefono);
                    } else {
                        System.out.println("Ya no hay mas cupos");
                    }
                }
            }
        }

    }
}
