package aplicacion.veterinaria.GUI;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class VentanaConfirmarCodigo extends javax.swing.JFrame {

 
    public VentanaConfirmarCodigo() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConfirmarCodigo = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        primerDigito = new javax.swing.JTextField();
        segundoDigito = new javax.swing.JTextField();
        tercerDigito = new javax.swing.JTextField();
        cuartoDigito = new javax.swing.JTextField();
        textoAyuda = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelConfirmarCodigo.setBackground(new java.awt.Color(43, 43, 43));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-security-100.png"))); // NOI18N

        primerDigito.setBackground(new java.awt.Color(90, 90, 90));
        primerDigito.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        primerDigito.setForeground(new java.awt.Color(204, 204, 204));
        primerDigito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primerDigito.setBorder(null);
        primerDigito.setCaretColor(new java.awt.Color(255, 255, 255));

        segundoDigito.setBackground(new java.awt.Color(90, 90, 90));
        segundoDigito.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        segundoDigito.setForeground(new java.awt.Color(204, 204, 204));
        segundoDigito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        segundoDigito.setBorder(null);
        segundoDigito.setCaretColor(new java.awt.Color(255, 255, 255));

        tercerDigito.setBackground(new java.awt.Color(90, 90, 90));
        tercerDigito.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        tercerDigito.setForeground(new java.awt.Color(204, 204, 204));
        tercerDigito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tercerDigito.setBorder(null);
        tercerDigito.setCaretColor(new java.awt.Color(255, 255, 255));

        cuartoDigito.setBackground(new java.awt.Color(90, 90, 90));
        cuartoDigito.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        cuartoDigito.setForeground(new java.awt.Color(204, 204, 204));
        cuartoDigito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cuartoDigito.setBorder(null);
        cuartoDigito.setCaretColor(new java.awt.Color(255, 255, 255));

        textoAyuda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoAyuda.setForeground(new java.awt.Color(255, 255, 255));
        textoAyuda.setText("Ingresa el codigo que te llego al correo asociado a esta cuenta.");

        confirmar.setBackground(new java.awt.Color(90, 90, 90));
        confirmar.setForeground(new java.awt.Color(210, 210, 210));
        confirmar.setText("Confirmar");
        confirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmarMouseClicked(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(90, 90, 90));
        cancelar.setForeground(new java.awt.Color(210, 210, 210));
        cancelar.setText("Cancelar");
        cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelConfirmarCodigoLayout = new javax.swing.GroupLayout(panelConfirmarCodigo);
        panelConfirmarCodigo.setLayout(panelConfirmarCodigoLayout);
        panelConfirmarCodigoLayout.setHorizontalGroup(
            panelConfirmarCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfirmarCodigoLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(img)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfirmarCodigoLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(panelConfirmarCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoAyuda)
                    .addGroup(panelConfirmarCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelConfirmarCodigoLayout.createSequentialGroup()
                            .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelConfirmarCodigoLayout.createSequentialGroup()
                            .addComponent(primerDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(segundoDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tercerDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cuartoDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(101, 101, 101))
        );
        panelConfirmarCodigoLayout.setVerticalGroup(
            panelConfirmarCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfirmarCodigoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoAyuda)
                .addGap(31, 31, 31)
                .addGroup(panelConfirmarCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segundoDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primerDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tercerDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuartoDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelConfirmarCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConfirmarCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConfirmarCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        aplicarRestriccion(primerDigito, segundoDigito);
        aplicarRestriccion(segundoDigito, tercerDigito);
        aplicarRestriccion(tercerDigito, cuartoDigito);
        aplicarRestriccion(cuartoDigito, null);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aplicarRestriccion(JTextField textField, JTextField nextTextField){
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string.matches("\\d") && fb.getDocument().getLength() == 0) {
                    super.insertString(fb, offset, string, attr);
                if (nextTextField != null) {
                    nextTextField.requestFocus(); // Cambia el foco al siguiente textField
                } else {
                    // Aquí puedes realizar alguna acción cuando se complete el ingreso
                    // en el último campo, como enviar los datos para su procesamiento.
                    // Por ejemplo: enviarDatos();
                }
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text.matches("\\d") && fb.getDocument().getLength() == 0) {
                    super.replace(fb, offset, length, text, attrs);
                if (nextTextField != null) {
                    nextTextField.requestFocus(); // Cambia el foco al siguiente textField
                } else {
                    // Aquí puedes realizar alguna acción cuando se complete el ingreso
                    // en el último campo, como enviar los datos para su procesamiento.
                    // Por ejemplo: enviarDatos();
                }
                }
            }
        });
    }
    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        System.out.println("cancelar codigo");
        VentanaLogin login = new VentanaLogin();
        setVisible(false);
    }//GEN-LAST:event_cancelarMouseClicked

    private void confirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarMouseClicked
        System.out.println("confirmar codigo");
        VentanaCodigoConfirmadoExitosamente confirmado = new VentanaCodigoConfirmadoExitosamente();
        confirmado.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_confirmarMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField cuartoDigito;
    private javax.swing.JLabel img;
    private javax.swing.JPanel panelConfirmarCodigo;
    private javax.swing.JTextField primerDigito;
    private javax.swing.JTextField segundoDigito;
    private javax.swing.JTextField tercerDigito;
    private javax.swing.JLabel textoAyuda;
    // End of variables declaration//GEN-END:variables
}
