
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Booking extends javax.swing.JFrame {

    Admin A = new Admin();
    public static String Name;
    String s1,s2,s5,s6;
    String s4 = "";
    int count=1;
    public static int amount;
    public static Integer[] seat = new Integer[20];
    public static Integer[] seat1 = new Integer[21];
    
    
    public static ArrayList<String> Booking_Name = new ArrayList<String>();
    public static ArrayList<Integer[]> Booking_movie_seats = new ArrayList<Integer[]>(); 
    public static int a;
    
    public Booking() {
        initComponents();
        amount = 0;
        for(int i= 0; i<A.Movie_Name.size();i++){
            String addMovies = A.Movie_Name.get(i);
            booking_movie_name.addItem(addMovies);
            seat = (Integer[])A.Movie_seats.get(i);          
            a = i;
            seat1[20] = a;
        }
//        for(int i=0;i<20;i++)
//        {
//            seat[i] = 0;
//        }
        if(Booking.seat[0]==1)
            jSeat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[1]==1)
            jSeat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[2]==1)
            jSeat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[3]==1)
            jSeat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[4]==1)
            jSeat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[5]==1)
            jSeat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[6]==1)
            jSeat6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[7]==1)
            jSeat7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[8]==1)
            jSeat8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[9]==1)
            jSeat9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[10]==1)
            jSeat10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[10]==1)
            jSeat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[11]==1)
            jSeat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[12]==1)
            jSeat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[13]==1)
            jSeat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[14]==1)
            jSeat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[15]==1)
            jSeat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[16]==1)
            jSeat6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[17]==1)
            jSeat7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[18]==1)
            jSeat8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[19]==1)
            jSeat9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        booking_name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        booking_city = new javax.swing.JComboBox();
        booking_movie_name = new javax.swing.JComboBox();
        booking_noof_seats = new javax.swing.JComboBox();
        booking_modeofPayment = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        booking_estimate_cost = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        seats = new javax.swing.JLabel();
        jSeat1 = new javax.swing.JLabel();
        jSeat2 = new javax.swing.JLabel();
        jSeat3 = new javax.swing.JLabel();
        jSeat4 = new javax.swing.JLabel();
        jSeat5 = new javax.swing.JLabel();
        jSeat6 = new javax.swing.JLabel();
        jSeat7 = new javax.swing.JLabel();
        jSeat8 = new javax.swing.JLabel();
        jSeat9 = new javax.swing.JLabel();
        jSeat10 = new javax.swing.JLabel();
        jSeat11 = new javax.swing.JLabel();
        jSeat12 = new javax.swing.JLabel();
        jSeat13 = new javax.swing.JLabel();
        jSeat14 = new javax.swing.JLabel();
        jSeat15 = new javax.swing.JLabel();
        jSeat16 = new javax.swing.JLabel();
        jSeat17 = new javax.swing.JLabel();
        jSeat18 = new javax.swing.JLabel();
        jSeat19 = new javax.swing.JLabel();
        jSeat20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        booking_movie_name.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booking");
        setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Booking");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("Name");

        jLabel5.setFont(new java.awt.Font("Leelawadee", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Movie Name");

        jLabel6.setFont(new java.awt.Font("Leelawadee", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setText("Number of Seats");

        jLabel7.setFont(new java.awt.Font("Leelawadee", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("Date of Booking");

        jLabel8.setFont(new java.awt.Font("Leelawadee", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("Mode of Payment");

        booking_name.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 51, 0));
        jButton1.setText("Confirm Booking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Leelawadee", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setText("City");

        booking_city.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        booking_city.setForeground(new java.awt.Color(153, 51, 0));
        booking_city.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delhi", "Mumbai", "Kolkata", "Chennai", "Bangalore", "Hyderabad", "Pune" }));
        booking_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_cityActionPerformed(evt);
            }
        });

        booking_movie_name.setVisible(true);
        booking_movie_name.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        booking_movie_name.setForeground(new java.awt.Color(153, 51, 0));
        booking_movie_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booking_movie_nameMouseClicked(evt);
            }
        });
        booking_movie_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_movie_nameActionPerformed(evt);
            }
        });

        booking_noof_seats.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        booking_noof_seats.setForeground(new java.awt.Color(153, 51, 0));
        booking_noof_seats.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "" }));
        booking_noof_seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_noof_seatsActionPerformed(evt);
            }
        });

        booking_modeofPayment.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        booking_modeofPayment.setForeground(new java.awt.Color(153, 51, 0));
        booking_modeofPayment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Credit Card", "Net Banking", "UPI" }));
        booking_modeofPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_modeofPaymentActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 51, 0));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        booking_estimate_cost.setEditable(false);
        booking_estimate_cost.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        booking_estimate_cost.setText("0");
        booking_estimate_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_estimate_costActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 51, 0));
        jButton3.setText("Estimate Cost");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        seats.setFont(new java.awt.Font("Leelawadee", 3, 14)); // NOI18N
        seats.setForeground(new java.awt.Color(51, 153, 0));
        seats.setText("Seats");

        jSeat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat1(evt);
            }
        });

        jSeat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat2(evt);
            }
        });

        jSeat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat3(evt);
            }
        });

        jSeat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat4(evt);
            }
        });

        jSeat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat5(evt);
            }
        });

        jSeat6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat6(evt);
            }
        });

        jSeat7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat7(evt);
            }
        });

        jSeat8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat8(evt);
            }
        });

        jSeat9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat9(evt);
            }
        });

        jSeat10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat10(evt);
            }
        });

        jSeat11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat11(evt);
            }
        });

        jSeat12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat12(evt);
            }
        });

        jSeat13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat13(evt);
            }
        });

        jSeat14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat14(evt);
            }
        });

        jSeat15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat15(evt);
            }
        });

        jSeat16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat16(evt);
            }
        });

        jSeat17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat17(evt);
            }
        });

        jSeat18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat18(evt);
            }
        });

        jSeat19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat19(evt);
            }
        });

        jSeat20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gray.png"))); // NOI18N
        jSeat20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat20(evt);
            }
        });

        jLabel13.setText("1");

        jLabel14.setText("2");

        jLabel15.setText("3");

        jLabel16.setText("4");

        jLabel17.setText("5");

        jLabel18.setText("A");

        jLabel19.setText("B");

        jLabel20.setText("C");

        jLabel22.setText("D");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seats, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeat1)
                                .addGap(18, 18, 18)
                                .addComponent(jSeat2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(jSeat6)
                                    .addGap(11, 11, 11)
                                    .addComponent(jSeat7)
                                    .addGap(5, 5, 5))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeat16)
                                        .addComponent(jSeat11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeat12)
                                        .addComponent(jSeat17)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeat13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeat14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeat15)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSeat3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeat4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeat5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSeat8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeat9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeat10)))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jSeat18)
                                .addGap(13, 13, 13)
                                .addComponent(jSeat19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeat20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel14)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel15)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel16)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(booking_estimate_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(booking_noof_seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)))
                                .addGap(71, 71, 71))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(124, 124, 124)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(booking_name, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(booking_movie_name, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(booking_city, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(142, 142, 142)
                                .addComponent(jButton2))
                            .addComponent(booking_modeofPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(238, 238, 238))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel3)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(booking_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booking_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(booking_movie_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(booking_noof_seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(booking_estimate_cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seats)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeat1)
                                    .addComponent(jSeat2)
                                    .addComponent(jSeat3)
                                    .addComponent(jSeat4)
                                    .addComponent(jSeat5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeat7)
                                    .addComponent(jSeat6)
                                    .addComponent(jSeat8)
                                    .addComponent(jSeat9)
                                    .addComponent(jSeat10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeat12)
                                    .addComponent(jSeat11)
                                    .addComponent(jSeat13)
                                    .addComponent(jSeat14)
                                    .addComponent(jSeat15))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jSeat16))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jSeat17))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSeat18)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSeat19, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeat20, javax.swing.GroupLayout.Alignment.LEADING)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel19)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel20)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel22)))
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booking_modeofPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        
        
        int n1 = (Integer)booking_noof_seats.getSelectedIndex();
        n1=n1+1;
        
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            s6 = dateFormat.format(jDateChooser1.getDate());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Date Selected");
        }
        
        s1 = booking_name.getText();
        
        Name = s1;
        
        s2 = (String)booking_city.getSelectedItem();
        
        try {
            s4 = (String) booking_movie_name.getSelectedItem();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Sorry No Movie Exists ):");
        }
        
        s5 = (String)booking_modeofPayment.getSelectedItem(); 

        
        int n2 = Integer.parseInt(booking_estimate_cost.getText());

        if (s1.equals(""))
            JOptionPane.showMessageDialog(this,"Enter a name.");
        else if (s6 == null)
            JOptionPane.showMessageDialog(this,"Enter the date of booking.");
        else if (s6.equals(""))
            JOptionPane.showMessageDialog(this,"Enter the date of booking.");
        else if (s4 == null)
            JOptionPane.showMessageDialog(this,"Sorry No Movie Exists ):");
        else if (s4.equals(""))
            JOptionPane.showMessageDialog(this,"Select the language you wish to see the movie in.");
        else if (n2 == 0)
            JOptionPane.showMessageDialog(this,"Please view the estimated cost of your program.");
        else if (s4.equals(""))
            JOptionPane.showMessageDialog(this,"Enter the Movie Name.");
        else
        {
//        try
//        {
//
//            Connection con = MySQLConnections.getCon();
//            Statement stmt = (Statement)con.createStatement();
//            stmt.executeUpdate("insert into movie_b values('"+s1+"','"+s6+"','"+s2+"','"+s4+"','"+n1+"','"+s5+"','"+n2+"')");
//            JOptionPane.showMessageDialog(this,"Your movie seats have been reserved.");
//
//                if (s5.equals("Credit Card"))
//                {
//                JOptionPane.showMessageDialog(this,"Credit Card payment to be made at Movie Counter");
//                }
//                if (s5.equals("Debit Card"))
//                {
//                JOptionPane.showMessageDialog(this,"Debit Card payment to be made at Movie Counter");
//                }
//                dispose();
//                new Thanks().setVisible(true);
//        }
//        catch (Exception e)
//        {
//            JOptionPane.showMessageDialog(this,e.getMessage());
//        }
            if (s5.equals("Credit Card"))
                {
                JOptionPane.showMessageDialog(this,"Credit Card payment to be made at Movie Counter");
                dispose();
                new Credit_card().setVisible(true);
                }
                if (s5.equals("Net Banking"))
                {
                JOptionPane.showMessageDialog(this,"Net Banking payment to be made at Movie Counter");
                dispose();
                new Net_Banking().setVisible(true);
                }
                if (s5.equals("UPI"))
                {
                JOptionPane.showMessageDialog(this,"UPI payment to be made at Movie Counter");
                dispose();
                new Upi_Payment().setVisible(true);
                }
                
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void booking_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_cityActionPerformed
        
        
    }//GEN-LAST:event_booking_cityActionPerformed

    private void booking_movie_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_movie_nameActionPerformed
        
    }//GEN-LAST:event_booking_movie_nameActionPerformed

    private void booking_noof_seatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_noof_seatsActionPerformed

        
    }//GEN-LAST:event_booking_noof_seatsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new Selection().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        booking_estimate_cost.setVisible(true);    
        String a = (String)booking_modeofPayment.getSelectedItem();
        Integer s = (Integer)booking_noof_seats.getSelectedIndex();
        s=s+1;
        Integer k = (count-1)*250;
        Integer c;
        switch (a) {
            case "Net Banking":
                if(k==0)
                    c = k;
                else
                    c = k + 50;
                JOptionPane.showMessageDialog(this,"Service charge of INR 50 is applicable for Net Banking");
                break;
            case "Debit Card":
                if(k==0)
                    c = k;
                else
                    c = k + 50;
                JOptionPane.showMessageDialog(this,"Service charge of INR 50 is applicable for Debit Card");
                break;
            case "UPI":
                c = k;
                break;
            default:
                c = k;
                break;
        }
        booking_estimate_cost.setText(""+c);
        amount = c;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void seat1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat1
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[0]==0){
        JOptionPane.showMessageDialog(this,"This is clicked");
        jSeat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[0] = 1;
        seat1[0] = 1;
        }
        else if(seat[0]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat1

    private void booking_modeofPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_modeofPaymentActionPerformed
       
    }//GEN-LAST:event_booking_modeofPaymentActionPerformed

    private void seat2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat2
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[1]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[1] = 1;
        seat1[1] = 1;
        }
        else if(seat[1]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat2

    private void seat3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat3
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[2]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[2] = 1;
        seat1[2] = 1;
        }
        else if(seat[2]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat3

    private void seat4(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat4
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[3]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[3] = 1;
        seat1[3] = 1;
        }
        else if(seat[3]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat4

    private void seat5(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat5
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[4]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[4] = 1;
        seat1[4] = 1;
        }
        else if(seat[4]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat5

    private void seat6(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat6
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[5]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[5] = 1;
        seat1[5] = 1;
        }
        else if(seat[5]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat6

    private void seat7(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat7
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[6]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[6] = 1;
        seat1[6] = 1;
        }
        else if(seat[6]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat7

    private void seat8(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat8
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[7]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[7] = 1;
        seat1[7] = 1;
        }
        else if(seat[7]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat8

    private void seat9(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat9
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[8]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[8] = 1;
        seat1[8] = 1;
        }
        else if(seat[8]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat9

    private void seat10(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat10
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[9]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[9] = 1;
        seat1[9] = 1;
        }
        else if(seat[9]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat10

    private void seat11(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat11
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[10]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[10] = 1;
        seat1[10] = 1;
        }
        else if(seat[10]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat11

    private void seat12(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat12
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[11]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[11] = 1;
        seat1[11] = 1;
        }
        else if(seat[11]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat12

    private void seat13(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat13
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[12]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[12] = 1;
        seat1[12] = 1;
        }
        else if(seat[12]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat13

    private void seat14(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat14
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[13]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[13] = 1;
        seat1[13] = 1;
        }
        else if(seat[13]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat14

    private void seat16(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat16
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[15]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[15] = 1;
        seat1[15] = 1;
        }
        else if(seat[15]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat16

    private void seat17(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat17
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[16]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[16] = 1;
        seat1[16] = 1;
        }
        else if(seat[16]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat17

    private void seat18(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat18
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[17]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[17] = 1;
        seat1[17] = 1;
        }
        else if(seat[17]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat18

    private void seat19(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat19
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[18]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[18] = 1;
        seat1[18] = 1;
        }
        else if(seat[18]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat19

    private void seat20(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat20
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[19]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[19] = 1;
        seat1[18] = 1;
        }
        else if(seat[19]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat20

    private void seat15(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat15
        Integer s = (Integer)booking_noof_seats.getSelectedIndex() +1;
        if(s>=count&&seat[14]==0){
        JOptionPane.showMessageDialog(this,"This is clicked "+count);
        jSeat15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.png")));
        count++;
        seat[14] = 1;
        seat1[14] = 1;
        }
        else if(seat[14]==1)
        {
            JOptionPane.showMessageDialog(this,"Seat is reserved");
        }
        else
            JOptionPane.showMessageDialog(this,"Check the number of seats");
    }//GEN-LAST:event_seat15

    private void booking_estimate_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_estimate_costActionPerformed
        
    }//GEN-LAST:event_booking_estimate_costActionPerformed

    private void booking_movie_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booking_movie_nameMouseClicked
        int i = booking_movie_name.getSelectedIndex();
        Integer[] temp = new Integer[20];
            temp = (Integer[])A.Movie_seats.get(i);
            for(int r = 0;r<20;r++)
                seat[r] = temp[r];           
            a = i;
            seat1[20] = a;
            
        if(Booking.seat[0]==1)
            jSeat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[1]==1)
            jSeat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[2]==1)
            jSeat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[3]==1)
            jSeat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[4]==1)
            jSeat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[5]==1)
            jSeat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[6]==1)
            jSeat6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[7]==1)
            jSeat7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[8]==1)
            jSeat8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[9]==1)
            jSeat9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[10]==1)
            jSeat10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[10]==1)
            jSeat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[11]==1)
            jSeat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[12]==1)
            jSeat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[13]==1)
            jSeat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[14]==1)
            jSeat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[15]==1)
            jSeat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[16]==1)
            jSeat6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[17]==1)
            jSeat7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[18]==1)
            jSeat8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
        if(Booking.seat[19]==1)
            jSeat9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red.png")));
    }//GEN-LAST:event_booking_movie_nameMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox booking_city;
    private javax.swing.JTextField booking_estimate_cost;
    private javax.swing.JComboBox booking_modeofPayment;
    private javax.swing.JComboBox booking_movie_name;
    private javax.swing.JTextField booking_name;
    private javax.swing.JComboBox booking_noof_seats;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jSeat1;
    private javax.swing.JLabel jSeat10;
    private javax.swing.JLabel jSeat11;
    private javax.swing.JLabel jSeat12;
    private javax.swing.JLabel jSeat13;
    private javax.swing.JLabel jSeat14;
    private javax.swing.JLabel jSeat15;
    private javax.swing.JLabel jSeat16;
    private javax.swing.JLabel jSeat17;
    private javax.swing.JLabel jSeat18;
    private javax.swing.JLabel jSeat19;
    private javax.swing.JLabel jSeat2;
    private javax.swing.JLabel jSeat20;
    private javax.swing.JLabel jSeat3;
    private javax.swing.JLabel jSeat4;
    private javax.swing.JLabel jSeat5;
    private javax.swing.JLabel jSeat6;
    private javax.swing.JLabel jSeat7;
    private javax.swing.JLabel jSeat8;
    private javax.swing.JLabel jSeat9;
    private javax.swing.JLabel seats;
    // End of variables declaration//GEN-END:variables
}
