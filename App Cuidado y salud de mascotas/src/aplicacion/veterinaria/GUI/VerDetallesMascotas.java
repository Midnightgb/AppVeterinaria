
package aplicacion.veterinaria.GUI;

import aplicacion.veterinaria.DataBase;
import aplicacion.veterinaria.Herramientas;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;


public class VerDetallesMascotas extends javax.swing.JPanel {

    private String cedula;
    private JTabbedPane contenido;
    private DataBase db = new DataBase();
    private Connection conn = db.getConexion();
    private String id_mascota;
    
    public VerDetallesMascotas(String cedula, JTabbedPane contenido, String id_mascota) {
        this.id_mascota = id_mascota;
        this.contenido = contenido;
        this.cedula = cedula;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDetalles = new javax.swing.JPanel();
        imgMascota = new javax.swing.JLabel();
        nombredMascota = new javax.swing.JLabel();
        textNombre = new javax.swing.JLabel();
        nombreMascota = new javax.swing.JTextField();
        textRaza = new javax.swing.JLabel();
        razaMascota = new javax.swing.JTextField();
        edadText = new javax.swing.JLabel();
        edadMascota = new javax.swing.JTextField();
        genero = new javax.swing.JComboBox<>();
        editarBoton = new javax.swing.JButton();
        editar = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        irAtras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        editarImagen = new javax.swing.JButton();

        panelDetalles.setBackground(new java.awt.Color(43, 43, 43));
        panelDetalles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/miamor (Custom).jpg"))); // NOI18N
        panelDetalles.add(imgMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 90, -1, -1));

