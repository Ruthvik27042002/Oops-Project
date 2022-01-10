import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
    
    Register R = new Register();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login_backButton = new javax.swing.JButton();
        login_button = new javax.swing.JButton();
        login_password = new javax.swing.JPasswordField();
        login_user_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Login_Choose = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("Password");

        login_backButton.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        login_backButton.setForeground(new java.awt.Color(153, 51, 0));
        login_backButton.setText("Back");
        login_backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_backButtonActionPerformed(evt);
            }
        });

        login_button.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        login_button.setForeground(new java.awt.Color(153, 51, 0));
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        login_user_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_user_nameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setText("Login Type");

        Login_Choose.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Login_Choose.setForeground(new java.awt.Color(153, 51, 0));
        Login_Choose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin" }));
        Login_Choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ChooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(login_button)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(login_password)
                                    .addComponent(login_user_name)
                                    .addComponent(Login_Choose, 0, 107, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(login_backButton)
                                .addGap(78, 78, 78))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(login_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Login_Choose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(login_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_button)
                    .addComponent(login_backButton))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        String s1 = login_user_name.getText();
        String s2 = login_password.getText();
        int count =0;
 
        
        if (s1.equals(""))
            JOptionPane.showMessageDialog(this,"Enter a username.");
        else if (s2.equals(""))
            JOptionPane.showMessageDialog(this,"Enter a password.");
        else if(Login_Choose.getSelectedIndex() == 1){
            
                if(s1.contains("Ruthvik"))
                {
                    if(s2.contains("Password"))
                    {
                        JOptionPane.showMessageDialog(this,"You have successfully logged in to Online Movie Ticket booking!!");  
                        new Admin().setVisible(true);
                        dispose();
                        count = 1;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Invalid Login Password");
                        count = 1;
                    }
                }
            
            if(count == 0)
                JOptionPane.showMessageDialog(this,"Invalid Login Credentials");
        }
        else {
//            try {
//                Connection con = MySQLConnections.getCon();
//                Statement stmt = (Statement)con.createStatement();
//                ResultSet rs = stmt.executeQuery("select * from userid where userid ='"+s1+"'");
//
//                if(rs.next());
//                {
//                String a1 = rs.getString(1);
//                String a2 = rs.getString(2);    
//
//                    if (a1.equals(s1) && a2.equals(s2))
//                    {
//                        JOptionPane.showMessageDialog(this,"You have successfully logged in to SeeItNow!");  
//                        new Selection().setVisible(true);
//                        dispose();
//                    }
//                    else
//                        JOptionPane.showMessageDialog(this,"Invalid Login Credentials");  
//                }
//}
//catch (Exception e)
//{
//    JOptionPane.showMessageDialog(this,e.getMessage());
//}
            for(int i = 0; i<R.User_Name.size();i++)
            {
                if(R.User_Name.get(i).contains(s1))
                {
                    if(R.User_Password.get(i).contains(s2))
                    {
                        JOptionPane.showMessageDialog(this,"You have successfully logged in to Online Movie Ticket booking!!");  
                        new Selection().setVisible(true);
                        dispose();
                        count = 1;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Invalid Login Password");
                        count = 1;
                    }
                }
            }
            if(count == 0)
                JOptionPane.showMessageDialog(this,"Invalid Login Credentials");
        }

        
    }//GEN-LAST:event_login_buttonActionPerformed

    private void login_user_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_user_nameActionPerformed
        
    }//GEN-LAST:event_login_user_nameActionPerformed

    private void login_backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_backButtonActionPerformed
       
        new Welcome().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_login_backButtonActionPerformed

    private void Login_ChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ChooseActionPerformed
        
    }//GEN-LAST:event_Login_ChooseActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Login_Choose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_backButton;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField login_password;
    private javax.swing.JTextField login_user_name;
    // End of variables declaration//GEN-END:variables
}
