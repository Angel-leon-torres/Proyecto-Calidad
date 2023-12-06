
package capapersistencia;

import capadominio.Medico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MedicoPostgreSQL {
    
    private AccesoDatosJDBC accesoDatosJDBC;

    public MedicoPostgreSQL(AccesoDatosJDBC accesoDatosJDBC) {
        this.accesoDatosJDBC = accesoDatosJDBC;
    }
    
    public void guardar(Medico medico) throws Exception {
        String insertSQL = "insert into medico(medico_id,nombres,apellidos,correoelectronico,numeromaximodeatenciones,tiempoespera,tipoespecialidad,dni,edad,celular) " +
                            "values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement sentencia;
        try{ 
            sentencia = accesoDatosJDBC.prepararSentencia(insertSQL);
            sentencia.setString(1, medico.getMedico_id());
            sentencia.setString(2, medico.getNombresMedico());
            sentencia.setString(3, medico.getApellidosMedico());
            sentencia.setString(4, medico.getCorreoElectronicoMedico());
            sentencia.setInt(5, medico.getNumeroMaximodeAtencionesPorMedico());
            sentencia.setInt(6, medico.getTiempoEsperaMedico());
            sentencia.setString(7, medico.getTipoespecialidadMedico());
            sentencia.setString(8, medico.getDNIMedico());
            sentencia.setInt(9, medico.getEdadMedico());
            sentencia.setString(10, medico.getCelularMedico());
            sentencia.executeUpdate();
        }catch(Exception e){
            throw new Exception("Error al intentar guardar el medico.", e);
        }
    }
    
    public Medico buscar(String medico_id) throws Exception {
        String consultaSQL = "select nombres,apellidos,correoelectronico,numeromaximodeatenciones,tiempoespera,tipoespecialidad,dni,edad,celular from medico where medico_id = ?";
        PreparedStatement sentencia;        
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(consultaSQL);
            sentencia.setString(1, medico_id);
            ResultSet resultado = sentencia.executeQuery();
            if (resultado.next()) {
                Medico medico = new Medico();
                medico.setMedico_id(medico_id);
                medico.setNombresMedico(resultado.getString("nombres"));
                medico.setApellidosMedico(resultado.getString("apellidos"));
                medico.setCorreoElectronicoMedico(resultado.getString("correoelectronico"));
                medico.setNumeroMaximodeAtencionesPorMedico(resultado.getInt("numeromaximodeatenciones"));
                medico.setTiempoEsperaMedico(resultado.getInt("tiempoespera"));
                medico.setTipoespecialidadMedico(resultado.getString("tipoespecialidad"));
                medico.setDNIMedico(resultado.getString("dni"));
                medico.setEdadMedico(resultado.getInt("edad"));
                medico.setDNIMedico(resultado.getString("celular"));
                return medico;
            }
            else {
                throw new Exception("No existe el medico.");
            }
        } catch (Exception e) {
            throw new Exception("Error al intentar buscar el medico.", e);
        }
    }
}