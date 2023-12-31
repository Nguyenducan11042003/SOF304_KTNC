
package PH19584;

import DAO.NhanVienDAO;
import javax.swing.ImageIcon;
import Utils.Auth;
import Utils.MsgBox;
import Entity.NhanVien;
import Utils.XImage;
import javax.swing.JOptionPane;
/**
 *
 * @author Nguyen Truc
 */
public class ChangePassUI extends javax.swing.JFrame {
    private  NhanVienDAO dao = new NhanVienDAO();
    public ChangePassUI() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Change default icon 
//        ImageIcon icon = new ImageIcon("src\\Icons\\fpt.png");
//        this.setIconImage(icon.getImage());
        this.setIconImage(XImage.getAppIcon());   
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        txtmatkhau = new javax.swing.JPasswordField();
        txtmatkhaumoi2 = new javax.swing.JPasswordField();
        txtmatkhaumoi = new javax.swing.JPasswordField();
        btnoke = new javax.swing.JButton();
        tbnhuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSys - Đổi mật khẩu");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ĐỔI MẬT KHẨU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên đăng nhập");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Xác nhận mật khẩu mới");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 207, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mật khẩu mới");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 207, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mật khẩu hiện tại");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 110, -1, -1));
        jPanel1.add(txtmanv, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 148, 285, 31));

        txtmatkhau.setEchoChar('\u2022');
        jPanel1.add(txtmatkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 148, 285, 31));

        txtmatkhaumoi2.setEchoChar('\u2022');
        jPanel1.add(txtmatkhaumoi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 253, 285, 31));

        txtmatkhaumoi.setEchoChar('\u2022');
        jPanel1.add(txtmatkhaumoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 253, 285, 31));

        btnoke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/OK.png"))); // NOI18N
        btnoke.setText("Đồng ý");
        btnoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokeActionPerformed(evt);
            }
        });
        jPanel1.add(btnoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 350, -1, -1));

        tbnhuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/No.png"))); // NOI18N
        tbnhuy.setText("Hủy bỏ");
        tbnhuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnhuyActionPerformed(evt);
            }
        });
        jPanel1.add(tbnhuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 350, 101, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokeActionPerformed
        String manv = txtmanv.getText();
        String matkhau = new String(txtmatkhau.getPassword());
        String matkhaumoi = new String(txtmatkhaumoi.getPassword());
        String matkhaumoi2 = new String(txtmatkhaumoi2.getPassword());
        if(manv.length()==0||matkhau.length()==0||matkhaumoi.length()==0||matkhaumoi2.length()==0){
            MsgBox.alert(this, "Không được để trống !");
            return;
        }
        doiMatkhau();
    }//GEN-LAST:event_btnokeActionPerformed

    private void tbnhuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnhuyActionPerformed
        huyBo();
    }//GEN-LAST:event_tbnhuyActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnoke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tbnhuy;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JPasswordField txtmatkhau;
    private javax.swing.JPasswordField txtmatkhaumoi;
    private javax.swing.JPasswordField txtmatkhaumoi2;
    // End of variables declaration//GEN-END:variables

    private void doiMatkhau() {
        String manv = txtmanv.getText();
        String matkhau = new String(txtmatkhau.getPassword());
        String matkhaumoi = new String(txtmatkhaumoi.getPassword());
        String matkhaumoi2 = new String(txtmatkhaumoi2.getPassword());
        
        if(!manv.equalsIgnoreCase(Auth.user.getManv())) {
            MsgBox.alert(this, "Sai tên đăng nhập !");
            return;
        } else if(!matkhau.equals(Auth.user.getMatkhau())) {
            MsgBox.alert(this, "Sai mật khẩu !");
            return;
        } else if(!matkhaumoi.equals(matkhaumoi2)) {
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng !");
            return;
        } else if(matkhaumoi.length()<6) {
            MsgBox.alert(this, "Mật khẩu phải ít nhất 6 kí tự !");
        } 
        else {
            Auth.user.setMatkhau(matkhaumoi);
            dao.update(Auth.user);
            MsgBox.alert(this, "Đổi mật khẩu thành công !");
            return;
       }
    }
    
    private void huyBo() {
        this.dispose();
    }
}
