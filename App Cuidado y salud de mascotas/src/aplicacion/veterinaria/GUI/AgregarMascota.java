
package aplicacion.veterinaria.GUI;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
import aplicacion.veterinaria.*;


public class AgregarMascota extends javax.swing.JFrame {
    private String cedula;
    ImageIcon imagenTemporal;
    public AgregarMascota(String cedula) {
        initComponents();
        imagenTemporal = null;
        this.cedula = cedula;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textNombre = new javax.swing.JLabel();
        nombreMascota = new javax.swing.JTextField();
        razaMascota = new javax.swing.JTextField();
        textRaza = new javax.swing.JLabel();
        edadMascota = new javax.swing.JTextField();
        edadText = new javax.swing.JLabel();
        genero = new javax.swing.JComboBox<>();
        btnLoadImage = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        btnUploadImage = new javax.swing.JButton();
        panelPreview = new javax.swing.JPanel();
        etqPreview = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imagenLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(43, 43, 43));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/Cat astronaut-cuate.png"))); // NOI18N

        textNombre.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        textNombre.setForeground(new java.awt.Color(210, 210, 210));
        textNombre.setText("Nombre:");

        nombreMascota.setBackground(new java.awt.Color(90, 90, 90));
        nombreMascota.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        nombreMascota.setForeground(new java.awt.Color(210, 210, 210));
        nombreMascota.setText("pepito");
        nombreMascota.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        nombreMascota.setCaretColor(new java.awt.Color(255, 255, 255));

        razaMascota.setBackground(new java.awt.Color(90, 90, 90));
        razaMascota.setForeground(new java.awt.Color(210, 210, 210));
        razaMascota.setText("Cocodrilo 🐊");
        razaMascota.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        razaMascota.setCaretColor(new java.awt.Color(255, 255, 255));

        textRaza.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        textRaza.setForeground(new java.awt.Color(210, 210, 210));
        textRaza.setText("Raza:");

        edadMascota.setBackground(new java.awt.Color(90, 90, 90));
        edadMascota.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        edadMascota.setForeground(new java.awt.Color(210, 210, 210));
        edadMascota.setText("150");
        edadMascota.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        edadMascota.setCaretColor(new java.awt.Color(255, 255, 255));

        edadText.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        edadText.setForeground(new java.awt.Color(210, 210, 210));
        edadText.setText("Edad:");

        genero.setBackground(new java.awt.Color(90, 90, 90));
        genero.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        genero.setForeground(new java.awt.Color(210, 210, 210));
        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Hembra", "Otro", "Indefinido" }));
        genero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro", 0, 12), new java.awt.Color(90, 90, 90))); // NOI18N

        btnLoadImage.setBackground(new java.awt.Color(90, 90, 90));
        btnLoadImage.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnLoadImage.setForeground(new java.awt.Color(210, 210, 210));
        btnLoadImage.setText("Agregar imagen");
        btnLoadImage.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLoadImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoadImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoadImageMousePressed(evt);
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

        btnUploadImage.setBackground(new java.awt.Color(48, 119, 62));
        btnUploadImage.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnUploadImage.setForeground(new java.awt.Color(255, 255, 255));
        btnUploadImage.setText("Guardar");
        btnUploadImage.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUploadImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUploadImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUploadImageMousePressed(evt);
            }
        });

        panelPreview.setBackground(new java.awt.Color(43, 43, 43));

        etqPreview.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        etqPreview.setForeground(new java.awt.Color(210, 210, 210));
        etqPreview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqPreview.setText("Vista Previa");

        imagenLabel.setBackground(new java.awt.Color(90, 90, 90));
        jScrollPane1.setViewportView(imagenLabel);

        javax.swing.GroupLayout panelPreviewLayout = new javax.swing.GroupLayout(panelPreview);
        panelPreview.setLayout(panelPreviewLayout);
        panelPreviewLayout.setHorizontalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelPreviewLayout.setVerticalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addComponent(etqPreview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setForeground(new java.awt.Color(210, 210, 210));
        jLabel2.setText("Genero:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(razaMascota, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnLoadImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                            .addComponent(btnUploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textRaza, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edadText))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(textNombre)
                    .addComponent(nombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(textNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textRaza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(razaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edadText)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLoadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadImageMousePressed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Imagen", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        int seleccion = fileChooser.showOpenDialog(panelPreview);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String rutaImagen = fileChooser.getSelectedFile().getAbsolutePath();
            imagenTemporal = new ImageIcon(rutaImagen);
            Image imagen = imagenTemporal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            imagenTemporal = new ImageIcon(imagen);

            imagenLabel.setIcon(imagenTemporal);
        }
    }//GEN-LAST:event_btnLoadImageMousePressed

    private void cancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMousePressed
        setVisible(false);
    }//GEN-LAST:event_cancelarMousePressed

    private void btnUploadImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUploadImageMousePressed
        try {
            BufferedImage image = createBufferedImage(imagenTemporal);
            if (image != null) {
                // Convertir la imagen a un arreglo de bytes
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos);
                byte[] imageData = baos.toByteArray();

                // Obtener otros datos de los campos de la interfaz
                String nombre = nombreMascota.getText();
                String raza = razaMascota.getText();
                int edad = Integer.parseInt(edadMascota.getText());
                String generoSeleccionado  = (String) genero.getSelectedItem(); // Obtener el género seleccionado

                // Guardar los datos en la base de datos
                guardarDatosEnBaseDeDatos(nombre, raza, edad, generoSeleccionado , imageData);

                setVisible(false);
                Herramientas.error("Datos de " + nombre + " guardados.",true);
            } else {
                Herramientas.error("No se pudo cargar la imagen.",false);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUploadImageMousePressed

    private void guardarDatosEnBaseDeDatos(String nombre, String raza, int edad, String genero, byte[] imagenData) {
        try {
            DataBase db = new DataBase();
            Connection conn = db.getConexion();
            System.out.println(cedula);
            int cedulaInt = Integer.parseInt(cedula);
            int id_user = Herramientas.obtenerIdUsuarioPorDocumento(cedulaInt);
            // Insertar datos en la tabla de mascotas
            String insertQuery = "INSERT INTO mascotas (nombre, raza, edad, genero, usuario, imagen) VALUES (?, ?, ?, ?, ?,?)";
            PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
            insertStatement.setString(1, nombre);
            insertStatement.setString(2, raza);
            insertStatement.setInt(3, edad);
            insertStatement.setString(4, genero);
            insertStatement.setInt(5, id_user);
            insertStatement.setBytes(6, imagenData);

            insertStatement.executeUpdate();

            // Cerrar recursos
            insertStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private BufferedImage createBufferedImage(ImageIcon temporal){
        Image imagen = temporal.getImage();
        
        BufferedImage bufferedImage = new BufferedImage(
            imagen.getWidth(null),
            imagen.getHeight(null),
            BufferedImage.TYPE_INT_ARGB
        );

        Graphics2D bGr = bufferedImage.createGraphics();
        bGr.drawImage(imagen, 0, 0, null);
        bGr.dispose();
        
        return bufferedImage;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadImage;
    private javax.swing.JButton btnUploadImage;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField edadMascota;
    private javax.swing.JLabel edadText;
    private javax.swing.JLabel etqPreview;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nombreMascota;
    private javax.swing.JPanel panelPreview;
    private javax.swing.JTextField razaMascota;
    private javax.swing.JLabel textNombre;
    private javax.swing.JLabel textRaza;
    // End of variables declaration//GEN-END:variables
}
