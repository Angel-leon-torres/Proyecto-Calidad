package capapersistencia;

import java.sql.DriverManager;
import java.sql.SQLException;


public class AccesoDatosJDBCPostgreSQL extends AccesoDatosJDBC {
    @Override
    public void abrirConexion() throws ConexionException {
        try {
            String url = "jdbc:postgresql://localhost:5432/proyecto";
            String password = System.getenv("DB_PASSWORD");
            System.out.println("Password from environment: " + password);
          conexion = DriverManager.getConnection(url, "postgres", password);

        } catch (SQLException e) {
            throw new ConexionException("Ocurrió un problema en la conexión con la base de datos.", e);
        }
    }
}


