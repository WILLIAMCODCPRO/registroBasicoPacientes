package Vista;
import Controlador.PedirDatos;
import Controlador.Registrar;
import Controlador.Atender;
import Controlador.Borrar;


public class Main {
     public static void main(String[] args) {
        int opcionUsuario;
        do {
            Menu.mostrarMenuPrincipal();
            opcionUsuario = PedirDatos.pedirOpcion();
            switch (opcionUsuario) {
                case 1:
                    Registrar.registrarPaciente();
                    break;
                case 2:
                    Menu.mostarPacientesRegistrados();
                    break;
                case 3:
                   Atender.atenderPasiente();
                    break;
                case 4:
                    Borrar.borrarPasiente();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Esa opcion no esta disponible");
            }
        } while (opcionUsuario != 5);

    }
}
