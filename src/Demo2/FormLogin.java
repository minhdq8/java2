/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo2;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author minhdq
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    ArrayList<SinhVien> listSV = new ArrayList<>();

    public FormLogin() {
        initComponents();
        setLocationRelativeTo(null);//show form ra giữa màn hình
        setResizable(false);//khóa kích cỡ form lại
        lbShowForm.setText("Trượt java 2 chặt luôn!");
        loadData();
        fillTable();
        cbbUser.removeAllItems();// xóa dữ liệu cữ trên cbb
        cbLuu.setSelected(true);// mặc định tick checkbox
        rdNam.setSelected(true);
        for (SinhVien xxx : listSV) {
            cbbUser.addItem(xxx.getUserName());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbShowForm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        cbbUser = new javax.swing.JComboBox<>();
        btHintPass = new javax.swing.JButton();
        lbHintPass = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbShowAcc = new javax.swing.JTable();
        btFillTable = new javax.swing.JButton();
        cbLuu = new javax.swing.JCheckBox();
        rdNu = new javax.swing.JRadioButton();
        rdNam = new javax.swing.JRadioButton();
        btGioiTinh = new javax.swing.JButton();
        tfShowUser = new javax.swing.JTextField();
        tfShowPass = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FPT Polytechnic");

        lbShowForm.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbShowForm.setText("Failed! Java 2!");

        jLabel2.setText("Username");

        jLabel3.setText("Password: ");

        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        cbbUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbUserActionPerformed(evt);
            }
        });

        btHintPass.setText("Hint Pass");
        btHintPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHintPassActionPerformed(evt);
            }
        });

        tbShowAcc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User", "Pass", "Class", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbShowAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbShowAccMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbShowAcc);

        btFillTable.setText("Fill");
        btFillTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFillTableActionPerformed(evt);
            }
        });

        cbLuu.setText("Lưu");

        buttonGroup1.add(rdNu);
        rdNu.setText("nữ");

        buttonGroup1.add(rdNam);
        rdNam.setText("nam");

        btGioiTinh.setText("Giới tính");
        btGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGioiTinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btHintPass))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btLogin)
                                        .addGap(18, 18, 18)
                                        .addComponent(btClear)
                                        .addGap(18, 18, 18)
                                        .addComponent(btAdd)
                                        .addGap(28, 28, 28)
                                        .addComponent(btExit)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbHintPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbShowForm)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUser)
                                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbLuu))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdNu)
                                    .addComponent(rdNam))))
                        .addGap(29, 29, 29)
                        .addComponent(btGioiTinh))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btFillTable)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfShowUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfShowPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbShowForm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdNam)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdNu)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btGioiTinh)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbLuu)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLogin)
                            .addComponent(btClear)
                            .addComponent(btAdd)
                            .addComponent(btExit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btHintPass))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbHintPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btFillTable)
                        .addGap(29, 29, 29)
                        .addComponent(tfShowUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Phương thức tự tạo

//    public void fillData() {
//        String[] data = {
//            "Minh", "Ăn", "Chơi", "Ngủ"
//        };
//        cbbUser.setModel(new DefaultComboBoxModel<>(data));
//    }

    public void loadData() {
        listSV.add(new SinhVien("a1", "111", "IT16302"));
        listSV.add(new SinhVien("a2", "222", "IT16302"));
        listSV.add(new SinhVien("a3", "333", "IT16302"));
        listSV.add(new SinhVien("a4", "444", "IT16302"));
        listSV.add(new SinhVien("a5", "555", "IT16302"));
    }

    public void clear() {
        txtPass.setText("");
        txtUser.setText("");
    }

    public void hintPass() {
        int index = cbbUser.getSelectedIndex();
        lbHintPass.setText(listSV.get(index).getPassWord());
    }

    public void login() {
        try {
            for (SinhVien xxx : listSV) {
                if (txtUser.getText().equalsIgnoreCase(xxx.getUserName())
                        && txtPass.getText().equalsIgnoreCase(xxx.getPassWord())) {
                    JOptionPane.showMessageDialog(this, "Login ok");
                    return;
                }
            }
            if (txtUser.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "User not null");
            } else if (txtPass.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Pass not null");
            } else {
                JOptionPane.showMessageDialog(this, "Login Failed!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Can not connect to DB");
        }
    }

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbShowAcc.getModel();
        model.setRowCount(0);// xóa hết dữ liệu

        for (SinhVien xxx : listSV) {
            model.addRow(new Object[]{
                xxx.getUserName(), xxx.getPassWord(), xxx.getClassMate(),xxx.getGioiTinh()
            });
        }
    }
    public boolean checkTrung(String name){
        boolean check = false;
        for(int i = 0; i < listSV.size(); i++){
            if(listSV.get(i).getUserName().equals(name)){
                check = true;
            }
        }
        return check;
    }
    public void addAcc() {
        String name = txtUser.getText();
        String pass = txtPass.getText();
        String gender = rdNam.isSelected() ? "Nam": "Nữ";
        
        try {
            if(checkTrung(name) == true){
                JOptionPane.showMessageDialog(rootPane, "Trùng ACC!");
                return;
            }
        } catch (Exception e) {
        }
        listSV.add(new SinhVien(name, pass, "",gender));
        cbbUser.addItem(name);
    }
    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        // TODO add your handling code here:
        login();
        clear();
    }//GEN-LAST:event_btLoginActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
        clear();
        cbbUser.setSelectedIndex(0);//cho cbb về vị trí đầu tiên
    }//GEN-LAST:event_btClearActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btHintPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHintPassActionPerformed
        // TODO add your handling code here:
        hintPass();
    }//GEN-LAST:event_btHintPassActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        if(cbLuu.isSelected() == true){
            addAcc();
            fillTable();
        } else{
            JOptionPane.showMessageDialog(rootPane, "Tick vào checkbox đã!");
            return;
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void btFillTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFillTableActionPerformed
        fillTable();
    }//GEN-LAST:event_btFillTableActionPerformed

    private void cbbUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbUserActionPerformed
        hintPass();
    }//GEN-LAST:event_cbbUserActionPerformed

    private void btGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGioiTinhActionPerformed
        if(rdNam.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Nam hoa hậu");
        }
        if(rdNu.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Nữ ");
        }
        
    }//GEN-LAST:event_btGioiTinhActionPerformed

    private void tbShowAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbShowAccMouseClicked
        int viTri = tbShowAcc.getSelectedRow();
//        JOptionPane.showMessageDialog(rootPane, viTri);
    // c1 từ table
//        DefaultTableModel model = (DefaultTableModel) tbShowAcc.getModel();
//        tfShowUser.setText(model.getValueAt(viTri, 0).toString());
//        tfShowPass.setText(model.getValueAt(viTri, 1).toString());
        // c2 từ list
        SinhVien xxx = listSV.get(viTri);
        tfShowUser.setText(xxx.getUserName());
        tfShowPass.setText(xxx.getPassWord());
    }//GEN-LAST:event_tbShowAccMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btFillTable;
    private javax.swing.JButton btGioiTinh;
    private javax.swing.JButton btHintPass;
    private javax.swing.JButton btLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbLuu;
    private javax.swing.JComboBox<String> cbbUser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbHintPass;
    private javax.swing.JLabel lbShowForm;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tbShowAcc;
    private javax.swing.JTextField tfShowPass;
    private javax.swing.JTextField tfShowUser;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
