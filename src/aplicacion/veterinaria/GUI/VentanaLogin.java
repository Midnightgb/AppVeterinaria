
package aplicacion.veterinaria.GUI;

public class VentanaLogin extends javax.swing.JFrame {

    public VentanaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        contraseniaInput = new javax.swing.JPasswordField();
        cedulaInput = new javax.swing.JTextField();
        cedulaText = new javax.swing.JLabel();
        contraseniaText = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        contraseniaOlvidada = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        setTitle("Login");
        setResizable(false);
        login.setBackground(new java.awt.Color(43, 43, 43));

        contraseniaInput.setBackground(new java.awt.Color(90, 90, 90));
        contraseniaInput.setForeground(new java.awt.Color(210, 210, 210));
        contraseniaInput.setToolTipText("");
        contraseniaInput.setBorder(null);
        contraseniaInput.setCaretColor(new java.awt.Color(204, 204, 204));

        cedulaInput.setBackground(new java.awt.Color(90, 90, 90));
        cedulaInput.setForeground(new java.awt.Color(210, 210, 210));
        cedulaInput.setToolTipText("");
        cedulaInput.setBorder(null);
        cedulaInput.setCaretColor(new java.awt.Color(204, 204, 204));

        cedulaText.setBackground(new java.awt.Color(40, 42, 54));
        cedulaText.setForeground(new java.awt.Color(210, 210, 210));
        cedulaText.setText("Cedula:");

        contraseniaText.setBackground(new java.awt.Color(40, 42, 54));
        contraseniaText.setForeground(new java.awt.Color(210, 210, 210));
        contraseniaText.setText("Contraseña:");

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

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contraseniaText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedulaText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseniaInput, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(cedulaInput))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addGap(0, 140, Short.MAX_VALUE)
                .addComponent(imgLogo)
                .addGap(129, 129, 129))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addComponent(contraseniaOlvidada)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(imgLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cedulaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cedulaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contraseniaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseniaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contraseniaOlvidada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        getContentPane().add(login, java.awt.BorderLayout.CENTER);
        setVisible(true);
        revalidate();
        repaint();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        System.out.println("Iniciar sesion hola");
        VentanaPrincipal main = new VentanaPrincipal();
        main.setVisible(true);
        setVisible(false);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedulaInput;
    private javax.swing.JLabel cedulaText;
    private javax.swing.JPasswordField contraseniaInput;
    private javax.swing.JLabel contraseniaOlvidada;
    private javax.swing.JLabel contraseniaText;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel login;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
