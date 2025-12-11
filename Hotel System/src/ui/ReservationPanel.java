package ui;
import javax.swing.*; 
import java.util.*;
public class reservation extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(reservation.class.getName());
    public reservation() {
        initComponents();
        String reservationId1 = "R" + (int)(Math.random() * 50000);
        String servicesId1 = "S" + (int)(Math.random() * 50000);
        String checkIn = "2025-12-18";
        String checkOut = "2025-12-19";
        jTable1.setValueAt(reservationId1, 0, 0);
        jTable1.setValueAt("khaled", 0, 1);
        jTable1.setValueAt("1", 0, 2);
        jTable1.setValueAt(checkIn, 0, 3);
        jTable1.setValueAt(checkOut, 0, 4);
        jTable1.setValueAt(servicesId1, 0, 5);
        
        String reservationId2 = "R" + (int)(Math.random() * 50000);
        String servicesId2 = "S" + (int)(Math.random() * 50000);
        checkIn = "2025-12-18";
        checkOut = "2025-12-24";
        jTable1.setValueAt(reservationId2, 1, 0);
        jTable1.setValueAt("ahmed", 1, 1);
        jTable1.setValueAt("2", 1, 2);
        jTable1.setValueAt(checkIn, 1, 3);
        jTable1.setValueAt(checkOut, 1, 4);
        jTable1.setValueAt(servicesId2, 1, 5);
    }
     public static int day(String date){
            int i = 0;
            String day = "";
            while(true){
                if(date.charAt(i) == '-'){
                    i++;
                    break;
                }
                i++;
            }
            while(true){
                if(date.charAt(i) == '-'){
                    i++;
                    break;
                }
                i++;
            }
            for(int j = i ; j < date.length() ; j++){
                day += date.charAt(j);
            }
            return Integer.parseInt(day);
        }
        public static int month(String date){
            int i = 0;
            String month = "";
            while(true){
                if(date.charAt(i) == '-'){
                    i++;
                    break;
                }
                i++;
            }
            for(int j = i ; j < date.length() ; j++){
                if(date.charAt(j) == '-'){
                    break;
                }
                month += date.charAt(j);
            }
            return Integer.parseInt(month);
        }
        public static int year(String date){
            String year = "";
            for(int j = 0 ; j < date.length() ; j++){
                if(date.charAt(j) == '-'){
                    break;
            }
                year += date.charAt(j);
            }
            return Integer.parseInt(year);
        }
    public int calculateNights(String checkOut , String checkIn){
        if(month(checkOut) == month(checkIn)){
            return day(checkOut)- day(checkIn);
        }
        else if(year(checkOut) == year(checkIn)){
            return (month(checkOut) - month(checkIn)) * 30 + (day(checkOut) -  day(checkIn));
        }
        else{
            return ((month(checkOut) + (12 * (year(checkOut) - year(checkIn))) - month(checkIn)) * 30) + (day(checkOut) -  day(checkIn));
        }
    }
//    public double calculateTotalCost(){
//        //return (room.price * calculateNights())+ service.price;
//        return (23.4 * calculateNights(checkOut , checkIn))+ 23.8;
//    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jButtonRefresh = new javax.swing.JButton();
        jButtonGenerateInvoice = new javax.swing.JButton();
        jButtonDeleteReservation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jButtonGenerateInvoice.setText("Generate Invoice for Selected");
        jButtonGenerateInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerateInvoiceActionPerformed(evt);
            }
        });

        jButtonDeleteReservation.setText("Delete Reservation");
        jButtonDeleteReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteReservationActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ResID", "Customer", "Room", "CheckIn", "CheckOut", "Services"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGenerateInvoice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeleteReservation)
                .addGap(480, 526, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRefresh)
                    .addComponent(jButtonGenerateInvoice)
                    .addComponent(jButtonDeleteReservation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pack();
    }                     
    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {                                               
    }                                              
    private void jButtonGenerateInvoiceActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        if(jTable1.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Select a reservation");
        }
    int nights= calculateNights(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString() , jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        JOptionPane.showMessageDialog(null, "INVOICE\n" + "Reservation: " + 
                jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "\n" + "Customer: " + jTable1.getValueAt(jTable1.getSelectedRow(), 1) + "\n" + 
                        "Room: " + jTable1.getValueAt(jTable1.getSelectedRow(), 2) + "\n" + "ChechIn: " +
                jTable1.getValueAt(jTable1.getSelectedRow(), 3) + "\n" + "CheckOut: " +
                jTable1.getValueAt(jTable1.getSelectedRow(), 4)
                + "\n" + "Nights: " + nights);
//                + "\n" + "Room price per night: " 
//                +jTable1.getValueAt(jTable1.getSelectedRow(), 5) + "\n" + "Services: \n" + "-food: " + jTable1.getValueAt(jTable1.getSelectedRow(), 5) + 
//                "\n" + "-----------" + "\n" + "TOTAL: " + jTable1.getValueAt(jTable1.getSelectedRow(), 5));
    }                                                      
    private void jButtonDeleteReservationActionPerformed(java.awt.event.ActionEvent evt) {                                                         

        if(jTable1.getSelectedRow() == -1){
           JOptionPane.showMessageDialog(null, "Please select row to delete it");
        }      
        jTable1.setValueAt("", jTable1.getSelectedRow(), 0);
        jTable1.setValueAt("", jTable1.getSelectedRow(), 1);
        jTable1.setValueAt("", jTable1.getSelectedRow(), 2);
        jTable1.setValueAt("", jTable1.getSelectedRow(), 3);
        jTable1.setValueAt("", jTable1.getSelectedRow(), 4);
        jTable1.setValueAt("", jTable1.getSelectedRow(), 5);
    }                                                        
    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(() -> new reservation().setVisible(true));
    }
    private javax.swing.JButton jButtonDeleteReservation;
    private javax.swing.JButton jButtonGenerateInvoice;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
}
