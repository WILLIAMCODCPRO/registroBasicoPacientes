package registropacientes;

public class Paciente {

    String nombre;
    int documento;
    int edad;
    String motivoConsulta;
    String telefonos;
    String estado;
    String tipoPaciente;

    public Paciente(String nombre, int documento, int edad, String motivoConsulta, String telefonos) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.motivoConsulta = motivoConsulta;
        this.telefonos = telefonos;
        this.estado = "registrado";
        this.tipoPaciente = calcularTipoPaciente();
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public int getEdad() {
        return edad;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public String getEstado() {
        return estado;
    }

    public String calcularTipoPaciente() {
        if (edad >= 18) {
            tipoPaciente = "MAYOR";
        } else {
            tipoPaciente = "MENOR";
        }

        return tipoPaciente;
    }

}
