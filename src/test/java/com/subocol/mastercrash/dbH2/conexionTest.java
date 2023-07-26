package com.subocol.mastercrash.dbH2;
import io.cucumber.java.nl.Stel;
import org.junit.Before;
import org.junit.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class conexionTest {

    @Before
    public void setupDatabase() throws Exception {
        // Cargar el driver de H2
        Class.forName("org.h2.Driver");

        // Establecer la conexión con la base de datos
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;MODE=Oracle", "pruebasqa", "12345");

        // Crear una tabla de ejemplo
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS example_table (id INT PRIMARY KEY, name VARCHAR(255))");
            stmt.executeUpdate("INSERT INTO example_table (id, name) VALUES (1, 'Ejemplo 1')");
            stmt.executeUpdate("INSERT INTO example_table (id, name) VALUES (2, 'Ejemplo 2')");
        }

        // Cerrar la conexión
        conn.close();
    }

}
