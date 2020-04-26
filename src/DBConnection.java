/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package connect2db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.DatabaseMetaData;
/**
 *
 * @author lejla
 */
public class DBConnection {
    
    
    // variables
    public static Connection con;
    public static PreparedStatement stm;
    public static ResultSet rSet;
    public static String msAccDB = "..//Kevin_Street_Library_DB.accdb"; // path to the DB file
    public static String dbURL = "jdbc:ucanaccess://" + msAccDB;
    
        
    public static DBConnection getConnection(){
       
        // Step 1: Loading or registering JDBC driver class
        /*try {
           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {
            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }*/
        // Step 2: Opening database connection
        try {
            // Step 2.A: Create and get connection using DriverManager class
            con = DriverManager.getConnection(dbURL);
        
        }catch(SQLException sqlex){
            System.err.println(sqlex.getMessage());
        }
        finally {

        // Step 3: Closing database connection
        try {
            if(null != con) {
                // cleanup resources, once after processing
                rSet.close();
                stm.close();
                // and then finally close connection
                con.close();
            }
        }
        catch (SQLException sqlex) {
            System.err.println(sqlex.getMessage());
        }
        }
        return (DBConnection) con;
    } // End of Constructor
    public static void main(String args[]){
        DBConnection dbConnection = new DBConnection();
    }
} // End of Class
