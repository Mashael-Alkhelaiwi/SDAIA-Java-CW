package day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertEmp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String URL = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\SDAIA-Course-HW\\src\\main\\java\\HW\\day4\\hr.db";
        String query = "insert into employee values (?, ?, ?, ?, ?, ?, ?)";


        try (Connection conn = DriverManager.getConnection(URL)) {
            conn.setAutoCommit(false);
            PreparedStatement st = conn.prepareStatement(query);

            while (true) {


                System.out.println("Enter employee ID: ");
                int employeeID = sc.nextInt();
                st.setInt(1, employeeID);
                sc.nextLine();

                System.out.println("Enter First name: ");
                String firstName = sc.nextLine();
                st.setString(2, firstName);

                System.out.println("Enter Last name: ");
                String lastName = sc.nextLine();
                st.setString(3, lastName);

                System.out.println("Enter Email: ");
                String email = sc.nextLine();
                st.setString(4, email);

                System.out.println("Enter Phone number: ");
                String phoneNumber = sc.nextLine();
                st.setString(5, phoneNumber);

                System.out.println("Enter Hire date: ");
                String hireDate = sc.nextLine();
                st.setString(6, hireDate);


                System.out.println("Enter Salary: ");
                int salary = sc.nextInt();
                st.setInt(7, salary);

                st.addBatch();


                sc.nextLine();
                System.out.println("Do you want to save: ");
                String toSave = sc.nextLine();
                if(toSave.equals("yes")) {
                    int[] rows = st.executeBatch();
                    for (int r : rows) {
                        System.out.println(r + " inserted");
                    }
                    conn.commit();
                    System.out.println("Data saved");
                    break;
                } else if (toSave.equals("no")) {
                    conn.rollback();
                    System.out.println("Save cancelled");
                    break;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
