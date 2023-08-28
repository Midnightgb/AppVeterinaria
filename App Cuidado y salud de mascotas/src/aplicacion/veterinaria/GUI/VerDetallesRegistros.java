
package aplicacion.veterinaria.GUI;

import aplicacion.veterinaria.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class VerDetallesRegistros extends javax.swing.JFrame {
    
    private DataBase db = new DataBase();
    private Connection conn = db.getConexion();
    private String idRegistro;
    private String nombreMascotatxt;
    
    public VerDetallesRegistros(String idRegistro, String nombreMascotatxt) {
        this.idRegistro = idRegistro;
        this.nombreMascotatxt = nombreMascotatxt;
        initComponents();
        nombreMsc.setText(nombreMascotatxt);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDetalleRegistro = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        detalleTxt = new javax.swing.JLabel();
        idMascotaTxt = new javax.swing.JLabel();
        nombreMscTxt = new javax.swing.JLabel();
        razaTxt = new javax.swing.JLabel();
        edadTxt = new javax.swing.JLabel();
        generoTxt = new javax.swing.JLabel();
        fechaTxt = new javax.swing.JLabel();
        dianosticoTxt = new javax.swing.JLabel();
        tratamientoTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tratamientoOutput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        diagnosticoOutput = new javax.swing.JTextArea();
        btnOk = new javax.swing.JButton();
        idMsc = new javax.swing.JLabel();
        nombreMsc = new javax.swing.JLabel();
        razaMsc = new javax.swing.JLabel();
        edadMsc = new javax.swing.JLabel();
        generoMsc = new javax.swing.JLabel();
        fechaMsc = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        imgMsc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelDetalleRegistro.setBackground(new java.awt.Color(43, 43, 43));
        panelDetalleRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img.setFont(img.getFont());
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/dogtor (Custom).png"))); // NOI18N
        panelDetalleRegistro.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 458, 133, 124));

        detalleTxt.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        detalleTxt.setForeground(new java.awt.Color(255, 255, 255));
        detalleTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detalleTxt.setText("Detalles de la consulta");
        panelDetalleRegistro.add(detalleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 438, -1));

        idMascotaTxt.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        idMascotaTxt.setForeground(new java.awt.Color(255, 255, 255));
        idMascotaTxt.setText("ID Mascota:");
        panelDetalleRegistro.add(idMascotaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, -1, -1));

        nombreMscTxt.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        nombreMscTxt.setForeground(new java.awt.Color(255, 255, 255));
        nombreMscTxt.setText("Nombre Mascota:");
        panelDetalleRegistro.add(nombreMscTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, -1, -1));

        razaTxt.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        razaTxt.setForeground(new java.awt.Color(255, 255, 255));
        razaTxt.setText("Raza:");
        panelDetalleRegistro.add(razaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, -1, -1));

        edadTxt.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        edadTxt.setForeground(new java.awt.Color(255, 255, 255));
        edadTxt.setText("Edad:");
        panelDetalleRegistro.add(edadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 122, -1, -1));

        generoTxt.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        generoTxt.setForeground(new java.awt.Color(255, 255, 255));
        generoTxt.setText("Género:");
        panelDetalleRegistro.add(generoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 144, -1, -1));

        fechaTxt.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        fechaTxt.setForeground(new java.awt.Color(255, 255, 255));
        fechaTxt.setText("Fecha de consulta:");
        panelDetalleRegistro.add(fechaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 166, -1, -1));

        dianosticoTxt.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        dianosticoTxt.setForeground(new java.awt.Color(255, 255, 255));
        dianosticoTxt.setText("Diagnóstico:");
        panelDetalleRegistro.add(dianosticoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 200, -1, -1));

        tratamientoTxt.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        tratamientoTxt.setForeground(new java.awt.Color(255, 255, 255));
        tratamientoTxt.setText("Tratamiento:");
        tratamientoTxt.setToolTipText("");
        panelDetalleRegistro.add(tratamientoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 329, -1, -1));

        tratamientoOutput.setBackground(new java.awt.Color(51, 51, 51));
        tratamientoOutput.setColumns(20);
        tratamientoOutput.setFont(new java.awt.Font("Source Code Pro", 2, 14)); // NOI18N
        tratamientoOutput.setRows(5);
        tratamientoOutput.setText("nada");
        tratamientoOutput.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 10, 5));
        jScrollPane1.setViewportView(tratamientoOutput);

        panelDetalleRegistro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 351, 438, 101));

        diagnosticoOutput.setBackground(new java.awt.Color(51, 51, 51));
        diagnosticoOutput.setColumns(20);
        diagnosticoOutput.setFont(new java.awt.Font("Source Code Pro", 2, 14)); // NOI18N
        diagnosticoOutput.setRows(5);
        diagnosticoOutput.setText("nada");
        diagnosticoOutput.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 10, 5));
        jScrollPane2.setViewportView(diagnosticoOutput);

        panelDetalleRegistro.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 222, 438, 101));

        btnOk.setBackground(new java.awt.Color(48, 119, 62));
        btnOk.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnOk.setForeground(new java.awt.Color(255, 255, 255));
        btnOk.setText("Ok");
        btnOk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOkMousePressed(evt);
            }
        });
        panelDetalleRegistro.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 492, 85, 40));

        idMsc.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        idMsc.setForeground(new java.awt.Color(255, 255, 255));
        idMsc.setText("{var}");
        panelDetalleRegistro.add(idMsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 56, -1, -1));

        nombreMsc.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        nombreMsc.setForeground(new java.awt.Color(255, 255, 255));
        nombreMsc.setText("{var}");
        panelDetalleRegistro.add(nombreMsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 78, -1, -1));

        razaMsc.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        razaMsc.setForeground(new java.awt.Color(255, 255, 255));
        razaMsc.setText("{var}");
        panelDetalleRegistro.add(razaMsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 100, -1, -1));

        edadMsc.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        edadMsc.setForeground(new java.awt.Color(255, 255, 255));
        edadMsc.setText("{var}");
        panelDetalleRegistro.add(edadMsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 122, -1, -1));

        generoMsc.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        generoMsc.setForeground(new java.awt.Color(255, 255, 255));
        generoMsc.setText("{var}");
        panelDetalleRegistro.add(generoMsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 144, -1, -1));

        fechaMsc.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        fechaMsc.setForeground(new java.awt.Color(255, 255, 255));
        fechaMsc.setText("{var}");
        panelDetalleRegistro.add(fechaMsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 166, -1, -1));
        panelDetalleRegistro.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 38, 193, 10));
        panelDetalleRegistro.add(imgMsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDetalleRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDetalleRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMousePressed
        setVisible(false);
    }//GEN-LAST:event_btnOkMousePressed

    public void getDetallesRegistro(String idRegistro){
    try {
        String selectQuery = "SELECT * FROM registro_medico WHERE id_registro = ?";
        PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
        selectStatement.setString(1, idRegistro);

        ResultSet resultSet = selectStatement.executeQuery();

        if (resultSet.next()) {
            String fechaRegistrotxt = resultSet.getString("fecha_registro");
            String idMascota = resultSet.getString("mascota");
            String diagnostico = resultSet.getString("diagnostico");
            String tratamiento = resultSet.getString("tratamiento");
            byte[] imagenData = resultSet.getBytes("imagen");
        }

        resultSet.close();
        selectStatement.close();
        conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel detalleTxt;
    private javax.swing.JTextArea diagnosticoOutput;
    private javax.swing.JLabel dianosticoTxt;
    private javax.swing.JLabel edadMsc;
    private javax.swing.JLabel edadTxt;
    private javax.swing.JLabel fechaMsc;
    private javax.swing.JLabel fechaTxt;
    private javax.swing.JLabel generoMsc;
    private javax.swing.JLabel generoTxt;
    private javax.swing.JLabel idMascotaTxt;
    private javax.swing.JLabel idMsc;
    private javax.swing.JLabel img;
    private javax.swing.JLabel imgMsc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombreMsc;
    private javax.swing.JLabel nombreMscTxt;
    private javax.swing.JPanel panelDetalleRegistro;
    private javax.swing.JLabel razaMsc;
    private javax.swing.JLabel razaTxt;
    private javax.swing.JTextArea tratamientoOutput;
    private javax.swing.JLabel tratamientoTxt;
    // End of variables declaration//GEN-END:variables
}
