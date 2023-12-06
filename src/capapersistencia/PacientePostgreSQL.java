
package capapersistencia;

import capadominio.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PacientePostgreSQL {
    
     private AccesoDatosJDBC accesoDatosJDBC;

    public PacientePostgreSQL(AccesoDatosJDBC accesoDatosJDBC) {
        this.accesoDatosJDBC = accesoDatosJDBC;
    }

    public void guardar(Paciente paciente) throws Exception {
        String insertSQL = "insert into paciente(paciente_id,nombre,apellidos,DNI,edad,celular) "
                + "values(?,?,?,?,?,?)";
        PreparedStatement sentencia;
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(insertSQL);
            sentencia.setString(1, paciente.getPaciente_id());
            sentencia.setString(2, paciente.getNombrePaciente());
            sentencia.setString(3, paciente.getApellidosPaciente());
            sentencia.setString(4, paciente.getDNIPaciente());
            sentencia.setInt(5, paciente.getEdadPaciente());
            sentencia.setInt(6, paciente.getCelularPaciente());
            sentencia.executeUpdate();
        } catch (Exception e) {
            throw new Exception("Error al intentar guardar el paciente.", e);
        }
    }
    
    public Paciente buscar(String dni) throws Exception {
        String consultaSQL = "select nombre,apellidos,dni,edad,celular from paciente where dni = ?";
        PreparedStatement sentencia;        
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(consultaSQL);
            sentencia.setString(1, dni);
            ResultSet resultado = sentencia.executeQuery();
            if (resultado.next()) {
                Paciente paciente = new Paciente();
                paciente.setDNIPaciente(dni);
                paciente.setNombrePaciente(resultado.getString("nombre"));
                paciente.setApellidosPaciente(resultado.getString("apellidos"));
                paciente.setDNIPaciente(resultado.getString("dni"));
                paciente.setEdadPaciente(resultado.getInt("edad"));
                paciente.setCelularPaciente(resultado.getInt("celular"));
                return paciente;
            }
            else {
                throw new Exception("DNI del paciente no registrado");
            }
        } catch (SQLException e) {
            throw new Exception("ERROR AL BUSCAR PACIENTE", e);
        }
    }
}