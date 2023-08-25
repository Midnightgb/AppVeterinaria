
package aplicacion.veterinaria.GUI;

import aplicacion.veterinaria.DataBase;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class VerDetallesMascotas extends javax.swing.JPanel {


    public VerDetallesMascotas() {
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

        panelDetalles.setBackground(new java.awt.Color(43, 43, 43));

        imgMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/miamor (Custom).jpg"))); // NOI18N
        imgMascota.setPreferredSize(new java.awt.Dimension(71, 75));

        nombredMascota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombredMascota.setForeground(new java.awt.Color(210, 210, 210));
        nombredMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombredMascota.setText("manolo");

        textNombre.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        textNombre.setForeground(new java.awt.Color(210, 210, 210));
        textNombre.setText("Nombre:");

        nombreMascota.setBackground(new java.awt.Color(90, 90, 90));
        nombreMascota.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        nombreMascota.setForeground(new java.awt.Color(210, 210, 210));
        nombreMascota.setText("pepito");
        nombreMascota.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        nombreMascota.setCaretColor(new java.awt.Color(255, 255, 255));
        nombreMascota.setEnabled(false);

        textRaza.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        textRaza.setForeground(new java.awt.Color(210, 210, 210));
        textRaza.setText("Raza:");

        razaMascota.setBackground(new java.awt.Color(90, 90, 90));
        razaMascota.setForeground(new java.awt.Color(210, 210, 210));
        razaMascota.setText("Cocodrilo 🐊");
        razaMascota.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        razaMascota.setCaretColor(new java.awt.Color(255, 255, 255));
        razaMascota.setEnabled(false);

        edadText.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        edadText.setForeground(new java.awt.Color(210, 210, 210));
        edadText.setText("Edad:");

        edadMascota.setBackground(new java.awt.Color(90, 90, 90));
        edadMascota.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        edadMascota.setForeground(new java.awt.Color(210, 210, 210));
        edadMascota.setText("150");
        edadMascota.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        edadMascota.setCaretColor(new java.awt.Color(255, 255, 255));
        edadMascota.setEnabled(false);

        genero.setBackground(new java.awt.Color(90, 90, 90));
        genero.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        genero.setForeground(new java.awt.Color(210, 210, 210));
        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Hembra", "Otro", "Indefinido" }));
        genero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 12), new java.awt.Color(90, 90, 90))); // NOI18N
        genero.setEnabled(false);

        editarBoton.setBackground(new java.awt.Color(214, 102, 0));
        editarBoton.setForeground(new java.awt.Color(255, 255, 255));
        editarBoton.setText("Editar");
        editarBoton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editarBoton.setFocusPainted(false);
        editarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBotonActionPerformed(evt);
            }
        });

        editar.setForeground(new java.awt.Color(210, 210, 210));
        editar.setText("Genero:");

        guardar.setBackground(new java.awt.Color(51, 153, 0));
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("Guardar");
        guardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guardar.setEnabled(false);
        guardar.setFocusPainted(false);

        irAtras.setBackground(new java.awt.Color(62, 112, 157));
        irAtras.setForeground(new java.awt.Color(255, 255, 255));
        irAtras.setText("Atras");
        irAtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        irAtras.setFocusPainted(false);

        javax.swing.GroupLayout panelDetallesLayout = new javax.swing.GroupLayout(panelDetalles);
        panelDetalles.setLayout(panelDetallesLayout);
        panelDetallesLayout.setHorizontalGroup(
            panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetallesLayout.createSequentialGroup()
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(irAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(287, 287, 287)
                        .addComponent(imgMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(nombredMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetallesLayout.createSequentialGroup()
                .addGap(0, 296, Short.MAX_VALUE)
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textRaza)
                    .addComponent(textNombre)
                    .addComponent(nombreMascota)
                    .addComponent(razaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edadText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelDetallesLayout.createSequentialGroup()
                                .addComponent(editar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addComponent(editarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(281, 281, 281))
        );
        panelDetallesLayout.setVerticalGroup(
            panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetallesLayout.createSequentialGroup()
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(imgMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(irAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombredMascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textRaza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(razaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edadText)
                    .addComponent(editar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBotonActionPerformed
        nombreMascota.setEnabled(true);
        razaMascota.setEnabled(true);
        edadMascota.setEnabled(true);
        genero.setEnabled(true);
        guardar.setEnabled(true);
    }//GEN-LAST:event_editarBotonActionPerformed
    
    public void cargarDetallesMascota(String id_mascota) {
        try {
            DataBase db = new DataBase();
            Connection conn = db.getConexion();
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
            // Cerrar recursos
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
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel imgMascota;
    private javax.swing.JButton irAtras;
    private javax.swing.JTextField nombreMascota;
    private javax.swing.JLabel nombredMascota;
    private javax.swing.JPanel panelDetalles;
    private javax.swing.JTextField razaMascota;
    private javax.swing.JLabel textNombre;
    private javax.swing.JLabel textRaza;
    // End of variables declaration//GEN-END:variables
}
