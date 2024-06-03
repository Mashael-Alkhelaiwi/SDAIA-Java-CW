package day4;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        String query = "select * from jobs where min_Salary > 1700";

        try (Connection conn = ConnPoolConfig.getConnection();) {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Jobs j = new Jobs(rs);
                System.out.println(j);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}