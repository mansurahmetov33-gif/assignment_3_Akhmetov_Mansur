package utils;

import java.sql.*;
public class DatabaseConnection {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/assignment_3_oop", "postgres", "Mans9614");
    }

    public static void main(String[] args){
        String connectionUrl="jdbc:postgresql://localhost:5432/assignment_3_oop";
        Connection con=null;
        ResultSet rs=null;
        Statement stmt=null;

        try{
            Class.forName("org.postgresql.Driver");

            con= DriverManager.getConnection(connectionUrl,"postgres","Mans9614");

            stmt=con.createStatement();

            rs=stmt.executeQuery("SELECT * FROM cars");

            while (rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("name"));
            }
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            try{
                rs.close();
                stmt.close();
                con.close();
            }catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }
    }


}
