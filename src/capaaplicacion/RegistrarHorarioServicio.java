
package capaaplicacion;

import capadominio.Horario;

import capapersistencia.AccesoDatosJDBC;
import capapersistencia.AccesoDatosJDBCPostgreSQL;
import capapersistencia.HorarioPostgreSQL;

import java.util.List;


public class RegistrarHorarioServicio {
  private AccesoDatosJDBC accesoDatosJDBC;
    private HorarioPostgreSQL horarioPostgreSQL;

    public RegistrarHorarioServicio() {
        accesoDatosJDBC = new AccesoDatosJDBCPostgreSQL();
        horarioPostgreSQL = new HorarioPostgreSQL(accesoDatosJDBC);
    }

    public void guardarHorario(Horario horario) throws Exception {
        
        accesoDatosJDBC.abrirConexion();
        accesoDatosJDBC.iniciarTransaccion();
        horarioPostgreSQL.guardar(horario);
        accesoDatosJDBC.terminarTransaccion();

    }
    
}