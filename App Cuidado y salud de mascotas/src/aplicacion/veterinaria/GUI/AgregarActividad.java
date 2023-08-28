package aplicacion.veterinaria.GUI;

import aplicacion.veterinaria.*;
import static aplicacion.veterinaria.Herramientas.obtenerIdUsuarioPorDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class AgregarActividad extends javax.swing.JFrame {

    private String cedula;
    public AgregarActividad(String cedula) {
        this.cedula = cedula;
        int idUser = obtenerIdUsuarioPorDocumento(Integer.parseInt(cedula));
        
        List<String> mascotasUsuario = Herramientas.obtenerMascotasUsuario(idUser);
        String[] mascotasArray = mascotasUsuario.toArray(new String[0]);
        
        initComponents();
        mascota.setModel(new javax.swing.DefaultComboBoxModel<>(mascotasArray));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        actvTxt = new javax.swing.JLabel();
        tituloActv = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        notasInput = new javax.swing.JTextArea();
        notasTxt = new javax.swing.JLabel();
        guardarActv = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        mascota = new javax.swing.JComboBox<>();
        mascotaTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(43, 43, 43));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/LogoActv-150.png"))); // NOI18N

        actvTxt.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        actvTxt.setForeground(new java.awt.Color(255, 255, 255));
        actvTxt.setText("Actividad:");

        tituloActv.setBackground(new java.awt.Color(43, 43, 43));
        tituloActv.setFont(new java.awt.Font("Source Code Pro", 2, 12)); // NOI18N
        tituloActv.setForeground(new java.awt.Color(255, 255, 255));
        tituloActv.setText("correr...");
        tituloActv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tituloActv.setCaretColor(new java.awt.Color(255, 255, 255));
        tituloActv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tituloActvKeyTyped(evt);
            }
        });

        notasInput.setBackground(new java.awt.Color(51, 51, 51));
        notasInput.setColumns(20);
        notasInput.setFont(new java.awt.Font("Source Code Pro", 2, 12)); // NOI18N
        notasInput.setForeground(new java.awt.Color(255, 255, 255));
        notasInput.setRows(5);
        notasInput.setText("Salir a trotar...");
        notasInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        notasInput.setCaretColor(new java.awt.Color(255, 255, 255));
        notasInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                notasInputKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(notasInput);

        notasTxt.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        notasTxt.setForeground(new java.awt.Color(255, 255, 255));
        notasTxt.setText("Notas:");

        guardarActv.setBackground(new java.awt.Color(48, 119, 62));
        guardarActv.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        guardarActv.setForeground(new java.awt.Color(255, 255, 255));
        guardarActv.setText("Guardar");
        guardarActv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        guardarActv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarActv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                guardarActvMousePressed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(255, 107, 107));
        cancelar.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarMousePressed(evt);
            }
        });

        mascota.setBackground(new java.awt.Color(51, 51, 51));
        mascota.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        mascota.setForeground(new java.awt.Color(255, 255, 255));
        mascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        mascota.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        mascotaTxt.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        mascotaTxt.setForeground(new java.awt.Color(255, 255, 255));
        mascotaTxt.setText("Mascota:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(actvTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mascotaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloActv)
                            .addComponent(jSeparator1)
                            .addComponent(mascota, 0, 208, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(notasTxt)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(guardarActv, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(actvTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tituloActv, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mascotaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarActv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean borrado = false;
    private void tituloActvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tituloActvKeyTyped
        if (!borrado) {
            tituloActv.setText("");
        }
        borrado = true;
    }//GEN-LAST:event_tituloActvKeyTyped

    private void guardarActvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarActvMousePressed
        try {
            DataBase db = new DataBase();
            Connection conn = db.getConexion();

            String titulo = tituloActv.getText();
            String notas = notasInput.getText();

            String mascotaSeleccionada = (String) mascota.getSelectedItem();
            int idUser = obtenerIdUsuarioPorDocumento(Integer.parseInt(cedula));
            int idMascota = Herramientas.obtenerIdMascotaPorNombre(idUser, mascotaSeleccionada);

            String sql = "INSERT INTO actividades_diarias (mascota, fecha_actividad, tipo_actividad, notas) VALUES (?, NOW(), ?, ?)";
            PreparedStatement insert = conn.prepareStatement(sql);
            insert.setInt(1, idMascota);
            insert.setString(2, titulo);
            insert.setString(3, notas);

            int rowsAffected = insert.executeUpdate();
            if (rowsAffected > 0) {
                PanelActividades actv = new PanelActividades(cedula);
                actv.consultarActividades();
                setVisible(false);
                Herramientas.error("Actividad Guardada",true);
            } else {
                Herramientas.error("Inténtalo nuevamente", false);
            }

            // Cerrar recursos
            insert.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_guardarActvMousePressed

    private void cancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMousePressed
        setVisible(false);
    }//GEN-LAST:event_cancelarMousePressed

    private boolean borradoNotas = false;
    private void notasInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notasInputKeyTyped
        if (!borradoNotas) {
            notasInput.setText("");
        }
        borradoNotas = true;
    }//GEN-LAST:event_notasInputKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actvTxt;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton guardarActv;
    private javax.swing.JLabel img;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> mascota;
    private javax.swing.JLabel mascotaTxt;
    private javax.swing.JTextArea notasInput;
    private javax.swing.JLabel notasTxt;
    private javax.swing.JTextField tituloActv;
    // End of variables declaration//GEN-END:variables
}
