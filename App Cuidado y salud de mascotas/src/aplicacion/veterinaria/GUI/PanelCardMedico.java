
package aplicacion.veterinaria.GUI;

import aplicacion.veterinaria.DataBase;
import aplicacion.veterinaria.Herramientas;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelCardMedico extends javax.swing.JPanel {
    
    private DataBase db = new DataBase();
    private Connection conn = db.getConexion();
    private String cedula;
    private int currentPage = 0;
    private int itemsPerPage = 2; // Cantidad de registros por página
    private String nombreMascotatxt = "";
    
    public PanelCardMedico(String cedula) {
        this.cedula = cedula;

        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelContenidoRegistros = new javax.swing.JPanel();
        listaRegistros = new javax.swing.JPanel();
        cartaRegistros = new javax.swing.JPanel();
        nombreMascota = new javax.swing.JLabel();
        detalleRegistro = new javax.swing.JPanel();
        registroTexto = new javax.swing.JLabel();
        btnDetalles = new javax.swing.JButton();
        textArea = new javax.swing.JScrollPane();
        notaRegistro = new javax.swing.JTextArea();
        btnEliminarRegistro = new javax.swing.JButton();
        fechaTxt = new javax.swing.JLabel();
        fechaRegistro = new javax.swing.JLabel();
        mascotaAbuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAddRegistro = new javax.swing.JButton();
        nextPageButton = new javax.swing.JButton();
        prevPageButton = new javax.swing.JButton();

        panelContenidoRegistros.setBackground(new java.awt.Color(43, 43, 43));
        panelContenidoRegistros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaRegistros.setBackground(new java.awt.Color(43, 43, 43));
        listaRegistros.setLayout(new java.awt.GridBagLayout());

        cartaRegistros.setBackground(new java.awt.Color(51, 51, 51));
        cartaRegistros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreMascota.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        nombreMascota.setForeground(new java.awt.Color(255, 255, 255));
        nombreMascota.setText("{nombre}");
        cartaRegistros.add(nombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 106, -1));

        detalleRegistro.setBackground(new java.awt.Color(51, 51, 51));

        registroTexto.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        registroTexto.setForeground(new java.awt.Color(255, 255, 255));
        registroTexto.setText("Descripcion:");

        btnDetalles.setBackground(new java.awt.Color(65, 118, 166));
        btnDetalles.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnDetalles.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalles.setText("Detalles");
        btnDetalles.setToolTipText("0");
        btnDetalles.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDetalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetalles.setFocusPainted(false);
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });

        textArea.setBackground(new java.awt.Color(43, 43, 43));

        notaRegistro.setBackground(new java.awt.Color(43, 43, 43));
        notaRegistro.setColumns(20);
        notaRegistro.setFont(new java.awt.Font("Source Code Pro", 2, 12)); // NOI18N
        notaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        notaRegistro.setRows(5);
        notaRegistro.setText("{El perro salio hoy a correr y se canso muy rapido}");
        notaRegistro.setToolTipText("0");
        notaRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        notaRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        notaRegistro.setEnabled(false);
        textArea.setViewportView(notaRegistro);

        btnEliminarRegistro.setBackground(new java.awt.Color(60, 63, 65));
        btnEliminarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-borrar-para-siempre-24.png"))); // NOI18N
        btnEliminarRegistro.setToolTipText("0");
        btnEliminarRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEliminarRegistro.setBorderPainted(false);
        btnEliminarRegistro.setContentAreaFilled(false);
        btnEliminarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarRegistro.setFocusPainted(false);
        btnEliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegistroActionPerformed(evt);
            }
        });

        fechaTxt.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        fechaTxt.setForeground(new java.awt.Color(255, 255, 255));
        fechaTxt.setText("Fecha:");

        fechaRegistro.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        fechaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        fechaRegistro.setText("2023-08-27 22:15:43");

        javax.swing.GroupLayout detalleRegistroLayout = new javax.swing.GroupLayout(detalleRegistro);
        detalleRegistro.setLayout(detalleRegistroLayout);
        detalleRegistroLayout.setHorizontalGroup(
            detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalleRegistroLayout.createSequentialGroup()
                .addGroup(detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalleRegistroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarRegistro)
                        .addGap(10, 10, 10))
                    .addGroup(detalleRegistroLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalleRegistroLayout.createSequentialGroup()
                                .addComponent(registroTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(fechaTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(textArea))))
                .addContainerGap())
        );
        detalleRegistroLayout.setVerticalGroup(
            detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalleRegistroLayout.createSequentialGroup()
                .addGroup(detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fechaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(registroTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(fechaRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btnDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cartaRegistros.add(detalleRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 6, -1, 150));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 234, 0);
        listaRegistros.add(cartaRegistros, gridBagConstraints);

        panelContenidoRegistros.add(listaRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 808, 390));

        mascotaAbuscar.setBackground(new java.awt.Color(90, 90, 90));
        mascotaAbuscar.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        mascotaAbuscar.setForeground(new java.awt.Color(204, 204, 204));
        mascotaAbuscar.setText("nombre de mascota");
        mascotaAbuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        mascotaAbuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        mascotaAbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mascotaAbuscarKeyTyped(evt);
            }
        });
        panelContenidoRegistros.add(mascotaAbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 28));

        btnBuscar.setBackground(new java.awt.Color(65, 118, 166));
        btnBuscar.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelContenidoRegistros.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 70, 28));

        btnAddRegistro.setBackground(new java.awt.Color(51, 131, 66));
        btnAddRegistro.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnAddRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRegistro.setText("Agregar registro");
        btnAddRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRegistroActionPerformed(evt);
            }
        });
        panelContenidoRegistros.add(btnAddRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 140, 30));

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
        panelContenidoRegistros.add(nextPageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 30, 30));

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
        panelContenidoRegistros.add(prevPageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenidoRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenidoRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegistroActionPerformed
        JButton btn = (JButton) evt.getSource();
        String idActividad = btn.getToolTipText();
        eliminarRegistro(idActividad);
    }//GEN-LAST:event_btnEliminarRegistroActionPerformed

    private boolean borradoInput = false;
    private void mascotaAbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mascotaAbuscarKeyTyped
        if (!borradoInput) {
            mascotaAbuscar.setText("");
        }
        borradoInput = true;
    }//GEN-LAST:event_mascotaAbuscarKeyTyped

    private void btnAddRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRegistroActionPerformed
        //AgregarActividad agregar = new AgregarActividad(cedula);
        //agregar.setVisible(true);
        //agregar.setResizable(false);
    }//GEN-LAST:event_btnAddRegistroActionPerformed

    private void nextPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageButtonActionPerformed
        currentPage++;
        consultarRegistros();
    }//GEN-LAST:event_nextPageButtonActionPerformed

    private void prevPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevPageButtonActionPerformed
        if (currentPage > 0) {
            currentPage--;
            consultarRegistros();
        }
    }//GEN-LAST:event_prevPageButtonActionPerformed

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        JButton btn = (JButton) evt.getSource();
        String idRegistro = btn.getToolTipText();
        mostrarDetallesRegistro(idRegistro);
    }//GEN-LAST:event_btnDetallesActionPerformed

    public void consultarRegistros(){
        try {
            int cedulaInt = Integer.parseInt(cedula);
            int idUsuario = Herramientas.obtenerIdUsuarioPorDocumento(cedulaInt);

            String sql = "SELECT R.id_registro, R.mascota, R.fecha_registro, R.diagnostico, R.tratamiento, M.nombre AS nombre_mascota, M.imagen " +
                         "FROM registro_medico R " +
                         "INNER JOIN mascotas M ON R.mascota = M.id_mascota " +
                         "WHERE M.usuario = ?";
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, idUsuario);

            ResultSet resultSet = preparedStatement.executeQuery();
            
            listaRegistros.removeAll();
            
            int startIndex = currentPage * itemsPerPage;
            int endIndex = startIndex + itemsPerPage;

            int gridHeight =2;

            int row = 0;
            int col = 0;

            int counter = 0;
            
            int totalItems = 0;
            
            while (resultSet.next()) {
                totalItems++;
                if (counter >= startIndex && counter < endIndex) {
                    String idRegistro = resultSet.getString("id_registro");
                    String fechaRegistrotxt = resultSet.getString("fecha_registro");
                    String idMascota = resultSet.getString("mascota");
                    String diagnostico = resultSet.getString("diagnostico");
                    String tratamiento = resultSet.getString("tratamiento");
                    this.nombreMascotatxt = resultSet.getString("nombre_mascota");
                    byte[] imagenData = resultSet.getBytes("imagen");


                    JPanel cartaRegistro = crearPanelRegistros(idRegistro,fechaRegistrotxt,idMascota,diagnostico,nombreMascotatxt);

                    GridBagConstraints gbc = new GridBagConstraints();
                    gbc.gridx = 0;
                    gbc.gridy = row;
                    System.out.println("row "+row);
                    gbc.ipadx = 11;
                    gbc.anchor = GridBagConstraints.NORTHWEST;
                    if (totalItems==1){
                        gbc.insets = new Insets(0, 0, 234, 0);
                    }else{
                        gbc.insets = new Insets(20, 0, 0, 0);
                    }
                    gbc.fill = GridBagConstraints.NONE;
                    listaRegistros.add(cartaRegistros, gbc);
                    
                    row++;
                    if (row >= gridHeight) {
                        row = 0; // Reiniciar a la primera fila
                        col++;  // Mover a la siguiente columna
                    }
                }
                counter++;

                if (counter >= endIndex) {
                    break;
                }
            }
            int totalPages = (totalItems + itemsPerPage - 2) / itemsPerPage; 

            nextPageButton.setVisible(currentPage < totalPages);
            prevPageButton.setVisible(currentPage > 0);

            listaRegistros.revalidate();
            listaRegistros.repaint();

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    private void eliminarRegistro(String idRegistro) {
        try {
            String deleteQuery = "DELETE FROM registro_medico WHERE id_registro = ?";
            PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);
            deleteStatement.setString(1, idRegistro);

            int rowsAffected = deleteStatement.executeUpdate();

            if (rowsAffected > 0) {
                Herramientas.error("      Registro eliminado   ", true);
                consultarRegistros();
            } else {
                Herramientas.error("No se pudo eliminar el registro",false);
            }

            // Cerrar recursos
            deleteStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mostrarDetallesRegistro(String idRegistro ){
        VerDetallesRegistros detalles = new VerDetallesRegistros(idRegistro,nombreMascotatxt);
        detalles.setVisible(true);
        detalles.setResizable(false);
    }

                
    private JPanel crearPanelRegistros(String idRegistro, String fechaRegistrotxt, String idMascota, String diagnostico, String nombreMascotatxt){
        cartaRegistros = new javax.swing.JPanel();
        nombreMascota = new javax.swing.JLabel();
        detalleRegistro = new javax.swing.JPanel();
        registroTexto = new javax.swing.JLabel();
        btnDetalles = new javax.swing.JButton();
        textArea = new javax.swing.JScrollPane();
        notaRegistro = new javax.swing.JTextArea();
        btnEliminarRegistro = new javax.swing.JButton();
        fechaTxt = new javax.swing.JLabel();
        fechaRegistro = new javax.swing.JLabel();
        
        cartaRegistros.setBackground(new java.awt.Color(51, 51, 51));
        cartaRegistros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreMascota.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        nombreMascota.setForeground(new java.awt.Color(255, 255, 255));
        nombreMascota.setText(nombreMascotatxt);
        cartaRegistros.add(nombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 106, -1));

        detalleRegistro.setBackground(new java.awt.Color(51, 51, 51));

        registroTexto.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        registroTexto.setForeground(new java.awt.Color(255, 255, 255));
        registroTexto.setText("Descripcion:");

        btnDetalles.setBackground(new java.awt.Color(65, 118, 166));
        btnDetalles.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnDetalles.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalles.setText("Detalles");
        btnDetalles.setToolTipText(idRegistro);
        btnDetalles.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDetalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetalles.setFocusPainted(false);
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });
        textArea.setBackground(new java.awt.Color(43, 43, 43));

        notaRegistro.setBackground(new java.awt.Color(43, 43, 43));
        notaRegistro.setColumns(20);
        notaRegistro.setFont(new java.awt.Font("Source Code Pro", 2, 12)); // NOI18N
        notaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        notaRegistro.setRows(5);
        notaRegistro.setText(diagnostico);
        notaRegistro.setToolTipText(idMascota);
        notaRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        notaRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        notaRegistro.setEnabled(false);
        textArea.setViewportView(notaRegistro);

        btnEliminarRegistro.setBackground(new java.awt.Color(60, 63, 65));
        btnEliminarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-borrar-para-siempre-24.png"))); // NOI18N
        btnEliminarRegistro.setToolTipText(idRegistro);
        btnEliminarRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEliminarRegistro.setBorderPainted(false);
        btnEliminarRegistro.setContentAreaFilled(false);
        btnEliminarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarRegistro.setFocusPainted(false);
        btnEliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegistroActionPerformed(evt);
            }
        });

        fechaTxt.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        fechaTxt.setForeground(new java.awt.Color(255, 255, 255));
        fechaTxt.setText("Fecha:");

        fechaRegistro.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        fechaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        fechaRegistro.setText(fechaRegistrotxt);

        javax.swing.GroupLayout detalleRegistroLayout = new javax.swing.GroupLayout(detalleRegistro);
        detalleRegistro.setLayout(detalleRegistroLayout);
        detalleRegistroLayout.setHorizontalGroup(
            detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalleRegistroLayout.createSequentialGroup()
                .addGroup(detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalleRegistroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarRegistro)
                        .addGap(10, 10, 10))
                    .addGroup(detalleRegistroLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalleRegistroLayout.createSequentialGroup()
                                .addComponent(registroTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(fechaTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                            .addComponent(textArea))))
                .addContainerGap())
        );
        detalleRegistroLayout.setVerticalGroup(
            detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalleRegistroLayout.createSequentialGroup()
                .addGroup(detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fechaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(registroTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(fechaRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detalleRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btnDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cartaRegistros.add(detalleRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 6, -1, 150));
        
        return cartaRegistros;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRegistro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnEliminarRegistro;
    private javax.swing.JPanel cartaRegistros;
    private javax.swing.JPanel detalleRegistro;
    private javax.swing.JLabel fechaRegistro;
    private javax.swing.JLabel fechaTxt;
    private javax.swing.JPanel listaRegistros;
    private javax.swing.JTextField mascotaAbuscar;
    private javax.swing.JButton nextPageButton;
    private javax.swing.JLabel nombreMascota;
    private javax.swing.JTextArea notaRegistro;
    private javax.swing.JPanel panelContenidoRegistros;
    private javax.swing.JButton prevPageButton;
    private javax.swing.JLabel registroTexto;
    private javax.swing.JScrollPane textArea;
    // End of variables declaration//GEN-END:variables
}
