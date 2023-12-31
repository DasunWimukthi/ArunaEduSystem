/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arunaedu.main;

import static com.anuraedu.common.SQ.LIKESEARCH;
import static com.anuraedu.common.SQ.SAVE;
import static com.anuraedu.common.SQ.STATUSSEARCH;
import static com.anuraedu.common.SQ.getResult;
import com.anuraedu.db.DB;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ASUS
 */
public class LecturerPayment extends javax.swing.JInternalFrame {

    DefaultTableModel dtm1;

    public LecturerPayment() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bif = (BasicInternalFrameUI) this.getUI();
        bif.setNorthPane(null);

        generateLecturerPaymentID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_lecturerid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_totalamount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_paymentid = new javax.swing.JTextField();
        txt_startdate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_enddate = new javax.swing.JTextField();
        cbox_suggestion = new javax.swing.JCheckBox();
        cbox_showall = new javax.swing.JCheckBox();
        lbl_payment = new javax.swing.JLabel();
        txt_payment = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1670, 1040));

        jPanel2.setBackground(new java.awt.Color(111, 187, 217));

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 76, 76));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Payment ID");

        txt_lecturerid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_lecturerid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_lecturerid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_lectureridKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_lectureridKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(76, 76, 76));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Lecturer ID");

        txt_totalamount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_totalamount.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 76, 76));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Total Amount");

        txt_paymentid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_paymentid.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txt_startdate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_startdate.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 76, 76));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Collecting start date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 76, 76));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Collecting end date");

        txt_enddate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_enddate.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        buttonGroup1.add(cbox_suggestion);
        cbox_suggestion.setText("suggestions");

        buttonGroup1.add(cbox_showall);
        cbox_showall.setText("Show all");
        cbox_showall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_showallActionPerformed(evt);
            }
        });

        lbl_payment.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_payment.setForeground(new java.awt.Color(76, 76, 76));
        lbl_payment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_payment.setText("Payment");

        txt_payment.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_payment.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_payment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_paymentKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_lecturerid, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_paymentid, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_totalamount, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_enddate, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(txt_startdate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbox_suggestion)
                    .addComponent(cbox_showall))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_lecturerid, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(cbox_suggestion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_showall)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_paymentid, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_totalamount, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Table_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lecturer ID", "First name", "Last name", "NIC", "DOB", "Contact No.1", "Contact No.2", "Address", "Email", "Gender", "Status"
            }
        ));
        Table_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_1);

        jTabbedPane1.addTab("Lecturer", jScrollPane1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class_ID", "Payment_ID", "Class_Payment", "Relevent_Date"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Class_Payment");
            jTable2.getColumnModel().getColumn(3).setHeaderValue("Relevent_Date");
        }

        jTabbedPane1.addTab("Collection", jScrollPane2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_lectureridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lectureridKeyReleased
        if (cbox_suggestion.isSelected()) {

            jTabbedPane1.setSelectedIndex(0);
            try {
                removeAllRows(Table_1);
                lecturerTablefill(2);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        if (evt.getKeyCode() == 10) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String nowDate = dtf.format(now);
            System.out.println(nowDate);
            txt_enddate.setText(nowDate);

            try {
                ResultSet rs = DB.search("select max(date_time) FROM lecturer_payment where id_lecturer='" + txt_lecturerid.getText() + "';");
                if (rs.next()) {
                    txt_startdate.setText(rs.getString("max(date_time)"));
                    if (txt_startdate.getText().equals("") || txt_startdate.equals(null)) {

                        ResultSet rs1 = DB.search("select start_date FROM lecturer_contract where id_lecturer='" + txt_lecturerid.getText() + "';");
                        rs1.next();
                        String dez = rs1.getString("start_date") + " " + "00:00:00";
                        txt_startdate.setText(dez);

                    }
                }

//            }catch(NullPointerException e){
//                    JOptionPane.showMessageDialog(this, "Cant Found Class Payments for this Lecturer ID !");
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                fillCollection();

                jTabbedPane1.setSelectedIndex(1);
////
                if (jTable2.getRowCount() != 0) {

                    double total = 0.0;
                    for (int row = 0; row < jTable2.getRowCount(); row++) {
                        total = total + Double.parseDouble(jTable2.getValueAt(row, 2).toString());
                    }
                    txt_totalamount.setText(Double.toString(total));
                    txt_payment.setText(Double.toString(total - ((total / 100) * 20)));
                }
/////
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_txt_lectureridKeyReleased

    private void cbox_showallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_showallActionPerformed

        removeAllRows(Table_1);
        lecturerTablefill(1);


    }//GEN-LAST:event_cbox_showallActionPerformed

    private void txt_lectureridKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lectureridKeyPressed

    }//GEN-LAST:event_txt_lectureridKeyPressed

    private void txt_paymentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paymentKeyReleased
        if (evt.getKeyCode() == 10) {

            try {
                int retV = 0;
                if (STATUSSEARCH("lecturer", "id_lecturer", txt_lecturerid.getText())) {
                } else {
                    retV = JOptionPane.showConfirmDialog(this, "Lecturer is Inactive (ACCORDING TO THE SYSTEM DATA), Do you want to continue the process ?");
                }
                if (retV == 0) {
                    SAVE("lecturer_payment", "'"
                            + txt_paymentid.getText() + "','"
                            + txt_lecturerid.getText() + "','"
                            + Double.parseDouble(txt_payment.getText()) + "',now()");
                    JOptionPane.showMessageDialog(this, "Saved !");
                }
                paymentReport();
                txt_lecturerid.grabFocus();
//                saveLecturerClassPayments();
                clearFields();
                removeAllRows(jTable2);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_txt_paymentKeyReleased

    private void Table_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_1MouseClicked
        txt_lecturerid.setText((String) Table_1.getValueAt(Table_1.getSelectedRow(), 0));
    }//GEN-LAST:event_Table_1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbox_showall;
    private javax.swing.JCheckBox cbox_suggestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_payment;
    private javax.swing.JTextField txt_enddate;
    private javax.swing.JTextField txt_lecturerid;
    private javax.swing.JTextField txt_payment;
    private javax.swing.JTextField txt_paymentid;
    private javax.swing.JTextField txt_startdate;
    private javax.swing.JTextField txt_totalamount;
    // End of variables declaration//GEN-END:variables

    private void fillCollection() {
        removeAllRows(jTable2);
        try {
            ResultSet rs = DB.search("select * from class_payment where payment_datetime > '" + txt_startdate.getText() + "' and id_lecturer='" + txt_lecturerid.getText() + "'");
            while (rs.next()) {

                String id_class = rs.getString("id_class");
                String id_payment = rs.getString("id_payment");
                String class_payment = rs.getString("class_payment");
                String relevent_date = rs.getString("relevant_date");

                Vector v = new Vector();

                v.add(id_class);
                v.add(id_payment);
                v.add(class_payment);
                v.add(relevent_date);

                dtm1 = (DefaultTableModel) jTable2.getModel();
                dtm1.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void lecturerTablefill(int i) {
        try {
            ResultSet rs = null;
            if (i == 1) {
                rs = DB.search("select * from lecturer");
            } else if (i == 2) {
                LIKESEARCH("lecturer", "id_lecturer", txt_lecturerid.getText());
                rs = getResult();
            }

            while (rs.next()) {
                String id_lecturer = rs.getString("id_lecturer");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String nic = rs.getString("nic");
                String dob = rs.getString("dob");
                String contact_no1 = rs.getString("contact_no1");
                String contact_no2 = rs.getString("contact_no2");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                boolean status = rs.getBoolean("status");

                Vector v = new Vector();

                v.add(id_lecturer);
                v.add(fname);
                v.add(lname);
                v.add(nic);
                v.add(dob);
                v.add(contact_no1);
                v.add(contact_no2);
                v.add(address);
                v.add(email);
                v.add(gender);
                if (status) {
                    v.add("Active");
                } else {
                    v.add("Inactive");
                }

                dtm1 = (DefaultTableModel) Table_1.getModel();
                dtm1.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void generateLecturerPaymentID() {
        try {
            ResultSet rs = DB.search("select count(*) as inv_count from lecturer_payment");
            if (rs.next()) {
                int count = rs.getInt("inv_count");
                String invoiceid = "AELCTRPYMNT" + (++count);
                txt_paymentid.setText(invoiceid);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void removeAllRows(JTable j) {

        for (int i = j.getRowCount() - 1; i >= 0; i--) {
            ((DefaultTableModel) j.getModel()).removeRow(i);
        }

    }

    private void clearFields() {
        txt_lecturerid.setText(null);
        txt_startdate.setText(null);
        txt_enddate.setText(null);
        txt_totalamount.setText(null);
        txt_payment.setText(null);
        generateLecturerPaymentID();
    }

//    private void saveLecturerClassPayments() {
//        try {
//            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
//            for (int row = 0; row < dtm.getRowCount(); row++) {
//                String classPayment_no = dtm.getValueAt(row, 0).toString();
//                String paymentID = txt_paymentid.getText();
//
//                SAVE("lecturerclass_payment", "'" + paymentID + "','" + classPayment_no + "'");
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    private void paymentReport() {
        try {
            String fullName = null;
            ResultSet rs = DB.search("select fname,lname from lecturer where id_lecturer='" + txt_lecturerid.getText() + "'");
            if (rs.next()) {
                fullName = rs.getString("fname") + " " + rs.getString("lname");
            }

            DefaultTableModel de = (DefaultTableModel) jTable2.getModel();
            JRTableModelDataSource dataSource = new JRTableModelDataSource(de);
//            C:\\Users\\ASUS\\Desktop\\Jasper\\MyReports\\test2.jrxml
//change path for new design
            String path = "";

            JasperReport compileReport = JasperCompileManager.compileReport(path);

            Map<String, Object> params = new HashMap<>();
            params.put("id_lecturer", txt_lecturerid.getText());
            params.put("id_payment", txt_paymentid.getText());
            params.put("fullname", fullName);
            params.put("total", txt_totalamount.getText());
            params.put("payment", txt_payment.getText());

            JasperPrint fillReport = JasperFillManager.fillReport(compileReport, params, dataSource);
            JasperViewer.viewReport(fillReport, false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
