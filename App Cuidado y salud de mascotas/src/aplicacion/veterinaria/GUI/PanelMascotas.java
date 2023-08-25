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
        mascota2 = new javax.swing.JPanel();
        eliminarMascota2 = new javax.swing.JButton();
        verDetallesMascota2 = new javax.swing.JButton();
        imgMascota2 = new javax.swing.JLabel();
        mascota3 = new javax.swing.JPanel();
        eliminarMascota3 = new javax.swing.JButton();
        verDetallesMascota3 = new javax.swing.JButton();
        imgMascota3 = new javax.swing.JLabel();
        mascota4 = new javax.swing.JPanel();
        eliminarMascota4 = new javax.swing.JButton();
        verDetallesMascota4 = new javax.swing.JButton();
        imgMascota4 = new javax.swing.JLabel();
        mascota5 = new javax.swing.JPanel();
        eliminarMascota5 = new javax.swing.JButton();
        verDetallesMascota5 = new javax.swing.JButton();
        imgMascota5 = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mascota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarMascota1)
                    .addComponent(verDetallesMascota1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 286, 0);
        listaMascotas.add(mascota1, gridBagConstraints);

        mascota2.setBackground(new java.awt.Color(43, 43, 43));
        mascota2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mascota2.setPreferredSize(new java.awt.Dimension(125, 125));

        eliminarMascota2.setBackground(new java.awt.Color(60, 63, 65));
        eliminarMascota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-borrar-para-siempre-24.png"))); // NOI18N
        eliminarMascota2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarMascota2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarMascota2.setFocusPainted(false);

        verDetallesMascota2.setBackground(new java.awt.Color(60, 63, 65));
        verDetallesMascota2.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        verDetallesMascota2.setForeground(new java.awt.Color(255, 255, 255));
        verDetallesMascota2.setText("Ver más");
        verDetallesMascota2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgMascota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/miamor (Custom).jpg"))); // NOI18N

        javax.swing.GroupLayout mascota2Layout = new javax.swing.GroupLayout(mascota2);
        mascota2.setLayout(mascota2Layout);
        mascota2Layout.setHorizontalGroup(
            mascota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verDetallesMascota2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(eliminarMascota2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgMascota2)
                .addGap(25, 25, 25))
        );
        mascota2Layout.setVerticalGroup(
            mascota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgMascota2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mascota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarMascota2)
                    .addComponent(verDetallesMascota2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 40, 286, 0);
        listaMascotas.add(mascota2, gridBagConstraints);

        mascota3.setBackground(new java.awt.Color(43, 43, 43));
        mascota3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mascota3.setPreferredSize(new java.awt.Dimension(125, 125));

        eliminarMascota3.setBackground(new java.awt.Color(60, 63, 65));
        eliminarMascota3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-borrar-para-siempre-24.png"))); // NOI18N
        eliminarMascota3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarMascota3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarMascota3.setFocusPainted(false);

        verDetallesMascota3.setBackground(new java.awt.Color(60, 63, 65));
        verDetallesMascota3.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        verDetallesMascota3.setForeground(new java.awt.Color(255, 255, 255));
        verDetallesMascota3.setText("Ver más");
        verDetallesMascota3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgMascota3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/miamor (Custom).jpg"))); // NOI18N

        javax.swing.GroupLayout mascota3Layout = new javax.swing.GroupLayout(mascota3);
        mascota3.setLayout(mascota3Layout);
        mascota3Layout.setHorizontalGroup(
            mascota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verDetallesMascota3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(eliminarMascota3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgMascota3)
                .addGap(25, 25, 25))
        );
        mascota3Layout.setVerticalGroup(
            mascota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgMascota3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mascota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarMascota3)
                    .addComponent(verDetallesMascota3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 40, 286, 0);
        listaMascotas.add(mascota3, gridBagConstraints);

        mascota4.setBackground(new java.awt.Color(43, 43, 43));
        mascota4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mascota4.setPreferredSize(new java.awt.Dimension(125, 125));

        eliminarMascota4.setBackground(new java.awt.Color(60, 63, 65));
        eliminarMascota4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-borrar-para-siempre-24.png"))); // NOI18N
        eliminarMascota4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarMascota4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarMascota4.setFocusPainted(false);

        verDetallesMascota4.setBackground(new java.awt.Color(60, 63, 65));
        verDetallesMascota4.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        verDetallesMascota4.setForeground(new java.awt.Color(255, 255, 255));
        verDetallesMascota4.setText("Ver más");
        verDetallesMascota4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgMascota4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/miamor (Custom).jpg"))); // NOI18N

        javax.swing.GroupLayout mascota4Layout = new javax.swing.GroupLayout(mascota4);
        mascota4.setLayout(mascota4Layout);
        mascota4Layout.setHorizontalGroup(
            mascota4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verDetallesMascota4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(eliminarMascota4)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgMascota4)
                .addGap(25, 25, 25))
        );
        mascota4Layout.setVerticalGroup(
            mascota4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgMascota4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mascota4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarMascota4)
                    .addComponent(verDetallesMascota4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 286, 0);
        listaMascotas.add(mascota4, gridBagConstraints);

        mascota5.setBackground(new java.awt.Color(43, 43, 43));
        mascota5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mascota5.setPreferredSize(new java.awt.Dimension(125, 125));

        eliminarMascota5.setBackground(new java.awt.Color(60, 63, 65));
        eliminarMascota5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-borrar-para-siempre-24.png"))); // NOI18N
        eliminarMascota5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarMascota5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarMascota5.setFocusPainted(false);

        verDetallesMascota5.setBackground(new java.awt.Color(60, 63, 65));
        verDetallesMascota5.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        verDetallesMascota5.setForeground(new java.awt.Color(255, 255, 255));
        verDetallesMascota5.setText("Ver más");
        verDetallesMascota5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgMascota5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/miamor (Custom).jpg"))); // NOI18N

        javax.swing.GroupLayout mascota5Layout = new javax.swing.GroupLayout(mascota5);
        mascota5.setLayout(mascota5Layout);
        mascota5Layout.setHorizontalGroup(
            mascota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verDetallesMascota5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(eliminarMascota5)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgMascota5)
                .addGap(25, 25, 25))
        );
        mascota5Layout.setVerticalGroup(
            mascota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mascota5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgMascota5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mascota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarMascota5)
                    .addComponent(verDetallesMascota5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 286, 27);
        listaMascotas.add(mascota5, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
    }//GEN-LAST:event_addMascotaMousePressed

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
                String nombreMascota = resultSet.getString("nombre");
                byte[] imagenData = resultSet.getBytes("imagen");

                JPanel mascotaPanel = crearPanelMascota(nombreMascota, imagenData);
                
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

    private JPanel crearPanelMascota(String nombreMascota, byte[] imagenData) {
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

        verDetallesMascota.setBackground(new java.awt.Color(60, 63, 65));
        verDetallesMascota.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        verDetallesMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verDetallesMascota.setForeground(new java.awt.Color(255, 255, 255));
        verDetallesMascota.setText("Ver más");
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

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMascota;
    private javax.swing.JButton eliminarMascota1;
    private javax.swing.JButton eliminarMascota2;
    private javax.swing.JButton eliminarMascota3;
    private javax.swing.JButton eliminarMascota4;
    private javax.swing.JButton eliminarMascota5;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel imgMascota1;
    private javax.swing.JLabel imgMascota2;
    private javax.swing.JLabel imgMascota3;
    private javax.swing.JLabel imgMascota4;
    private javax.swing.JLabel imgMascota5;
    private javax.swing.JPanel listaMascotas;
    private javax.swing.JPanel mascota1;
    private javax.swing.JPanel mascota2;
    private javax.swing.JPanel mascota3;
    private javax.swing.JPanel mascota4;
    private javax.swing.JPanel mascota5;
    private javax.swing.JButton verDetallesMascota1;
    private javax.swing.JButton verDetallesMascota2;
    private javax.swing.JButton verDetallesMascota3;
    private javax.swing.JButton verDetallesMascota4;
    private javax.swing.JButton verDetallesMascota5;
    // End of variables declaration//GEN-END:variables
}
