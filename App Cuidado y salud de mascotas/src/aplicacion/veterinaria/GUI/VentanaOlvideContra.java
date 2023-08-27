package aplicacion.veterinaria.GUI;
import aplicacion.veterinaria.Herramientas;
import java.util.Random;
import javax.mail.*;
import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class VentanaOlvideContra extends javax.swing.JFrame {

    public VentanaOlvideContra() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contraOlvidada = new javax.swing.JPanel();
        imgContraOlvidada = new javax.swing.JLabel();
        cedulaBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        buscarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        textoAyuda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(43, 43, 43));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contraOlvidada.setBackground(new java.awt.Color(43, 43, 43));
        contraOlvidada.setForeground(new java.awt.Color(210, 210, 210));

        imgContraOlvidada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-guard-dog-100.png"))); // NOI18N

        cedulaBuscar.setBackground(new java.awt.Color(43, 43, 43));
        cedulaBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cedulaBuscar.setForeground(new java.awt.Color(210, 210, 210));
        cedulaBuscar.setText("Ingresa tu cedula");
        cedulaBuscar.setBorder(null);
        cedulaBuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        cedulaBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaBuscarKeyTyped(evt);
            }
        });

        buscarButton.setBackground(new java.awt.Color(90, 90, 90));
        buscarButton.setForeground(new java.awt.Color(210, 210, 210));
        buscarButton.setText("Buscar");
        buscarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarButtonMouseClicked(evt);
            }
        });

        cancelarButton.setBackground(new java.awt.Color(90, 90, 90));
        cancelarButton.setForeground(new java.awt.Color(210, 210, 210));
        cancelarButton.setText("Cancelar");
        cancelarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarButtonMouseClicked(evt);
            }
        });

        textoAyuda.setForeground(new java.awt.Color(255, 255, 255));
        textoAyuda.setText("Porfavor ingresa tu cedula para encontrar tu cuenta.");

        javax.swing.GroupLayout contraOlvidadaLayout = new javax.swing.GroupLayout(contraOlvidada);
        contraOlvidada.setLayout(contraOlvidadaLayout);
        contraOlvidadaLayout.setHorizontalGroup(
            contraOlvidadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contraOlvidadaLayout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(contraOlvidadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contraOlvidadaLayout.createSequentialGroup()
                        .addComponent(imgContraOlvidada)
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contraOlvidadaLayout.createSequentialGroup()
                        .addGroup(contraOlvidadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cedulaBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contraOlvidadaLayout.createSequentialGroup()
                        .addGroup(contraOlvidadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contraOlvidadaLayout.createSequentialGroup()
                                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(141, 141, 141))))
        );
        contraOlvidadaLayout.setVerticalGroup(
            contraOlvidadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contraOlvidadaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(imgContraOlvidada, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(textoAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cedulaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(contraOlvidadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        getContentPane().add(contraOlvidada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarButtonMouseClicked
        System.out.println("contra no olvidada");
        VentanaLogin login = new VentanaLogin();
        setVisible(false);
    }//GEN-LAST:event_cancelarButtonMouseClicked
    private boolean borrado = false;
    private void cedulaBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaBuscarKeyTyped
        char c = evt.getKeyChar();
        if (c == '\n') {
            buscarButtonMouseClicked(null);
        }
        if (!borrado)
            cedulaBuscar.setText("");
            borrado = true;
    }//GEN-LAST:event_cedulaBuscarKeyTyped
    //buscar usuario 
    private void buscarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarButtonMouseClicked
        System.out.println("Buscar cuenta");
        String cedula = cedulaBuscar.getText();
        
        if (!cedula.isEmpty() && cedula.matches("\\d+")) {
            int cedulaInt = Integer.parseInt(cedula);
            boolean usuarioExiste = verificarUsuarioExistente(cedulaInt);
            
            if (!usuarioExiste) {
                Herramientas.error("Usuario ingresado no registrado.",false);
            } else {
                String codigo = generarCodigo();
                String correo = obtenerCorreo(cedulaInt);
                String mensaje = "Su codigo de autenticacion es : <b style='font-size:16px;'>"+codigo+"</b>"
                        + "<br><br><br>Atentamente,<br>"
                        + "Equipo de <b>PetCare</b>";
                boolean envio = false;
                try {
                    envio = Herramientas.enviarCorreo(correo, "Codigo de verificacion ", mensaje);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaOlvideContra.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (envio) {
                    VentanaConfirmarCodigo confirmacion = new VentanaConfirmarCodigo(codigo, cedulaInt);
                    confirmacion.setVisible(true);
                    setVisible(false);   
                }
            }
        } else {
            Herramientas.error("Por favor, ingrese una cédula válida.",false);
        }
    }//GEN-LAST:event_buscarButtonMouseClicked
    private boolean verificarUsuarioExistente(int cedula) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mascotas", "root", "");

            String query = "SELECT COUNT(*) FROM usuarios WHERE documento = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, cedula);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);

            resultSet.close();
            preparedStatement.close();
            conn.close();

            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    private String generarCodigo() {
        Random numero = new Random();
        int codigo = numero.nextInt(9000) + 1000;
        return Integer.toString(codigo);
    }
    
    private String obtenerCorreo(int cedula) {
    String correo = "";

    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mascotas", "root", "");

        String consulta = "SELECT correo FROM usuarios WHERE documento = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(consulta);
        preparedStatement.setInt(1, cedula);

        ResultSet resultado = preparedStatement.executeQuery();
        if (resultado.next()) {
            correo = resultado.getString("correo");
        }

        resultado.close();
        preparedStatement.close();
        connection.close();
        
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return correo;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField cedulaBuscar;
    private javax.swing.JPanel contraOlvidada;
    private javax.swing.JLabel imgContraOlvidada;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel textoAyuda;
    // End of variables declaration//GEN-END:variables
}
