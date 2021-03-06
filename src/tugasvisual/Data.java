/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasvisual;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Melin
 */
public class Data extends javax.swing.JFrame {
        Koneksi koneksi;
        Statement st; //digunakan utk eksekusi query
        ResultSet rs; //sbg pointer utk menunjuk suatu baris pd tabel
        
    
    private void kosongkan_form(){
        nim.setText(null);
        nama.setText(null);
        jurusan.setSelectedItem(null);
        alamat.setText(null);
        email.setText(null);
        noHp.setText(null);
    }
    
    public void tampil(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Jurusan");
        model.addColumn("Alamat");
        model.addColumn("E-mail");
        model.addColumn("No. Tlp");
       
        try{
            int no = 1;
            st =(Statement) koneksi.con.createStatement();
            String sql = "SELECT * FROM data_mhs";
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(new Object[]{no++,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                
            }
            tabelMhs.setModel(model);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error : "+e.getMessage());
        }
    }
    
    public Data() {
        koneksi = new Koneksi();
        initComponents();
        setLocationRelativeTo(this);
        tampil();
        kosongkan_form();      
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMhs = new javax.swing.JTable();
        del = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        jurusan = new javax.swing.JComboBox<>();
        noHp = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        nim = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setBackground(new java.awt.Color(102, 102, 102));
        add.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        add.setText("INSERT");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        tabelMhs.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMhs);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 60, 470, 250));

        del.setBackground(new java.awt.Color(102, 102, 102));
        del.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        del.setText("DELETE");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        getContentPane().add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        edit.setBackground(new java.awt.Color(102, 102, 102));
        edit.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 80, -1));

        simpan.setBackground(new java.awt.Color(102, 102, 102));
        simpan.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        simpan.setText("SAVE");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 80, -1));

        jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEKNIK INFORMATIKA", "TEKNIK SIPIL", "TEKNIK ELEKTRO", "TEKNIK MESIN" }));
        jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurusanActionPerformed(evt);
            }
        });
        getContentPane().add(jurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 240, 30));
        getContentPane().add(noHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 240, 30));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 240, 30));
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 240, 30));

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 240, 30));
        getContentPane().add(nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 240, 30));

        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 153, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Daftar Mahasiswa Berprestasi");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 470, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("MAHASISWA BERPRESTASI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 260, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("NO HP");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("NAMA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("NIM");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("JURUSAN");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("ALAMAT");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("EMAIL");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        try{
             String n = nim.getText();
             String nam = nama.getText();
             String j = (String) jurusan.getSelectedItem();
             String al = alamat.getText();
             String em = email.getText();
             String no = noHp.getText();

            String sql = "insert into data_mhs values('"+n+"','"+nam+"','"+j+"','"+al+"','"+em+"','"+no+"')";
            java.sql.PreparedStatement pstm = koneksi.con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Proses tambah data berhasil");
            tampil();
            kosongkan_form();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error : "+e.getMessage());
    }                // TODO add your handling code here:
    }//GEN-LAST:event_simpanActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        try{
            String n = nim.getText();
            String nam = nama.getText();
            String j = (String) jurusan.getSelectedItem();
            String al = alamat.getText();
            String em = email.getText();
            String no = noHp.getText();
            String sql = "update data_mhs set NIM= '"+n+"', nama= '"+nam+"',Jurusan= '"+j+"',Alamat = '"+al+"',Email = '"+em+"',NoHP = '"+no+"' WHERE NIM= '"+n+"'";
            java.sql.PreparedStatement pstm = koneksi.con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Proses Edit data berhasil");
            tampil();
            kosongkan_form();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"error : "+e.getMessage());
        }
    }//GEN-LAST:event_editActionPerformed

    private void tabelMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMhsMouseClicked
        int baris = tabelMhs.rowAtPoint(evt.getPoint());
        String n = tabelMhs.getValueAt(baris,1).toString();
        nim.setText(n);
        String nam = tabelMhs.getValueAt(baris,2).toString();
        nama.setText(nam);
        String j = tabelMhs.getValueAt(baris,3).toString();
        jurusan.setSelectedItem(j);
        String al = tabelMhs.getValueAt(baris,4).toString();
        alamat.setText(al);
        String em = tabelMhs.getValueAt(baris,5).toString();
        email.setText(em);
        String no = tabelMhs.getValueAt(baris,6).toString();
        noHp.setText(no);
        
    }//GEN-LAST:event_tabelMhsMouseClicked

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
       try{
            String n = nim.getText();
            String sql = "Delete from data_mhs where NIM= '"+n+"'";
            java.sql.PreparedStatement pstm = koneksi.con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Proses Hapus data berhasil");
            tampil();
            kosongkan_form();
       }catch(Exception e){
       JOptionPane.showMessageDialog(null,"error : "+e.getMessage());
       
       }
    }//GEN-LAST:event_delActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
           kosongkan_form();
    }//GEN-LAST:event_addActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jurusanActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
     
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
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton del;
    private javax.swing.JButton edit;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jurusan;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JTextField noHp;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabelMhs;
    // End of variables declaration//GEN-END:variables
}
