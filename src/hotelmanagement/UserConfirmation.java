package hotelmanagement;
import java.sql.*;
import Project.*;
import javax.swing.JOptionPane;

public class UserConfirmation extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UserConfirmation.class.getName());

    public UserConfirmation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        room_label = new javax.swing.JLabel();
        room_text = new javax.swing.JTextField();
        checkin_label = new javax.swing.JLabel();
        checkin_text = new javax.swing.JTextField();
        address_label = new javax.swing.JLabel();
        address_text = new javax.swing.JTextField();
        nic_label = new javax.swing.JLabel();
        nic_text = new javax.swing.JTextField();
        gender_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        email_text = new javax.swing.JTextField();
        age_label = new javax.swing.JLabel();
        age_text = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        name_text = new javax.swing.JTextField();
        addcustomer_btn = new javax.swing.JButton();
        gender_text1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 150, 199));

        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Confirmation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setText("Please make sure that the details entered below are correct");

        room_label.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        room_label.setText("Room Number");

        room_text.setEditable(false);

        checkin_label.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        checkin_label.setText("Check In Date");

        checkin_text.setEditable(false);

        address_label.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        address_label.setText("Address");

        address_text.setEditable(false);

        nic_label.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        nic_label.setText("NIC Number");

        nic_text.setEditable(false);

        gender_label.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        gender_label.setText("Gender");

        email_label.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        email_label.setText("Email");

        email_text.setEditable(false);

        age_label.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        age_label.setText("Age");

        age_text.setEditable(false);

        name_label.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        name_label.setText("Name");

        name_text.setEditable(false);

        addcustomer_btn.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        addcustomer_btn.setText("Verify");
        addcustomer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcustomer_btnActionPerformed(evt);
            }
        });

        gender_text1.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(room_label, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(room_text, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nic_label, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(address_text, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nic_text, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(gender_label, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(gender_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(checkin_label, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(checkin_text, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(age_label, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(age_text, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addcustomer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_label, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(gender_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nic_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nic_label, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address_label, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkin_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkin_label, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(room_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room_label, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(addcustomer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addcustomer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcustomer_btnActionPerformed
        String customerName = name_text.getText();
        String customerAge = age_text.getText();
        String customerEmail = email_text.getText();
        String customerGender = gender_text1.getText();
        String customerNIC = nic_text.getText();
        String customerAddress = address_text.getText();
        String customerCheckindate = checkin_text.getText();
        String roomNo = room_text.getText();

        try {
            ResultSet rs = Select.getData("SELECT status FROM rooms WHERE roomNo = '" + roomNo + "'");
            if (rs.next()) {
                String status = rs.getString("status");
                if (!"Not Booked".equalsIgnoreCase(status)) {
                    JOptionPane.showMessageDialog(null, "Room " + roomNo + " is already booked. Cannot assign customer.");
                    return; 
                }
            } else {
                JOptionPane.showMessageDialog(null, "Room " + roomNo + " does not exist.");
                return;
            }

            // Room is available, insert customer
            String Query = "INSERT INTO Customer VALUES ('" 
                    + customerName + "', '" 
                    + customerAge + "', '" 
                    + customerEmail + "', '" 
                    + customerGender + "', '" 
                    + customerNIC + "', '" 
                    + customerAddress + "', '" 
                    + customerCheckindate + "', '" 
                    + roomNo + "')";

            InsertUpdateDelete.setData(Query, "Successfully Inserted Customer");

            String updateStatusQuery = "UPDATE rooms SET status = 'Booked' WHERE roomNo = '" + roomNo + "'";
            InsertUpdateDelete.setData(updateStatusQuery, null);

            setVisible(false);
            new UserConfirmation().setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_addcustomer_btnActionPerformed

    public void updateDisplay(Customer customer) {
        name_text.setText(customer.getName());
        age_text.setText(String.valueOf(customer.getAge()));
        email_text.setText(customer.getEmail());
        gender_text1.setText(customer.getGender());
        nic_text.setText(customer.getNicNumber());
        address_text.setText(customer.getAddress());
        checkin_text.setText(customer.getCheckInDate());
        room_text.setText(customer.getRoomNumber());
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcustomer_btn;
    private javax.swing.JLabel address_label;
    private javax.swing.JTextField address_text;
    private javax.swing.JLabel age_label;
    private javax.swing.JTextField age_text;
    private javax.swing.JLabel checkin_label;
    private javax.swing.JTextField checkin_text;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_text;
    private javax.swing.JLabel gender_label;
    private javax.swing.JTextField gender_text1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_text;
    private javax.swing.JLabel nic_label;
    private javax.swing.JTextField nic_text;
    private javax.swing.JLabel room_label;
    private javax.swing.JTextField room_text;
    // End of variables declaration//GEN-END:variables
}
