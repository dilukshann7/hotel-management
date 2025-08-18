package hotelmanagement;

import java.awt.CardLayout;
import java.awt.LayoutManager;

    public class Homepage extends javax.swing.JFrame {
        private CardLayout cardLayout;

        private CustomerCheckinPanel customerCheckinPanel;
        private CustomerCheckoutPanel customerCheckoutPanel;
        private ManageRoomsPanel manageRoomsPanel;
        private ManagementPanel managementPanel;

        private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Homepage.class.getName());

        public Homepage() {
        initComponents();
        cardLayout = new CardLayout();
        jPanel3.setLayout(cardLayout);

        // Shared objects
        Customer customer = new Customer();
        UserConfirmation userConfirmation = new UserConfirmation();
        userConfirmation.setVisible(true);

        // Pass shared objects to the check-in panel
        customerCheckinPanel = new CustomerCheckinPanel(customer, userConfirmation);

        // Other panels can stay the same
        customerCheckoutPanel = new CustomerCheckoutPanel();
        manageRoomsPanel = new ManageRoomsPanel();
        managementPanel = new ManagementPanel();

        // Add panels to CardLayout
        jPanel3.add(customerCheckinPanel, "customerin");
        jPanel3.add(customerCheckoutPanel, "customerout");
        jPanel3.add(manageRoomsPanel, "managerooms");
        jPanel3.add(managementPanel, "management");

        // Button actions
        customerin_btn.addActionListener(e -> cardLayout.show(jPanel3, "customerin"));
        customerout_btn.addActionListener(e -> cardLayout.show(jPanel3, "customerout"));
        managerooms_btn.addActionListener(e -> cardLayout.show(jPanel3, "managerooms"));
        overview_btn.addActionListener(e -> cardLayout.show(jPanel3, "management"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        welcome_text = new javax.swing.JLabel();
        managerooms_btn = new javax.swing.JButton();
        customerin_btn = new javax.swing.JButton();
        customerout_btn = new javax.swing.JButton();
        overview_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 150, 199));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(2, 62, 138)));
        jPanel1.setFocusCycleRoot(true);

        welcome_text.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        welcome_text.setForeground(new java.awt.Color(255, 255, 255));
        welcome_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome_text.setText("Welcome, User!");

        managerooms_btn.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        managerooms_btn.setText("Manage Rooms");
        managerooms_btn.setMaximumSize(new java.awt.Dimension(230, 35));
        managerooms_btn.setMinimumSize(new java.awt.Dimension(230, 35));
        managerooms_btn.setPreferredSize(new java.awt.Dimension(230, 35));

        customerin_btn.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        customerin_btn.setText("Customer Check-In");
        customerin_btn.setMaximumSize(new java.awt.Dimension(230, 35));
        customerin_btn.setMinimumSize(new java.awt.Dimension(230, 35));
        customerin_btn.setPreferredSize(new java.awt.Dimension(230, 35));
        customerin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerin_btnActionPerformed(evt);
            }
        });

        customerout_btn.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        customerout_btn.setText("Customer Check-Out");

        overview_btn.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        overview_btn.setText("Overview");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcome_text, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(managerooms_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerin_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerout_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(overview_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(welcome_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(managerooms_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customerin_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customerout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(overview_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        title.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Hotel Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(title))
        );

        jPanel3.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerin_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerin_btnActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Homepage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customerin_btn;
    private javax.swing.JButton customerout_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton managerooms_btn;
    private javax.swing.JButton overview_btn;
    private javax.swing.JLabel title;
    private javax.swing.JLabel welcome_text;
    // End of variables declaration//GEN-END:variables
}
