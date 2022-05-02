/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.util.Date;
/**
 *
 * @author Admin
 */
public class Factura {

  

//Atributos
    
    int IdFactura;
    String IdCliente;
    String IdTrabajador;
    Date Fecha;
    int SubTotal;
    double Iva;
    double Total;
    String Estado;

   
    
//Constructores   
     public Factura(int IdFactura, String IdCliente, String IdTrabajador, Date Fecha, int SubTotal, double Iva, double Total,String Estado) {
        this.IdFactura = IdFactura;
        this.IdCliente = IdCliente;
        this.IdTrabajador = IdTrabajador;
        this.Fecha = Fecha;
        this.SubTotal = SubTotal;
        this.Iva = Iva;
        this.Total = Total;
        this.Estado= Estado;
    }   
     
     public Factura() {

    }   
     
//Setter and Getter

     public int getIdFactura() {
        return IdFactura;
    }

    public void setIdFactura(int IdFactura) {
        this.IdFactura = IdFactura;
    }

    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getIdTrabajador() {
        return IdTrabajador;
    }

    public void setIdTrabajador(String IdTrabajador) {
        this.IdTrabajador = IdTrabajador;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(int SubTotal) {
        this.SubTotal = SubTotal;
    }

    public double getIva() {
        return Iva;
    }

    public void setIva(double Iva) {
        this.Iva = Iva;
    }

    public double getTotal() {
        return Total;
    }
    
    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
