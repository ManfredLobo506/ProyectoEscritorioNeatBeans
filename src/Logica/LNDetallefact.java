/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import AccesoDatos.ADDetalleFact;
import AccesoDatos.ADFactura;
import Entidades.DetalleFactura;

/**
 *
 * @author Admin
 */
public class LNDetallefact {
    //Atributo

    private String _mensaje;

    public String getMensaje() {
        return _mensaje;
    }

    public int InsertaroModificar(DetalleFactura detalleFactura) throws Exception {

        int id = 0;
        ADDetalleFact aDDetalleFact;
        try {
            aDDetalleFact = new ADDetalleFact();
            id = aDDetalleFact.InsertaroModificar(detalleFactura);
            _mensaje = aDDetalleFact.getMensaje();
        } catch (Exception e) {
            throw e;
        }
        return id;
    }

}
