package capadominio;

public class Medico {

    private String medico_id;
    private String nombresMedico;
    private String apellidosMedico;
    private String correoElectronicoMedico;
    private int numeroMaximodeAtencionesPorMedico;
    private int tiempoEsperaMedico;
    private String tipoespecialidadMedico;
    private String DNIMedico;
    private int edadMedico;
    private String celularMedico;

    public Medico() {
    }

    public Medico(String medico_id, String nombresMedico, String apellidosMedico, String correoElectronicoMedico, int numeroMaximodeAtencionesPorMedico, int tiempoEsperaMedico, String tipoespecialidadMedico, String DNIMedico, int edadMedico, String celularMedico) {
        this.medico_id = medico_id;
        this.nombresMedico = nombresMedico;
        this.apellidosMedico = apellidosMedico;
        this.correoElectronicoMedico = correoElectronicoMedico;
        this.numeroMaximodeAtencionesPorMedico = numeroMaximodeAtencionesPorMedico;
        this.tiempoEsperaMedico = tiempoEsperaMedico;
        this.tipoespecialidadMedico = tipoespecialidadMedico;
        this.DNIMedico = DNIMedico;
        this.edadMedico = edadMedico;
        this.celularMedico = celularMedico;
    }



    public String getMedico_id() {
        return medico_id;
    }

    public void setMedico_id(String medico_id) {
        this.medico_id = medico_id;
    }

    public String getNombresMedico() {
        return nombresMedico;
    }

    public void setNombresMedico(String nombresMedico) {
        this.nombresMedico = nombresMedico;
    }

    public String getApellidosMedico() {
        return apellidosMedico;
    }

    public void setApellidosMedico(String apellidosMedico) {
        this.apellidosMedico = apellidosMedico;
    }

    public String getCorreoElectronicoMedico() {
        return correoElectronicoMedico;
    }

    public void setCorreoElectronicoMedico(String correoElectronicoMedico) {
        this.correoElectronicoMedico = correoElectronicoMedico;
    }

    public int getNumeroMaximodeAtencionesPorMedico() {
        return numeroMaximodeAtencionesPorMedico;
    }

    public void setNumeroMaximodeAtencionesPorMedico(int numeroMaximodeAtencionesPorMedico) {
        this.numeroMaximodeAtencionesPorMedico = numeroMaximodeAtencionesPorMedico;
    }

    public int getTiempoEsperaMedico() {
        return tiempoEsperaMedico;
    }

    public void setTiempoEsperaMedico(int tiempoEsperaMedico) {
        this.tiempoEsperaMedico = tiempoEsperaMedico;
    }

    public String getTipoespecialidadMedico() {
        return tipoespecialidadMedico;
    }

    public void setTipoespecialidadMedico(String tipoespecialidadMedico) {
        this.tipoespecialidadMedico = tipoespecialidadMedico;
    }

    public String getDNIMedico() {
        return DNIMedico;
    }

    public void setDNIMedico(String DNIMedico) {
        this.DNIMedico = DNIMedico;
    }

    public int getEdadMedico() {
        return edadMedico;
    }

    public void setEdadMedico(int edadMedico) {
        this.edadMedico = edadMedico;
    }

    public String getCelularMedico() {
        return celularMedico;
    }

    public void setCelularMedico(String celularMedico) {
        this.celularMedico = celularMedico;
    }
    //REGLAS 
    
    public boolean validarNumeroMaximoDeAtencionesMedicas() {
        return numeroMaximodeAtencionesPorMedico >10 && numeroMaximodeAtencionesPorMedico<=20;
    }

    public boolean validarTiempoEspera() {
        return tiempoEsperaMedico<=10;
    }
    
    public boolean permitirNuevaCita(int totalDeCitas) {
        return totalDeCitas < numeroMaximodeAtencionesPorMedico;
    }
    public boolean validarEdadMedico() {
        return edadMedico>=25;
    }
    
}//end Medico