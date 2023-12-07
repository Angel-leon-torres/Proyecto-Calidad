package capadominio;
import javax.swing.JOptionPane;
public class Cita {
    private String codigoCita;
    private String estadoCita;
    private Paciente paciente;
    private Medico medico;
    private Horario horario;
    private String horaCita;
    private String idHorarioDeCita;
    private String fechaCita;
    private String idMedicoCita;
    private String turnoCita;
    private double pagoCita;
    private double costoCita = 0.0;
    private double comisionCita = 0.0;

    public Cita() {}

    public Cita(String codigoCita, String estadoCita, Paciente paciente, Medico medico, Horario horario, String horaCita, String idHorarioDeCita, String fechaCita, String idMedicoCita, String turnoCita, double pagoCita) {
        this.codigoCita = codigoCita;
        this.estadoCita = estadoCita;
        this.paciente = paciente;
        this.medico = medico;
        this.horario = horario;
        this.horaCita = horaCita;
        this.idHorarioDeCita = idHorarioDeCita;
        this.fechaCita = fechaCita;
        this.idMedicoCita = idMedicoCita;
        this.turnoCita = turnoCita;
        this.pagoCita = pagoCita;
    }

    public String getIdHorarioDeCita() {
        return idHorarioDeCita;
    }

    public void setIdHorarioDeCita(String idHorarioDeCita) {
        this.idHorarioDeCita = idHorarioDeCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getIdMedicoCita() {
        return idMedicoCita;
    }

    public void setIdMedicoCita(String idMedicoCita) {
        this.idMedicoCita = idMedicoCita;
    }

    public String getTurnoCita() {
        return turnoCita;
    }

    public void setTurnoCita(String turnoCita) {
        this.turnoCita = turnoCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getCodigoCita() {
        return codigoCita;
    }

    public void setCodigoCita(String codigoCita) {
        this.codigoCita = codigoCita;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public double getPagoCita() {
        return pagoCita;
    }

    public void setPagoCita(double pagoCita) {
        this.pagoCita = pagoCita;
    }

    public double calcularCostoEspecialidadPorTipoPago(String especialidad, String tarjeta) {
        double comisionPorTarjeta = 0.0, costoEspecialidad = 0.0;

        switch (especialidad.toLowerCase()) {
            case "medicina general":
                costoEspecialidad = 90;
                break;
            case "pediatria":
                costoEspecialidad = 80;
                break;
            case "obstetricia":
                costoEspecialidad = 50;
                break;
            case "ginecologia":
                costoEspecialidad = 100;
                break;
            case "odontologia":
                costoEspecialidad = 110;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Especialidad no encontrada", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        if (tarjeta.equalsIgnoreCase("Si")) {
            comisionPorTarjeta = 0.05 * costoEspecialidad;
        }

        costoCita = comisionPorTarjeta + costoEspecialidad;
        return costoCita;
    }

    public double calcularComisionPorEspecialidad(String especialidad, String tarjeta) {
        double costoEspecialidad = 0.0;

        switch (especialidad.toLowerCase()) {
            case "medicina general":
                costoEspecialidad = 90;
                break;
            case "pediatria":
                costoEspecialidad = 80;
                break;
            case "obstetricia":
                costoEspecialidad = 50;
                break;
            case "ginecologia":
                costoEspecialidad = 100;
                break;
            case "odontologia":
                costoEspecialidad = 110;
                break;
        }

        if (tarjeta.equalsIgnoreCase("Si")) {
            comisionCita = 0.05 * costoEspecialidad;
        }

       
