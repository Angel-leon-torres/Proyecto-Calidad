
package capadominio;

import java.util.List;
import javax.swing.JOptionPane;

public class Horario {
    private String codigo;
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private String medico_id;
    private String estado;
    private String turno;
    private String medico_especialidad;
   private Medico medico;

    public Horario() {
    }

    public Horario(String codigo, String fecha, String horaInicio, String horaFin, String medico_id, String estado, String turno, String medico_especialidad, Medico medico) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.medico_id = medico_id;
        this.estado = estado;
        this.turno = turno;
        this.medico_especialidad = medico_especialidad;
        this.medico = medico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getMedico_id() {
        return medico_id;
    }

    public void setMedico_id(String medico_id) {
        this.medico_id = medico_id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getMedico_especialidad() {
        return medico_especialidad;
    }

    public void setMedico_especialidad(String medico_especialidad) {
        this.medico_especialidad = medico_especialidad;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public boolean horarioDuplicado(List<Horario> horarios) {
        for (Horario h : horarios) {
            // Verificar si el horario es para el mismo médico
            if (h.getMedico_id().equals(this.medico_id)) {
                // Verificar si las horas de inicio y fin son iguales
                if (h.getHoraInicio().equals(this.horaInicio) && h.getHoraFin().equals(this.horaFin)) {
                    // Si es así, mostrar un mensaje de error o tomar la acción que desees
                    System.out.println("Error: Ya existe un horario para el mismo médico con las mismas horas.");
                    return true;
                }
            }
        }
        // No hay horario duplicado
        return false;
    }
    
}