package aplicacion.veterinaria.GUI;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.plaf.metal.MetalTabbedPaneUI;

public class VentanaPrincipal extends javax.swing.JFrame {

    private JButton pastButton;

    public VentanaPrincipal() {
        initComponents();
        pastButton = mainButton;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setResizable(false);
        nav = new javax.swing.JPanel();
        mainButton = new javax.swing.JButton();
        mascotasButton = new javax.swing.JButton();
        activityButton = new javax.swing.JButton();
        registroCliniButton = new javax.swing.JButton();
        dietasButton = new javax.swing.JButton();
        topNav = new javax.swing.JPanel();
        navLogo = new javax.swing.JLabel();
        currentUser = new javax.swing.JLabel();
        relleno = new javax.swing.JPanel();
        contenido = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mascotasPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        actividadesPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        registroClinicoPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dietasPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        relleno2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(43, 43, 43));
        nav.setForeground(new java.awt.Color(210, 210, 210));
        nav.setMinimumSize(new java.awt.Dimension(186, 496));
        nav.setPreferredSize(new java.awt.Dimension(186, 496));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainButton.setBackground(new java.awt.Color(130, 130, 130));
        mainButton.setForeground(new java.awt.Color(210, 210, 210));
        mainButton.setText("Inicio");
        mainButton.setBorder(null);
        mainButton.setBorderPainted(false);
        mainButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainButton.setFocusable(false);
        mainButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainButton.setName(""); // NOI18N
        mainButton.setOpaque(true);
        mainButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainButtonMouseExited(evt);
            }
        });
        nav.add(mainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 41));

        mascotasButton.setBackground(new java.awt.Color(90, 90, 90));
        mascotasButton.setForeground(new java.awt.Color(210, 210, 210));
        mascotasButton.setText("Mascotas");
        mascotasButton.setBorder(null);
        mascotasButton.setBorderPainted(false);
        mascotasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mascotasButton.setFocusable(false);
        mascotasButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mascotasButton.setMaximumSize(new java.awt.Dimension(179, 41));
        mascotasButton.setMinimumSize(new java.awt.Dimension(179, 41));
        mascotasButton.setName(""); // NOI18N
        mascotasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mascotasButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mascotasButtonMouseExited(evt);
            }
        });
        mascotasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotasButtonActionPerformed(evt);
            }
        });
        nav.add(mascotasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 41));

        activityButton.setBackground(new java.awt.Color(90, 90, 90));
        activityButton.setForeground(new java.awt.Color(210, 210, 210));
        activityButton.setText("Actividades");
        activityButton.setBorder(null);
        activityButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        activityButton.setFocusable(false);
        activityButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        activityButton.setMaximumSize(new java.awt.Dimension(179, 41));
        activityButton.setMinimumSize(new java.awt.Dimension(179, 41));
        activityButton.setName(""); // NOI18N
        activityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                activityButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                activityButtonMouseExited(evt);
            }
        });
        activityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityButtonActionPerformed(evt);
            }
        });
        nav.add(activityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 190, 41));

        registroCliniButton.setBackground(new java.awt.Color(90, 90, 90));
        registroCliniButton.setForeground(new java.awt.Color(210, 210, 210));
        registroCliniButton.setText("Registro clinico");
        registroCliniButton.setBorder(null);
        registroCliniButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registroCliniButton.setFocusable(false);
        registroCliniButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registroCliniButton.setMaximumSize(new java.awt.Dimension(179, 41));
        registroCliniButton.setMinimumSize(new java.awt.Dimension(179, 41));
        registroCliniButton.setName(""); // NOI18N
        registroCliniButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registroCliniButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registroCliniButtonMouseExited(evt);
            }
        });
        registroCliniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroCliniButtonActionPerformed(evt);
            }
        });
        nav.add(registroCliniButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, 41));

        dietasButton.setBackground(new java.awt.Color(90, 90, 90));
        dietasButton.setForeground(new java.awt.Color(210, 210, 210));
        dietasButton.setText("Dietas");
        dietasButton.setBorder(null);
        dietasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dietasButton.setFocusable(false);
        dietasButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dietasButton.setMaximumSize(new java.awt.Dimension(179, 41));
        dietasButton.setMinimumSize(new java.awt.Dimension(179, 41));
        dietasButton.setName(""); // NOI18N
        dietasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dietasButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dietasButtonMouseExited(evt);
            }
        });
        dietasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietasButtonActionPerformed(evt);
            }
        });
        nav.add(dietasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 41));

        getContentPane().add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, -1, -1));

        topNav.setBackground(new java.awt.Color(43, 43, 43));

        navLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/LogoNav.png"))); // NOI18N

        currentUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        currentUser.setForeground(new java.awt.Color(210, 210, 210));
        currentUser.setText("Usuario:");

        javax.swing.GroupLayout topNavLayout = new javax.swing.GroupLayout(topNav);
        topNav.setLayout(topNavLayout);
        topNavLayout.setHorizontalGroup(
            topNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topNavLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(navLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currentUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topNavLayout.setVerticalGroup(
            topNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topNavLayout.createSequentialGroup()
                .addGroup(topNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topNavLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(currentUser))
                    .addGroup(topNavLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(navLogo)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(topNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1001, -1));

        relleno.setBackground(java.awt.Color.darkGray);

        javax.swing.GroupLayout rellenoLayout = new javax.swing.GroupLayout(relleno);
        relleno.setLayout(rellenoLayout);
        rellenoLayout.setHorizontalGroup(
            rellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rellenoLayout.setVerticalGroup(
            rellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        getContentPane().add(relleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1001, 112));

        contenido.setUI(new BasicTabbedPaneUI() {
            @Override
            protected void installDefaults() {
                super.installDefaults();
                highlight = new Color(43, 43, 43);
                lightHighlight = new Color(43, 43, 43);
                shadow = new Color(43, 43, 43);
                darkShadow = new Color(43, 43, 43);
                focus = new Color(43, 43, 43);
            }
        });
        contenido.setBackground(new java.awt.Color(43, 43, 43));
        contenido.setForeground(new java.awt.Color(210, 210, 210));

        homePanel.setBackground(new java.awt.Color(43, 43, 43));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(210, 210, 210));
        jLabel1.setText("hola");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(483, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );

        contenido.addTab("tab1", homePanel);

        mascotasPanel.setBackground(new java.awt.Color(43, 43, 43));

        jLabel2.setForeground(new java.awt.Color(210, 210, 210));
        jLabel2.setText("mascotas");

        javax.swing.GroupLayout mascotasPanelLayout = new javax.swing.GroupLayout(mascotasPanel);
        mascotasPanel.setLayout(mascotasPanelLayout);
        mascotasPanelLayout.setHorizontalGroup(
            mascotasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mascotasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(752, Short.MAX_VALUE))
        );
        mascotasPanelLayout.setVerticalGroup(
            mascotasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mascotasPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(473, Short.MAX_VALUE))
        );

        contenido.addTab("tab2", mascotasPanel);

        actividadesPanel.setBackground(new java.awt.Color(43, 43, 43));

        jLabel3.setForeground(new java.awt.Color(210, 210, 210));
        jLabel3.setText("actividades");

        javax.swing.GroupLayout actividadesPanelLayout = new javax.swing.GroupLayout(actividadesPanel);
        actividadesPanel.setLayout(actividadesPanelLayout);
        actividadesPanelLayout.setHorizontalGroup(
            actividadesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actividadesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(743, Short.MAX_VALUE))
        );
        actividadesPanelLayout.setVerticalGroup(
            actividadesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actividadesPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(475, Short.MAX_VALUE))
        );

        contenido.addTab("tab3", actividadesPanel);

        registroClinicoPanel.setBackground(new java.awt.Color(43, 43, 43));

        jLabel4.setForeground(new java.awt.Color(210, 210, 210));
        jLabel4.setText("registro clinico");

        javax.swing.GroupLayout registroClinicoPanelLayout = new javax.swing.GroupLayout(registroClinicoPanel);
        registroClinicoPanel.setLayout(registroClinicoPanelLayout);
        registroClinicoPanelLayout.setHorizontalGroup(
            registroClinicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroClinicoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(724, Short.MAX_VALUE))
        );
        registroClinicoPanelLayout.setVerticalGroup(
            registroClinicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroClinicoPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addContainerGap(472, Short.MAX_VALUE))
        );

        contenido.addTab("tab4", registroClinicoPanel);

        dietasPanel.setBackground(new java.awt.Color(43, 43, 43));

        jLabel5.setForeground(new java.awt.Color(210, 210, 210));
        jLabel5.setText("dietas");

        javax.swing.GroupLayout dietasPanelLayout = new javax.swing.GroupLayout(dietasPanel);
        dietasPanel.setLayout(dietasPanelLayout);
        dietasPanelLayout.setHorizontalGroup(
            dietasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dietasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(771, Short.MAX_VALUE))
        );
        dietasPanelLayout.setVerticalGroup(
            dietasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dietasPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addContainerGap(472, Short.MAX_VALUE))
        );

        contenido.addTab("tab5", dietasPanel);

        getContentPane().add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 68, 808, 540));
        contenido.getAccessibleContext().setAccessibleName("");

        relleno2.setBackground(java.awt.Color.darkGray);

        javax.swing.GroupLayout relleno2Layout = new javax.swing.GroupLayout(relleno2);
        relleno2.setLayout(relleno2Layout);
        relleno2Layout.setHorizontalGroup(
            relleno2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1001, Short.MAX_VALUE)
        );
        relleno2Layout.setVerticalGroup(
            relleno2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        getContentPane().add(relleno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1001, 498));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mascotasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotasButtonActionPerformed
        System.out.println("Boton mascotas");
        contenido.setSelectedIndex(1);
        mascotasButton.setBackground(new java.awt.Color(130, 130, 130));
        if (pastButton!=mascotasButton)
            pastButton.setBackground(new java.awt.Color(90, 90, 90));
        
        pastButton = mascotasButton;
    }//GEN-LAST:event_mascotasButtonActionPerformed

    private void mainButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainButtonMouseClicked
        System.out.println("Boton main");
        contenido.setSelectedIndex(0);
        mainButton.setBackground(new java.awt.Color(130, 130, 130));
        if (pastButton!=mainButton)
            pastButton.setBackground(new java.awt.Color(90, 90, 90));
        pastButton = mainButton;
    }//GEN-LAST:event_mainButtonMouseClicked

    private void activityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityButtonActionPerformed
        System.out.println("Boton actividades");
        contenido.setSelectedIndex(2);
        activityButton.setBackground(new java.awt.Color(130, 130, 130));
        if (pastButton!=activityButton)
            pastButton.setBackground(new java.awt.Color(90, 90, 90));
        
        pastButton = activityButton;
    }//GEN-LAST:event_activityButtonActionPerformed

    private void registroCliniButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroCliniButtonActionPerformed
        System.out.println("Boton registro clinico");
        contenido.setSelectedIndex(3);
        registroCliniButton.setBackground(new java.awt.Color(130, 130, 130));
        if (pastButton!=registroCliniButton)
            pastButton.setBackground(new java.awt.Color(90, 90, 90));
        
        pastButton = registroCliniButton;
    }//GEN-LAST:event_registroCliniButtonActionPerformed

    private void dietasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietasButtonActionPerformed
        System.out.println("Boton dietas");
        contenido.setSelectedIndex(4);
        dietasButton.setBackground(new java.awt.Color(130, 130, 130));
        if (pastButton!=dietasButton)
            pastButton.setBackground(new java.awt.Color(90, 90, 90));
        
        pastButton = dietasButton;
    }//GEN-LAST:event_dietasButtonActionPerformed

    private void mainButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainButtonMouseEntered
        mainButton.setBackground(new java.awt.Color(130, 130, 130));
    }//GEN-LAST:event_mainButtonMouseEntered

    private void mainButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainButtonMouseExited
        if (pastButton!=mainButton)
            mainButton.setBackground(new java.awt.Color(90, 90, 90));
    }//GEN-LAST:event_mainButtonMouseExited

    private void mascotasButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mascotasButtonMouseEntered
        mascotasButton.setBackground(new java.awt.Color(130, 130, 130));
    }//GEN-LAST:event_mascotasButtonMouseEntered

    private void mascotasButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mascotasButtonMouseExited
        if (pastButton!=mascotasButton)
            mascotasButton.setBackground(new java.awt.Color(90, 90, 90));
    }//GEN-LAST:event_mascotasButtonMouseExited

    private void activityButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activityButtonMouseEntered
        activityButton.setBackground(new java.awt.Color(130, 130, 130));
    }//GEN-LAST:event_activityButtonMouseEntered

    private void activityButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activityButtonMouseExited
        if (pastButton!=activityButton)
            activityButton.setBackground(new java.awt.Color(90, 90, 90));
    }//GEN-LAST:event_activityButtonMouseExited

    private void registroCliniButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroCliniButtonMouseEntered
        registroCliniButton.setBackground(new java.awt.Color(130, 130, 130));
    }//GEN-LAST:event_registroCliniButtonMouseEntered

    private void registroCliniButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroCliniButtonMouseExited
        if (pastButton!=registroCliniButton)
            registroCliniButton.setBackground(new java.awt.Color(90, 90, 90));
    }//GEN-LAST:event_registroCliniButtonMouseExited

    private void dietasButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dietasButtonMouseEntered
        dietasButton.setBackground(new java.awt.Color(130, 130, 130));
    }//GEN-LAST:event_dietasButtonMouseEntered

    private void dietasButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dietasButtonMouseExited
        if (pastButton!=dietasButton)
            dietasButton.setBackground(new java.awt.Color(90, 90, 90));
    }//GEN-LAST:event_dietasButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actividadesPanel;
    private javax.swing.JButton activityButton;
    private javax.swing.JTabbedPane contenido;
    private javax.swing.JLabel currentUser;
    private javax.swing.JButton dietasButton;
    private javax.swing.JPanel dietasPanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton mascotasButton;
    private javax.swing.JPanel mascotasPanel;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel navLogo;
    private javax.swing.JButton registroCliniButton;
    private javax.swing.JPanel registroClinicoPanel;
    private javax.swing.JPanel relleno;
    private javax.swing.JPanel relleno2;
    private javax.swing.JPanel topNav;
    // End of variables declaration//GEN-END:variables
}
