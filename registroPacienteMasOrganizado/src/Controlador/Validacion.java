package Controlador;

import java.util.Scanner;
public class Validacion {
    
     public static int validarNumero() {
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
}
