package day4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        String query = "select * from employees ";

        try (Connection conn = ConnPoolConfig.getConnection();) {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Employees e = new Employees(rs);
                System.out.println(e);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}