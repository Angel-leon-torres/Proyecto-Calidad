
package capaaplicacion;

import capadominio.Medico;
import capapersistencia.AccesoDatosJDBC;
import capapersistencia.AccesoDatosJDBCPostgreSQL;
import capapersistencia.MedicoPostgreSQL;

public class RegistrarMedicoServicio {
    
    private AccesoDatosJDBC accesoDatosJDBC;
    private MedicoPostgreSQL medicoPostgreSQL;

   public RegistrarMedicoServicio() {
        accesoDatosJDBC = new AccesoDatosJDBCPostgreSQL();
        medicoPostgreSQL = new MedicoPostgreSQL(accesoDatosJDBC);    
    }

    public void guardarmedico(Medico medico) throws Exception {
        if(!medico.validarNumeroMaximoDeAtencionesMedicas()){
            throw new Exception("El numero maximo de atenciones no es valido");
        }
        if(!medico.validarTiempoEspera()){
            throw new Exception("El tiempo de espera no es valido");
        }
        if(!medico.validarEdadMedico()){
            throw new Exception("Edad fuera del rango permitido");
        }
        accesoDatosJDBC.abrirConexion();
        accesoDatosJDBC.iniciarTransaccion();
        medicoPostgreSQL.guardar(medico);
        accesoDatosJDBC.terminarTransaccion();
    }  
}