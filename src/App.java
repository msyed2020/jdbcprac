import java.sql.*;

// run using command: java -cp "src;lib/postgresql-42.7.4.jar" App
// path should be C:\Users\fredb\Downloads\jdbcpoc\JDBCProofOfConcept>
// Don't enter any src or lib folders to run this

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Smashbros1!";
        String query = "delete from student where sid=4";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established");

        Statement st = con.createStatement();
        st.execute(query);
        //ResultSet rs = st.executeQuery(query);
        // rs.next();
        // String name = rs.getString("sname");
        // System.out.println("A student name could be " + name);
        // while (rs.next()) {
        //     System.out.println(rs.getInt(1) + ": ");
        //     System.out.println(rs.getString(2) + ": ");
        //     System.out.println(rs.getInt(3));
        //     System.out.println();
        // }
        con.close();
        System.out.println("Connection closed");
    }
}
