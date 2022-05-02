/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import AccesoDatos.ADFactura;
import AccesoDatos.ADProductos;
import Entidades.Factura;
import Entidades.Productos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LNFactura {
    //Atributo

    private String _mensaje;

    public String getMensaje() {
        return _mensaje;
    }

    public int InsertaroModificar(Factura factura) throws Exception {

        int id = 0;

        try {
            ADFactura aDFactura = new ADFactura();
            id = aDFactura.InsertaroModificar(factura);
            _mensaje = aDFactura.getMensaje();
        } catch (Exception e) {
            throw e;
        }
        return id;
    }

    public String ObtenerVentas(int mes) throws Exception {

        String total = "";

        try {
            ADFactura aDFactura = new ADFactura();
            total = aDFactura.ObtenerVentas(mes);

        } catch (Exception e) {
            throw e;
        }
        return total;
    }

    public String ObtenerVentasTrab(int mes, String id) throws Exception {

        String total = "";

        try {
            ADFactura aDFactura = new ADFactura();
            total = aDFactura.ObtenerVentasTrab(mes, id);

        } catch (Exception e) {
            throw e;
        }
        return total;
    }

    public int Eliminar(Productos productos) throws Exception {

        int total = 0;
        ADProductos aDProductos;
        try {
            aDProductos = new ADProductos();
            total = aDProductos.Eliminar(productos);
            _mensaje = aDProductos.getMensaje();
        } catch (Exception e) {
            throw e;
        }
        return total;
    }

    public List<Productos> ListarRegistros(String condicion) throws Exception {
        List<Productos> resultado = new ArrayList();
        ADProductos aDProductos;
        try {
            aDProductos = new ADProductos();
            resultado = aDProductos.ListarRegistros(condicion);
        } catch (Exception e) {
            throw e;
        }
        return resultado;

    }

    public Productos ObtenerRegistro(String condicion) throws Exception {
        Productos resultado;
        ADProductos aDProductos;

        aDProductos = new ADProductos();
        resultado = aDProductos.ObtenerRegistro(condicion);

        return resultado;
    }
}
