/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidades.Trabajadores;
import Logica.LNTrabajadores;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FrmAgregarTrabajador extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmAgregarPersona
     *
     *
     */
    public Trabajadores GenerarEntidad() {

        Trabajadores trabajadores = new Trabajadores();

        trabajadores.setId(TxtId.getText());
        trabajadores.setNombre(TxtNombre.getText());
        trabajadores.setNumeroTelefonico(TxtNumero.getText());
        trabajadores.setResidencia(TxtResidencia.getText());
        trabajadores.setCorreoElectronico(TxtCorreo.getText());
        trabajadores.setExiste(1);

        return trabajadores;

    }

    public void limpiar() {
        TxtId.setText("");
        TxtNombre.setText("");
        TxtNumero.setText("");
        TxtResidencia.setText("");
        TxtCorreo.setText("");

    }
    DefaultTableModel modelo;

    private void LimpiarTabla() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        TblPersonas.setModel(modelo);
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("Residencia");

    }

    private void CargarDatos(String condicion) throws Exception {
        try {
            LNTrabajadores logica = new LNTrabajadores();
            List<Trabajadores> lista;
            LimpiarTabla();
            Object[] fila = new Object[5];
            lista = logica.ListarRegistros(condicion);
            for (Trabajadores trabajadores : lista) {
                fila[0] = trabajadores.getId();
                fila[1] = trabajadores.getNombre();
                fila[2] = trabajadores.getNumeroTelefonico();
                fila[3] = trabajadores.getCorreoElectronico();
                fila[4] = trabajadores.getResidencia();
                modelo.addRow(fila);
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public FrmAgregarTrabajador() {
        initComponents();

        try {
            CargarDatos("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtNumero = new javax.swing.JTextField();
        TxtId = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtResidencia = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPersonas = new javax.swing.JTable();
        TxtBuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();

        jLabel1.setText("Identificacion:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Numero Telefonico:");

        jLabel4.setText("Correo Electronico:");

        jLabel5.setText("Residencia:");

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        TblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TblPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblPersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblPersonas);

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 593, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(BtnBuscar))
                                        .addComponent(TxtResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSalir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(TxtResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnSalir))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        int resultado = 0;
        LNTrabajadores logica = new LNTrabajadores();
        Trabajadores trabajadores = GenerarEntidad();
        try {
            resultado = logica.InsertaroModificar(trabajadores);
            JOptionPane.showMessageDialog(this, logica.getMensaje());

            limpiar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        try {
            CargarDatos("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }


    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        int resultado = 0;
        LNTrabajadores logica = new LNTrabajadores();
        Trabajadores trabajadores = GenerarEntidad();
        try {
            resultado = logica.Eliminar(trabajadores);
            JOptionPane.showMessageDialog(this, logica.getMensaje());
            limpiar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        try {
            CargarDatos("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void TblPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblPersonasMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {

            int fila = TblPersonas.rowAtPoint(evt.getPoint());
            TxtId.setText(TblPersonas.getValueAt(fila, 0).toString());
            TxtNombre.setText(TblPersonas.getValueAt(fila, 1).toString());
            TxtNumero.setText(TblPersonas.getValueAt(fila, 2).toString());
            TxtCorreo.setText(TblPersonas.getValueAt(fila, 3).toString());
            TxtResidencia.setText(TblPersonas.getValueAt(fila, 4).toString());

        }
    }//GEN-LAST:event_TblPersonasMouseClicked

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
        String condicion = "";
        try {
            if (!TxtBuscar.getText().equals("")) {
                condicion = "nombre like '%" + TxtBuscar.getText() + "%'";
            }
            CargarDatos(condicion);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTable TblPersonas;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JTextField TxtResidencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
