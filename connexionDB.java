
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnexion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hotel"; // nom de ta BD
        String user = "root"; // ton nom d'utilisateur MySQL
        String password = "root"; // ton mot de passe MySQL

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion réussie à la base de données !");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erreur de connexion !");
            e.printStackTrace();
        }
    }
}
