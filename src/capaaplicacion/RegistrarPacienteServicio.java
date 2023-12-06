
package capaaplicacion;

import capadominio.Paciente;
import capapersistencia.AccesoDatosJDBC;
import capapersistencia.AccesoDatosJDBCPostgreSQL;
import capapersistencia.PacientePostgreSQL;

public class RegistrarPacienteServicio {
    
     private AccesoDatosJDBC accesoDatosJDBC;
    private PacientePostgreSQL medicoPostgreSQL;
    
    public RegistrarPacienteServicio() {
        accesoDatosJDBC = new AccesoDatosJDBCPostgreSQL();
        medicoPostgreSQL = new PacientePostgreSQL(accesoDatosJDBC);    
    }

     public void guardarpaciente(Paciente paciente) throws Exception {
        if(!paciente.validarEdadPaciente()){
            throw new Exception("La edad no es valida");
        }
        accesoDatosJDBC.abrirConexion();
        accesoDatosJDBC.iniciarTransaccion();
        medicoPostgreSQL.guardar(paciente);
        accesoDatosJDBC.terminarTransaccion();
    }  
}