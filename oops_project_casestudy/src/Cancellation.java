
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Cancellation extends javax.swing.JFrame {

    
    public Cancellation() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cancellation");

        jButton1.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 51, 0));
        jButton1.setText("Confirm Cancellation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Leelawadee", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Enter name for Cancellation");

        jLabel2.setFont(new java.awt.Font("Leelawadee", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Cancellation");

        jButton2.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 51, 0));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String a1 = jTextField1.getText();
int count =0;

//try
//{
//    Class.forName("java.sql.DriverManager");
//    Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/mov_book","root","");
//    Statement stmt = (Statement)con.createStatement();
//    stmt.executeUpdate("delete from movie_b where name = '"+a1+"'");
//    JOptionPane.showMessageDialog(this,"Your movie tickets have been cancelled.");
//}
//catch (Exception e)
//{
//    JOptionPane.showMessageDialog(this,e.getMessage());
//}
    
    for(int i =0;i<Booking.Booking_Name.size();i++)
    {
        if(Booking.Booking_Name.get(i).equals(a1))
        {
//        Integer[] update = (Integer[])Booking.Booking_movie_seats.get(i);
//        int l = update[20];
//        Integer[] update1 = Admin.Movie_seats.get(l);
//        for(int j =0;j<20;j++)
//        {
//            if(update[j]==1)
//                update1[j]=0;
//        }
//        Admin.Movie_seats.remove(l);
//        Admin.Movie_seats.add(l, update1);
            Booking.Booking_movie_seats.remove(i);
            Booking.Booking_Name.remove(i);
            count = 1;
            dispose();
            new Thanks().setVisible(true);
            break;
        }
    }

//    if(Booking.Booking_Name.contains(a1))
//    {
//        
//        int i = Booking.Booking_Name.indexOf(a1);
//        Integer[] update = new Integer[21];
//        Integer[] update1 = new Integer[20];
//        update = Booking.Booking_movie_seats.get(i);
//        int l = update[20];
//        update1 = Admin.Movie_seats.get(l);
//        for(int j =0;j<20;j++)
//        {
//            if(update[j]==1)
//                update1[j]=0;
//        }
//        Admin.Movie_seats.remove(l);
//        Admin.Movie_seats.add(l, update1);
//        Booking.Booking_movie_seats.remove(i);
//        Booking.Booking_Name.remove(a1);
//        dispose();
//        new Thanks().setVisible(true);
//    }
    if(count ==0)
    {
        JOptionPane.showMessageDialog(this,"Booking Name doesnot exists");
    }

    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();
new Selection().setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancellation().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
