package com.codingchallenges.nagesh;

import java.sql.*;

public class PostgreSQLJDBCConnection {
    private final String url="jdbc:postgresql://localhost:5432/crossasyst";
    private final String user = "postgres";
    private final String password = "1234";

    public static void main(String[] args) throws SQLException {
        Connection con=null;
        try{
            Class.forName("org.postgresql.Driver");
            con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo","postgres","1234");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from person ");
            while (rs.next()){
                System.out.println(rs.getInt(1)+rs.getString(2));
            }
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
