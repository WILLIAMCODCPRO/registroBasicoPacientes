package Controlador;

import java.util.Scanner;

public class PedirDatos {
    static  Scanner emilia = new Scanner(System.in);
    
    public static int pedirOpcion() {
        int opcionUsuario = emilia.nextInt();
        return opcionUsuario;
    }
}
