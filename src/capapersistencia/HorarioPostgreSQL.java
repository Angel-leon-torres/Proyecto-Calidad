
package capapersistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import capadominio.Horario;
import capadominio.Medico;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;


public class HorarioPostgreSQL {
    private AccesoDatosJDBC accesoDatosJDBC;

    public HorarioPostgreSQL(AccesoDatosJDBC accesoDatosJDBC) {
        this.accesoDatosJDBC = accesoDatosJDBC;
       
    } 

    public void guardar(Horario horario) throws Exception {
    // Verificar si ya existe un horario con las mismas horas de inicio y fin para el mismo médico
    if (!horarioDuplicado(horario)) {
        String insertSQL = "INSERT INTO horario(codigo, fecha, horainicio, horafin, medico_id, estado, medico_especialidad, turno)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement sentencia;
        try {
            sentencia = accesoDatosJDBC.prepararSentencia(insertSQL);
            sentencia.setString(1, horario.getCodigo());
            sentencia.setString(2, horario.getFecha());
            sentencia.setString(3, horario.getHoraInicio());
            sentencia.setString(4, horario.getHoraFin());
            sentencia.setString(5, horario.getMedico_id());
            sentencia.setString(6, horario.getEstado());
            sentencia.setString(7, horario.getMedico_especialidad());
            sentencia.setString(8, horario.getTurno());
            sentencia.executeUpdate();
        } catch (Exception e) {
            throw new Exception("Error al intentar guardar el horario.", e);
        }
    } else {
        // Agregar lógica adicional si es necesario cuando hay un horario duplicado
        System.out.println("Error: Ya existe un horario para el mismo médico con las mismas horas.");
    }
}

// Método para verificar si ya existe un horario con las mismas horas de inicio y fin para el mismo médico
private boolean horarioDuplicado(Horario nuevoHorario) throws Exception {
    // Obtener la lista de horarios existentes (puedes modificar esto según tu implementación)
    List<Horario> horariosExistente = mostrarhorario();

    for (Horario h : horariosExistente) {
        // Verificar si el horario es para el mismo médico
        if (h.getMedico_id().equals(nuevoHorario.getMedico_id())) {
            // Verificar si las horas de inicio y fin son iguales
            if (h.getHoraInicio().equals(nuevoHorario.getHoraInicio()) && h.getHoraFin().equals(nuevoHorario.getHoraFin())) {
                return true; // Horario duplicado
            }
        }
    }
    return false; // No hay horario duplicado
}


 public ArrayList<Horario> buscar(String medico_especialidad) throws Exception {
 
//    String consultaSQL = "SELECT * FROM horario WHERE medico_especialidad = ?";
    PreparedStatement sentencia =null;
    ArrayList<Horario> horarios = new ArrayList<Horario>();

    try {
        sentencia = accesoDatosJDBC.prepararSentencia("SELECT * FROM horario WHERE estado = 'Disponible' AND medico_especialidad = ?");
        sentencia.setString(1, medico_especialidad);
        ResultSet resultado = sentencia.executeQuery();

        while (resultado.next()) {
            Horario horario = new Horario();

            horario.setMedico_especialidad(medico_especialidad);
            horario.setMedico_id(resultado.getString("medico_id"));
            horario.setCodigo(resultado.getString("codigo"));
            horario.setFecha(resultado.getString("fecha"));
            horario.setHoraInicio(resultado.getString("horainicio"));
            horario.setHoraFin(resultado.getString("horafin"));
            horario.setEstado(resultado.getString("estado"));
            horario.setTurno(resultado.getString("turno"));

            horarios.add(horario);
        }

        if (horarios.isEmpty()) {
            throw new Exception("La especialidad elegida no cuenta con horarios disponibles");
        }
    } catch (SQLException e) {
        throw new Exception("Error al intentar buscar los horarios.", e);
    }

    return horarios;
}
 
 public ArrayList<Horario> mostrarhorario() throws Exception {
 ArrayList<Horario> lista = new ArrayList<>();
    String consultaSQL = "select * from horario WHERE estado = 'Disponible'";
    PreparedStatement sentencia ;

    try {
        sentencia = accesoDatosJDBC.prepararSentencia(consultaSQL);
       
        ResultSet resultado = sentencia.executeQuery();

        while (resultado.next()) {
            Horario horario = new Horario();

            horario.setMedico_id(resultado.getString("medico_id"));
            horario.setCodigo(resultado.getString("codigo"));
            horario.setFecha(resultado.getString("fecha"));
            horario.setHoraInicio(resultado.getString("horainicio"));
            horario.setHoraFin(resultado.getString("horafin"));
            horario.setEstado(resultado.getString("estado"));
            horario.setMedico_especialidad(resultado.getString("medico_especialidad"));
            horario.setTurno(resultado.getString("turno"));

            lista.add(horario);
        }

        if (lista.isEmpty()) {
            throw new Exception("No se encontraron horarios para la especialidad proporcionada.");
        }
    } catch (SQLException e) {
        throw new Exception("Error al intentar buscar los horarios.", e);
    
    }

    return lista;
}
       
   }
     
     
     
     
     
     
     
     
     
     
     
     
     
    
    
    
    
    
    