        nombredMascota.setFont(new java.awt.Font("Source Code Pro", 1, 18)); // NOI18N
        nombredMascota.setForeground(new java.awt.Color(210, 210, 210));
        nombredMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombredMascota.setText("manolo");
        panelDetalles.add(nombredMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 150, -1));

        textNombre.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        textNombre.setForeground(new java.awt.Color(210, 210, 210));
        textNombre.setText("Nombre:");
        panelDetalles.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        nombreMascota.setBackground(new java.awt.Color(90, 90, 90));
        nombreMascota.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        nombreMascota.setForeground(new java.awt.Color(210, 210, 210));
        nombreMascota.setText("pepito");
        nombreMascota.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        nombreMascota.setCaretColor(new java.awt.Color(255, 255, 255));
        nombreMascota.setEnabled(false);
        nombreMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreMascotaKeyReleased(evt);
            }
        });
        panelDetalles.add(nombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 250, 33));

        textRaza.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        textRaza.setForeground(new java.awt.Color(210, 210, 210));
        textRaza.setText("Raza:");
        panelDetalles.add(textRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        razaMascota.setBackground(new java.awt.Color(90, 90, 90));
        razaMascota.setForeground(new java.awt.Color(210, 210, 210));
        razaMascota.setText("Cocodrilo 🐊");
        razaMascota.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        razaMascota.setCaretColor(new java.awt.Color(255, 255, 255));
        razaMascota.setEnabled(false);
        panelDetalles.add(razaMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 250, 35));

        edadText.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        edadText.setForeground(new java.awt.Color(210, 210, 210));
        edadText.setText("Edad:");
        panelDetalles.add(edadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        edadMascota.setBackground(new java.awt.Color(90, 90, 90));
        edadMascota.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        edadMascota.setForeground(new java.awt.Color(210, 210, 210));
        edadMascota.setText("150");
        edadMascota.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        edadMascota.setCaretColor(new java.awt.Color(255, 255, 255));
        edadMascota.setEnabled(false);
        panelDetalles.add(edadMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 60, 35));

        genero.setBackground(new java.awt.Color(90, 90, 90));
        genero.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        genero.setForeground(new java.awt.Color(210, 210, 210));
        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Hembra", "Otro", "Indefinido" }));
        genero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 12), new java.awt.Color(90, 90, 90))); // NOI18N
        genero.setEnabled(false);
        panelDetalles.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 184, 35));

        editarBoton.setBackground(new java.awt.Color(229, 171, 37));
        editarBoton.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        editarBoton.setForeground(new java.awt.Color(255, 255, 255));
        editarBoton.setText("Editar");
        editarBoton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        editarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarBoton.setFocusPainted(false);
        editarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBotonActionPerformed(evt);
            }
        });
        panelDetalles.add(editarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 75, 40));

        editar.setForeground(new java.awt.Color(210, 210, 210));
        editar.setText("Genero:");
        panelDetalles.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        guardar.setBackground(new java.awt.Color(51, 153, 0));
        guardar.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("Guardar");
        guardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.setEnabled(false);
        guardar.setFocusPainted(false);
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });
        panelDetalles.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 75, 40));

        irAtras.setBackground(new java.awt.Color(62, 112, 157));
        irAtras.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        irAtras.setForeground(new java.awt.Color(255, 255, 255));
        irAtras.setText("Atras");
        irAtras.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        irAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        irAtras.setFocusPainted(false);
        irAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irAtrasActionPerformed(evt);
            }
        });
        panelDetalles.add(irAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 29, 75, 40));

        jPanel1.setBackground(new java.awt.Color(64, 64, 64));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 12));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        panelDetalles.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 827, 6));

        editarImagen.setBackground(new java.awt.Color(90, 90, 90));
        editarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-editar-30.png"))); // NOI18N
        editarImagen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        editarImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarImagen.setEnabled(false);
        editarImagen.setFocusPainted(false);
        editarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarImagenMouseClicked(evt);
            }
        });
        panelDetalles.add(editarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 133, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        panelDetalles.setFocusable(true);
        panelDetalles.requestFocusInWindow();
    }// </editor-fold>//GEN-END:initComponents

    private void editarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBotonActionPerformed
        nombreMascota.setEnabled(true);
        razaMascota.setEnabled(true);
        edadMascota.setEnabled(true);
        genero.setEnabled(true);
        guardar.setEnabled(true);
        editarImagen.setEnabled(true);
    }//GEN-LAST:event_editarBotonActionPerformed

    private void irAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irAtrasActionPerformed
        PanelMascotas panelmascotas = new PanelMascotas(cedula, contenido);
        
        panelmascotas.consultarDatosEnBaseDeDatos();
        contenido.setComponentAt(1, panelmascotas);
    }//GEN-LAST:event_irAtrasActionPerformed

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        if (guardar.isEnabled())
        try {
            String nombre = nombreMascota.getText();
            String raza = razaMascota.getText();
            int edad = Integer.parseInt(edadMascota.getText());
            String generoSeleccionado  = (String) genero.getSelectedItem();
            
            String updateQuery = "UPDATE mascotas SET nombre = ?, raza = ?, edad = ?, genero = ? WHERE id_mascota = ?";
            PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
            updateStatement.setString(1, nombre); 
            updateStatement.setString(2, raza);  
            updateStatement.setInt(3, edad);  
            updateStatement.setString(4, generoSeleccionado); 
            updateStatement.setString(5, id_mascota); 
            
            updateStatement.executeUpdate();

            int rowsAffected = updateStatement.executeUpdate();
            if (rowsAffected > 0) {
                cargarDetallesMascota();
                Herramientas.error("Mascota actualizada", true);
            } else {
                Herramientas.error("Intentalo nuevamente", false);
            }

            updateStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_guardarMouseClicked

    private void nombreMascotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreMascotaKeyReleased
        String input = nombreMascota.getText();
        nombredMascota.setText(input);
    }//GEN-LAST:event_nombreMascotaKeyReleased

    private void editarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarImagenMouseClicked
        if (editarImagen.isEnabled()){
            String nombreMascota = nombredMascota.getText();
            System.out.println("editar imagen de "+nombreMascota);
            CambiarImagenMascota modificarImg = new CambiarImagenMascota(cedula, nombreMascota, id_mascota);
            modificarImg.setVisible(true);
            modificarImg.setResizable(false);
        }
    }//GEN-LAST:event_editarImagenMouseClicked
    
    public void cargarDetallesMascota() {
        try {
            String selectQuery = "SELECT * FROM mascotas WHERE id_mascota = ?";
            PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
            selectStatement.setString(1, id_mascota);

            ResultSet resultSet = selectStatement.executeQuery();
            if (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String raza = resultSet.getString("raza");
                String edad = resultSet.getString("edad");
                String genero = resultSet.getString("genero");
                byte[] imagenData = resultSet.getBytes("imagen");

                nombredMascota.setText(nombre);
                nombreMascota.setText(nombre);
                razaMascota.setText(raza);
                edadMascota.setText(edad);
                //genero.setSelectedItem(genero);

                ImageIcon imagenIcono = new ImageIcon(imagenData);
                Image imagenOriginal = imagenIcono.getImage();
                Image imagenRedimensionada = imagenOriginal.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
                ImageIcon imagenRedimensionadaIcono = new ImageIcon(imagenRedimensionada);
                imgMascota.setIcon(imagenRedimensionadaIcono);
            }
            resultSet.close();
            selectStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edadMascota;
    private javax.swing.JLabel edadText;
    private javax.swing.JLabel editar;
    private javax.swing.JButton editarBoton;
    private javax.swing.JButton editarImagen;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel imgMascota;
    private javax.swing.JButton irAtras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreMascota;
    private javax.swing.JLabel nombredMascota;
    private javax.swing.JPanel panelDetalles;
    private javax.swing.JTextField razaMascota;
    private javax.swing.JLabel textNombre;
    private javax.swing.JLabel textRaza;
    // End of variables declaration//GEN-END:variables
}
