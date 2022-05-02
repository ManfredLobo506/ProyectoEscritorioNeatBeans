/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Config.Config;
import Entidades.Factura;
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
public class ADFactura {
    //Atributos

    private Connection _cnn;
    private String _mensaje;

    public String getMensaje() {
        return _mensaje;
    }

    //Constructor
    public ADFactura() throws Exception {
        try {
            String url = Config.getConnectionString();
            _cnn = DriverManager.getConnection(url);
            _mensaje = "";
        } catch (Exception e) {
            throw e;
        }
    }

    public int InsertaroModificar(Factura factura) throws Exception {

        int idFact = 0;
        ResultSet rs = null;

        String sentencia = ("insert into Factura(IdTrabajador,IdCliente,Subtotal,Iva,Total,ESTADO)\n"
                + "				values(?,?,?,?,?,?)");
        String sentencia2 = "select idProducto from productos where idproducto=?";

        PreparedStatement corroborar = _cnn.prepareStatement(sentencia2);
        corroborar.setString(1, "" + factura.getIdFactura());
        rs = corroborar.executeQuery();

        try {

            PreparedStatement ps = _cnn.prepareStatement(sentencia, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, factura.getIdTrabajador());
            ps.setString(2, factura.getIdCliente());
            ps.setInt(3, factura.getSubTotal());
            ps.setInt(4, ((int) factura.getIva()));
            ps.setDouble(5, factura.getTotal());
            ps.setString(6, factura.getEstado());
            ps.execute();

            ResultSet rs2 = ps.getGeneratedKeys(); //El result set es como una tabla con un registro
            if (rs2 != null && rs2.next()) { //SI SE GENERÓ EL RESULTSET Y HAY OTRO REGISTRO
                idFact = rs2.getInt(1);

            }

            if (rs.next()) {

                _mensaje = "Factura modificado con exito";
            } else {
                _mensaje = "Factura Ingresada con Exito";
            }

        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }

        return idFact;
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

    public String ObtenerVentas(int mes) throws SQLException {
        ResultSet rs = null;
        String total = "";
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select TotalVentas=SUM(total) from factura where MONTH(fecha)=" + mes;

            rs = stm.executeQuery(sentencia);
            if (rs.next()) {
                total = rs.getString("TotalVentas");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return total;
    }

    public String ObtenerVentasTrab(int mes, String id) throws SQLException {
        ResultSet rs = null;
        String total = "";
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select TotalVentas=SUM(total) from factura where MONTH(fecha)=" + mes + " and idtrabajador='" + id + "'";

            rs = stm.executeQuery(sentencia);
            if (rs.next()) {
                total = rs.getString("TotalVentas");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return total;
    }
}
