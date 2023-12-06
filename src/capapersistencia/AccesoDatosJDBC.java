package capapersistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AccesoDatosJDBC {
    protected Connection conexion;

    public abstract void abrirConexion() throws Exception;

    public void cerrarConexion() throws SQLException {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception e) {
            throw new SQLException("Ocurrio un problema al cerrar la conexión", e);
        }
    }

    public void iniciarTransaccion() throws SQLException {
        try {
            conexion.setAutoCommit(false);
        } catch (Exception e) {
            throw new SQLException("Ocurrio un problema al iniciar la transacción", e);
        }
    }

    public void terminarTransaccion() throws SQLException {
        try {
            if (conexion != null) {
                conexion.commit();
                conexion.setAutoCommit(true);
                conexion.close();
            }
        } catch (Exception e) {
            throw new SQLException("Ocurrio un problema al terminar la transacción", e);
        }
    }

    public void cancelarTransaccion() throws SQLException {
        try {
            if (conexion != null) {
                conexion.rollback();
                conexion.setAutoCommit(true);
                conexion.close();
            }
        } catch (Exception e) {
            throw new SQLException("Ocurrio un problema al cancelar la transacción", e);
        }
    }

    public PreparedStatement prepararSentencia(String sql) throws SQLException {
        try {
            return conexion.prepareStatement(sql);
        } catch (Exception e) {
            throw new SQLException("Ocurrio un problema al preparar la sentencia", e);
        }
    }

    public ResultSet ejecutarConsulta(String sql) throws SQLException {
        Statement sentencia = null;
        ResultSet resultado = null;
        try {
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            return resultado;
        } catch (Exception e) {
            throw new SQLException("Ocurrio un problema al ejecutar la consulta", e);
        } finally {
            if (sentencia != null) {
                sentencia.close();
            }
            if (resultado != null) {
                resultado.close();
            }
        }
    }
}
