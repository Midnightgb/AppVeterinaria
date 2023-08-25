package aplicacion.veterinaria.GUI;

import aplicacion.veterinaria.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class VentanaLogin extends javax.swing.JFrame {

    public VentanaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        contraseniaInput = new javax.swing.JPasswordField();
        cedulaInput = new javax.swing.JTextField();
        imgLogo = new javax.swing.JLabel();
        contraseniaOlvidada = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        separadorContra = new javax.swing.JSeparator();
        separadorCedula = new javax.swing.JSeparator();
        contraText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(43, 43, 43));

        setTitle("Login");
        setResizable(false);
        login.setBackground(new java.awt.Color(43, 43, 43));

        contraseniaInput.setBackground(new java.awt.Color(43, 43, 43));
        contraseniaInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contraseniaInput.setForeground(new java.awt.Color(210, 210, 210));
        contraseniaInput.setText("Contraseña:");
        contraseniaInput.setToolTipText("");
        contraseniaInput.setBorder(null);
        contraseniaInput.setCaretColor(new java.awt.Color(204, 204, 204));
        contraseniaInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contraseniaInputKeyTyped(evt);
            }
        });

        cedulaInput.setBackground(new java.awt.Color(43, 43, 43));
        cedulaInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cedulaInput.setForeground(new java.awt.Color(210, 210, 210));
        cedulaInput.setText("Cedula");
        cedulaInput.setToolTipText("");
        cedulaInput.setBorder(null);
        cedulaInput.setCaretColor(new java.awt.Color(204, 204, 204));
        cedulaInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaInputKeyTyped(evt);
            }
        });

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/LogoLogoResized.png"))); // NOI18N

        contraseniaOlvidada.setForeground(new java.awt.Color(210, 210, 210));
        contraseniaOlvidada.setText("¿Olvidaste tu contraseña?");
        contraseniaOlvidada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contraseniaOlvidada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseniaOlvidadaMouseClicked(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(90, 90, 90));
        loginButton.setForeground(new java.awt.Color(210, 210, 210));
        loginButton.setText("Ingresar");
        loginButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.setForeground(new java.awt.Color(210, 210, 210));
        registerButton.setText("Registrarse");
        registerButton.setBorder(null);
        registerButton.setBorderPainted(false);
        registerButton.setContentAreaFilled(false);
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registerButtonMousePressed(evt);
            }
        });

        contraText.setForeground(new java.awt.Color(210, 210, 210));
        contraText.setText("Contraseña:");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addComponent(contraseniaOlvidada, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraText)
                            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(contraseniaInput)
                                .addComponent(cedulaInput, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addGroup(loginLayout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(imgLogo))
                                .addComponent(separadorContra)
                                .addComponent(separadorCedula)))
                        .addGap(53, 53, 53))))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(imgLogo)
                .addGap(18, 18, 18)
                .addComponent(cedulaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(separadorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(contraText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseniaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorContra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contraseniaOlvidada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setVisible(true);
        revalidate();
        repaint();

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        DataBase db = new DataBase(); // Crear instancia de DataBase
        String cedula = cedulaInput.getText();
        String contrasena = new String(contraseniaInput.getPassword());
        boolean estadoCedula = true;

        //acciones finales
        if (!estadoCedula) {
            Herramientas.error("Cédula no válida. Intente nuevamente.",false);

        } else if (cedula.isEmpty() || contrasena.isEmpty()) {
            Herramientas.error("Por favor, diligencie todos los campos.",false);

        } else {
            String selectQuery = "SELECT * FROM usuarios WHERE documento = ? AND contrasena = ?";

            try {
                PreparedStatement selectStatement = db.getConexion().prepareStatement(selectQuery);
                selectStatement.setString(1, cedula);
                selectStatement.setString(2, contrasena);

                ResultSet resultSet = selectStatement.executeQuery();

                if (resultSet.next()) {
                    System.out.println("Inicio de sesión exitoso.");
                    VentanaPrincipal main = new VentanaPrincipal(cedula);
                    main.setVisible(true);
                    setVisible(false);
                } else {
                    Herramientas.error("Cedula o contraseña incorrecta",false);

                }

            } catch (SQLException ex) {
                System.out.println("Error al realizar la consulta: " + ex.getMessage());
            }

            try {
                db.getConexion().close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException ex) {
                System.out.println("Error al cerrar conexión: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMousePressed
        System.out.println("No tengo cuenta");
        VentanaRegister registrar = new VentanaRegister();
        registrar.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_registerButtonMousePressed

    private void contraseniaOlvidadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseniaOlvidadaMouseClicked
        System.out.println("hola olvide la contra");
        VentanaOlvideContra olvido = new VentanaOlvideContra();
        olvido.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_contraseniaOlvidadaMouseClicked
    private boolean borradoCedula = false;
    private void cedulaInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaInputKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // No permite ingresar el carácter no numérico
        }
        if (!borradoCedula) {
            cedulaInput.setText("");
        }
        borradoCedula = true;
    }//GEN-LAST:event_cedulaInputKeyTyped
    private boolean borradoContra = false;
    private void contraseniaInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseniaInputKeyTyped
        if (!borradoContra) {
            contraseniaInput.setText("");
        }
        borradoContra = true;
    }//GEN-LAST:event_contraseniaInputKeyTyped
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedulaInput;
    private javax.swing.JLabel contraText;
    private javax.swing.JPasswordField contraseniaInput;
    private javax.swing.JLabel contraseniaOlvidada;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel login;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JButton registerButton;
    private javax.swing.JSeparator separadorCedula;
    private javax.swing.JSeparator separadorContra;
    // End of variables declaration//GEN-END:variables
}
