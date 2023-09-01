package aplicacion.veterinaria.GUI;

import aplicacion.veterinaria.*;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.HashMap;
import java.util.Map;


public class PanelActividades extends javax.swing.JPanel{
    
    private Map<String, ComponentTrio> componentMap = new HashMap<>();
    private DataBase db = new DataBase();
    private Connection conn = db.getConexion();
    private String cedula;
    private int currentPage = 0;
    private int itemsPerPage = 2; // Cantidad de actividades por página
    
    public PanelActividades(String cedula) {
        this.cedula = cedula;
        
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelContenidoActv = new javax.swing.JPanel();
        listaActividades = new javax.swing.JPanel();
        cartaActividad = new javax.swing.JPanel();
        imgMascota = new javax.swing.JLabel();
        nombreMascota = new javax.swing.JLabel();
        detalleActividad = new javax.swing.JPanel();
        actividadTexto = new javax.swing.JLabel();
        nombreActv = new javax.swing.JLabel();
        notasTxt = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        textArea = new javax.swing.JScrollPane();
        notaActividad = new javax.swing.JTextArea();
        btnEliminarActv = new javax.swing.JButton();
        fechaTxt = new javax.swing.JLabel();
        fechaActv = new javax.swing.JLabel();
        mascotaAbuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAddActv = new javax.swing.JButton();
        nextPageButton = new javax.swing.JButton();
        prevPageButton = new javax.swing.JButton();

        panelContenidoActv.setBackground(new java.awt.Color(43, 43, 43));
        panelContenidoActv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaActividades.setBackground(new java.awt.Color(43, 43, 43));
        listaActividades.setLayout(new java.awt.GridBagLayout());

        cartaActividad.setBackground(new java.awt.Color(51, 51, 51));
        cartaActividad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgMascota.setBackground(new java.awt.Color(255, 255, 255));
        imgMascota.setText("jLabel1");
        cartaActividad.add(imgMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 106, 106));

