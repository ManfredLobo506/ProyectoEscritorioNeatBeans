/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Config.Config;
import Entidades.DetalleFactura;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class ADDetalleFact {
     //Atributos
    private Connection _cnn;
    private String _mensaje;
    
    
    public String getMensaje() {
        return _mensaje;
    }
    //Constructor
    public ADDetalleFact() throws Exception {
        try {
            String url = Config.getConnectionString();
            _cnn = DriverManager.getConnection(url);
            _mensaje = "";
        } catch (Exception e) {
            throw e;
        }
    }
    
    public int InsertaroModificar(DetalleFactura detalleFactura) throws Exception {

        int total = 0;
        ResultSet rs = null;

        String sentencia = "{call InsertarDetalleFactura(?,?,?)}";//LLAMAMOS A EL PROCESO ALMACENADO

        try {

            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setInt(1, detalleFactura.getIdFactura());
            ps.setString(2, detalleFactura.getIdProducto());
            ps.setInt(3, detalleFactura.getCantidad());

            ps.execute();

        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return total;
    }//Fin Insertar
    
    
     
     
    
}
