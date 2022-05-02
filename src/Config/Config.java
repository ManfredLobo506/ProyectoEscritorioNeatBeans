/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

/**
 *
 * @author Telyman
 */
public final class Config {
    public static String getConnectionString() throws ClassNotFoundException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //com.microsoft.sqlserver.jdbc.SQLServerDriver
        
        return "jdbc:sqlserver://localhost;databaseName=BDelectroDomesticos2022;user=sa;password=sa";
        //jdbc:sqlserver://localhost;databaseName=CAPAS_JAVA_ESCRITORIO;user=sa;password=sa
    }
}
