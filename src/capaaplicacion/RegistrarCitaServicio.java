
package capaaplicacion;
import capadominio.Cita;
import capadominio.Horario;
import capadominio.Medico;
import capadominio.Paciente;
import capapersistencia.AccesoDatosJDBC;
import capapersistencia.AccesoDatosJDBCPostgreSQL;
import capapersistencia.CitaPostgreSQL;
import capapersistencia.HorarioPostgreSQL;
import capapersistencia.MedicoPostgreSQL;
import capapersistencia.PacientePostgreSQL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RegistrarCitaServicio {
    
    private AccesoDatosJDBC accesoDatosJDBC;
    private CitaPostgreSQL citaPostgreSQL;
     private MedicoPostgreSQL medicoPostgreSQL;
    private PacientePostgreSQL pacientePostgreSQL;
    private     HorarioPostgreSQL horarioPostgreSQL;
   
    public RegistrarCitaServicio() {
        accesoDatosJDBC = new AccesoDatosJDBCPostgreSQL();
        citaPostgreSQL = new CitaPostgreSQL(accesoDatosJDBC); 
        medicoPostgreSQL = new MedicoPostgreSQL(accesoDatosJDBC); 
        pacientePostgreSQL = new PacientePostgreSQL(accesoDatosJDBC); 
        horarioPostgreSQL = new HorarioPostgreSQL(accesoDatosJDBC); 
    }
    
       public Medico buscarMedico(String medico_id) throws Exception {
        accesoDatosJDBC.abrirConexion();
        Medico medico = medicoPostgreSQL.buscar(medico_id);
        accesoDatosJDBC.cerrarConexion();
        return medico;
    }
    
     public Paciente buscarPaciente(String dni) throws Exception {
        accesoDatosJDBC.abrirConexion();
        Paciente paciente = pacientePostgreSQL.buscar(dni);
        accesoDatosJDBC.cerrarConexion();
        return paciente;
    }
    
     public ArrayList<Horario> buscarHorario(String medico_especialidad) throws Exception{
       accesoDatosJDBC.abrirConexion();
        ArrayList<Horario> horarios = horarioPostgreSQL.buscar(medico_especialidad);
        accesoDatosJDBC.cerrarConexion();
        return horarios;
     }
     public ArrayList<Horario> mostrarHorario() throws Exception{
       accesoDatosJDBC.abrirConexion();
        ArrayList<Horario> lista = horarioPostgreSQL.mostrarhorario();
        accesoDatosJDBC.cerrarConexion();
        return lista;
     }
 
    public void guardarcita(Cita cita) throws Exception {
       Horario horario=cita.getHorario();
        Medico medico= cita.getMedico();
        accesoDatosJDBC.abrirConexion();
        accesoDatosJDBC.iniciarTransaccion();
        citaPostgreSQL.guardar(cita);
        accesoDatosJDBC.terminarTransaccion();
    }  
}