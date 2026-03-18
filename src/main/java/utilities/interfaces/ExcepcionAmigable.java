package utilities.interfaces;
//Clase con metodo que devuelve una excepción legible para un usuario, al insertar archivos con duplicados.
public interface ExcepcionAmigable {
    static void verificarErrorAmigable(java.sql.SQLException e) throws Exception {
        String estadoSQL = e.getSQLState();
        if ("23505".equals(estadoSQL)) {
            throw new Exception("Error: Uno o más datos ya han sido ingresados, no se permiten duplicados.");
        } else {
            System.err.println("Código SQLState: " + estadoSQL); // Para depurar
            throw new Exception("Error de base de datos: " + e.getMessage());
        }
    }
}
