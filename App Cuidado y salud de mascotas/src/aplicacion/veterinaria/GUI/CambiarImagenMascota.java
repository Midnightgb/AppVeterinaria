package aplicacion.veterinaria.GUI;

import aplicacion.veterinaria.DataBase;
import aplicacion.veterinaria.Herramientas;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class CambiarImagenMascota extends javax.swing.JFrame {

    ImageIcon imagenTemporal;
    
    private String cedula;
    private String nombreMascota;
    private String id_mascota;
    
    public CambiarImagenMascota(String cedula, String nombreMascota, String id_mascota) {
        this.cedula = cedula;
        this.nombreMascota = nombreMascota;
        this.id_mascota = id_mascota;
        imagenTemporal = null;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCambiarFoto = new javax.swing.JPanel();
        textoCambiarFoto = new javax.swing.JLabel();
        btnLoadImage = new javax.swing.JButton();
        panelPreview = new javax.swing.JPanel();
        etqPreview = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imagenLabel = new javax.swing.JLabel();
        btnUploadImage = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        nombreMascotaTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCambiarFoto.setBackground(new java.awt.Color(43, 43, 43));
        panelCambiarFoto.setForeground(new java.awt.Color(210, 210, 210));

        textoCambiarFoto.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        textoCambiarFoto.setForeground(new java.awt.Color(255, 255, 255));
        textoCambiarFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCambiarFoto.setText("Cambiar  foto de");

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

        btnCancelar.setBackground(new java.awt.Color(255, 107, 107));
        btnCancelar.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        nombreMascotaTxt.setFont(new java.awt.Font("Source Code Pro", 0, 18)); // NOI18N
        nombreMascotaTxt.setForeground(new java.awt.Color(255, 255, 255));
        nombreMascotaTxt.setText(nombreMascota);
        System.out.println(nombreMascotaTxt.getText());

        javax.swing.GroupLayout panelCambiarFotoLayout = new javax.swing.GroupLayout(panelCambiarFoto);
        panelCambiarFoto.setLayout(panelCambiarFotoLayout);
        panelCambiarFotoLayout.setHorizontalGroup(
            panelCambiarFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambiarFotoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelCambiarFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambiarFotoLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(btnUploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLoadImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelCambiarFotoLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(textoCambiarFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreMascotaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelCambiarFotoLayout.setVerticalGroup(
            panelCambiarFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambiarFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCambiarFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCambiarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreMascotaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnLoadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCambiarFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCambiarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCambiarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
            Image imagen = imagenTemporal.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH);
            imagenTemporal = new ImageIcon(imagen);

            imagenLabel.setIcon(imagenTemporal);
        }
    }//GEN-LAST:event_btnLoadImageMousePressed

    private void btnUploadImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUploadImageMousePressed
        try {
            BufferedImage image = createBufferedImage(imagenTemporal);
            if (image != null) {
                // Convertir la imagen a un arreglo de bytes
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos);
                byte[] imageData = baos.toByteArray();

                DataBase db = new DataBase();
                Connection conn = db.getConexion();
                String updateQuery = "UPDATE mascotas SET imagen = ? WHERE id_mascota = ?";
                PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
                updateStatement.setBytes(1, imageData); 
                updateStatement.setString(2, id_mascota); 

                updateStatement.executeUpdate();

                int rowsAffected = updateStatement.executeUpdate();
                if (rowsAffected > 0) {
                    setVisible(false);
                    Herramientas.error("Imagen de " + nombreMascota + " actualizada.",true);
                } else {
                    Herramientas.error("Intentalo nuevamente", false);
                }
                updateStatement.close();
            } else {
                Herramientas.error("No se pudo cargar la imagen.",false);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(CambiarImagenMascota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUploadImageMousePressed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        setVisible(false);
    }//GEN-LAST:event_btnCancelarMouseClicked
    
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLoadImage;
    private javax.swing.JButton btnUploadImage;
    private javax.swing.JLabel etqPreview;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreMascotaTxt;
    private javax.swing.JPanel panelCambiarFoto;
    private javax.swing.JPanel panelPreview;
    private javax.swing.JLabel textoCambiarFoto;
    // End of variables declaration//GEN-END:variables
}
