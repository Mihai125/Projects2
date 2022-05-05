package food.ordering.system;


import java.awt.Image;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    Connection cn;

    public Main() {
        connection();
        initComponents();

        ImageIcon background = new ImageIcon("photos\\patru.jpg");
        Image img = background.getImage();
        Image temp = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        background = new ImageIcon(temp);
        JLabel back = new JLabel(background);
        back.setLayout(null);
        back.setBounds(0, 0, getWidth(), getHeight());
        add(back);

        this.setLocationRelativeTo(null);
        btnAdd.setEnabled(false);
        btnRemove.setEnabled(false);
        btnCommand.setEnabled(false);
        loadRecord(jTableMenu);
        loadGift(jTableCart);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnCommand = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMenu = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Burgers");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cart");

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setText("Add to Cart");
        btnAdd.setFocusable(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.setFocusable(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnCommand.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCommand.setText("Command");
        btnCommand.setFocusable(false);
        btnCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommandActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.setFocusable(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jTableMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMenu.getTableHeader().setReorderingAllowed(false);
        jTableMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMenu);
        if (jTableMenu.getColumnModel().getColumnCount() > 0) {
            jTableMenu.getColumnModel().getColumn(0).setResizable(false);
            jTableMenu.getColumnModel().getColumn(1).setResizable(false);
            jTableMenu.getColumnModel().getColumn(2).setResizable(false);
        }

        jTableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Number", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCartMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCart);
        if (jTableCart.getColumnModel().getColumnCount() > 0) {
            jTableCart.getColumnModel().getColumn(0).setResizable(false);
            jTableCart.getColumnModel().getColumn(1).setResizable(false);
            jTableCart.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(btnCommand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadRecord(JTable table) {

        try {
            PreparedStatement ps = cn.prepareStatement("Select * from tblproducts");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] row;
            while (rs.next()) {
                row = new Object[3];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getInt(3);

                model.addRow(row);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void loadGift(JTable jTableCart) {

        connection();

        try {

            PreparedStatement ps = cn.prepareStatement("Select p.id, p.Products, t.username, t.comenzi from tblproducts p join tblsecurity t on p.id = t.id");
            ResultSet rs = ps.executeQuery();
            rs.next();
            int id = rs.getInt("id");
            String produs = rs.getString("Products");
            String user = rs.getString("username");
            int comenzi = rs.getInt("comenzi");

            DefaultTableModel model = (DefaultTableModel) jTableCart.getModel();
            System.out.print(produs);
            if (!produs.isEmpty() && Login.user.equals(user) && (comenzi % 5 == 0)) {
                model.addRow(new Object[]{produs, 1, 0});

            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Option().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jTableMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMenuMouseClicked
        btnAdd.setEnabled(true);
        btnRemove.setEnabled(false);
        jTableCart.clearSelection();
    }//GEN-LAST:event_jTableMenuMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int rowIndex = jTableMenu.getSelectedRow();

        String product = jTableMenu.getValueAt(rowIndex, 1).toString();
        String price = jTableMenu.getValueAt(rowIndex, 2).toString();

        DefaultTableModel model = (DefaultTableModel) jTableCart.getModel();
        List<String> cart = new ArrayList<>();
        for (int i = 0; i < model.getRowCount(); i++) {
            cart.add(model.getValueAt(i, 0).toString());
        }

        if (!cart.contains(product)) {
            model.addRow(new Object[]{product, 1, price});
        } else {
            int index = cart.indexOf(product);
            int currentCount = Integer.parseInt(model.getValueAt(index, 1).toString());
            int currentPrice = Integer.parseInt(model.getValueAt(index, 2).toString()) + Integer.parseInt(price);
            model.setValueAt(currentCount + 1, index, 1);
            model.setValueAt(currentPrice, index, 2);
        }

        btnCommand.setEnabled(true);

    }//GEN-LAST:event_btnAddActionPerformed

    private void jTableCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCartMouseClicked
        btnRemove.setEnabled(true);
        btnAdd.setEnabled(false);
        jTableMenu.clearSelection();
    }//GEN-LAST:event_jTableCartMouseClicked

    private void btnCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommandActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableCart.getModel();
        List<String> cart = new ArrayList<>();
        for (int i = 0; i < model.getRowCount(); i++) {
            cart.add(model.getValueAt(i, 2).toString());
        }

        int sum = 0;

        for (String n : cart) {
            sum += Integer.parseInt(n);
        }

        JOptionPane.showMessageDialog(this, "Total to pay = " + sum + "\nDo you wish to continue?");
        model.setRowCount(0);
        btnRemove.setEnabled(false);
    }//GEN-LAST:event_btnCommandActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableCart.getModel();
        int rowIndex = jTableCart.getSelectedRow();
        int count = Integer.parseInt(model.getValueAt(rowIndex, 1).toString());
        int price = Integer.parseInt(model.getValueAt(rowIndex, 2).toString());
        if (count > 1) {
            model.setValueAt(count - 1, rowIndex, 1);
            model.setValueAt(price - (price / count), rowIndex, 2);
        } else {
            model.removeRow(rowIndex);
            btnRemove.setEnabled(false);
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public void connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsistemcomenzi", "root", "");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Connection is close!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCommand;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCart;
    private javax.swing.JTable jTableMenu;
    // End of variables declaration//GEN-END:variables

}
