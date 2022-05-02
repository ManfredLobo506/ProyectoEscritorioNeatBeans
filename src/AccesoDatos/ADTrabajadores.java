/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Config.Config;
import Entidades.Trabajadores;
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
public class ADTrabajadores {

    //Atributos
    private Connection _cnn;
    private String _mensaje;

    public String getMensaje() {
        return _mensaje;
    }

    //Constructor
    public ADTrabajadores() throws Exception {
        try {
            String url = Config.getConnectionString();
            _cnn = DriverManager.getConnection(url);
            _mensaje = "";
        } catch (Exception e) {
            throw e;
        }
    }

    public int InsertaroModificar(Trabajadores trabajadores) throws Exception {

        int total = 0;
        ResultSet rs = null;

        String sentencia = "{call InsertarTrabajador(?,?,?,?,?)}";
        String sentencia2 = "select idtrabajador, nombre from trabajadores where idtrabajador=?";

        PreparedStatement corroborar = _cnn.prepareStatement(sentencia2);
        corroborar.setString(1, trabajadores.getId());
        rs = corroborar.executeQuery();

        try {

            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setString(1, trabajadores.getId());
            ps.setString(2, trabajadores.getNombre());
            ps.setString(3, trabajadores.getNumeroTelefonico());
            ps.setString(4, trabajadores.getCorreoElectronico());
            ps.setString(5, trabajadores.getResidencia());

            ps.execute();

            if (rs.next()) {

                _mensaje = "Trabajador modificado con exito";
            } else {
                _mensaje = "Trabajador Ingresado con Exito";
            }

        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return total;
    }//Fin Insertar

    public int Eliminar(Trabajadores trabajadores) throws Exception {

        int total = 0;
        ResultSet rs = null;

        String sentencia = "{call EliminarTrabajador(?)}";
        String sentencia2 = "select idtrabajador, nombre from trabajadores where idtrabajador=?";

        PreparedStatement corroborar = _cnn.prepareStatement(sentencia2);
        corroborar.setString(1, trabajadores.getId());
        rs = corroborar.executeQuery();

        try {

            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setString(1, trabajadores.getId());

            ps.execute();

            if (rs.next()) {

                _mensaje = "Trabajador eliminado con exito";
            } else {
                _mensaje = "El trabajador no existe";
            }

        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return total;
    }//Fin Insertar

    public List<Trabajadores> ListarRegistros(String condicion) throws SQLException {
        ResultSet rs = null;
        List<Trabajadores> lista = new ArrayList();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select IdTrabajador,Nombre,Correo,NumeroTelefonico,Residencia, Existe from Trabajadores";
            if (!condicion.equals("")) {
                sentencia = String.format("%s where %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            while (rs.next()) {
                lista.add(new Trabajadores(rs.getString("IdTrabajador"), rs.getString("Nombre"), rs.getString("NumeroTelefonico"), rs.getString("Correo"), rs.getString("Residencia"), rs.getInt("Existe")));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return lista;
    }
}
