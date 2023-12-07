package capaaplicacion;

import capadominio.Cita;
import capadominio.Horario;
import capadominio.Medico;
import capadominio.Paciente;
import capapersistencia.*;

import java.util.List;

public class RegistrarCitaServicio {

    private final AccesoDatosJDBCPostgreSQL accesoDatosJDBC; // Cambio de tipo de AccesoDatosJDBC
    private final CitaPostgreSQL citaPostgreSQL;
    private final MedicoPostgreSQL medicoPostgreSQL;
    private final PacientePostgreSQL pacientePostgreSQL;
    private final HorarioPostgreSQL horarioPostgreSQL;

    public RegistrarCitaServicio() {
        accesoDatosJDBC = new AccesoDatosJDBCPostgreSQL();
        citaPostgreSQL = new CitaPostgreSQL(accesoDatosJDBC);
        medicoPostgreSQL = new MedicoPostgreSQL(accesoDatosJDBC);
        pacientePostgreSQL = new PacientePostgreSQL(accesoDatosJDBC);
        horarioPostgreSQL = new HorarioPostgreSQL(accesoDatosJDBC);
    }

    public Medico buscarMedico(String medicoId) throws Exception {
        try {
            accesoDatosJDBC.abrirConexion();
            return medicoPostgreSQL.buscar(medicoId);
        } finally {
            accesoDatosJDBC.cerrarConexion();
        }
    }

    public Paciente buscarPaciente(String dni) throws Exception {
        try {
            accesoDatosJDBC.abrirConexion();
            return pacientePostgreSQL.buscar(dni);
        } finally {
            accesoDatosJDBC.cerrarConexion();
        }
    }

    public List<Horario> buscarHorario(String medicoEspecialidad) throws Exception {
        try {
            accesoDatosJDBC.abrirConexion();
            return horarioPostgreSQL.buscar(medicoEspecialidad);
        } finally {
            accesoDatosJDBC.cerrarConexion();
        }
    }

    public List<Horario> mostrarHorario() throws Exception {
        try {
            accesoDatosJDBC.abrirConexion();
            return horarioPostgreSQL.mostrarhorario();
        } finally {
            accesoDatosJDBC.cerrarConexion();
        }
    }

    public void guardarCita(Cita cita) throws Exception {
        try {
            accesoDatosJDBC.abrirConexion();
            accesoDatosJDBC.iniciarTransaccion();
            citaPostgreSQL.guardar(cita);
            accesoDatosJDBC.terminarTransaccion();
        } finally {
            accesoDatosJDBC.cerrarConexion();
        }
    }

    public void guardarcita(Cita cita) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
