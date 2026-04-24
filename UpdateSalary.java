import java.sql.*;

public class UpdateSalary {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/librarydb";
        String user = "root";
        String password = "Root@123";

        try {
            // Load driver (optional in modern JDBC, but fine)
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            //BEFORE UPDATE
            System.out.println("Table before UPDATE query:");
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                int id = rs.getInt("empid");
                int empsal = rs.getInt("empsal"); 
                System.out.println(id + " " + empsal);
            }

            //UPDATE QUERY
            String updateQuery = "UPDATE employee SET empsal=? WHERE empid=?";
            PreparedStatement ps = con.prepareStatement(updateQuery);

            ps.setInt(1, 87000); 
            ps.setInt(2, 1);      

            int rows = ps.executeUpdate();
            System.out.println("\nRows updated: " + rows);

            //AFTER UPDATE
            System.out.println("\nTable after UPDATE query:");
            rs = stmt.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                int id = rs.getInt("empid");
                int empsal = rs.getInt("empsal");
                System.out.println(id + " " + empsal);
            }

            con.close();
            System.out.println("\nUPDATE operation completed!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}