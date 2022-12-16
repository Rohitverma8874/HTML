package com.rohit;

import java.sql.*;
import java.util.Scanner;

public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/infinite";
        String user = "root";
        String password = "root";
        Connection con = null;

        try {
            con = DriverManager.getConnection(url, user, password);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Account Number ");
            String acc_n = sc.next();
            System.out.println("Enter Month");
            Integer m = sc.nextInt();

            //for input and output procedure
            String sql1 = "call get_amnt_due(?,?,?)";
            CallableStatement cstmt1 = con.prepareCall(sql1);
            cstmt1.setString(1,acc_n);

            cstmt1.setInt(2,m);
            cstmt1.registerOutParameter(3,Types.DOUBLE);


            cstmt1.executeQuery();
            Double amount=cstmt1.getDouble(3);
            System.out.println("Account Number :" + acc_n);
            System.out.println("Bill Month : " + m);
            System.out.println("Bill Amount: " +amount);





        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}