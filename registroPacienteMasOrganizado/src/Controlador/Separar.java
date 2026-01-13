package Controlador;


public class Separar {
     public static StringBuilder separarTelefonos(String telefono){
        StringBuilder listaTelefonos = new StringBuilder();
        for (int i = 0; i < telefono.split(",").length; i++) {
            listaTelefonos.append("Telefono ").append(i+1).append(":").append( telefono.split(",")[i]).append(" ");
        }
        
        return listaTelefonos;
    }
}