        nombreMascota.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        nombreMascota.setForeground(new java.awt.Color(255, 255, 255));
        nombreMascota.setText("{nombre}");
        cartaActividad.add(nombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 118, 106, -1));

        detalleActividad.setBackground(new java.awt.Color(51, 51, 51));

        actividadTexto.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        actividadTexto.setForeground(new java.awt.Color(255, 255, 255));
        actividadTexto.setText("Actividad:");

        nombreActv.setForeground(new java.awt.Color(255, 255, 255));
        nombreActv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreActv.setText("{Nombre actividad}");

        notasTxt.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        notasTxt.setForeground(new java.awt.Color(255, 255, 255));
        notasTxt.setText("Notas:");

        btnEditar.setBackground(new java.awt.Color(229, 171, 37));
        btnEditar.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("0");
        btnEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(51, 153, 0));
        btnActualizar.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setFocusPainted(false);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        textArea.setBackground(new java.awt.Color(43, 43, 43));

        notaActividad.setBackground(new java.awt.Color(43, 43, 43));
        notaActividad.setColumns(20);
        notaActividad.setFont(new java.awt.Font("Source Code Pro", 2, 12)); // NOI18N
        notaActividad.setForeground(new java.awt.Color(255, 255, 255));
        notaActividad.setRows(5);
        notaActividad.setText("{El perro salio hoy a correr y se canso muy rapido}");
        notaActividad.setToolTipText("0");
        notaActividad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        notaActividad.setCaretColor(new java.awt.Color(255, 255, 255));
        notaActividad.setEnabled(false);
        textArea.setViewportView(notaActividad);

        btnEliminarActv.setBackground(new java.awt.Color(60, 63, 65));
        btnEliminarActv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-borrar-para-siempre-24.png"))); // NOI18N
        btnEliminarActv.setToolTipText("0");
        btnEliminarActv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEliminarActv.setBorderPainted(false);
        btnEliminarActv.setContentAreaFilled(false);
        btnEliminarActv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarActv.setFocusPainted(false);
        btnEliminarActv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActvActionPerformed(evt);
            }
        });

        fechaTxt.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        fechaTxt.setForeground(new java.awt.Color(255, 255, 255));
        fechaTxt.setText("Fecha:");

        fechaActv.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        fechaActv.setForeground(new java.awt.Color(255, 255, 255));
        fechaActv.setText("2023-08-27 22:15:43");

        javax.swing.GroupLayout detalleActividadLayout = new javax.swing.GroupLayout(detalleActividad);
        detalleActividad.setLayout(detalleActividadLayout);
        detalleActividadLayout.setHorizontalGroup(
            detalleActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalleActividadLayout.createSequentialGroup()
                .addGroup(detalleActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalleActividadLayout.createSequentialGroup()
                        .addComponent(actividadTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreActv, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaActv, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalleActividadLayout.createSequentialGroup()
                        .addComponent(notasTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textArea))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalleActividadLayout.createSequentialGroup()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarActv)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        detalleActividadLayout.setVerticalGroup(
            detalleActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalleActividadLayout.createSequentialGroup()
                .addGroup(detalleActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actividadTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(fechaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreActv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaActv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detalleActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detalleActividadLayout.createSequentialGroup()
                        .addComponent(notasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detalleActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarActv, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cartaActividad.add(detalleActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 6, -1, 150));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 437;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 8, 6);
        listaActividades.add(cartaActividad, gridBagConstraints);

        panelContenidoActv.add(listaActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 808, 390));

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
        panelContenidoActv.add(mascotaAbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 28));

        btnBuscar.setBackground(new java.awt.Color(65, 118, 166));
        btnBuscar.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelContenidoActv.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 70, 28));

        btnAddActv.setBackground(new java.awt.Color(51, 131, 66));
        btnAddActv.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnAddActv.setForeground(new java.awt.Color(255, 255, 255));
        btnAddActv.setText("Nueva actividad");
        btnAddActv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddActv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddActv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActvActionPerformed(evt);
            }
        });
        panelContenidoActv.add(btnAddActv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 140, 30));

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
        panelContenidoActv.add(nextPageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 30, 30));

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
        panelContenidoActv.add(prevPageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 30, 30));

        btnActualizar.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenidoActv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenidoActv, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean borradoInput;
    private void mascotaAbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mascotaAbuscarKeyTyped
        if (!borradoInput) {
            mascotaAbuscar.setText("");
        }
        borradoInput = true;
    }//GEN-LAST:event_mascotaAbuscarKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnActualizar.setEnabled(true);
        btnActualizar.setVisible(true);
        notaActividad.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnEliminarActvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActvActionPerformed
        JButton btn = (JButton) evt.getSource();
        String idActividad = btn.getToolTipText();
        eliminarActividad(idActividad);
    }//GEN-LAST:event_btnEliminarActvActionPerformed
    
    private void actualizarActividad(String idActv, String notas){
        try {
            String updateQuery = "UPDATE actividades_diarias SET notas = ? WHERE id = ?";
            PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
            updateStatement.setString(1, notas);
            updateStatement.setString(2, idActv);

            updateStatement.executeUpdate();

            int rowsAffected = updateStatement.executeUpdate();
            if (rowsAffected > 0) {
                    consultarActividades();
                    btnActualizar.setVisible(false);

                    Herramientas.error("Actividad actualizada", true);
                } else {
                    Herramientas.error("Intentalo nuevamente", false);
            }

        updateStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }   
    }
    
    private void nextPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageButtonActionPerformed
        currentPage++;
        consultarActividades();
    }//GEN-LAST:event_nextPageButtonActionPerformed

    private void prevPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevPageButtonActionPerformed
        if (currentPage > 0) {
            currentPage--;
            consultarActividades();
        }
    }//GEN-LAST:event_prevPageButtonActionPerformed

    private void btnAddActvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActvActionPerformed
        AgregarActividad agregar = new AgregarActividad(cedula);
        agregar.setVisible(true);
        agregar.setResizable(false);
    }//GEN-LAST:event_btnAddActvActionPerformed
    
    public void consultarActividades(){
        try {
            int cedulaInt = Integer.parseInt(cedula);
            int idUsuario = Herramientas.obtenerIdUsuarioPorDocumento(cedulaInt);

            String sql = "SELECT A.id, A.mascota, A.fecha_actividad, A.notas, A.tipo_actividad, M.nombre AS nombre_mascota, M.imagen " +
                         "FROM actividades_diarias A " +
                         "INNER JOIN mascotas M ON A.mascota = M.id_mascota " +
                         "WHERE M.usuario = ?";
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, idUsuario);

            ResultSet resultSet = preparedStatement.executeQuery();
            
            String sqlContador = "SELECT COUNT(*) AS total_actividades " +
                         "FROM actividades_diarias A " +
                         "INNER JOIN mascotas M ON A.mascota = M.id_mascota " +
                         "WHERE M.usuario = ?";

            PreparedStatement contadorActividades = conn.prepareStatement(sqlContador);
            contadorActividades.setInt(1, idUsuario);
            ResultSet contadorResult = contadorActividades.executeQuery();
            int contadorValue = 0;
            if (contadorResult.next()) {
                contadorValue = contadorResult.getInt(1);
                System.out.println("CONTADOR: " + contadorValue);
            } else {
                System.out.println("No se encontró ningún resultado para el contador.");
            }

            listaActividades.removeAll();
            
            int startIndex = currentPage * itemsPerPage;
            int endIndex = startIndex + itemsPerPage;

            int gridHeight = 2;

            int row = 0;
            int col = 0;

            int counter = 0;
            
            while (resultSet.next()) {
                if (counter >= startIndex && counter < endIndex) {
                    String idActividad = resultSet.getString("id");
                    String tituloActividad = resultSet.getString("tipo_actividad");
                    String idMascota = resultSet.getString("mascota");
                    String nombredeMascota = resultSet.getString("nombre_mascota");
                    String fecha_actividad = resultSet.getString("fecha_actividad");
                    String notas = resultSet.getString("notas");
                    byte[] imagenData = resultSet.getBytes("imagen");


                    JPanel cartaActividad = crearPanelActividad(idActividad, idMascota, nombredeMascota, fecha_actividad, notas, imagenData, tituloActividad);

                    GridBagConstraints gbc = new GridBagConstraints();
                    gbc.gridx = 0;
                    gbc.gridy = row;
                    System.out.println("row "+row);
                    gbc.ipadx = 437;
                    gbc.ipady = -1;
                    gbc.anchor = GridBagConstraints.NORTHWEST;
                    gbc.insets = new Insets(18, 6, 0, 6);
                    gbc.fill = GridBagConstraints.NONE;
                    listaActividades.add(cartaActividad, gbc);

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
            int totalPages = (contadorValue + itemsPerPage - 1) / itemsPerPage; 

            nextPageButton.setVisible(currentPage < totalPages - 1);
            prevPageButton.setVisible(currentPage > 0);

            listaActividades.revalidate();
            listaActividades.repaint();

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private JPanel crearPanelActividad(String idActividad, String idMascota, String nombredeMascota, String fecha_actividad, String notas, byte[] imagenData, String tituloActividad){
        cartaActividad = new javax.swing.JPanel();
        imgMascota = new javax.swing.JLabel();
        nombreMascota = new javax.swing.JLabel();
        detalleActividad = new javax.swing.JPanel();
        actividadTexto = new javax.swing.JLabel();
        nombreActv = new javax.swing.JLabel();
        notasTxt = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        textArea = new javax.swing.JScrollPane();
        notaActividad = new javax.swing.JTextArea();
        btnEliminarActv = new javax.swing.JButton();
        fechaTxt = new javax.swing.JLabel();
        fechaActv = new javax.swing.JLabel();
        
        cartaActividad.setBackground(new java.awt.Color(51, 51, 51));
        cartaActividad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgMascota.setBackground(new java.awt.Color(255, 255, 255));
        imgMascota.setText("");
        
        ImageIcon imagenIcono = new ImageIcon(imagenData);
        Image imagenOriginal = imagenIcono.getImage();
        Image imagenRedimensionada = imagenOriginal.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon imagenRedimensionadaIcono = new ImageIcon(imagenRedimensionada);
        imgMascota.setIcon(imagenRedimensionadaIcono);
        
        cartaActividad.add(imgMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 106, 106));

        nombreMascota.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        nombreMascota.setForeground(new java.awt.Color(255, 255, 255));
        nombreMascota.setText(nombredeMascota);
        cartaActividad.add(nombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 118, 106, -1));

        detalleActividad.setBackground(new java.awt.Color(51, 51, 51));

        actividadTexto.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        actividadTexto.setForeground(new java.awt.Color(255, 255, 255));
        actividadTexto.setText("Actividad:");

        nombreActv.setForeground(new java.awt.Color(255, 255, 255));
        nombreActv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreActv.setText(tituloActividad);

        notasTxt.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        notasTxt.setForeground(new java.awt.Color(255, 255, 255));
        notasTxt.setText("Notas:");

        btnEditar.setBackground(new java.awt.Color(229, 171, 37));
        btnEditar.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText(idActividad);
        btnEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter () {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton btnEditar = (JButton) evt.getSource();
                String idActv = btnEditar.getToolTipText();

                if (componentMap.containsKey(idActv)) {
                    ComponentTrio trio = componentMap.get(idActv);
                    JButton btnActualizar = trio.getBtnActualizar();
                    JTextArea notaActividad = trio.getTextArea();

                    btnActualizar.setEnabled(true);
                    btnActualizar.setVisible(true);
                    notaActividad.setEnabled(true);
                }
            }
        });

        btnActualizar.setBackground(new java.awt.Color(51, 153, 0));
        btnActualizar.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setFocusPainted(false);
        btnActualizar.setEnabled(false);
        btnActualizar.setVisible(false);
        btnActualizar.setToolTipText(idActividad);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton btn = (JButton) evt.getSource();
                String idActv = btn.getToolTipText();

                for (Component component : listaActividades.getComponents()) {
                    if (component instanceof JPanel) {
                        JPanel cartaActividad = (JPanel) component;
                        JPanel detalleActividad = (JPanel) cartaActividad.getComponent(2); // Ajusta el índice según tu disposición

                        JScrollPane scrollPane = (JScrollPane) detalleActividad.getComponent(5); // Ajusta el índice según tu disposición
                        JTextArea notaActividad = (JTextArea) scrollPane.getViewport().getView();

                        String cartaId = notaActividad.getToolTipText();

                        if (cartaId != null && cartaId.equals(idActv)) {
                            String notas = notaActividad.getText();
                            System.out.println("Notas actualizar:");
                            System.out.println(notas);

                            actualizarActividad(idActv, notas);
                            break;
                        }
                    }
                }
            }
        });

        textArea.setBackground(new java.awt.Color(43, 43, 43));

        notaActividad.setBackground(new java.awt.Color(43, 43, 43));
        notaActividad.setColumns(20);
        notaActividad.setFont(new java.awt.Font("Source Code Pro", 2, 12)); // NOI18N
        notaActividad.setForeground(new java.awt.Color(255, 255, 255));
        notaActividad.setRows(4);
        notaActividad.setText(notas);
        notaActividad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        notaActividad.setCaretColor(new java.awt.Color(255, 255, 255));
        notaActividad.setEnabled(false);
        notaActividad.setToolTipText(idActividad);
        textArea.setViewportView(notaActividad);

        btnEliminarActv.setBackground(new java.awt.Color(60, 63, 65));
        btnEliminarActv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-borrar-para-siempre-24.png"))); // NOI18N
        btnEliminarActv.setToolTipText(idActividad);
        btnEliminarActv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEliminarActv.setBorderPainted(false);
        btnEliminarActv.setContentAreaFilled(false);
        btnEliminarActv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarActv.setFocusPainted(false);
        btnEliminarActv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActvActionPerformed(evt);
            }
        });

        fechaTxt.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        fechaTxt.setForeground(new java.awt.Color(255, 255, 255));
        fechaTxt.setText("Fecha:");

        fechaActv.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        fechaActv.setForeground(new java.awt.Color(255, 255, 255));
        fechaActv.setText(fecha_actividad);

        javax.swing.GroupLayout detalleActividadLayout = new javax.swing.GroupLayout(detalleActividad);
        detalleActividad.setLayout(detalleActividadLayout);
        detalleActividadLayout.setHorizontalGroup(
            detalleActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalleActividadLayout.createSequentialGroup()
                .addGroup(detalleActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalleActividadLayout.createSequentialGroup()
                        .addComponent(actividadTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreActv, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaActv, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalleActividadLayout.createSequentialGroup()
                        .addComponent(notasTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textArea))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalleActividadLayout.createSequentialGroup()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarActv)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        detalleActividadLayout.setVerticalGroup(
            detalleActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalleActividadLayout.createSequentialGroup()
                .addGroup(detalleActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actividadTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(fechaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreActv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaActv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detalleActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detalleActividadLayout.createSequentialGroup()
                        .addComponent(notasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detalleActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarActv, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        componentMap.put(idActividad, new ComponentTrio(btnActualizar,null, notaActividad));
        cartaActividad.add(detalleActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 6, -1, 150));

        return cartaActividad;
    }
    
    private void eliminarActividad(String idActividad) {
        try {
            String deleteQuery = "DELETE FROM actividades_diarias WHERE id = ?";
            PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);
            deleteStatement.setString(1, idActividad);

            int rowsAffected = deleteStatement.executeUpdate();

            if (rowsAffected > 0) {
                Herramientas.error("  Actividad eliminada", true);
                consultarActividades();
            } else {
                Herramientas.error("No se pudo eliminar la actividad",false);
            }

            // Cerrar recursos
            deleteStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actividadTexto;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAddActv;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarActv;
    private javax.swing.JPanel cartaActividad;
    private javax.swing.JPanel detalleActividad;
    private javax.swing.JLabel fechaActv;
    private javax.swing.JLabel fechaTxt;
    private javax.swing.JLabel imgMascota;
    private javax.swing.JPanel listaActividades;
    private javax.swing.JTextField mascotaAbuscar;
    private javax.swing.JButton nextPageButton;
    private javax.swing.JLabel nombreActv;
    private javax.swing.JLabel nombreMascota;
    private javax.swing.JTextArea notaActividad;
    private javax.swing.JLabel notasTxt;
    private javax.swing.JPanel panelContenidoActv;
    private javax.swing.JButton prevPageButton;
    private javax.swing.JScrollPane textArea;
    // End of variables declaration//GEN-END:variables
}
