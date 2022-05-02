/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Admin
 */
public class DetalleFactura {
    //Atributos   
    int IdDetalle;
    int IdFactura;
    String IdProducto;
    int Cantidad;

    
    //Constructores
    
    public DetalleFactura(int IdDetalle, int IdFactura, String IdProducto, int Cantidad) {
        this.IdDetalle = IdDetalle;
        this.IdFactura = IdFactura;
        this.IdProducto = IdProducto;
        this.Cantidad = Cantidad;
    }
    public DetalleFactura() {
    }
    
    //Getter and Setter
    
     public int getIdDetalle() {
        return IdDetalle;
    }

    public void setIdDetalle(int IdDetalle) {
        this.IdDetalle = IdDetalle;
    }

    public int getIdFactura() {
        return IdFactura;
    }

    public void setIdFactura(int IdFactura) {
        this.IdFactura = IdFactura;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
