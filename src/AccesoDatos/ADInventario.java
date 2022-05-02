/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Config.Config;
import Entidades.DetalleFactura;
import Entidades.EntradaProductos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class ADInventario {
    
         //Atributos
    private Connection _cnn;
    private String _mensaje;
    
    
    public String getMensaje() {
        return _mensaje;
    }
    //Constructor
    public ADInventario() throws Exception {
        try {
            String url = Config.getConnectionString();
            _cnn = DriverManager.getConnection(url);
            _mensaje = "";
        } catch (Exception e) {
            throw e;
        }
    }
      public int InsertaroModificar(EntradaProductos entradaProductos) throws Exception {
       
        int total = 0;
        ResultSet rs = null;

        String sentencia = "{call InsertarInvetario(?,?,?)}";

        try {

            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setString(1, entradaProductos.getIdProducto());
            ps.setInt(2, entradaProductos.getCantidad());
            ps.setString(3, entradaProductos.getProveedor());

            ps.execute();
            _mensaje="Se ha agregado el registro correctamente";

        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return total;
    }//Fin Insertar
}
