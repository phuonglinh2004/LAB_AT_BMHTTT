package week_03;

public class frm_Menu extends javax.swing.JFrame {

    public frm_Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_rsa = new javax.swing.JButton();
        btn_ecc = new javax.swing.JButton();
        btn_rsaaes = new javax.swing.JButton();
        btn_signature = new javax.swing.JButton();
        btn_sql = new javax.swing.JButton();
        btn_history = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LAB 3 - Mã hóa khóa công khai");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("LAB 3 - MÃ HÓA KHÓA CÔNG KHAI");

        jLabel2.setText("Chọn một bài để mở form tương ứng (bài 3.1 chạy RSADemo.java bằng Run File):");

        btn_rsa.setText("3.2 RSA (Swing)");
        btn_rsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rsaActionPerformed(evt);
            }
        });

        btn_ecc.setText("3.3 ECC");
        btn_ecc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eccActionPerformed(evt);
            }
        });

        btn_rsaaes.setText("3.4 RSA + AES");
        btn_rsaaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rsaaesActionPerformed(evt);
            }
        });

        btn_signature.setText("3.5 Chữ ký ECDSA");
        btn_signature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signatureActionPerformed(evt);
            }
        });

        btn_sql.setText("Kết nối SQL Server");
        btn_sql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sqlActionPerformed(evt);
            }
        });

        btn_history.setText("Xem lịch sử");
        btn_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_rsa, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btn_signature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_ecc, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btn_sql, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_rsaaes, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btn_history, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_rsa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ecc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_rsaaes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_signature, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sql, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_history, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_rsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rsaActionPerformed
        new frm_RSA().setVisible(true);
    }//GEN-LAST:event_btn_rsaActionPerformed

    private void btn_eccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eccActionPerformed
        new frm_ECC().setVisible(true);
    }//GEN-LAST:event_btn_eccActionPerformed

    private void btn_rsaaesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rsaaesActionPerformed
        new frm_RSA_AES().setVisible(true);
    }//GEN-LAST:event_btn_rsaaesActionPerformed

    private void btn_signatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signatureActionPerformed
        new frm_ECC_Signature().setVisible(true);
    }//GEN-LAST:event_btn_signatureActionPerformed

    private void btn_sqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sqlActionPerformed
        new frm_KetNoiSQL().setVisible(true);
    }//GEN-LAST:event_btn_sqlActionPerformed

    private void btn_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historyActionPerformed
        new frm_LichSu().setVisible(true);
    }//GEN-LAST:event_btn_historyActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ecc;
    private javax.swing.JButton btn_history;
    private javax.swing.JButton btn_rsa;
    private javax.swing.JButton btn_rsaaes;
    private javax.swing.JButton btn_signature;
    private javax.swing.JButton btn_sql;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}