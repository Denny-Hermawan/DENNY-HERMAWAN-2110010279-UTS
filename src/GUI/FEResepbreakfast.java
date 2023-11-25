/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import GUI.FBreakfast;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.Toolkit;


/**
 *
 * @author Denny Hermawan
 */
public class FEResepbreakfast extends javax.swing.JFrame {
    // Mendeklarasikan variabel fBreakfast sebagai referensi ke instans FBreakfast
    private FBreakfast fBreakfast;

    /**
     * Konstruktor kelas FEResepbreakfast.
     * @param fBreakfast Referensi ke instans FBreakfast yang digunakan untuk mengakses data terpilih.
     */
    public FEResepbreakfast(FBreakfast fBreakfast) {
        initComponents();
        // Menyimpan referensi fBreakfast yang diteruskan sebagai parameter ke variabel instans fBreakfast
        this.fBreakfast = fBreakfast;

        // Mengakses data terpilih dari FBreakfast
        String kodemasakan = fBreakfast.getSelectedKode();
        String nama = fBreakfast.getSelectedNama();
        String bahan = fBreakfast.getSelectedBahan();
        String approve = fBreakfast.getSelectedApprove();
        String caramasak = fBreakfast.getSelectedCaraMasak();

        // Mengisi UI Components dengan data terpilih
        TFKode.setText(kodemasakan);
        TFNama.setText(nama);
        JTABahan.setText(bahan);
        TFApprove.setText(approve);
        JTACaramasak.setText(caramasak);
    }

    

    /**
     * Creates new form FEResepbreakfast
     */
    public FEResepbreakfast() {
        initComponents();
        // Menetapkan lokasi form ke tengah layar
        centerFrame();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void centerFrame() {
        // Mendapatkan ukuran layar
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Mendapatkan ukuran form
        Dimension frameSize = this.getSize();

        // Menghitung posisi x dan y untuk membuat form berada di tengah layar
        int x = (screenSize.width - frameSize.width) / 2;
        int y = (screenSize.height - frameSize.height) / 2;

        // Menetapkan lokasi form
        this.setLocation(x, y);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTABahan = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTACaramasak = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        TFApprove = new javax.swing.JTextField();
        BKembali = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TFKode = new javax.swing.JTextField();
        BSimpanperubahan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDIT RESEP BREAKFAST");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NAMA :");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("BAHAN :");

        TFNama.setBackground(new java.awt.Color(255, 255, 255));
        TFNama.setForeground(new java.awt.Color(0, 0, 0));
        TFNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNamaActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        JTABahan.setBackground(new java.awt.Color(255, 255, 255));
        JTABahan.setColumns(20);
        JTABahan.setForeground(new java.awt.Color(0, 0, 0));
        JTABahan.setLineWrap(true);
        JTABahan.setRows(5);
        JTABahan.setWrapStyleWord(true);
        jScrollPane1.setViewportView(JTABahan);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CARA MASAK :");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        JTACaramasak.setBackground(new java.awt.Color(255, 255, 255));
        JTACaramasak.setColumns(20);
        JTACaramasak.setForeground(new java.awt.Color(0, 0, 0));
        JTACaramasak.setLineWrap(true);
        JTACaramasak.setRows(5);
        JTACaramasak.setWrapStyleWord(true);
        jScrollPane2.setViewportView(JTACaramasak);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("APPROVE BY:");

        TFApprove.setBackground(new java.awt.Color(255, 255, 255));
        TFApprove.setForeground(new java.awt.Color(0, 0, 0));
        TFApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFApproveActionPerformed(evt);
            }
        });

        BKembali.setBackground(new java.awt.Color(0, 0, 0));
        BKembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BKembali.setForeground(new java.awt.Color(255, 255, 255));
        BKembali.setText("KEMBALI");
        BKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKembaliActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("KODE :");

        TFKode.setBackground(new java.awt.Color(255, 255, 255));
        TFKode.setForeground(new java.awt.Color(0, 0, 0));
        TFKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFKodeActionPerformed(evt);
            }
        });

        BSimpanperubahan.setBackground(new java.awt.Color(0, 0, 0));
        BSimpanperubahan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BSimpanperubahan.setForeground(new java.awt.Color(255, 255, 255));
        BSimpanperubahan.setText("SIMPAN PERUBAHAN");
        BSimpanperubahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSimpanperubahanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BSimpanperubahan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BKembali)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFKode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFApprove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(TFNama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                        .addGap(57, 69, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFApprove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BKembali)
                    .addComponent(BSimpanperubahan))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNamaActionPerformed

    private void TFApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFApproveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFApproveActionPerformed

    private void BKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKembaliActionPerformed
        // Menyembunyikan frame saat ini (frame saat ini adalah frame yang memiliki tombol BKembali)
        this.setVisible(false);

        // Menampilkan kembali frame FUtama
        FBreakfast frameBreakfast = new FBreakfast();
        frameBreakfast.setVisible(true);
    }//GEN-LAST:event_BKembaliActionPerformed

    private void TFKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFKodeActionPerformed

    private void BSimpanperubahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSimpanperubahanActionPerformed
        try {
        // Dapatkan nilai dari inputan
        String kodeMasakan = TFKode.getText();
        String nama = TFNama.getText();
        String bahan = JTABahan.getText();
        String approve = TFApprove.getText();
        String caraMasak = JTACaramasak.getText();

        // Query SQL untuk memperbarui data
        String sql = "UPDATE breakfast SET nama='" + nama + "', bahan='" + bahan + "', approve='" + approve + "', caramasak='" + caraMasak + "' WHERE kodemasakan='" + kodeMasakan + "'";

        // Eksekusi query SQL, atau gunakan PreparedStatement untuk mencegah SQL Injection
        java.sql.Connection conn = koneksi.getConnection(); // Dapatkan koneksi ke database
        java.sql.Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);

        // Tambahkan logika tambahan jika diperlukan, seperti menutup frame atau memberikan pesan ke pengguna
        JOptionPane.showMessageDialog(this, "Perubahan berhasil disimpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        
        // Menampilkan kembali frame FBreakfast
        FBreakfast frameBreakfast = new FBreakfast();
        frameBreakfast.setVisible(true);
    } catch (Exception e) {
        // Tangani eksepsi jika terjadi kesalahan
        e.printStackTrace(); // Cetak trace eksepsi ke konsol (opsional)
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_BSimpanperubahanActionPerformed

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
            java.util.logging.Logger.getLogger(FEResepbreakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FEResepbreakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FEResepbreakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FEResepbreakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FEResepbreakfast().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BKembali;
    private javax.swing.JButton BSimpanperubahan;
    private javax.swing.JTextArea JTABahan;
    private javax.swing.JTextArea JTACaramasak;
    private javax.swing.JTextField TFApprove;
    private javax.swing.JTextField TFKode;
    private javax.swing.JTextField TFNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
