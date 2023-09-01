package aplicacion.veterinaria.GUI;
import aplicacion.veterinaria.*;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VentanaRegister extends javax.swing.JFrame {

    public VentanaRegister() {
        initComponents();
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
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        setTitle("Registro de usuario");
        setResizable(false);
        panelMain.setBackground(new java.awt.Color(43, 43, 43));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/PetCare-150.png"))); // NOI18N

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
        cedulaInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaInputKeyTyped(evt);
            }
        });

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

        registerButton.setBackground(new java.awt.Color(79, 147, 210));
        registerButton.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Registrarse");
        registerButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contraseniaText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contraseniaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contraseniaInputConfirm)
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addComponent(contraseniaInputConfirmText)
                                        .addGap(0, 162, Short.MAX_VALUE))))
                            .addGroup(formLayout.createSequentialGroup()
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cedulaText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cedulaInput, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(nombreInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreInput))
                                .addGap(50, 50, 50)
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(correoInput)
                                    .addComponent(apellidoInput)
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lastNameInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(correoInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(siCuentaClickText))
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedulaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(correoInput, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(cedulaInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(lastNameInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(nombreInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(contraseniaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contraseniaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(contraseniaInputConfirmText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contraseniaInputConfirm)))
                .addGap(32, 32, 32)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siCuentaClickText)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelMain);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        DataBase db = new DataBase();
        String cedula = cedulaInput.getText();
        String nombre = nombreInput.getText();
        String apellido = apellidoInput.getText();
        String correo = correoInput.getText();
        String contrasena = new String(contraseniaInput.getPassword());
        String contrasenaConfirmada = new String(contraseniaInputConfirm.getPassword());
        boolean estadoCedula = false;

        // Verificar si la cédula es válida
        if (cedula.matches("\\d+")) {
            estadoCedula = true;
        }

        // Verificar otros campos y proceder con la inserción...
        if (!estadoCedula) {
            Herramientas.error("Cédula no válida. Intente nuevamente.",false);
        } else if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || contrasenaConfirmada.isEmpty()) {
            Herramientas.error("Por favor, diligencie todos los campos.",false);
        } else if (!contrasena.equals(contrasenaConfirmada)) {
            Herramientas.error("Las contraseñas no coinciden.",false);
        } else {
            // Verificar si el usuario ya está registrado
            String selectQuery = "SELECT * FROM usuarios WHERE documento = ?";
            try {
                PreparedStatement selectStatement = db.getConexion().prepareStatement(selectQuery);
                selectStatement.setString(1, cedula);
                ResultSet resultSet = selectStatement.executeQuery();

                if (resultSet.next()) {
                    Herramientas.error("El usuario ya esta registrado.",false);
                    db.getConexion().close();
                    return; 
                }

                String insertQuery = "INSERT INTO usuarios (documento, nombre, apellidos, correo, contrasena, fecha) VALUES (?, ?, ?, ?, ?, NOW())";

                try {
                    PreparedStatement insertStatement = db.getConexion().prepareStatement(insertQuery);
                    insertStatement.setString(1, cedula);
                    insertStatement.setString(2, nombre);
                    insertStatement.setString(3, apellido);
                    insertStatement.setString(4, correo);
                    insertStatement.setString(5, contrasena);

                    int rowsAffected = insertStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        VentanaLogin login = new VentanaLogin();
                        setVisible(false);
                        Herramientas.error("Usuario registrado exitosamente.",true);
                        String asunto = "¡Bienvenido a PetCare - Tu Plataforma para el Cuidado de Mascotas!";
                        String mensaje = "<h2 style='color:#1E1E1E;'>Estimad@ "+ nombre +",</h2>" +
                                        "Es un placer darte la bienvenida a <b>PetCare</b>, la plataforma diseñada para cuidar a tus mascotas de una manera sencilla y efectiva. Estamos emocionados de que te hayas unido a nuestra comunidad de amantes de los animales y esperamos que disfrutes de todas las funciones que <b>PetCare</b> tiene para ofrecer.\n" +
                                        "<p>Hemos creado tu cuenta con los siguientes detalles:</p>" +
                                        "<br><b>Datos para iniciar sesion: "+ cedula +"</b>" +
                                        "<br><b>Correo Electrónico: "+ correo +"</b>" +
                                        "<br><br>Con <b>PetCare</b>, podrás:\n" +
                                        "<br><b>1.</b> Registrar a tus mascotas y mantener un registro detallado de sus actividades diarias.\n" +
                                        "<br><b>2.</b> Agregar notas de las actividades realizadas por tus mascotas, como paseos, juegos y más.\n" +
                                        "<br><b>3.</b> Llevar un registro médico completo, incluyendo citas veterinarias, tratamientos y medicamentos.\n" +
                                        "<br><b>4.</b> Establecer dietas personalizadas para cada mascota y mantener un seguimiento de su alimentación.\n" +
                                        "<br><br><br>Para comenzar, te recomendamos iniciar sesión con tus credenciales y explorar todas las características intuitivas que hemos preparado para ti.\n" +
                                        "<br><br>Queremos que tu experiencia con PetCare sea excepcional y que sientas la tranquilidad de cuidar a tus mascotas de la mejor manera posible. ¡Gracias por unirte a nuestra comunidad!\n" +
                                        "<br><br><br>Saludos cordiales,<br>" +
                                        "Equipo de <b>PetCare</b>";
                        Herramientas.enviarCorreo(correo, asunto, mensaje);
                    } else {
                        Herramientas.error("No se pudo registrar el usuario.",false);
                    }

                } catch (SQLException ex) {
                    System.out.println("Error al insertar usuario: " + ex.getMessage());
                } catch (IOException ex) {
                    Logger.getLogger(VentanaRegister.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    db.getConexion().close();
                    System.out.println("Conexión cerrada.");
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar conexión: " + ex.getMessage());
                }


            } catch (SQLException ex) {
                System.out.println("Error al verificar usuario: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void siCuentaClickTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siCuentaClickTextMouseClicked
        System.out.println("Si tengo cuenta");
        VentanaLogin login = new VentanaLogin();
        setVisible(false);
    }//GEN-LAST:event_siCuentaClickTextMouseClicked

    private void cedulaInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaInputKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // No permite ingresar el carácter no numérico
        }
    }//GEN-LAST:event_cedulaInputKeyTyped

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
