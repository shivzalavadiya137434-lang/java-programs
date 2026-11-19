// 44. Write a JDBC program to Insert data into Oracle Table

import java.sql.*;
import java.util.Scanner;

public class p44 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        String sql = "INSERT INTO student VALUES ("
                + id + ", '" + name + "', " + age + ")";

        int n = st.executeUpdate(sql);

        System.out.println(n + " record inserted successfully");

        st.close();
        con.close();
        sc.close();
    }
}
