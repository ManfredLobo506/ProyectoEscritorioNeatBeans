/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.LNFactura;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FrmFiltrarVentas extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmFiltrarVentas
     */
    public FrmFiltrarVentas() {
        initComponents();
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
        CBMes = new javax.swing.JComboBox<>();
        TxtTotal = new javax.swing.JTextField();
        BtnSalir = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();

        jLabel1.setText("Seleccione el mes");

        CBMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril","Mayo","Junio", "Julio", "Agosto","Septiembre", "Octubre", "Noviembre","Diciembre" }));

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

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
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtTotal)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBMes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CBMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(BtnBuscar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
        int mes = 0;
        switch ((String) CBMes.getSelectedItem()) {//DEPENDIENDO DEL MES SE ASIGNA UN VALOR

            case "Enero":
                mes = 1;
                break;
            case "Febrero":
                mes = 2;
                break;
            case "Marzo":
                mes = 3;
                break;
            case "Abril":
                mes = 4;
                break;
            case "Mayo":
                mes = 5;
                break;
            case "Junio":
                mes = 6;
                break;
            case "Julio":
                mes = 7;
                break;
            case "Agosto":
                mes = 8;
                break;
            case "Septiembre":
                mes = 9;
                break;
            case "Octubre":
                mes = 10;
                break;
            case "Noviembre":
                mes = 11;
                break;
            case "Diciembre":
                mes = 12;
                break;
        }

        LNFactura logica = new LNFactura();
        try {
            TxtTotal.setText(logica.ObtenerVentas(mes));
            if (TxtTotal.getText().equals("")) {
                TxtTotal.setText("No hay registros");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }


    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CBMes;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}