/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controller.Kereta;
import Controller.Gerbong;

/**
 *
 * @author Anggi
 */
public class HomeFrame extends javax.swing.JFrame {

    private ArrayList<Kereta> keretas = DataHolder.keretas; 
    private ArrayList<Tiket> tikets = DataHolder.tikets;
    private ArrayList<String> keretaComboDatas = new ArrayList<String>();
    private ArrayList<String> gerbongComboDatas = new ArrayList<String>();
    
    /**
     * Creates new form HomeFrame
     */
    public HomeFrame(boolean isAdmin) {
        for (Kereta kereta : keretas) {
            keretaComboDatas.add(kereta.getNama());
        }
        
        initComponents();
        mainTabbedPane.add("Cek Kereta", new CekKeretaPanel());
        mainTabbedPane.add("Cari Tiket", new CariTiketPanel());
        
        if (isAdmin)
            mainTabbedPane.add("Pegawai", new PegawaiPanel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTabbedPane = new javax.swing.JTabbedPane();
        pesanTikeBaruPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        infoNamaKeretaTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        infoStasiunAsalTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        infoStasiunTujuanTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        gerbongsTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        infoJadwalSpinner = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        keretaCombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        gerbongCombo = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        noKTPTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamatArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        pesanTiketButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        kodeTiketTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mainTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mainTabbedPaneStateChanged(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Info Kereta"));
        jPanel3.setToolTipText("");

        jLabel2.setText("Nama Kereta");

        infoNamaKeretaTextField.setEditable(false);

        jLabel3.setText("Stasiun Asal");

        infoStasiunAsalTextField.setEditable(false);

        jLabel5.setText("Stasiun Tujuan");

        infoStasiunTujuanTextField.setEditable(false);

        gerbongsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(gerbongsTable);

        jLabel6.setText("Info Gerbong");

        jLabel7.setText("Jadwal");

        infoJadwalSpinner.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoStasiunTujuanTextField)
                            .addComponent(infoStasiunAsalTextField)
                            .addComponent(infoNamaKeretaTextField)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(infoJadwalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(infoNamaKeretaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(infoStasiunAsalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(infoStasiunTujuanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(infoJadwalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Pilih Kereta"));

        jLabel1.setText("Pilih Kereta Api");

        keretaCombo.setModel(new javax.swing.DefaultComboBoxModel(keretaComboDatas.toArray()));
        keretaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keretaComboActionPerformed(evt);
            }
        });

        jLabel4.setText("Pilih Gerbong");

        gerbongCombo.setModel(new javax.swing.DefaultComboBoxModel(gerbongComboDatas.toArray()));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(keretaCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerbongCombo, 0, 243, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(keretaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(gerbongCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Diri Penumpang"));

        jLabel8.setText("No KTP");

        jLabel9.setText("Nama");

        alamatArea.setColumns(20);
        alamatArea.setRows(5);
        jScrollPane2.setViewportView(alamatArea);

        jLabel10.setText("Alamat");

        pesanTiketButton.setText("Pesan Tiket");
        pesanTiketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanTiketButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Kode Tiket");

        kodeTiketTextField.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pesanTiketButton))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kodeTiketTextField)
                    .addComponent(noKTPTextField)
                    .addComponent(namaTextField)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(noKTPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodeTiketTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(pesanTiketButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout pesanTikeBaruPanelLayout = new javax.swing.GroupLayout(pesanTikeBaruPanel);
        pesanTikeBaruPanel.setLayout(pesanTikeBaruPanelLayout);
        pesanTikeBaruPanelLayout.setHorizontalGroup(
            pesanTikeBaruPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesanTikeBaruPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesanTikeBaruPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pesanTikeBaruPanelLayout.setVerticalGroup(
            pesanTikeBaruPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesanTikeBaruPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesanTikeBaruPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pesanTikeBaruPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        mainTabbedPane.addTab("Pesan Tiket Baru", pesanTikeBaruPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayDataKereta() {
        Kereta kereta = keretas.get(keretaCombo.getSelectedIndex());
        String[] gerbongsTableTitles = {"No", "Kode Gerbong", "Harga", "Jumlah Kursi", "Terpesan"};
        String[][] gerbongsTableDatas = new String[kereta.getGerbongs().size()][gerbongsTableTitles.length];
        
        gerbongComboDatas.clear();
        int i = 0;
        for (Gerbong gerbong : kereta.getGerbongs()) {
            gerbongComboDatas.add(gerbong.getKodeGerbong());
            gerbongsTableDatas[i][1] = gerbong.getKodeGerbong();
            gerbongsTableDatas[i][2] = String.valueOf(gerbong.getHarga());
            gerbongsTableDatas[i][3] = String.valueOf(gerbong.getJumlahKursi());
            gerbongsTableDatas[i][4] = String.valueOf(gerbong.getPenumpangs().size());
            gerbongsTableDatas[i][0] = String.valueOf(++i);
        }
        
        gerbongCombo.setModel(new javax.swing.DefaultComboBoxModel(gerbongComboDatas.toArray()));
        gerbongsTable.setModel(new DefaultTableModel(gerbongsTableDatas, gerbongsTableTitles));
        infoNamaKeretaTextField.setText(kereta.getNama());
infoStasiunAsalTextField.setText(kereta.getRute().getAsal().getNama() + ", " + kereta.getRute().getAsal().getDaerah());
        infoStasiunTujuanTextField.setText(kereta.getRute().getTujuan().getNama() + ", " + kereta.getRute().getTujuan().getDaerah());
        infoJadwalSpinner.setValue(kereta.getJadwal());
    }
    
    private void keretaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keretaComboActionPerformed
        displayDataKereta();
    }//GEN-LAST:event_keretaComboActionPerformed

    private void pesanTiketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanTiketButtonActionPerformed
        Kereta k = keretas.get(keretaCombo.getSelectedIndex());
        Gerbong g = k.getGerbongs().get(gerbongCombo.getSelectedIndex());
        
        Penumpang p = new Penumpang();
        p.setNoKTP(noKTPTextField.getText());
        p.setNama(namaTextField.getText());
        p.setAlamat(alamatArea.getText());
        
        Tiket t = new Tiket(p, new Date());
        t.setGerbong(g);
        t.setKereta(k);
        t.setNoKursi(g.addPenumpang(p));
        
        tikets.add(t);
        kodeTiketTextField.setText(t.getNoKursi());
        System.out.println(t);
        
        displayDataKereta();
    }//GEN-LAST:event_pesanTiketButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(null, 
            "Apakah anda yakin logout dan kembali ke menu login?", "Logout", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            this.setVisible(false);
            
            LoginFrame login = new LoginFrame();
            login.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosing

    private void mainTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mainTabbedPaneStateChanged
        if (mainTabbedPane.getSelectedComponent().getClass().toString().equals(CekKeretaPanel.class.toString())) {
            ((CekKeretaPanel) mainTabbedPane.getSelectedComponent()).reload();
        } else if(mainTabbedPane.getSelectedComponent().equals(pesanTikeBaruPanel)) {
            reload();
        }
    }//GEN-LAST:event_mainTabbedPaneStateChanged

    public void reload() {
        displayDataKereta();
    }
    
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
                if ("Mac OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame(true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatArea;
    private javax.swing.JComboBox gerbongCombo;
    private javax.swing.JTable gerbongsTable;
    private javax.swing.JSpinner infoJadwalSpinner;
    private javax.swing.JTextField infoNamaKeretaTextField;
    private javax.swing.JTextField infoStasiunAsalTextField;
    private javax.swing.JTextField infoStasiunTujuanTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox keretaCombo;
    private javax.swing.JTextField kodeTiketTextField;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField noKTPTextField;
    private javax.swing.JPanel pesanTikeBaruPanel;
    private javax.swing.JButton pesanTiketButton;
    // End of variables declaration//GEN-END:variables
}
