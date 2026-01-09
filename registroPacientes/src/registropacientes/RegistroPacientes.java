package registropacientes;

public class RegistroPacientes {

    public static void main(String[] args) {
        int opcionUsuario = 0;
        do {
            Funciones.mostrarMenuPrincipal();
            opcionUsuario = Funciones.pedirOpcion(opcionUsuario);
            switch (opcionUsuario) {
                case 1:
                    Funciones.registarPaciente();
                    break;
                case 2:
                    Funciones.mostarPacientesRegistrados();
                    break;
                case 3:
                    System.out.println("Funciona");
                    break;
                case 4:

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
