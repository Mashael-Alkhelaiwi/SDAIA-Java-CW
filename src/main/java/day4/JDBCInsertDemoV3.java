package day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertDemoV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String URL = "jdbc:sqlite:C:\\Users\\dev\\Desktop\\JavaBasics-master\\src\\main\\java\\day4\\hr.db";
        String query = "insert into jobs values (?, ?, ?, ?)";


        try (Connection conn = DriverManager.getConnection(URL)) {
            conn.setAutoCommit(false);
            PreparedStatement st = conn.prepareStatement(query);

            while (true) {


                System.out.println("Enter job ID: ");
                int jobID = sc.nextInt();
                st.setInt(1, jobID);
                sc.nextLine();

                System.out.println("Enter job Title: ");
                String jobnTitle = sc.nextLine();
                st.setString(2, jobnTitle);

                System.out.println("Enter min Salary: ");
                int minSalary = sc.nextInt();
                st.setInt(3, minSalary);

                System.out.println("Enter mxn Salary: ");
                int mxnSalary = sc.nextInt();
                st.setInt(4, mxnSalary);

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