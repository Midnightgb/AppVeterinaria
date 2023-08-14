package aplicacion.veterinaria.GUI;

public class VentanaRegister extends javax.swing.JFrame {

    public VentanaRegister() {
        initComponents();
        settings();
    }
    private void settings(){
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        form = new javax.swing.JPanel();
        contraseniaInput = new javax.swing.JPasswordField();
        contraseniaText = new javax.swing.JLabel();
        cedulaInput = new javax.swing.JTextField();
        cedulaText = new javax.swing.JLabel();
        nombreInputText = new javax.swing.JLabel();
        nombreInput = new javax.swing.JTextField();
        lastNameInputText = new javax.swing.JLabel();
        apellidoInput = new javax.swing.JTextField();
        correoInputText = new javax.swing.JLabel();
        correoInput = new javax.swing.JTextField();
        contraseniaInputConfirm = new javax.swing.JPasswordField();
        contraseniaInputConfirmText = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        siCuentaClickText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setTitle("Registro de usuario");
        setResizable(false);
        panelMain.setBackground(new java.awt.Color(43, 43, 43));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/LogoLogoResized.png"))); // NOI18N

        form.setBackground(new java.awt.Color(43, 43, 43));

        contraseniaInput.setBackground(new java.awt.Color(90, 90, 90));
        contraseniaInput.setForeground(new java.awt.Color(210, 210, 210));
        contraseniaInput.setToolTipText("");
        contraseniaInput.setBorder(null);
        contraseniaInput.setCaretColor(new java.awt.Color(204, 204, 204));

        contraseniaText.setBackground(new java.awt.Color(40, 42, 54));
        contraseniaText.setForeground(new java.awt.Color(210, 210, 210));
        contraseniaText.setText("Contraseña:");

        cedulaInput.setBackground(new java.awt.Color(90, 90, 90));
        cedulaInput.setForeground(new java.awt.Color(210, 210, 210));
        cedulaInput.setToolTipText("");
        cedulaInput.setBorder(null);
        cedulaInput.setCaretColor(new java.awt.Color(204, 204, 204));

        cedulaText.setBackground(new java.awt.Color(40, 42, 54));
        cedulaText.setForeground(new java.awt.Color(210, 210, 210));
        cedulaText.setText("Cedula:");

        nombreInputText.setBackground(new java.awt.Color(40, 42, 54));
        nombreInputText.setForeground(new java.awt.Color(210, 210, 210));
        nombreInputText.setText("Nombre/s:");

        nombreInput.setBackground(new java.awt.Color(90, 90, 90));
        nombreInput.setForeground(new java.awt.Color(210, 210, 210));
        nombreInput.setToolTipText("");
        nombreInput.setBorder(null);
        nombreInput.setCaretColor(new java.awt.Color(204, 204, 204));

        lastNameInputText.setBackground(new java.awt.Color(40, 42, 54));
        lastNameInputText.setForeground(new java.awt.Color(210, 210, 210));
        lastNameInputText.setText("Apellido/s:");

        apellidoInput.setBackground(new java.awt.Color(90, 90, 90));
        apellidoInput.setForeground(new java.awt.Color(210, 210, 210));
        apellidoInput.setToolTipText("");
        apellidoInput.setBorder(null);
        apellidoInput.setCaretColor(new java.awt.Color(204, 204, 204));

        correoInputText.setBackground(new java.awt.Color(40, 42, 54));
        correoInputText.setForeground(new java.awt.Color(210, 210, 210));
        correoInputText.setText("Correo:");

        correoInput.setBackground(new java.awt.Color(90, 90, 90));
        correoInput.setForeground(new java.awt.Color(210, 210, 210));
        correoInput.setToolTipText("");
        correoInput.setBorder(null);
        correoInput.setCaretColor(new java.awt.Color(204, 204, 204));

        contraseniaInputConfirm.setBackground(new java.awt.Color(90, 90, 90));
        contraseniaInputConfirm.setForeground(new java.awt.Color(210, 210, 210));
        contraseniaInputConfirm.setToolTipText("");
        contraseniaInputConfirm.setBorder(null);
        contraseniaInputConfirm.setCaretColor(new java.awt.Color(204, 204, 204));

        contraseniaInputConfirmText.setBackground(new java.awt.Color(40, 42, 54));
        contraseniaInputConfirmText.setForeground(new java.awt.Color(210, 210, 210));
        contraseniaInputConfirmText.setText("Confirmar contraseña:");

        registerButton.setBackground(new java.awt.Color(90, 90, 90));
        registerButton.setForeground(new java.awt.Color(210, 210, 210));
        registerButton.setText("Registrarse");
        registerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        siCuentaClickText.setForeground(new java.awt.Color(210, 210, 210));
        siCuentaClickText.setText("¿Ya tienes cuenta? Click aqui");
        siCuentaClickText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siCuentaClickText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siCuentaClickTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(siCuentaClickText)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cedulaInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contraseniaInput)
                    .addComponent(contraseniaInputConfirm)
                    .addComponent(apellidoInput)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cedulaText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correoInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseniaText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseniaInputConfirmText))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nombreInput)
                    .addComponent(correoInput))
                .addContainerGap())
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cedulaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cedulaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lastNameInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(correoInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contraseniaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseniaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contraseniaInputConfirmText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseniaInputConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siCuentaClickText)
                .addGap(25, 25, 25))
        );

        formLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cedulaInput, contraseniaInput});

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img)
                .addGap(111, 111, 111))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        System.out.println("Registrarme");
        VentanaLogin login = new VentanaLogin();
        setVisible(false);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void siCuentaClickTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siCuentaClickTextMouseClicked
        System.out.println("Si tengo cuenta");
        VentanaLogin login = new VentanaLogin();
        setVisible(false);
    }//GEN-LAST:event_siCuentaClickTextMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoInput;
    private javax.swing.JTextField cedulaInput;
    private javax.swing.JLabel cedulaText;
    private javax.swing.JPasswordField contraseniaInput;
    private javax.swing.JPasswordField contraseniaInputConfirm;
    private javax.swing.JLabel contraseniaInputConfirmText;
    private javax.swing.JLabel contraseniaText;
    private javax.swing.JTextField correoInput;
    private javax.swing.JLabel correoInputText;
    private javax.swing.JPanel form;
    private javax.swing.JLabel img;
    private javax.swing.JLabel lastNameInputText;
    private javax.swing.JTextField nombreInput;
    private javax.swing.JLabel nombreInputText;
    private javax.swing.JPanel panelMain;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel siCuentaClickText;
    // End of variables declaration//GEN-END:variables
}
