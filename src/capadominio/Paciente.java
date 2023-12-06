package capadominio;

public class Paciente {

    private String paciente_id;
    private String nombrePaciente;
    private String apellidosPaciente;
    private String DNIPaciente;
    private int edadPaciente;
    private int celularPaciente;

    public Paciente() {

    }

    public Paciente(String paciente_id, String nombrePaciente, String apellidosPaciente, String DNIPaciente, int edadPaciente, int celularPaciente) {
        this.paciente_id = paciente_id;
        this.nombrePaciente = nombrePaciente;
        this.apellidosPaciente = apellidosPaciente;
        this.DNIPaciente = DNIPaciente;
        this.edadPaciente = edadPaciente;
        this.celularPaciente = celularPaciente;
    }

    public String getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(String paciente_id) {
        this.paciente_id = paciente_id;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidosPaciente() {
        return apellidosPaciente;
    }

    public void setApellidosPaciente(String apellidosPaciente) {
        this.apellidosPaciente = apellidosPaciente;
    }

    public String getDNIPaciente() {
        return DNIPaciente;
    }

    public void setDNIPaciente(String DNIPaciente) {
        this.DNIPaciente = DNIPaciente;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(int edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public int getCelularPaciente() {
        return celularPaciente;
    }

    public void setCelularPaciente(int celularPaciente) {
        this.celularPaciente = celularPaciente;
    }

    // REGLAS
    
    public boolean validarEdadPaciente() {
        return edadPaciente>=18;
    }
    
      public boolean validarEdadParaDescuentoPaciente() {
        return edadPaciente>=60;
    }
}


//end Paciente
