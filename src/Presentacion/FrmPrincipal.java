/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.Dimension;

/**
 *
 * @author Admin
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FrmPrincipal() {
        initComponents();
        this.setExtendedState(FrmPrincipal.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        EntradaProductos = new javax.swing.JMenu();
        Vender = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Clientes = new javax.swing.JMenuItem();
        Trabajador = new javax.swing.JMenuItem();
        Productos = new javax.swing.JMenuItem();
        Usuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        VentasMes = new javax.swing.JMenuItem();
        VentasMesTrab = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar3 = new javax.swing.JMenuBar();
        EntradaProductos1 = new javax.swing.JMenu();
        Vender1 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Clientes1 = new javax.swing.JMenuItem();
        Trabajador1 = new javax.swing.JMenuItem();
        Productos1 = new javax.swing.JMenuItem();
        Usuarios1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        VentasMes1 = new javax.swing.JMenuItem();
        VentasMesTrab1 = new javax.swing.JMenuItem();

        EntradaProductos.setText("Compras-Ventas");

        Vender.setText("Vender");
        Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderActionPerformed(evt);
            }
        });
        EntradaProductos.add(Vender);

        jMenuItem8.setText("Entrada Productos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        EntradaProductos.add(jMenuItem8);

        jMenuBar2.add(EntradaProductos);

        jMenu1.setText("Agregar Registros");

        Clientes.setText("Agregar Cliente");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        jMenu1.add(Clientes);

        Trabajador.setText("Agregar Trabajador");
        Trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrabajadorActionPerformed(evt);
            }
        });
        jMenu1.add(Trabajador);

        Productos.setText("Agregar Productos");
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });
        jMenu1.add(Productos);

        Usuarios.setText("Agregar Usuario");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(Usuarios);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Filtrar Ventas");

        VentasMes.setText("Ventas Mes");
        VentasMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasMesActionPerformed(evt);
            }
        });
        jMenu2.add(VentasMes);

        VentasMesTrab.setText("Ventas mes Trabajador");
        VentasMesTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasMesTrabActionPerformed(evt);
            }
        });
        jMenu2.add(VentasMesTrab);

        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        EntradaProductos1.setText("Compras-Ventas");

        Vender1.setText("Vender");
        Vender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vender1ActionPerformed(evt);
            }
        });
        EntradaProductos1.add(Vender1);

        jMenuItem9.setText("Entrada Productos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        EntradaProductos1.add(jMenuItem9);

        jMenuBar3.add(EntradaProductos1);

        jMenu3.setText("Agregar Registros");

        Clientes1.setText("Agregar Cliente");
        Clientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clientes1ActionPerformed(evt);
            }
        });
        jMenu3.add(Clientes1);

        Trabajador1.setText("Agregar Trabajador");
        Trabajador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Trabajador1ActionPerformed(evt);
            }
        });
        jMenu3.add(Trabajador1);

        Productos1.setText("Agregar Productos");
        Productos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos1ActionPerformed(evt);
            }
        });
        jMenu3.add(Productos1);

        Usuarios1.setText("Agregar Usuario");
        Usuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuarios1ActionPerformed(evt);
            }
        });
        jMenu3.add(Usuarios1);

        jMenuBar3.add(jMenu3);

        jMenu4.setText("Filtrar Ventas");

        VentasMes1.setText("Ventas Mes");
        VentasMes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasMes1ActionPerformed(evt);
            }
        });
        jMenu4.add(VentasMes1);

        VentasMesTrab1.setText("Ventas mes Trabajador");
        VentasMesTrab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasMesTrab1ActionPerformed(evt);
            }
        });
        jMenu4.add(VentasMesTrab1);

        jMenuBar3.add(jMenu4);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>                        
//AQUI ABRIMOS Y CENTRAMOS LOS FORMULARIOS CON UNA FORMULA PREVIAMENTE VISTA EN CLASE
    private void VenderActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        FrmComprar formularioInterno = new FrmComprar();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                      

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        // TODO add your handling code here:
        FrmIngresarProductos formularioInterno = new FrmIngresarProductos();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                          

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:

        FrmAgregarPersona formularioInterno = new FrmAgregarPersona();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                        

    private void TrabajadorActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        FrmAgregarTrabajador formularioInterno = new FrmAgregarTrabajador();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                          

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:

        FrmIngresoProductos formularioInterno = new FrmIngresoProductos();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                         

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        FrmAgregarUsuario formularioInterno = new FrmAgregarUsuario();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                        

    private void VentasMesActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        FrmFiltrarVentas formularioInterno = new FrmFiltrarVentas();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                         

    private void VentasMesTrabActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        FrmFiltrarVentasTrab formularioInterno = new FrmFiltrarVentasTrab();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                             

    private void Vender1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        FrmComprar formularioInterno = new FrmComprar();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                       

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        // TODO add your handling code here:
        FrmIngresarProductos formularioInterno = new FrmIngresarProductos();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                          

    private void Clientes1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:

        FrmAgregarPersona formularioInterno = new FrmAgregarPersona();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                         

    private void Trabajador1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        FrmAgregarTrabajador formularioInterno = new FrmAgregarTrabajador();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                           

    private void Productos1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:

        FrmIngresoProductos formularioInterno = new FrmIngresoProductos();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                          

    private void Usuarios1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        FrmAgregarUsuario formularioInterno = new FrmAgregarUsuario();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                         

    private void VentasMes1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        FrmFiltrarVentas formularioInterno = new FrmFiltrarVentas();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                          

    private void VentasMesTrab1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        FrmFiltrarVentasTrab formularioInterno = new FrmFiltrarVentasTrab();

        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);

        //el tama??o de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
                getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);

        formularioInterno.show();
    }                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenuItem Clientes;
    private javax.swing.JMenuItem Clientes1;
    private javax.swing.JMenu EntradaProductos;
    private javax.swing.JMenu EntradaProductos1;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem Productos;
    private javax.swing.JMenuItem Productos1;
    private javax.swing.JMenuItem Trabajador;
    private javax.swing.JMenuItem Trabajador1;
    private javax.swing.JMenuItem Usuarios;
    private javax.swing.JMenuItem Usuarios1;
    private javax.swing.JMenuItem Vender;
    private javax.swing.JMenuItem Vender1;
    private javax.swing.JMenuItem VentasMes;
    private javax.swing.JMenuItem VentasMes1;
    private javax.swing.JMenuItem VentasMesTrab;
    private javax.swing.JMenuItem VentasMesTrab1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration                   
}
