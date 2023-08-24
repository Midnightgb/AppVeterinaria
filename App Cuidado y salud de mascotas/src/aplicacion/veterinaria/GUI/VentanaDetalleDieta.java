/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplicacion.veterinaria.GUI;

/**
 *
 * @author INSTRUCTOR
 */
public class VentanaDetalleDieta extends javax.swing.JFrame {

    /**
     * Creates new form VentanaDetalleRegistro
     */
    public VentanaDetalleDieta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        etq_id_mascota = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        etq_raza = new javax.swing.JLabel();
        etq_edad = new javax.swing.JLabel();
        etq_genero = new javax.swing.JLabel();
        etq_raciones = new javax.swing.JLabel();
        etq_descripcion = new javax.swing.JLabel();
        capa_texto_descripcion = new javax.swing.JPanel();
        btn_atras = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Diagnóstico:");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_titulo.setText("Detalle del registro");

        etq_id_mascota.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_id_mascota.setText("ID Mascota:");

        etq_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_nombre.setText("Nombre:");

        etq_raza.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_raza.setText("Raza:");

        etq_edad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_edad.setText("Edad:");

        etq_genero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_genero.setText("Género:");

        etq_raciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_raciones.setText("Raciones:");

        etq_descripcion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_descripcion.setText("Descripción:");

        capa_texto_descripcion.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout capa_texto_descripcionLayout = new javax.swing.GroupLayout(capa_texto_descripcion);
        capa_texto_descripcion.setLayout(capa_texto_descripcionLayout);
        capa_texto_descripcionLayout.setHorizontalGroup(
            capa_texto_descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );
        capa_texto_descripcionLayout.setVerticalGroup(
            capa_texto_descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        btn_atras.setText("Atras");

        btn_eliminar.setText("Eliminar");

        btn_editar.setText("Editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_raciones)
                            .addComponent(etq_genero)
                            .addComponent(etq_edad)
                            .addComponent(etq_raza)
                            .addComponent(etq_nombre)
                            .addComponent(etq_id_mascota)
                            .addComponent(capa_texto_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(etq_descripcion))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(etq_titulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btn_atras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btn_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_eliminar)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etq_titulo)
                .addGap(30, 30, 30)
                .addComponent(etq_id_mascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_raza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_edad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_genero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_raciones)
                .addGap(43, 43, 43)
                .addComponent(etq_descripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capa_texto_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_editar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaDetalleDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDetalleDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDetalleDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDetalleDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDetalleDieta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JPanel capa_texto_descripcion;
    private javax.swing.JLabel etq_descripcion;
    private javax.swing.JLabel etq_edad;
    private javax.swing.JLabel etq_genero;
    private javax.swing.JLabel etq_id_mascota;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_raciones;
    private javax.swing.JLabel etq_raza;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}