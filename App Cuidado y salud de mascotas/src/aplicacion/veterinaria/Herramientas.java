
package aplicacion.veterinaria;
import javax.swing.*;
import aplicacion.veterinaria.*;
import java.sql.*;

public abstract class Herramientas {

    //FUNCION VENTANA ERRORES
    public static void error(String mensaje, boolean estado){
        JDialog error = new javax.swing.JDialog();
        JPanel panelError = new javax.swing.JPanel();
        JLabel errorText = new javax.swing.JLabel();
        JButton cerrarAlerta = new javax.swing.JButton();
        JLabel imgError = new javax.swing.JLabel();
        
        if (!estado){
            error.setTitle("ERROR");  
            ImageIcon icon = new ImageIcon(Herramientas.class.getResource("/aplicacion/veterinaria/GUI/img/404 error lost in space-amico (Custom) (1).png"));
            imgError.setIcon(icon);
        }else{
            error.setTitle("EXITOSO");   
            ImageIcon icon = new ImageIcon(Herramientas.class.getResource("/aplicacion/veterinaria/GUI/img/icons8-comprobado-100.png"));
            imgError.setIcon(icon);
        }
        
        errorText.setText(mensaje);

        error.setBackground(new java.awt.Color(43, 43, 43));
        error.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelError.setBackground(new java.awt.Color(38, 50, 56));
        panelError.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelError.setMaximumSize(new java.awt.Dimension(400, 300));
        panelError.setMinimumSize(new java.awt.Dimension(400, 300));

        errorText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        errorText.setForeground(new java.awt.Color(207, 150, 217));
        
        cerrarAlerta.setText("CERRAR");
        cerrarAlerta.setBackground(new java.awt.Color(90, 90, 90));
        cerrarAlerta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cerrarAlerta.setForeground(new java.awt.Color(204, 204, 204));
        cerrarAlerta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cerrarAlerta.addMouseListener(new java.awt.event.MouseAdapter() {
        final JDialog errorFinal = error;
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                errorFinal.setVisible(false); // Cerrar la ventana de error
            }
        });



        javax.swing.GroupLayout panelErrorLayout = new javax.swing.GroupLayout(panelError);
        panelError.setLayout(panelErrorLayout);
        panelErrorLayout.setHorizontalGroup(
            panelErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelErrorLayout.createSequentialGroup()
                .addGroup(panelErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelErrorLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(imgError, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelErrorLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(errorText))
                    .addGroup(panelErrorLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(cerrarAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        panelErrorLayout.setVerticalGroup(
            panelErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelErrorLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(imgError, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(cerrarAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        error.getContentPane().add(panelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));
        error.revalidate();
        error.repaint();
        error.pack();
        error.setLocationRelativeTo(null);
        error.setVisible(true);
    }

    public javax.swing.JDialog error;
    public javax.swing.JLabel errorText;
    public javax.swing.JLabel imgError;
    public javax.swing.JPanel panelError;
    public javax.swing.JButton cerrarAlerta;

    
    public static int obtenerIdUsuarioPorDocumento(int documento) {
    int idUsuario = -1; // Valor predeterminado en caso de que no se encuentre un usuario

    try {
        DataBase db = new DataBase();
        Connection conn = db.getConexion();

        String selectQuery = "SELECT id_user FROM usuarios WHERE documento = ?";
        PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
        selectStatement.setInt(1, documento);

        ResultSet resultSet = selectStatement.executeQuery();

        if (resultSet.next()) {
            idUsuario = resultSet.getInt("id_user");
        }

        resultSet.close();
        selectStatement.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return idUsuario;
}
}