package week_03;

import javax.swing.JOptionPane;

public class frm_RSA extends javax.swing.JFrame {

    private final RSACipher rsa = new RSACipher();

    public frm_RSA() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbo_bits = new javax.swing.JComboBox<>();
        btn_generate = new javax.swing.JButton();
        lbl_keyinfo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_plaintext = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_ciphertext = new javax.swing.JTextArea();
        btn_encrypt = new javax.swing.JButton();
        btn_decrypt = new javax.swing.JButton();
        lbl_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RSA Cipher");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MẬT MÃ RSA (OAEP - SHA-256)");

        jLabel2.setText("Key size:");

        cbo_bits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2048", "3072" }));

        btn_generate.setText("Generate Keys");
        btn_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generateActionPerformed(evt);
            }
        });

        lbl_keyinfo.setText("Chưa có khóa.");

        jLabel3.setText("Plaintext:");

        txt_plaintext.setColumns(20);
        txt_plaintext.setLineWrap(true);
        txt_plaintext.setRows(2);
        jScrollPane1.setViewportView(txt_plaintext);

        jLabel4.setText("Ciphertext:");

        txt_ciphertext.setColumns(20);
        txt_ciphertext.setLineWrap(true);
        txt_ciphertext.setRows(3);
        jScrollPane2.setViewportView(txt_ciphertext);

        btn_encrypt.setText("Encrypt");
        btn_encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_encryptActionPerformed(evt);
            }
        });

        btn_decrypt.setText("Decrypt");
        btn_decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decryptActionPerformed(evt);
            }
        });

        lbl_status.setText("Bấm Generate Keys để tạo cặp khóa.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_encrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_decrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbo_bits, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_keyinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_bits, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_keyinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_encrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_decrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(lbl_status, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generateActionPerformed
        int bits = Integer.parseInt((String) cbo_bits.getSelectedItem());
        try {
            long start = System.currentTimeMillis();
            rsa.generateKeys(bits);
            long ms = System.currentTimeMillis() - start;
            lbl_keyinfo.setText("RSA-" + bits + ": tạo khóa " + ms + " ms, tối đa " + rsa.maxPlaintextBytes() + " byte");
            lbl_status.setText("Đã tạo cặp khóa. Khóa công khai dùng để mã hóa, khóa riêng để giải mã.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Không tạo được khóa: " + ex.getMessage(),
                    "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_generateActionPerformed

    private void btn_encryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encryptActionPerformed
        String plaintext = txt_plaintext.getText();
        if (plaintext.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hãy nhập Plaintext trước khi mã hóa.");
            return;
        }
        try {
            String ciphertext = rsa.encrypt(plaintext);
            txt_ciphertext.setText(ciphertext);
            txt_ciphertext.setCaretPosition(0);
            lbl_status.setText("Đã mã hóa RSA (" + ciphertext.length() + " ký tự Base64). "
                    + HistoryDao.tryInsert("RSA", "ENCRYPT", plaintext.length(), true));
        } catch (Exception ex) {
            HistoryDao.tryInsert("RSA", "ENCRYPT", plaintext.length(), false);
            JOptionPane.showMessageDialog(this, "Mã hóa thất bại: " + ex.getMessage(),
                    "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_encryptActionPerformed

    private void btn_decryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_decryptActionPerformed
        String ciphertext = txt_ciphertext.getText();
        if (ciphertext.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hãy nhập Ciphertext trước khi giải mã.");
            return;
        }
        try {
            String plaintext = rsa.decrypt(ciphertext);
            txt_plaintext.setText(plaintext);
            txt_plaintext.setCaretPosition(0);
            lbl_status.setText("Đã giải mã RSA. " + HistoryDao.tryInsert("RSA", "DECRYPT", ciphertext.length(), true));
        } catch (Exception ex) {
            HistoryDao.tryInsert("RSA", "DECRYPT", ciphertext.length(), false);
            lbl_status.setText("Giải mã RSA THẤT BẠI (sai khóa hoặc bản mã bị sửa).");
            JOptionPane.showMessageDialog(this, "Giải mã thất bại: sai khóa riêng hoặc bản mã bị sửa.\n" + ex,
                    "Giải mã thất bại", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_decryptActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new frm_RSA().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_decrypt;
    private javax.swing.JButton btn_encrypt;
    private javax.swing.JButton btn_generate;
    private javax.swing.JComboBox<String> cbo_bits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_keyinfo;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JTextArea txt_ciphertext;
    private javax.swing.JTextArea txt_plaintext;
    // End of variables declaration//GEN-END:variables
}