/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Config.Config;
import Entidades.Productos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ADProductos {
    //Atributos

    private Connection _cnn;
    private String _mensaje;

    public String getMensaje() {
        return _mensaje;
    }

    //Constructor
    public ADProductos() throws Exception {
        try {
            String url = Config.getConnectionString();
            _cnn = DriverManager.getConnection(url);
            _mensaje = "";
        } catch (Exception e) {
            throw e;
        }
    }

    public int InsertaroModificar(Productos productos) throws Exception {

        int total = 0;
        ResultSet rs = null;

        String sentencia = "{call InsertarProductos(?,?,?,?,?,?)}";
        String sentencia2 = "select idProducto from productos where idproducto=?";

        PreparedStatement corroborar = _cnn.prepareStatement(sentencia2);
        corroborar.setString(1, productos.getIdProducto());
        rs = corroborar.executeQuery();

        try {

            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setString(1, productos.getIdProducto());
            ps.setString(2, productos.getDescripcion());
            ps.setString(3, productos.getMarca());
            ps.setString(4, productos.getCategoria());
            ps.setInt(5, productos.getCantidad());
            ps.setInt(6, productos.getPrecioVenta());

            ps.execute();

            if (rs.next()) {

                _mensaje = "Producto modificado con exito";
            } else {
                _mensaje = "Producto Ingresado con Exito";
            }

        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return total;
    }//Fin Insertar

    public int Eliminar(Productos productos) throws Exception {

        int total = 0;
        ResultSet rs = null;

        String sentencia = "{call EliminarProductos(?)}";
        String sentencia2 = "select IdProducto from Productos where IdProducto=?";

        PreparedStatement corroborar = _cnn.prepareStatement(sentencia2);
        corroborar.setString(1, productos.getIdProducto());
        rs = corroborar.executeQuery();

        try {

            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setString(1, productos.getIdProducto());

            ps.execute();

            if (rs.next()) {

                _mensaje = "Producto eliminado con exito";
            } else {
                _mensaje = "El producto no existe";
            }

        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return total;
    }//Fin Insertar

    public List<Productos> ListarRegistros(String condicion) throws SQLException {
        ResultSet rs = null;
        List<Productos> lista = new ArrayList();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select IdProducto,Nombre,Categoria,Precio,Marca,Cantidada from Productos";
            if (!condicion.equals("")) {
                sentencia = String.format("%s where %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            while (rs.next()) {
                lista.add(new Productos(rs.getString("IdProducto"), rs.getString("Nombre"), rs.getString("Categoria"), rs.getInt("Precio"), rs.getString("Marca"), rs.getInt("Cantidada")));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return lista;
    }

    public Productos ObtenerRegistro(String condicion) throws SQLException {
        Productos productos = new Productos();
        ResultSet rs = null;
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select Idproducto,nombre,precio from productos";

            if (!condicion.equals("")) {
                sentencia = String.format("%s where %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            if (rs.next()) {
                productos.setIdProducto(rs.getString(1));
                productos.setDescripcion(rs.getString(2));
                productos.setPrecioVenta(rs.getInt(3));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return productos;
    }
}
