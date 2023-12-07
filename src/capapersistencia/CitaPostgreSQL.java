
package capapersistencia;
import capadominio.Cita;
import capadominio.Medico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CitaPostgreSQL {
    private AccesoDatosJDBC accesoDatosJDBC;

    public CitaPostgreSQL(AccesoDatosJDBC accesoDatosJDBC) {
        this.accesoDatosJDBC = accesoDatosJDBC;
    }

    public void guardar(Cita cita) throws Exception {
    String insertCitaSQL = "INSERT INTO cita(codigocita, estado, dnipaciente, idhorario, fecha, hora, idmedico, turno, pago)" +
                           " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    String updateHorarioSQL = "UPDATE horario SET estado = 'NO Disponible' WHERE codigo = ?";
    
        try {
        // Guardar la cita
        PreparedStatement sentenciaInsertCita = accesoDatosJDBC.prepararSentencia(insertCitaSQL);
        sentenciaInsertCita.setString(1, cita.getCodigoCita());
        sentenciaInsertCita.setString(2, cita.getEstadoCita());
        sentenciaInsertCita.setString(3, cita.getPaciente().getDNIPaciente());
        sentenciaInsertCita.setString(4, cita.getIdHorarioDeCita());
        sentenciaInsertCita.setString(5, cita.getFechaCita());
        sentenciaInsertCita.setString(6, cita.getHoraCita());
        sentenciaInsertCita.setString(7, cita.getIdMedicoCita());
        sentenciaInsertCita.setString(8, cita.getTurnoCita());
        sentenciaInsertCita.setDouble(9, cita.getPagoCita());
        sentenciaInsertCita.executeUpdate();
        
        // Desactivar estado en la tabla horario
        PreparedStatement sentenciaUpdateHorario = accesoDatosJDBC.prepararSentencia(updateHorarioSQL);
        sentenciaUpdateHorario.setString(1, cita.getIdHorarioDeCita());
        sentenciaUpdateHorario.executeUpdate();
        
    } catch (SQLException e) {
        throw new Exception("Error al intentar guardar la cita ", e);
    }
        
    }
       
    
    public int consultarTotalDeCitas(Medico medico) throws Exception {
        String consultaSQL = "select count(cita_id) as total from cita where medico_id = ?";
        PreparedStatement sentencia;
        int totalDeCitas = 0;
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(consultaSQL);
            sentencia.setString(1, medico.getMedico_id());
            ResultSet resultado = sentencia.executeQuery();
            if (resultado.next()) {
                totalDeCitas = resultado.getInt("total");
            }
            return totalDeCitas;
        } catch (SQLException e) {
            throw new Exception("ERROR AL INTENTAR CONSULTAR LA CITA.", e);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}