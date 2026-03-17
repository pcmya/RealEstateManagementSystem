/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyApp;
import MyLib.Client;
import MyLib.EstateProperties;
import MyLib.Property;

/**
 *
 * @author pcmya
 */
public class ClientSiteMap extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ClientSiteMap.class.getName());
    
    private Client loggedIn;
    private EstateProperties ep;
    
    public ClientSiteMap() {
    this(null, new EstateProperties());
    }

    public ClientSiteMap(Client client, EstateProperties ep) {
        initComponents();
        this.loggedIn = client;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 54)); // NOI18N
        titleLabel.setText("Site Map");

        legend.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        legend.setText("Legend: 🟢 Available  🟡 Reserved  🔴 Sold");

        gridPanel.setLayout(new java.awt.GridLayout(20, 5));

        returnClientDashB.setText("<- Return to dashboard");
        returnClientDashB.addActionListener(this::returnClientDashBActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(gridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel)
                            .addComponent(legend, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnClientDashB))))
                .addContainerGap(806, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(legend)
                .addGap(44, 44, 44)
                .addComponent(gridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnClientDashB)
                .addContainerGap(596, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1355, 821);
    }// </editor-fold>//GEN-END:initComponents

    private void returnClientDashBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnClientDashBActionPerformed
        new ClientDashboard(loggedIn).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnClientDashBActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new ClientSiteMap().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gridPanel;
    private javax.swing.JLabel legend;
    private javax.swing.JButton returnClientDashB;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
