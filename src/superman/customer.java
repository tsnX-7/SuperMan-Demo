/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package superman;

import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author User
 */
public class customer extends javax.swing.JPanel {

    /**
     * Creates new form customer
     */
    public customer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        c_fname = new javax.swing.JTextField();
        c_lname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        c_status = new javax.swing.JComboBox<>();
        c_age = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        c_cont = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        c_gen = new javax.swing.JComboBox<>();
        c_id = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        c_adr = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        c_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 690));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c_fname.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        c_fname.setAlignmentX(0.0F);
        c_fname.setAlignmentY(0.0F);
        c_fname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        c_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_fnameActionPerformed(evt);
            }
        });
        jPanel2.add(c_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 290, 30));

        c_lname.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        c_lname.setAlignmentX(0.0F);
        c_lname.setAlignmentY(0.0F);
        c_lname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        c_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_lnameActionPerformed(evt);
            }
        });
        jPanel2.add(c_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 290, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel2.setText("First name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel9.setText("Last name:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel10.setText("Age:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 40, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel11.setText("Contact no:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel12.setText("Customer ID :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        c_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Elite", "Active", "General", "Student" }));
        c_status.setSelectedIndex(-1);
        c_status.setToolTipText("");
        c_status.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        c_status.setName(""); // NOI18N
        c_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_statusActionPerformed(evt);
            }
        });
        jPanel2.add(c_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 80, 30));

        c_age.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        c_age.setAlignmentX(0.0F);
        c_age.setAlignmentY(0.0F);
        c_age.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        c_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_ageActionPerformed(evt);
            }
        });
        jPanel2.add(c_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 80, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel13.setText("Gender:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 60, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel14.setText("Membership status:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 150, 30));

        c_cont.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        c_cont.setAlignmentX(0.0F);
        c_cont.setAlignmentY(0.0F);
        c_cont.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        c_cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_contActionPerformed(evt);
            }
        });
        jPanel2.add(c_cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 290, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel15.setText("Address:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 30));

        c_gen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));
        c_gen.setSelectedIndex(-1);
        c_gen.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        c_gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_genActionPerformed(evt);
            }
        });
        jPanel2.add(c_gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 80, 30));

        c_id.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        c_id.setAlignmentX(0.0F);
        c_id.setAlignmentY(0.0F);
        c_id.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        c_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_idActionPerformed(evt);
            }
        });
        jPanel2.add(c_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 290, 30));

        c_adr.setColumns(20);
        c_adr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_adr.setRows(4);
        c_adr.setTabSize(4);
        c_adr.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jScrollPane3.setViewportView(c_adr);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 290, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 420, 420));

        jTable1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First name", "Last name", "Gender", "Age", "Contact no", "Address", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 740, 570));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-customer-40 blue.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 28)); // NOI18N
        jLabel6.setText("Customers");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 350, 50));

        jTextField7.setBackground(new java.awt.Color(0, 51, 51));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 530, 10));

        c_search.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        c_search.setForeground(new java.awt.Color(153, 153, 153));
        c_search.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        c_search.setText("     Search via ID");
        c_search.setAlignmentX(0.0F);
        c_search.setAlignmentY(0.0F);
        c_search.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        c_search.setDoubleBuffered(true);
        c_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                c_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                c_searchFocusLost(evt);
            }
        });
        c_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_searchActionPerformed(evt);
            }
        });
        c_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_searchKeyTyped(evt);
            }
        });
        jPanel1.add(c_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, 200, 20));

        jButton1.setText("Edit");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, -1, -1));

        jButton2.setText("Delete");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-25.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 30, 30, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1330, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void c_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_lnameActionPerformed

    private void c_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_fnameActionPerformed

    private void c_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_searchActionPerformed

    private void c_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_statusActionPerformed

    private void c_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_ageActionPerformed

    private void c_contActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_contActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_contActionPerformed

    private void c_genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_genActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_genActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void c_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_idActionPerformed

    private void c_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_searchFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_c_searchFocusGained

    private void c_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_c_searchFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_c_searchFocusLost

    private void c_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_searchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_c_searchKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id = c_id.getText();
        String fname = c_fname.getText();
        String lname = c_lname.getText();
        String gender = (String)c_gen.getSelectedItem().toString();
        String age = c_age.getText();
        String contact = c_cont.getText();
        String address = c_adr.getText();
        String type = (String)c_status.getSelectedItem().toString();
        
        try{
            Statement s = (Statement) db.mycon().createStatement();
            s.executeUpdate(" INSERT INTO customer VALUES('"+id+"','"+fname+"','"+lname+"','"+gender+"','"+age+"','"+contact+"','"+address+"','"+type+"') ");
            
        }catch(SQLException e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String search = c_search.getText();
        try{
            Statement s = (Statement) db.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM customer WHERE cid = '"+search+"' ");
            
            if(rs.next()) {
                c_id.setText(rs.getString("cid"));
                c_fname.setText(rs.getString("first_name"));
                c_lname.setText(rs.getString("last_name"));
                //c_gen.setText(rs.getString("gender"));
                c_age.setText(rs.getString("age"));
                c_cont.setText(rs.getString("contact"));
                c_adr.setText(rs.getString("address"));
                //c_status.setText(rs.getString("status"));
            }
        } catch(SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea c_adr;
    private javax.swing.JTextField c_age;
    private javax.swing.JTextField c_cont;
    private javax.swing.JTextField c_fname;
    private javax.swing.JComboBox<String> c_gen;
    private javax.swing.JTextField c_id;
    private javax.swing.JTextField c_lname;
    private javax.swing.JTextField c_search;
    private javax.swing.JComboBox<String> c_status;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
