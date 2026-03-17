/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyApp;
import MyLib.Admin;
import MyLib.EstateProperties;
import MyLib.Property;

/**
 *
 * @author pcmya
 */
public class AdminSiteMap extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminSiteMap.class.getName());
    
    private Admin loggedIn;
    private EstateProperties ep;
    
    public AdminSiteMap() {
        this(null, new EstateProperties());
    }

    public AdminSiteMap(Admin admin, EstateProperties ep) {
        initComponents();
        this.loggedIn = admin;
        this.ep = ep;
        
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));
        
        javax.swing.JPanel topPanel = new javax.swing.JPanel(new java.awt.GridLayout(2, 1));
        titleLabel.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        legend.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // smaller title
        legend.setFont(new java.awt.Font("Helvetica Neue", 0, 14));     // smaller legend
        topPanel.add(titleLabel);
        topPanel.add(legend);
        topPanel.setPreferredSize(new java.awt.Dimension(800, 100));
        
        int maxBlock = 1, maxLot = 1;
        for (Property p : ep.getProperties()) {
            if (p.getBlockLoc() > maxBlock) maxBlock = p.getBlockLoc();
            if (p.getLotLoc() > maxLot) maxLot = p.getLotLoc();
        }

        javax.swing.JPanel grid = new javax.swing.JPanel(new java.awt.GridLayout(maxBlock, maxLot, 2, 2));

        for (int block = 1; block <= maxBlock; block++) {
            for (int lot = 1; lot <= maxLot; lot++) {

                Property found = null;
                for (Property p : ep.getProperties()) {
                    if (p.getBlockLoc() == block && p.getLotLoc() == lot) {
                        found = p;
                        break;
                    }
                }

                javax.swing.JButton btn = new javax.swing.JButton("B"+block+"L"+lot);
                btn.setFont(new java.awt.Font("Arial", 0, 8));
                btn.setBorderPainted(false);
                btn.setFocusPainted(false);
                btn.setOpaque(true);

                if (found == null) {
                    btn.setBackground(java.awt.Color.GRAY);
                    btn.setEnabled(false);
                } else {
                    if (found.getStatus().equals("Available")) {
                        btn.setBackground(new java.awt.Color(0, 180, 0));
                    } else if (found.getStatus().equals("Reserved")) {
                        btn.setBackground(java.awt.Color.YELLOW);
                    } else if (found.getStatus().equals("Sold")) {
                        btn.setBackground(java.awt.Color.RED);
                    }

                    Property finalFound = found;
                    btn.addActionListener(e -> {
                        javax.swing.JOptionPane.showMessageDialog(this,
                            "Block: "  + finalFound.getBlockLoc() +
                            "\nLot: "   + finalFound.getLotLoc() +
                            "\nModel: " + finalFound.getModel().getModelName() +
                            "\nSize: "  + finalFound.getSize() + " sqm" +
                            "\nPrice: ₱" + finalFound.getPrice() +
                            "\nStatus: " + finalFound.getStatus()
                        );
                    });
                }

                grid.add(btn); // add button to grid
            }//inner for
        }//outer for
        
        javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(grid);
        scroll.setPreferredSize(new java.awt.Dimension(800, 300));
        scroll.setHorizontalScrollBarPolicy(
            javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
            javax.swing.JScrollPane.VERTICAL_SCROLLBAR_NEVER);

        javax.swing.JPanel bottomPanel = new javax.swing.JPanel();
        bottomPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 20, 0));
        returnClientDashB.setPreferredSize(new java.awt.Dimension(200, 35));
        bottomPanel.add(returnClientDashB);

        javax.swing.JPanel contentArea = new javax.swing.JPanel(new java.awt.BorderLayout(5, 5));
        contentArea.add(topPanel, java.awt.BorderLayout.NORTH);
        contentArea.add(scroll, java.awt.BorderLayout.CENTER);
        contentArea.add(bottomPanel, java.awt.BorderLayout.SOUTH);

        getContentPane().add(contentArea, java.awt.BorderLayout.CENTER);

        revalidate();
        repaint();
}////end of constructor

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        legend = new javax.swing.JLabel();
        gridPanel = new javax.swing.JPanel();
        returnClientDashB = new javax.swing.JButton();
        navbar = new javax.swing.JPanel();
        dashboardButton = new javax.swing.JButton();
        sitemapButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        logoimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 54)); // NOI18N
        titleLabel.setText("Site Map");

        legend.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        legend.setText("Legend: 🟢 Available  🟡 Reserved  🔴 Sold");

        gridPanel.setLayout(new java.awt.GridLayout(20, 5));

        returnClientDashB.setText("<- Return to dashboard");
        returnClientDashB.addActionListener(this::returnClientDashBActionPerformed);

        navbar.setBackground(new java.awt.Color(153, 153, 153));

        dashboardButton.setBackground(new java.awt.Color(153, 153, 153));
        dashboardButton.setFont(new java.awt.Font("Mukta Malar", 0, 18)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(0, 0, 0));
        dashboardButton.setText("Dashboard");
        dashboardButton.setBorder(null);
        dashboardButton.addActionListener(this::dashboardButtonActionPerformed);

        sitemapButton.setBackground(new java.awt.Color(153, 153, 153));
        sitemapButton.setFont(new java.awt.Font("Mukta Malar", 0, 18)); // NOI18N
        sitemapButton.setForeground(new java.awt.Color(0, 0, 0));
        sitemapButton.setText("Site map");
        sitemapButton.setBorder(null);
        sitemapButton.addActionListener(this::sitemapButtonActionPerformed);

        logoutButton.setBackground(new java.awt.Color(153, 153, 153));
        logoutButton.setFont(new java.awt.Font("Mukta Malar", 0, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 0, 0));
        logoutButton.setText("Log out");
        logoutButton.setBorder(null);
        logoutButton.addActionListener(this::logoutButtonActionPerformed);

        logoimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyApp/images/logoimgsmall.png"))); // NOI18N
        logoimage.setText("jLabel2");

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sitemapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logoimage, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(logoimage, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(dashboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sitemapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnClientDashB)
                    .addComponent(gridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel)
                    .addComponent(legend, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(legend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnClientDashB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 1025, 787);
    }// </editor-fold>//GEN-END:initComponents

    private void returnClientDashBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnClientDashBActionPerformed
        new AdminDashboard(loggedIn).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnClientDashBActionPerformed

    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
        new AdminDashboard(loggedIn).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardButtonActionPerformed

    private void sitemapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sitemapButtonActionPerformed
        new AdminSiteMap(loggedIn, ep).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sitemapButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new AdminSiteMap().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboardButton;
    private javax.swing.JPanel gridPanel;
    private javax.swing.JLabel legend;
    private javax.swing.JLabel logoimage;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel navbar;
    private javax.swing.JButton returnClientDashB;
    private javax.swing.JButton sitemapButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
