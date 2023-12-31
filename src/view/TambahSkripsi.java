/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import dao.DaoSkripsi;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import parsisten.Skripsi;
import servis.ServiceSkripsi;

/**
 *
 * @author fatiq
 */
public class TambahSkripsi extends javax.swing.JDialog {

    /**
     * Creates new form TambahBuku
     */
    private Skripsi mod = new Skripsi();
    private ServiceSkripsi servis = new DaoSkripsi();
    
    public TambahSkripsi(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents();
        jLabel1.requestFocus();
        tf_id.setText(servis.nomer());
    }
    
    public TambahSkripsi(java.awt.Frame parent, boolean modal, String id){
        super(parent, modal);
        initComponents();
        jLabel1.requestFocus();
        mod = servis.getById(id);
        
        setForm(mod);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGradientVertikal1 = new custom.JPanelGradientVertikal();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_judul = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_fakultas = new javax.swing.JTextField();
        tf_prodi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_bahasa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_tahun = new javax.swing.JTextField();
        tf_penulis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sp_jmlHal = new javax.swing.JSpinner();
        sp_jmlSal = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_kategori = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lb_foto = new javax.swing.JLabel();
        tf_path = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tf_kategori = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_pembimbing = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LibraLinx Tambah Buku");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/iconlibralinx.png")).getImage());

        jPanelGradientVertikal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 50, 124)));
        jPanelGradientVertikal1.setCStart(new java.awt.Color(68, 50, 124));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tambah Data Skripsi");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tf_id.setEditable(false);
        tf_id.setForeground(new java.awt.Color(68, 50, 124));
        tf_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(68, 50, 124)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(68, 50, 124));
        jLabel2.setText("ID Skripsi");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(68, 50, 124));
        jLabel3.setText("Judul Skripsi");

        tf_judul.setForeground(new java.awt.Color(68, 50, 124));
        tf_judul.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(68, 50, 124)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(68, 50, 124));
        jLabel4.setText("Fakultas");

        tf_fakultas.setForeground(new java.awt.Color(68, 50, 124));
        tf_fakultas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(68, 50, 124)));

        tf_prodi.setForeground(new java.awt.Color(68, 50, 124));
        tf_prodi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(68, 50, 124)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(68, 50, 124));
        jLabel5.setText("Program Studi");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(68, 50, 124));
        jLabel6.setText("Bahasa");

        tf_bahasa.setForeground(new java.awt.Color(68, 50, 124));
        tf_bahasa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_bahasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(68, 50, 124)));
        tf_bahasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_bahasaKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(68, 50, 124));
        jLabel7.setText("Tahun");

        tf_tahun.setForeground(new java.awt.Color(68, 50, 124));
        tf_tahun.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_tahun.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(68, 50, 124)));
        tf_tahun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_tahunKeyTyped(evt);
            }
        });

        tf_penulis.setForeground(new java.awt.Color(68, 50, 124));
        tf_penulis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(68, 50, 124)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(68, 50, 124));
        jLabel8.setText("Penulis");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(68, 50, 124));
        jLabel9.setText("Jumlah Halaman");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(68, 50, 124));
        jLabel10.setText("Jumlah Salinan");

        sp_jmlHal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 50, 124)));
        sp_jmlHal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sp_jmlHalKeyTyped(evt);
            }
        });

        sp_jmlSal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 50, 124)));
        sp_jmlSal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sp_jmlSalKeyTyped(evt);
            }
        });

        tbl_kategori.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tbl_kategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategori"
            }
        ));
        jScrollPane1.setViewportView(tbl_kategori);

        jButton1.setBackground(new java.awt.Color(68, 50, 124));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(68, 50, 124));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lb_foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 50, 124)));

        tf_path.setEditable(false);
        tf_path.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tf_path.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 50, 124)));

        jButton5.setBackground(new java.awt.Color(68, 50, 124));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btn_simpan.setBackground(new java.awt.Color(0, 200, 0));
        btn_simpan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(200, 0, 0));
        btn_batal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(68, 50, 124));
        jLabel11.setText("Kategori");

        tf_kategori.setForeground(new java.awt.Color(68, 50, 124));
        tf_kategori.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(68, 50, 124)));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(68, 50, 124));
        jLabel12.setText("Pembimbing");

        tf_pembimbing.setForeground(new java.awt.Color(68, 50, 124));
        tf_pembimbing.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(68, 50, 124)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_judul)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tf_fakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_prodi)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_pembimbing, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_kategori, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(tf_bahasa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(tf_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_penulis)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sp_jmlHal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(sp_jmlSal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tf_path, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                                    .addComponent(lb_foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_batal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_fakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_prodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tf_pembimbing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_bahasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(tf_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp_jmlSal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp_jmlHal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_path, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_batal)
                                .addGap(8, 8, 8)
                                .addComponent(btn_simpan)))))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanelGradientVertikal1Layout = new javax.swing.GroupLayout(jPanelGradientVertikal1);
        jPanelGradientVertikal1.setLayout(jPanelGradientVertikal1Layout);
        jPanelGradientVertikal1Layout.setHorizontalGroup(
            jPanelGradientVertikal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradientVertikal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelGradientVertikal1Layout.setVerticalGroup(
            jPanelGradientVertikal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGradientVertikal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGradientVertikal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGradientVertikal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) tbl_kategori.getModel();
        String kategori = tf_kategori.getText();
        tbl.addRow(new Object[]{kategori});
        tbl_kategori.setModel(tbl);
        tf_kategori.setText("");
        jLabel1.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) tbl_kategori.getModel();                                        
        int index = tbl_kategori.getSelectedRow();
        try {
            tbl.removeRow(index);
        } catch (IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus");
        }
        tbl_kategori.setModel(tbl);
        jLabel1.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE","jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File fi = file.getSelectedFile();
            String path = fi.getAbsolutePath();
            tf_path.setText(path);
            try{
                byte[] img = Files.readAllBytes(fi.toPath());
                mod.setFotoSampul(img);
                ImageIcon imgIcon = new ImageIcon(img);

                double lbW = lb_foto.getWidth();
                double lbH = lb_foto.getHeight();

                double imgW = imgIcon.getIconWidth();
                double imgH = imgIcon.getIconHeight();

                double scaleX   = (double) lbW / (double) imgW;
                double scaleY   = (double) lbH / (double) imgH;
                double scale    = Math.min(scaleX, scaleY);

                Image scaleImg = imgIcon.getImage().getScaledInstance((int) (scale * imgW), (int) (scale * imgH),Image.SCALE_SMOOTH);

                
                lb_foto.setIcon(new ImageIcon(scaleImg));
            }  catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        jLabel1.requestFocus();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        dispose();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        mod.setIdSkripsi(tf_id.getText());
        mod.setJudul(tf_judul.getText());
        mod.setProgramStudi(tf_prodi.getText());
        mod.setBahasa(tf_bahasa.getText());
        mod.setFakultas(tf_fakultas.getText());
        mod.setTahun(tf_tahun.getText());
        mod.setPenulis(tf_penulis.getText());
        mod.setPembimbing(tf_pembimbing.getText());
        mod.setJumlahHalaman(Integer.parseInt(sp_jmlHal.getValue().toString()));
        mod.setJumlahSalinan(Integer.parseInt(sp_jmlSal.getValue().toString()));
        
        List<String> kategori = new ArrayList();
        DefaultTableModel tblK = (DefaultTableModel) tbl_kategori.getModel();                                         
        int indexK = tblK.getRowCount()-1;           
        
        for(int i = 0; i<= indexK; i++){
            String k = tblK.getValueAt(i, 0).toString();
            kategori.add(k);
        }
        
        mod.setKategori(kategori);
        if(jLabel1.getText().equalsIgnoreCase("Tambah Data Skripsi"))
            servis.tambahData(mod);
        else
            servis.ubahData(mod);
        
        dispose();
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void tf_tahunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_tahunKeyTyped
        char a = evt.getKeyChar();
        if(!Character.isDigit(a)||tf_tahun.getText().length() >= 4)
            evt.consume();
    }//GEN-LAST:event_tf_tahunKeyTyped

    private void sp_jmlHalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sp_jmlHalKeyTyped
        char a = evt.getKeyChar();
        if(!Character.isDigit(a))
            evt.consume();
    }//GEN-LAST:event_sp_jmlHalKeyTyped

    private void sp_jmlSalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sp_jmlSalKeyTyped
        char a = evt.getKeyChar();
        if(!Character.isDigit(a))
            evt.consume();
    }//GEN-LAST:event_sp_jmlSalKeyTyped

    private void tf_bahasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_bahasaKeyTyped
        if(tf_bahasa.getText().length() >= 15)
            evt.consume();
    }//GEN-LAST:event_tf_bahasaKeyTyped

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
            java.util.logging.Logger.getLogger(TambahSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TambahSkripsi dialog = null;
                dialog = new TambahSkripsi(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private custom.JPanelGradientVertikal jPanelGradientVertikal1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_foto;
    private javax.swing.JSpinner sp_jmlHal;
    private javax.swing.JSpinner sp_jmlSal;
    private javax.swing.JTable tbl_kategori;
    private javax.swing.JTextField tf_bahasa;
    private javax.swing.JTextField tf_fakultas;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_judul;
    private javax.swing.JTextField tf_kategori;
    private javax.swing.JTextField tf_path;
    private javax.swing.JTextField tf_pembimbing;
    private javax.swing.JTextField tf_penulis;
    private javax.swing.JTextField tf_prodi;
    private javax.swing.JTextField tf_tahun;
    // End of variables declaration//GEN-END:variables

    private void setForm(Skripsi mod) {
       jLabel1.setText("Perbarui Data Skripsi");
        
        tf_id.setText(mod.getIdSkripsi());
        tf_judul.setText(mod.getJudul());
        tf_prodi.setText(mod.getProgramStudi());
        tf_fakultas.setText(mod.getFakultas());
        tf_bahasa.setText(mod.getBahasa());
        tf_tahun.setText(mod.getTahun());
        tf_penulis.setText(mod.getPenulis());
        tf_pembimbing.setText(mod.getPembimbing());
        sp_jmlHal.setValue(mod.getJumlahHalaman());
        sp_jmlSal.setValue(mod.getJumlahSalinan());
        
        if(mod.getFotoSampul()!= null){
            byte[] img = mod.getFotoSampul();
            ImageIcon imgIcon = new ImageIcon(img);
            double lbW = lb_foto.getWidth();
            double lbH = lb_foto.getHeight();
            double imgW = imgIcon.getIconWidth();
            double imgH = imgIcon.getIconHeight();
            double scaleX   = (double) lbW / (double) imgW;
            double scaleY   = (double) lbH / (double) imgH;
            double scale    = Math.min(scaleX, scaleY);
            Image scaleImg = imgIcon.getImage().getScaledInstance((int) (scale * imgW), (int) (scale * imgH),Image.SCALE_SMOOTH);
            lb_foto.setIcon(new ImageIcon(scaleImg));
        }
        
        DefaultTableModel tbl = (DefaultTableModel) tbl_kategori.getModel();
        if(mod.getKategori() != null){
            for(String data : mod.getKategori()){
                tbl.addRow(new Object[]{data});
            }
        }
    }
}
