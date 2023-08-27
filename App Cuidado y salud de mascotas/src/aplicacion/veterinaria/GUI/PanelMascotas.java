package aplicacion.veterinaria.GUI;
import java.sql.*;
import aplicacion.veterinaria.*;
import java.awt.*;
import javax.swing.*;

public class PanelMascotas extends javax.swing.JPanel {

    private String cedula;
    private JTabbedPane contenido;
    private DataBase db = new DataBase();
    private Connection conn = db.getConexion();
    private int currentPage = 0;
    private int itemsPerPage = 8; // Cantidad de mascotas por página

    public PanelMascotas(String cedula, JTabbedPane contenido) {
        System.out.println(cedula);
        this.cedula = cedula;
        this.contenido = contenido;
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        addMascota = new javax.swing.JButton();
        listaMascotas = new javax.swing.JPanel();
        mascota1 = new javax.swing.JPanel();
        eliminarMascota1 = new javax.swing.JButton();
        verDetallesMascota1 = new javax.swing.JButton();
        imgMascota1 = new javax.swing.JLabel();
        prevPageButton = new javax.swing.JButton();
        nextPageButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(43, 43, 43));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(64, 64, 64));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 12));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 827, 6));

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
        add(addMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 40));

        listaMascotas.setBackground(new java.awt.Color(43, 43, 43));
        listaMascotas.setLayout(new java.awt.GridBagLayout());

        mascota1.setBackground(new java.awt.Color(102, 255, 0));
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

        add(listaMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 827, -1));

        prevPageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/flecha-izquierda.png"))); // NOI18N
        prevPageButton.setBorder(null);
        prevPageButton.setBorderPainted(false);
        prevPageButton.setContentAreaFilled(false);
        prevPageButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prevPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevPageButtonActionPerformed(evt);
            }
        });
        add(prevPageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 30, 30));

        nextPageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-chevron-derecha-en-círculo-48.png"))); // NOI18N
        nextPageButton.setBorder(null);
        nextPageButton.setBorderPainted(false);
        nextPageButton.setContentAreaFilled(false);
        nextPageButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageButtonActionPerformed(evt);
            }
        });
        add(nextPageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addMascotaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMascotaMousePressed
        System.out.println("agregar mascota");
        AgregarMascota add = new AgregarMascota(cedula);
        add.setVisible(true);
        consultarDatosEnBaseDeDatos();
    }//GEN-LAST:event_addMascotaMousePressed

    private void nextPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageButtonActionPerformed
        currentPage++;
        consultarDatosEnBaseDeDatos();
    }//GEN-LAST:event_nextPageButtonActionPerformed

    private void prevPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevPageButtonActionPerformed
        if (currentPage > 0) {
            currentPage--;
            consultarDatosEnBaseDeDatos();
        }
    }//GEN-LAST:event_prevPageButtonActionPerformed
    
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
            int cedulaInt = Integer.parseInt(cedula);
            int id_user = Herramientas.obtenerIdUsuarioPorDocumento(cedulaInt);
            String selectQuery = "SELECT * FROM mascotas WHERE usuario = ?";
            PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
            selectStatement.setInt(1, id_user);

            ResultSet resultSet = selectStatement.executeQuery();

            listaMascotas.removeAll();
            

            
            int startIndex = currentPage * itemsPerPage;
            int endIndex = startIndex + itemsPerPage;

            int gridWidth = 4;
            int gridHeight = 2;

            int row = 0;
            int col = 0;

            int counter = 0;
            
            int totalItems = 0;
            while (resultSet.next()) {
                totalItems++;
                if (counter >= startIndex && counter < endIndex) {
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
                }

                counter++;

                if (counter >= endIndex) {
                    break;
                }
            }
            int totalPages = (totalItems + itemsPerPage - 2) / itemsPerPage; // Cálculo de páginas totales
            System.out.println("Total pag "+totalPages);
            System.out.println("pag act "+currentPage);

            // Actualizar visibilidad de botones de navegación
            nextPageButton.setVisible(currentPage < totalPages);
            prevPageButton.setVisible(currentPage > 0);
            
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
        VerDetallesMascotas detallesMascotas = new VerDetallesMascotas(cedula, contenido, id_mascota);
        
        contenido.setComponentAt(1, detallesMascotas);

        detallesMascotas.cargarDetallesMascota();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMascota;
    private javax.swing.JButton eliminarMascota1;
    private javax.swing.JLabel imgMascota1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel listaMascotas;
    private javax.swing.JPanel mascota1;
    private javax.swing.JButton nextPageButton;
    private javax.swing.JButton prevPageButton;
    private javax.swing.JButton verDetallesMascota1;
    // End of variables declaration//GEN-END:variables
}
