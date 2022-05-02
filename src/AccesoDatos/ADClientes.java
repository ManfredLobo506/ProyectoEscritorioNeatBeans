/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;
import Config.Config;
import Entidades.Cliente;
import Entidades.Personas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/**
 *
 * @author Admin
 */
public class ADClientes {

    //Atributos
    private Connection _cnn;
    private String _mensaje;

    public String getMensaje() {
        return _mensaje;
    }

    //Constructor
    public ADClientes() throws Exception {
        try {
            String url = Config.getConnectionString();
            _cnn = DriverManager.getConnection(url);
            _mensaje = "";
        } catch (Exception e) {
            throw e;
        }
    }

    public int InsertaroModificar(Cliente cliente) throws Exception {
        int total = 0;
        ResultSet rs = null;

        String sentencia = "{call InsertarCliente(?,?,?,?,?)}";//CREAMOS LA SENTECIA PARA EJECUTARLA
        String sentencia2 = "select idcliente, nombre from Clientes where IdCliente=?";//CREAMOS PARA VERIFICAR EL ESTADO DE UN CLIENTE

        PreparedStatement corroborar = _cnn.prepareStatement(sentencia2);
        corroborar.setString(1, cliente.getId());
        rs = corroborar.executeQuery();

        try {

            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setString(1, cliente.getId());//ASIGNAMOS VALORES A LOS PARAMETROS
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getNumeroTelefonico());
            ps.setString(4, cliente.getCorreoElectronico());
            ps.setString(5, cliente.getResidencia());

            ps.execute();

            if (rs.next()) {//UN CONDICIONAL PARA SABER SI EL CLIENTE FUE MODIFICADO O INGRESADO
                _mensaje = "Cliente modificado con exito";
            } else {
                _mensaje = "Cliente Ingresado con Exito";
            }

        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return total;
    }//Fin Insertar

    public int Eliminar(Cliente cliente) throws Exception {

        int total = 0;
        ResultSet rs = null;

        String sentencia = "{call EliminarCliente(?)}";//CREAMOS LA SENTECIA PARA EJECUTARLA
        String sentencia2 = "select idcliente, nombre from Clientes where IdCliente=?";//CREAMOS PARA VERIFICAR EL ESTADO DE UN CLIENTE

        PreparedStatement corroborar = _cnn.prepareStatement(sentencia2);
        corroborar.setString(1, cliente.getId());
        rs = corroborar.executeQuery();

        try {

            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setString(1, cliente.getId());

            ps.execute();

            if (rs.next()) {//UN CONDICIONAL PARA SABER SI EL CLIENTE EXISTIA O NO
                _mensaje = "Cliente eliminado con exito";
            } else {
                _mensaje = "El cliente no existe";
            }

        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return total;
    }//Fin Insertar

    public List<Cliente> ListarRegistros(String condicion) throws SQLException {
        ResultSet rs = null;
        List<Cliente> lista = new ArrayList();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select IdCliente,Nombre,Correo,NumeroTelefonico,Residencia, Existe from Clientes where Existe=1";//REALIZAMOS UN SELECT A TODOS LOS CLIENTES ACTIVOS
            if (!condicion.equals("")) {//EN CASO DE QUE LA CONDICION NO VENGA VACIA LE SUMAMOS ESTOS ELEMENTOS
                sentencia = String.format("%s  and %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            while (rs.next()) {//TOMAMOS LOS VALORES DEVUELTOS Y LOS ASIGNAMOS A LA ENTIDAD CLIENTE QUE SERAN INGRESADOS A LA LISTA
                lista.add(new Cliente(rs.getString("IdCliente"), rs.getString("Nombre"), rs.getString("NumeroTelefonico"), rs.getString("Correo"), rs.getString("Residencia"), rs.getInt("Existe")));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            _cnn = null;
        }
        return lista;
    }
}
