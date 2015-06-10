import java.sql.*;

/**
 * Created by b.istomin on 08.06.2015.
 */
public class OldJdbc {

    public static void addStudent() {

        Student student = new Student();
        student.setName("old jdbc");

        try {
            Class.forName("org.hsqldb.jdbcDriver");
        } catch (ClassNotFoundException cfe) {
            System.out.println("Driver not found");
            System.exit(0);
        }

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/asiavant", "sa", "");
            stmt = conn.prepareStatement("INSERT INTO student (NAME) VALUES (?) ");
            stmt.setString(1, student.getName());
            stmt.execute();
        } catch (SQLException se) {
            System.out.println("Problem with data insert");
            se.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }

    }
}
