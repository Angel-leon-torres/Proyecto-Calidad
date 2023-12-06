package capadominio;
import capadominio.Paciente;
import capadominio.Medico;
import capapresentacion.VentanaRegistrarCita;
import java.util.List;
import javax.swing.JOptionPane;
public class Cita {

    private String codigocita;
    private String estado_cita;
    private Paciente paciente;
    private Medico medico;
    private Horario horario;
    private String horaCita;
    private String idhorarioDeCita;
    private String fechaCita;
    private String idmedicoCita;
    private String turnoCita;
    private double pagoCita;
    private double costoCita=0.0;
    private double comisionCita=0.0;
    public Cita() {

    }

    public Cita(String codigocita, String estado_cita, Paciente paciente, Medico medico, Horario horario, String horaCita, String idhorarioDeCita, String fechaCita, String idmedicoCita, String turnoCita, double pagoCita) {
        this.codigocita = codigocita;
        this.estado_cita = estado_cita;
        this.paciente = paciente;
        this.medico = medico;
        this.horario = horario;
        this.horaCita = horaCita;
        this.idhorarioDeCita = idhorarioDeCita;
        this.fechaCita = fechaCita;
        this.idmedicoCita = idmedicoCita;
        this.turnoCita = turnoCita;
        this.pagoCita = pagoCita;
    }

   

    public String getIdhorarioDeCita() {
        return idhorarioDeCita;
    }

    public void setIdhorarioDeCita(String idhorarioDeCita) {
        this.idhorarioDeCita = idhorarioDeCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getIdmedicoCita() {
        return idmedicoCita;
    }

    public void setIdmedicoCita(String idmedicoCita) {
        this.idmedicoCita = idmedicoCita;
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

   

    public String getCodigocita() {
        return codigocita;
    }

    public void setCodigocita(String codigocita) {
        this.codigocita = codigocita;
    }

    public String getEstado_cita() {
        return estado_cita;
    }

    public void setEstado_cita(String estado_cita) {
        this.estado_cita = estado_cita;
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

    public double getCostoCita() {
        return costoCita;
    }

    public void setCostoCita(double costoCita) {
        this.costoCita = costoCita;
    }

    public double getComisionCita() {
        return comisionCita;
    }

    public void setComisionCita(double comisionCita) {
        this.comisionCita = comisionCita;
    }


     public double calcularElCostoDelTipoDeEspecialidadPorElTipoDePago(String especialidad, String tarjeta) {
     double comisionportarjeta=0.0, COSTOESPECIALIDAD=0.0;
  
     if (especialidad.equals("Medicina General")) {
            COSTOESPECIALIDAD = 90;
        } else if (especialidad.equals("Pediatria")) {
            COSTOESPECIALIDAD = 80;
        } else if (especialidad.equals("Obstetricia")) {
            COSTOESPECIALIDAD = 50;
        } else if (especialidad.equals("Ginecologia")) {
            COSTOESPECIALIDAD = 100;
        } else if (especialidad.equals("Odontología")){
            COSTOESPECIALIDAD = 110;
        } else  JOptionPane.showMessageDialog(null, "Error al calcular el costo total", "Advertenia", JOptionPane.WARNING_MESSAGE);
    
     if (tarjeta.equals("Si")) {
            comisionportarjeta = 0.05*COSTOESPECIALIDAD;
        } 
      costoCita=comisionportarjeta+COSTOESPECIALIDAD;
          return costoCita;
         
      }
     public double calcularcomisionporespecialidad(String especialidad, String tarjeta)  {
     double  COSTOESPECIALIDAD=0.0;
     if (especialidad.equals("Medicina General")) {
            COSTOESPECIALIDAD = 90;
        } else if (especialidad.equals("Pediatria")) {
            COSTOESPECIALIDAD = 80;
        } else if (especialidad.equals("Obstetricia")) {
            COSTOESPECIALIDAD = 50;
        } else if (especialidad.equals("Ginecologia")) {
            COSTOESPECIALIDAD = 100;
        } else if (especialidad.equals("Odontologia")){
            COSTOESPECIALIDAD = 110;
        } 
     if (tarjeta.equals("Si")) 
            comisionCita = 0.05*COSTOESPECIALIDAD;
        
      
          return comisionCita;
         
      }
      
   
}//end Cita
