
package aplicacion.veterinaria.GUI;

import aplicacion.veterinaria.*;
import static aplicacion.veterinaria.Herramientas.obtenerIdUsuarioPorDocumento;
import java.sql.*;
import java.util.List;


public class AgregarRegistro extends javax.swing.JFrame {

    private DataBase db = new DataBase();
    private Connection conn = db.getConexion();
    private String cedula;
    
    public AgregarRegistro(String cedula) {
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

        panelAgregarregistro = new javax.swing.JPanel();
        mascotaTxt = new javax.swing.JLabel();
        mascota = new javax.swing.JComboBox<>();
        img = new javax.swing.JLabel();
        detalleTxt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        diagnosticoOutput = new javax.swing.JTextArea();
        dianosticoTxt = new javax.swing.JLabel();
        tratamientoTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tratamientoOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAgregarregistro.setBackground(new java.awt.Color(43, 43, 43));

        mascotaTxt.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        mascotaTxt.setForeground(new java.awt.Color(255, 255, 255));
        mascotaTxt.setText("Mascota:");

        mascota.setBackground(new java.awt.Color(51, 51, 51));
        mascota.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        mascota.setForeground(new java.awt.Color(255, 255, 255));
        mascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        mascota.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        img.setFont(img.getFont());
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/dogtor (Custom).png"))); // NOI18N

        detalleTxt.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        detalleTxt.setForeground(new java.awt.Color(255, 255, 255));
        detalleTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detalleTxt.setText("Agregar registro clinico");

        guardar.setBackground(new java.awt.Color(48, 119, 62));
        guardar.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("Guardar");
        guardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                guardarMousePressed(evt);
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

        diagnosticoOutput.setBackground(new java.awt.Color(51, 51, 51));
        diagnosticoOutput.setColumns(20);
        diagnosticoOutput.setFont(new java.awt.Font("Source Code Pro", 2, 14)); // NOI18N
        diagnosticoOutput.setForeground(new java.awt.Color(255, 255, 255));
        diagnosticoOutput.setRows(5);
        diagnosticoOutput.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 10, 5));
        diagnosticoOutput.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(diagnosticoOutput);

        dianosticoTxt.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        dianosticoTxt.setForeground(new java.awt.Color(255, 255, 255));
        dianosticoTxt.setText("Diagnóstico:");

        tratamientoTxt.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        tratamientoTxt.setForeground(new java.awt.Color(255, 255, 255));
        tratamientoTxt.setText("Tratamiento:");
        tratamientoTxt.setToolTipText("");

        tratamientoOutput.setBackground(new java.awt.Color(51, 51, 51));
        tratamientoOutput.setColumns(20);
        tratamientoOutput.setFont(new java.awt.Font("Source Code Pro", 2, 14)); // NOI18N
        tratamientoOutput.setForeground(new java.awt.Color(255, 255, 255));
        tratamientoOutput.setRows(5);
        tratamientoOutput.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 10, 5));
        tratamientoOutput.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tratamientoOutput);

        javax.swing.GroupLayout panelAgregarregistroLayout = new javax.swing.GroupLayout(panelAgregarregistro);
        panelAgregarregistro.setLayout(panelAgregarregistroLayout);
        panelAgregarregistroLayout.setHorizontalGroup(
            panelAgregarregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarregistroLayout.createSequentialGroup()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mascotaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarregistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelAgregarregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detalleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAgregarregistroLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelAgregarregistroLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(panelAgregarregistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dianosticoTxt)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tratamientoTxt)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAgregarregistroLayout.setVerticalGroup(
            panelAgregarregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarregistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detalleTxt)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAgregarregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mascotaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(dianosticoTxt)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(tratamientoTxt)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panelAgregarregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAgregarregistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAgregarregistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void guardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMousePressed
        try {
            String diagnostico = diagnosticoOutput.getText();
            String tratamiento = tratamientoOutput.getText();

            String mascotaSeleccionada = (String) mascota.getSelectedItem();
            int idUser = obtenerIdUsuarioPorDocumento(Integer.parseInt(cedula));
            int idMascota = Herramientas.obtenerIdMascotaPorNombre(idUser, mascotaSeleccionada);

            String sql = "INSERT INTO registro_medico (mascota, fecha_registro, diagnostico, tratamiento) VALUES (?, NOW(), ?, ?)";
            PreparedStatement insert = conn.prepareStatement(sql);
            insert.setInt(1, idMascota);
            insert.setString(2, diagnostico);
            insert.setString(3, tratamiento);

            int rowsAffected = insert.executeUpdate();
            if (rowsAffected > 0) {
                PanelCardMedico cardMedc = new PanelCardMedico(cedula);
                cardMedc.consultarRegistros();
                setVisible(false);
                Herramientas.error("Registro Guardado",true);
            } else {
                Herramientas.error("Inténtalo nuevamente", false);
            }

            // Cerrar recursos
            insert.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_guardarMousePressed

    private void cancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMousePressed
        setVisible(false);
    }//GEN-LAST:event_cancelarMousePressed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel detalleTxt;
    private javax.swing.JTextArea diagnosticoOutput;
    private javax.swing.JLabel dianosticoTxt;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel img;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> mascota;
    private javax.swing.JLabel mascotaTxt;
    private javax.swing.JPanel panelAgregarregistro;
    private javax.swing.JTextArea tratamientoOutput;
    private javax.swing.JLabel tratamientoTxt;
    // End of variables declaration//GEN-END:variables
}
