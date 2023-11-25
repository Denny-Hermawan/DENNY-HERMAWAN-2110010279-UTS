/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import GUI.FUtama;
import GUI.FResepmaincourse;
import GUI.FEResepmaincourse;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Denny Hermawan
 */
public class FMaincourse extends javax.swing.JFrame {
    // Mendeklarasikan DefaultTableModel untuk data tabel breakfast dan SQL untuk query database
    private DefaultTableModel DftJTMaincourse;
    private String SQL;
    
    private void TampilkanData() {
        // Override metode isCellEditable
        // Metode untuk menampilkan data pada tabel maincourse
        DefaultTableModel DftJTMaincourse = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Semua sel tidak dapat di-edit
                return false;
            }
        };
        // Inisialisasi objek DefaultTableModel
        DftJTMaincourse = new DefaultTableModel();
        
        // Menambahkan kolom-kolom ke dalam tabel
        DftJTMaincourse.addColumn("KODE");
        DftJTMaincourse.addColumn("NAMA");
        DftJTMaincourse.addColumn("BAHAN YANG DIPERLUKAN");
        DftJTMaincourse.addColumn("APPROVE");
        DftJTMaincourse.addColumn("CARA MASAK");
        
        // Mengatur model tabel dengan objek DefaultTableModel yang sudah diinisialisasi
        JTMaincourse.setModel (DftJTMaincourse);
        
        // Mendapatkan koneksi ke database
        Connection conn = koneksi.getConnection();
        
        try {
            
            // Membuat statement SQL
            java.sql.Statement stmt = conn.createStatement();
            
            // Menjalankan query untuk mengambil data dari tabel maincourse
            SQL = "select * from maincourse";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            
            // Menambahkan data dari hasil query ke dalam model tabel
            while (res.next()) { 
            DftJTMaincourse.addRow(new Object[] {
                res.getString("kodemasakan"),
                res.getString("nama"),
                res.getString("bahan"),
                res.getString("approve"),
                res.getString("caramasak")
            });
        }
        } catch (SQLException e) {
            // Menangani eksepsi jika terjadi kesalahan SQL
            System.out.println(e.getMessage());
        }
    }
        // Metode untuk mendapatkan nilai dari kolom "KODE" pada baris yang dipilih
        public String getSelectedKode() {
            int selectedRow = JTMaincourse.getSelectedRow();
            if (selectedRow == -1) {
                return null; // or throw an exception, depending on your requirements
            }
            return JTMaincourse.getValueAt(selectedRow, 0).toString();
        }
        
        // Metode untuk mendapatkan nilai dari kolom "NAMA" pada baris yang dipilih
        public String getSelectedNama() {
            int selectedRow = JTMaincourse.getSelectedRow();
            if (selectedRow == -1) {
                return null;
            }
            return JTMaincourse.getValueAt(selectedRow, 1).toString();
        }
        
        // Metode untuk mendapatkan nilai dari kolom "BAHAN" pada baris yang dipilih
        public String getSelectedBahan() {
            int selectedRow = JTMaincourse.getSelectedRow();
            if (selectedRow == -1) {
                return null;
            }
            return JTMaincourse.getValueAt(selectedRow, 2).toString();
        }
        
        // Metode untuk mendapatkan nilai dari kolom "APPROVE" pada baris yang dipilih
        public String getSelectedApprove() {
            int selectedRow = JTMaincourse.getSelectedRow();
            if (selectedRow == -1) {
                return null;
            }
            return JTMaincourse.getValueAt(selectedRow, 3).toString();
        }

        // Metode untuk mendapatkan nilai dari kolom "CAAR MASAK" pada baris yang dipilih
        public String getSelectedCaraMasak() {
            int selectedRow = JTMaincourse.getSelectedRow();
            if (selectedRow == -1) {
                return null;
            }
            return JTMaincourse.getValueAt(selectedRow, 4).toString();
        }

    /**
     * Creates new form FMaincourse
     */
    public FMaincourse() {
        initComponents();
        this.TampilkanData();
        JTMaincourse.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
        BTambahresep = new javax.swing.JButton();
        BKembali = new javax.swing.JButton();
        BHapusresep = new javax.swing.JButton();
        BEditresep = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTMaincourse = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MAIN COURSE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(283, 283, 283))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BTambahresep.setBackground(new java.awt.Color(0, 0, 0));
        BTambahresep.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTambahresep.setForeground(new java.awt.Color(255, 255, 255));
        BTambahresep.setText("TAMBAH RESEP");
        BTambahresep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahresepActionPerformed(evt);
            }
        });

        BKembali.setBackground(new java.awt.Color(0, 0, 0));
        BKembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BKembali.setForeground(new java.awt.Color(255, 255, 255));
        BKembali.setText("<-");
        BKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKembaliActionPerformed(evt);
            }
        });

        BHapusresep.setBackground(new java.awt.Color(0, 0, 0));
        BHapusresep.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BHapusresep.setForeground(new java.awt.Color(255, 255, 255));
        BHapusresep.setText("HAPUS RESEP");
        BHapusresep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusresepActionPerformed(evt);
            }
        });

        BEditresep.setBackground(new java.awt.Color(0, 0, 0));
        BEditresep.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BEditresep.setForeground(new java.awt.Color(255, 255, 255));
        BEditresep.setText("EDIT RESEP");
        BEditresep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditresepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(BKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTambahresep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BEditresep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BHapusresep)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTambahresep)
                    .addComponent(BKembali)
                    .addComponent(BEditresep)
                    .addComponent(BHapusresep))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        JTMaincourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "KODE", "NAMA", "BAHAN YANG DIPERLUKAN", "CARA MASAK", "APPROVE"
            }
        ));
        JTMaincourse.setRowSelectionAllowed(false);
        JTMaincourse.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JTMaincourse.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                JTMaincourseComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(JTMaincourse);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKembaliActionPerformed
        this.setVisible(false);

        // Menampilkan kembali frame FUtama
        FUtama frameUtama = new FUtama();
        frameUtama.setVisible(true);
    }//GEN-LAST:event_BKembaliActionPerformed

    private void JTMaincourseComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_JTMaincourseComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_JTMaincourseComponentShown

    private void BHapusresepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusresepActionPerformed
        try {
            // Mendapatkan indeks baris yang dipilih
            int selectedRow = JTMaincourse.getSelectedRow();

            // Memeriksa apakah ada baris yang dipilih
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Pilih resep yang ingin dihapus.");
                return;
            }

            // Konfirmasi pengguna sebelum menghapus
            int confirmResult = JOptionPane.showConfirmDialog(
                this,
                "Anda yakin ingin menghapus resep ini?",
                "Konfirmasi Hapus",
                JOptionPane.YES_NO_OPTION);

            // Jika pengguna memilih "Ya" (YES_OPTION), lanjutkan dengan penghapusan
            if (confirmResult == JOptionPane.YES_OPTION) {
                // Mendapatkan nilai kode masakan dari baris yang dipilih
                String kodeMasakan = JTMaincourse.getValueAt(selectedRow, 0).toString();

                // Query SQL untuk menghapus data berdasarkan kode masakan
                String sql = "DELETE FROM maincourse WHERE kodemasakan=?";

                // Dapatkan koneksi ke database
                Connection conn = koneksi.getConnection();

                // Gunakan PreparedStatement untuk mencegah SQL Injection
                try (java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    // Set parameter pada PreparedStatement
                    pstmt.setString(1, kodeMasakan);

                    // Eksekusi query SQL
                    pstmt.executeUpdate();
                }

                // Hapus baris dari model tabel
                DefaultTableModel model = (DefaultTableModel) JTMaincourse.getModel();
                model.removeRow(selectedRow);

                // Tambahkan logika tambahan jika diperlukan, seperti memberikan pesan ke pengguna
                JOptionPane.showMessageDialog(this, "Resep berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            // Tangani eksepsi jika terjadi kesalahan SQL
            e.printStackTrace(); // Cetak trace eksepsi ke konsol (opsional)
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan SQL: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Tangani eksepsi jika terjadi kesalahan lainnya
            e.printStackTrace(); // Cetak trace eksepsi ke konsol (opsional)
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_BHapusresepActionPerformed

    private void BEditresepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditresepActionPerformed
        // TODO add your handling code here:
        // Mendapatkan indeks baris yang dipilih
        int selectedRow = JTMaincourse.getSelectedRow();

        // Memeriksa apakah ada baris yang dipilih
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih resep yang ingin diedit.");
            return;
        }

        // Mendapatkan nilai-nilai dari baris yang dipilih
        String kodemasakan = JTMaincourse.getValueAt(selectedRow, 0).toString();
        String nama = JTMaincourse.getValueAt(selectedRow, 1).toString();
        String bahan = JTMaincourse.getValueAt(selectedRow, 2).toString();
        String approve = JTMaincourse.getValueAt(selectedRow, 3).toString();
        String caramasak = JTMaincourse.getValueAt(selectedRow, 4).toString();

        // Menyembunyikan frame saat ini (frame saat ini adalah frame yang memiliki tombol BKembali)
        this.setVisible(false);
        // Membuka frame FEResepmaincourse
        FEResepmaincourse frameEditResepMaincourse = new FEResepmaincourse(this);
        frameEditResepMaincourse.setVisible(true);
    }//GEN-LAST:event_BEditresepActionPerformed

    private void BTambahresepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahresepActionPerformed
        // TODO add your handling code here:
        // Menyembunyikan frame saat ini (frame saat ini adalah frame yang memiliki tombol BKembali)
        this.setVisible(false);
        // Menampilkan frame FResepbreakfast
        FResepmaincourse frameResepMaincourse = new FResepmaincourse();
        frameResepMaincourse.setVisible(true);
    }//GEN-LAST:event_BTambahresepActionPerformed

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
            java.util.logging.Logger.getLogger(FMaincourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMaincourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMaincourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMaincourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMaincourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEditresep;
    private javax.swing.JButton BHapusresep;
    private javax.swing.JButton BKembali;
    private javax.swing.JButton BTambahresep;
    private javax.swing.JTable JTMaincourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
