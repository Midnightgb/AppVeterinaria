package aplicacion.veterinaria.GUI;
import java.sql.*;
import aplicacion.veterinaria.*;
import java.awt.*;
import javax.swing.*;

public class PanelMascotas extends javax.swing.JPanel {

    private String cedula;
    public PanelMascotas(String cedula) {
        System.out.println(cedula);
        this.cedula = cedula;

        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        addMascota = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        listaMascotas = new javax.swing.JPanel();
        mascota1 = new javax.swing.JPanel();
        eliminarMascota1 = new javax.swing.JButton();
        verDetallesMascota1 = new javax.swing.JButton();
        imgMascota1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(43, 43, 43));

        addMascota.setBackground(new java.awt.Color(90, 90, 90));
        addMascota.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        addMascota.setForeground(new java.awt.Color(210, 210, 210));
        addMascota.setText("Registrar mascota");
        addMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addMascotaMousePressed(evt);
            }
        });

        listaMascotas.setBackground(new java.awt.Color(43, 43, 43));
        listaMascotas.setLayout(new java.awt.GridBagLayout());

        mascota1.setBackground(new java.awt.Color(43, 43, 43));
        mascota1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mascota1.setPreferredSize(new java.awt.Dimension(125, 125));

        eliminarMascota1.setBackground(new java.awt.Color(60, 63, 65));
        eliminarMascota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-borrar-para-siempre-24.png"))); // NOI18N
        eliminarMascota1.setToolTipText("0");
        eliminarMascota1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarMascota1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarMascota1.setFocusPainted(false);

        verDetallesMascota1.setBackground(new java.awt.Color(60, 63, 65));
        verDetallesMascota1.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        verDetallesMascota1.setForeground(new java.awt.Color(255, 255, 255));
        verDetallesMascota1.setText("Ver más");
        verDetallesMascota1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgMascota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/miamor (Custom).jpg"))); // NOI18N

        javax.swing.GroupLayout mascota1Layout = new javax.swing.GroupLayout(mascota1);
        mascota1.setLayout(mascota1Layout);
        mascota1Layout.setHorizontalGroup(
            mascota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verDetallesMascota1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(eliminarMascota1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgMascota1)
                .addGap(25, 25, 25))
        );
        mascota1Layout.setVerticalGroup(
            mascota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgMascota1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(mascota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verDetallesMascota1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarMascota1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 286, 0);
        listaMascotas.add(mascota1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addComponent(listaMascotas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaMascotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addMascotaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMascotaMousePressed
        System.out.println("agregar mascota");
        AgregarMascota add = new AgregarMascota(cedula);
        add.setVisible(true);
        consultarDatosEnBaseDeDatos();
    }//GEN-LAST:event_addMascotaMousePressed
    
    private void eliminarMascotaMouseClicked(java.awt.event.MouseEvent evt) {                                              
        JButton btn = (JButton) evt.getSource();
        String idMascota = btn.getToolTipText();
        eliminarMascota(idMascota);
    }   
    
    private void verMascotaMouseClicked(java.awt.event.MouseEvent evt) {                                              
        JButton btn = (JButton) evt.getSource();
        String idMascota = btn.getToolTipText();
        mostrarDetallesMascota(idMascota);
    }   
    
    public void consultarDatosEnBaseDeDatos() {
        try {
            DataBase db = new DataBase();
            Connection conn = db.getConexion();
            int cedulaInt = Integer.parseInt(cedula);
            int id_user = Herramientas.obtenerIdUsuarioPorDocumento(cedulaInt);
            String selectQuery = "SELECT * FROM mascotas WHERE usuario = ?";
            PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
            selectStatement.setInt(1, id_user);

            ResultSet resultSet = selectStatement.executeQuery();

            listaMascotas.removeAll();
            
            int gridWidth = 4;
            int gridHeight = 2;

            int row = 0;
            int col = 0;
            
            while (resultSet.next()) {
                String id_mascota = resultSet.getString("id_mascota");
                byte[] imagenData = resultSet.getBytes("imagen");
                JPanel mascotaPanel = crearPanelMascota(id_mascota, imagenData);
                
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridx = col;
                gbc.gridy = row;
                gbc.ipadx = 17;
                gbc.ipady = 5;
                gbc.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gbc.insets = new java.awt.Insets(10, 25, 30, 35);
                listaMascotas.add(mascotaPanel, gbc);

                col++;
                if (col >= gridWidth) {
                    col = 0;
                    row++;
                }
                if (row >= gridHeight) {
                    break; 
                }
            }
            
            listaMascotas.revalidate();
            listaMascotas.repaint();

            // Cerrar recursos
            resultSet.close();
            selectStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private JPanel crearPanelMascota(String id_mascota, byte[] imagenData) {
        JPanel mascotaPanel = new JPanel();
        JButton eliminarMascota = new JButton();
        JButton verDetallesMascota = new JButton();
        
        ImageIcon imagenIcono = new ImageIcon(imagenData);
        Image imagenOriginal = imagenIcono.getImage();
        Image imagenRedimensionada = imagenOriginal.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        ImageIcon imagenRedimensionadaIcono = new ImageIcon(imagenRedimensionada);
        JLabel imgMascotaLabel = new JLabel(imagenRedimensionadaIcono);
        
        mascotaPanel.setBackground(new java.awt.Color(60, 60, 60));
        mascotaPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mascotaPanel.setPreferredSize(new java.awt.Dimension(125, 125));

        eliminarMascota.setBackground(new java.awt.Color(60, 63, 65));
        eliminarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-borrar-para-siempre-24.png"))); // NOI18N
        eliminarMascota.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarMascota.setFocusPainted(false);
        eliminarMascota.setToolTipText(id_mascota);
        eliminarMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMascotaMouseClicked(evt);
            }
        });
        System.out.println(id_mascota);
        
        verDetallesMascota.setBackground(new java.awt.Color(60, 63, 65));
        verDetallesMascota.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        verDetallesMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verDetallesMascota.setForeground(new java.awt.Color(255, 255, 255));
        verDetallesMascota.setText("Ver más");
        verDetallesMascota.setToolTipText(id_mascota);
        verDetallesMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMascotaMouseClicked(evt);
            }
        });
        verDetallesMascota.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));


        javax.swing.GroupLayout mascotaLayout = new javax.swing.GroupLayout(mascotaPanel);
        mascotaPanel.setLayout(mascotaLayout);
        mascotaLayout.setHorizontalGroup(
            mascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verDetallesMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(eliminarMascota)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascotaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgMascotaLabel)
                .addGap(25, 25, 25))
        );
        mascotaLayout.setVerticalGroup(
            mascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgMascotaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarMascota)
                    .addComponent(verDetallesMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        


        mascotaPanel.add(imgMascotaLabel);
        return mascotaPanel;
    }

    private void eliminarMascota(String idMascota) {
    try {
        DataBase db = new DataBase();
        Connection conn = db.getConexion();
        String deleteQuery = "DELETE FROM mascotas WHERE id_mascota = ?";
        PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);
        deleteStatement.setString(1, idMascota);

        int rowsAffected = deleteStatement.executeUpdate();
        
        if (rowsAffected > 0) {
            Herramientas.error("Mascota eliminada: " + idMascota , true);
            consultarDatosEnBaseDeDatos();
        } else {
            Herramientas.error("No se pudo eliminar la mascota",false);
        }

        // Cerrar recursos
        deleteStatement.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    private void mostrarDetallesMascota(String id_mascota) {
        VerDetallesMascotas detallesMascotas = new VerDetallesMascotas();
        
        detallesMascotas.cargarDetallesMascota(id_mascota);

        JFrame frame = new JFrame("Detalles de la Mascota");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(detallesMascotas);
        frame.setResizable(false);
        //frame.setLocationRelativeTo();
        frame.pack();
        frame.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMascota;
    private javax.swing.JButton eliminarMascota1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel imgMascota1;
    private javax.swing.JPanel listaMascotas;
    private javax.swing.JPanel mascota1;
    private javax.swing.JButton verDetallesMascota1;
    // End of variables declaration//GEN-END:variables
}
