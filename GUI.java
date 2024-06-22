package view;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.AccessibleRole;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.dsO;
import model.luotThayDoi;
import model.o;

public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    dsO list;
    ArrayList<JButton> listBtn;
    ArrayList<luotThayDoi> dsThayDoi = new ArrayList();
    int checkNguoiChoi = 0;
    int soLuongQuanNguoiChoi2 = 0;
    int soLuongQuanNguoiChoi1 = 0;

    public GUI() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        list = new dsO();
        khoiTao();

    }

    void khoiTao() {
        listBtn = new ArrayList<>();
        listBtn.add(btnDan1);
        listBtn.add(btnDan2);
        listBtn.add(btnDan3);
        listBtn.add(btnDan4);
        listBtn.add(btnDan5);
        listBtn.add(btnQuan2);
        listBtn.add(btnDan6);
        listBtn.add(btnDan7);
        listBtn.add(btnDan8);
        listBtn.add(btnDan9);
        listBtn.add(btnDan10);
        listBtn.add(btnQuan1);
        for (int i = 0; i < 12; i++) {
            if (i == 5 || i == 11) {
                listBtn.get(i).setText("10");
            } else {
                listBtn.get(i).setText("5");
            }
        }
        for (JButton btn : listBtn) {
            System.out.printf(btn.getName() + " ");
        }
        System.out.println("");
        lbQuanNguoiChoi2.setText("0");
        lbQuanNguoiChoi1.setText("0");
        rdNguoiChoi2.setSelected(false);
        rdNguoiChoi1.setSelected(true);
        rdMay.setSelected(true);
        soLuongQuanNguoiChoi2 = soLuongQuanNguoiChoi1 = checkNguoiChoi = 0;
        dsThayDoi.clear();
        rdNguoiChoi2.setText("Computer turn");
        jLabel1.setText("Number of computer:");
        jLabel2.setText("Number of player:");
        rdNguoiChoi1.setText("Player turn");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnDan1 = new javax.swing.JButton();
        btnDan2 = new javax.swing.JButton();
        btnDan3 = new javax.swing.JButton();
        btnDan4 = new javax.swing.JButton();
        btnDan5 = new javax.swing.JButton();
        btnDan10 = new javax.swing.JButton();
        btnDan9 = new javax.swing.JButton();
        btnDan8 = new javax.swing.JButton();
        btnDan7 = new javax.swing.JButton();
        btnDan6 = new javax.swing.JButton();
        btnQuan2 = new javax.swing.JButton();
        btnQuan1 = new javax.swing.JButton();
        rdMay = new javax.swing.JRadioButton();
        rdNguoi = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbQuanNguoiChoi2 = new javax.swing.JLabel();
        lbQuanNguoiChoi1 = new javax.swing.JLabel();
        rdNguoiChoi1 = new javax.swing.JRadioButton();
        rdNguoiChoi2 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnINew = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnitemThoat = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Umbrella game");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(2, 21, -3, -3));

        btnDan1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnDan1.setText("5");
        btnDan1.setActionCommand("0");
        btnDan1.setName("Dan1"); // NOI18N
        btnDan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDan1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDan1);

        btnDan2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnDan2.setText("5");
        btnDan2.setActionCommand("1");
        btnDan2.setName("Dan2"); // NOI18N
        btnDan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDan1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDan2);

        btnDan3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnDan3.setText("5");
        btnDan3.setActionCommand("2");
        btnDan3.setName("Dan3"); // NOI18N
        btnDan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDan1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDan3);

        btnDan4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnDan4.setText("5");
        btnDan4.setActionCommand("3");
        btnDan4.setName("Dan4"); // NOI18N
        btnDan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDan1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDan4);

        btnDan5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnDan5.setText("5");
        btnDan5.setActionCommand("4");
        btnDan5.setName("Dan5"); // NOI18N
        btnDan5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDan1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDan5);

        btnDan10.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnDan10.setText("5");
        btnDan10.setActionCommand("10");
        btnDan10.setName("Dan10"); // NOI18N
        btnDan10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDan1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDan10);

        btnDan9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnDan9.setText("5");
        btnDan9.setActionCommand("9");
        btnDan9.setName("Dan9"); // NOI18N
        btnDan9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDan1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDan9);

        btnDan8.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnDan8.setText("5");
        btnDan8.setActionCommand("8");
        btnDan8.setName("Dan8"); // NOI18N
        btnDan8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDan1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDan8);

        btnDan7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnDan7.setText("5");
        btnDan7.setActionCommand("7");
        btnDan7.setName("Dan7"); // NOI18N
        btnDan7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDan1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDan7);

        btnDan6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnDan6.setText("5");
        btnDan6.setActionCommand("6");
        btnDan6.setName("Dan6"); // NOI18N
        btnDan6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDan1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDan6);

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 373, 147));

        btnQuan2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnQuan2.setText("10");
        btnQuan2.setEnabled(false);
        btnQuan2.setName("Quan2"); // NOI18N
        jPanel2.add(btnQuan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 82, 147));

        btnQuan1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnQuan1.setText("10");
        btnQuan1.setEnabled(false);
        btnQuan1.setName("Quan1"); // NOI18N
        btnQuan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuan1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnQuan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 82, 147));

        buttonGroup1.add(rdMay);
        rdMay.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rdMay.setSelected(true);
        rdMay.setText("Play with the machine");
        rdMay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rdMayMousePressed(evt);
            }
        });

        buttonGroup1.add(rdNguoi);
        rdNguoi.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rdNguoi.setText("Play with people");
        rdNguoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rdNguoiMousePressed(evt);
            }
        });
        rdNguoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNguoiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Number of troops of the machine: ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Number of your troops:");

        lbQuanNguoiChoi2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        lbQuanNguoiChoi1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        rdNguoiChoi1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdNguoiChoi1);
        rdNguoiChoi1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rdNguoiChoi1.setForeground(new java.awt.Color(255, 0, 0));
        rdNguoiChoi1.setSelected(true);
        rdNguoiChoi1.setText("Your turn");
        rdNguoiChoi1.setEnabled(false);
        rdNguoiChoi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rdNguoiChoi1MousePressed(evt);
            }
        });
        rdNguoiChoi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNguoiChoi1ActionPerformed(evt);
            }
        });

        rdNguoiChoi2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdNguoiChoi2);
        rdNguoiChoi2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rdNguoiChoi2.setForeground(new java.awt.Color(255, 0, 0));
        rdNguoiChoi2.setText("Machine's turn");
        rdNguoiChoi2.setEnabled(false);
        rdNguoiChoi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNguoiChoi2ActionPerformed(evt);
            }
        });

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jMenu2.setText("Game");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        mnINew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnINew.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mnINew.setText("New game");
        mnINew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnINewActionPerformed(evt);
            }
        });
        jMenu2.add(mnINew);
        jMenu2.add(jSeparator1);

        mnitemThoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        mnitemThoat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mnitemThoat.setText("Exit ");
        mnitemThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitemThoatActionPerformed(evt);
            }
        });
        jMenu2.add(mnitemThoat);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdNguoiChoi1)
                    .addComponent(rdNguoiChoi2))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbQuanNguoiChoi1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbQuanNguoiChoi2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdMay)
                    .addComponent(rdNguoi))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbQuanNguoiChoi2)
                    .addComponent(rdNguoiChoi2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(rdMay)
                        .addGap(18, 18, 18)
                        .addComponent(rdNguoi)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbQuanNguoiChoi1))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdNguoiChoi1)
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnitemThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitemThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnitemThoatActionPerformed

    private void btnQuan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuan1ActionPerformed

    private void rdMayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMayMousePressed
        // TODO add your handling code here:
        rdNguoiChoi2.setText("Computer turn");
        rdNguoiChoi1.setText("Player turn");
        jLabel1.setText("Number of computer:");
        jLabel2.setText("Number of player:");

    }//GEN-LAST:event_rdMayMousePressed
    boolean ktraNguoiChoi(int thuTuO) {
        if (list.getList().get(thuTuO).getSoLuongDa() == 0) {
            return false;
        }
        if (checkNguoiChoi % 2 == 0) {
            switch (thuTuO) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    JOptionPane.showMessageDialog(null, "You cannot go to this box", "Notification", 1);
                    return false;
            }
        } else {
            switch (thuTuO) {
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    JOptionPane.showMessageDialog(null, "You cannot go to this box", "Notification", 1);
                    return false;
            }
        }
        return true;
    }
    private void rdNguoiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdNguoiMousePressed
        // TODO add your handling code here:
        rdNguoiChoi2.setText("Player 2 turn");
        rdNguoiChoi1.setText("Player 1 turn");
        jLabel1.setText("Number of player 2:");
        jLabel2.setText("Number of player 1:");
    }//GEN-LAST:event_rdNguoiMousePressed
    void run(int thuTuO, boolean checkHuong) {
        int soLuongDa = 0;
        soLuongDa = list.getList().get(thuTuO).getSoLuongDa();
        int oBatDau = 0;
        do {
            String tenO = list.getList().get(thuTuO).getTenO();
            int soDaBD = 0;
            list.getList().set(thuTuO, new o(tenO, 0));
            dsThayDoi.add(new luotThayDoi(thuTuO, 0));
            if ((thuTuO < 5 && checkHuong) || (thuTuO > 5 && !checkHuong)) {
                oBatDau = thuTuO - 1;
            } else if ((thuTuO < 5 && !checkHuong) || (thuTuO > 5 && checkHuong)) {
                oBatDau = thuTuO + 1;
            }
            while (soLuongDa > 0) {
                if (oBatDau < 0) {
                    oBatDau = 11;
                } else if (oBatDau > 11) {
                    oBatDau = 0;
                }
                tenO = list.getList().get(oBatDau).getTenO();
                soDaBD = list.getList().get(oBatDau).getSoLuongDa();
                list.getList().set(oBatDau, new o(tenO, soDaBD + 1));
                dsThayDoi.add(new luotThayDoi(oBatDau, soDaBD + 1));
                if ((thuTuO < 5 && checkHuong) || (thuTuO > 5 && !checkHuong)) {
                    oBatDau--;
                } else if ((thuTuO < 5 && !checkHuong) || (thuTuO > 5 && checkHuong)) {
                    oBatDau++;
                }

                soLuongDa--;
            }
            if (oBatDau < 0) {
                oBatDau = 11;
            } else if (oBatDau > 11) {
                oBatDau = 0;
            }
            if (oBatDau == 11 || oBatDau == 5) {
                break;
            }
            if (list.getList().get(oBatDau).getSoLuongDa() != 0) {
                if (checkHuong) {
                    if ((thuTuO > 5 && oBatDau < 5) || (thuTuO < 5 && oBatDau > 5)) {
                        checkHuong = false;
                    }
                } else {
                    if ((thuTuO > 5 && oBatDau < 5) || (thuTuO < 5 && oBatDau > 5)) {
                        checkHuong = true;
                    }
                }
                soLuongDa = list.getList().get(oBatDau).getSoLuongDa();
                thuTuO = oBatDau;
            } else {
                break;
            }
        } while (true);
        
        while (true) {
            if (list.getList().get(oBatDau).getSoLuongDa() == 0) {
                if ((thuTuO < 5 && checkHuong) || (thuTuO > 5 && !checkHuong)) {
                    oBatDau--;
                } else if ((thuTuO < 5 && !checkHuong) || (thuTuO > 5 && checkHuong)) {
                    oBatDau++;
                }
                if (oBatDau < 0) {
                    oBatDau = 11;
                } else if (oBatDau > 11) {
                    oBatDau = 0;
                }
                int quanAn = list.getList().get(oBatDau).getSoLuongDa();
                if (checkNguoiChoi % 2 == 0) {
                    soLuongQuanNguoiChoi1 += quanAn;
                } else {
                    soLuongQuanNguoiChoi2 += quanAn;
                }
                String tenO = list.getList().get(oBatDau).getTenO();
                list.getList().set(oBatDau, new o(tenO, 0));
                dsThayDoi.add(new luotThayDoi(oBatDau, 0));
                if (quanAn != 0) {
                    if ((thuTuO < 5 && checkHuong) || (thuTuO > 5 && !checkHuong)) {
                        oBatDau--;
                    } else if ((thuTuO < 5 && !checkHuong) || (thuTuO > 5 && checkHuong)) {
                        oBatDau++;
                    }
                    if (oBatDau < 0) {
                        oBatDau = 11;
                    } else if (oBatDau > 11) {
                        oBatDau = 0;
                    }

                } else {
                    break;
                }
            } else {
                break;
            }
        }
        checkNguoiChoi++;
    }

    void runAI() {
        int vt = 0;
        int max = 0, trai, phai;
        boolean checkHuong = true;
        ArrayList<o> lst;
        for (int i = 0; i < 5; i++) {
            lst = copy();
            trai = checkAI(lst, i, true);
            lst = copy();
            phai = checkAI(lst, i, false);
            if (max <= trai) {
                max = trai;
                vt = i;
                checkHuong = true;
            }
            if (max <= phai) {
                vt = i;
                checkHuong = false;
                max = phai;
            }
        }
        System.out.println(vt + " " + checkHuong + " " + max);
        run(vt, checkHuong);
    }

    int checkAI(ArrayList<o> lst, int thuTuO, boolean checkHuong) {
        int soLuongDa = 0;
        int soQuanAn = 0;
        soLuongDa = lst.get(thuTuO).getSoLuongDa();
        if (soLuongDa == 0) {
            return -1;
        }
        int oBatDau = 0;
        do {
            String tenO = lst.get(thuTuO).getTenO();
            int soDaBD = 0;
            lst.set(thuTuO, new o(tenO, 0));
            if ((thuTuO < 5 && checkHuong) || (thuTuO > 5 && !checkHuong)) {
                oBatDau = thuTuO - 1;
            } else if ((thuTuO < 5 && !checkHuong) || (thuTuO > 5 && checkHuong)) {
                oBatDau = thuTuO + 1;
            }
            while (soLuongDa > 0) {
                if (oBatDau < 0) {
                    oBatDau = 11;
                } else if (oBatDau > 11) {
                    oBatDau = 0;
                }
                tenO = lst.get(oBatDau).getTenO();
                soDaBD = lst.get(oBatDau).getSoLuongDa();
                lst.set(oBatDau, new o(tenO, soDaBD + 1));
                if ((thuTuO < 5 && checkHuong) || (thuTuO > 5 && !checkHuong)) {
                    oBatDau--;
                } else if ((thuTuO < 5 && !checkHuong) || (thuTuO > 5 && checkHuong)) {
                    oBatDau++;
                }

                soLuongDa--;
            }
            if (oBatDau < 0) {
                oBatDau = 11;
            } else if (oBatDau > 11) {
                oBatDau = 0;
            }
            if (oBatDau == 11 || oBatDau == 5) {
                break;
            }

            if (lst.get(oBatDau).getSoLuongDa() != 0) {
                if (checkHuong) {
                    if ((thuTuO > 5 && oBatDau < 5) || (thuTuO < 5 && oBatDau > 5)) {
                        checkHuong = false;
                    }
                } else {
                    if ((thuTuO > 5 && oBatDau < 5) || (thuTuO < 5 && oBatDau > 5)) {
                        checkHuong = true;
                    }
                }
                soLuongDa = lst.get(oBatDau).getSoLuongDa();
                thuTuO = oBatDau;
            } else {
                break;
            }
        } while (true);
        while (true) {
            if (lst.get(oBatDau).getSoLuongDa() == 0) {
                if ((thuTuO < 5 && checkHuong) || (thuTuO > 5 && !checkHuong)) {
                    oBatDau--;
                } else if ((thuTuO < 5 && !checkHuong) || (thuTuO > 5 && checkHuong)) {
                    oBatDau++;
                }
                if (oBatDau < 0) {
                    oBatDau = 11;
                } else if (oBatDau > 11) {
                    oBatDau = 0;
                }
                int quanAn = lst.get(oBatDau).getSoLuongDa();
                soQuanAn += quanAn;
                String tenO = lst.get(oBatDau).getTenO();
                lst.set(oBatDau, new o(tenO, 0));
                if (quanAn != 0) {
                    if ((thuTuO < 5 && checkHuong) || (thuTuO > 5 && !checkHuong)) {
                        oBatDau--;
                    } else if ((thuTuO < 5 && !checkHuong) || (thuTuO > 5 && checkHuong)) {
                        oBatDau++;
                    }
                    if (oBatDau < 0) {
                        oBatDau = 11;
                    } else if (oBatDau > 11) {
                        oBatDau = 0;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return soQuanAn;
    }

    ArrayList<o> copy() {
        ArrayList<o> lst = new ArrayList();
        for (int i = 0; i < 12; i++) {
            lst.add(list.getList().get(i));
        }
        return lst;
    }

    int tongDaNguoiChoi2() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += list.getList().get(i).getSoLuongDa();
        }
        return sum;
    }

    int tongDaNguoiChoi1() {
        int sum = 0;
        for (int i = 6; i < 11; i++) {
            sum += list.getList().get(i).getSoLuongDa();
        }
        return sum;
    }

    void reset() {

        for (int i = 0; i < 12; i++) {
            if (list.getList().get(i).getSoLuongDa() != 0) {
                String tenO = list.getList().get(i).getTenO();
                list.getList().set(i, new o(tenO, 0));
                dsThayDoi.add(new luotThayDoi(i, 0));
            }
        }
    }

    boolean ktraTranKetThuc() {
        if (list.getList().get(5).getSoLuongDa() == 0 && list.getList().get(11).getSoLuongDa() == 0) {
            soLuongQuanNguoiChoi2 = soLuongQuanNguoiChoi2 + tongDaNguoiChoi2();
            soLuongQuanNguoiChoi1 = soLuongQuanNguoiChoi1 + tongDaNguoiChoi1();
            reset();
            return true;
        }
        if (list.getList().get(5).getSoLuongDa() != 0 || list.getList().get(11).getSoLuongDa() != 0) {
            if (checkNguoiChoi % 2 != 0 && tongDaNguoiChoi2() == 0) {
                if (soLuongQuanNguoiChoi2 < 5) {
                    return true;
                }
                for (int i = 0; i < 5; i++) {
                    String tenO = list.getList().get(i).getTenO();
                    list.getList().set(i, new o(tenO, 1));
                    dsThayDoi.add(new luotThayDoi(i, 1));
                }
                soLuongQuanNguoiChoi2 = soLuongQuanNguoiChoi2 - 5;
            }
            if (checkNguoiChoi % 2 == 0 && tongDaNguoiChoi1() == 0) {
                if (soLuongQuanNguoiChoi1 < 5) {
                    return true;
                }
                for (int i = 6; i < 11; i++) {
                    String tenO = list.getList().get(i).getTenO();
                    list.getList().set(i, new o(tenO, 1));
                    dsThayDoi.add(new luotThayDoi(i, 1));
                }
                soLuongQuanNguoiChoi1 = soLuongQuanNguoiChoi1 - 5;
            }
        }
        return false;
    }

    int nguoiThang() {
        if (ktraTranKetThuc()) {
            if (soLuongQuanNguoiChoi2 == soLuongQuanNguoiChoi1) {
                return 0;//hoa
            } else if (soLuongQuanNguoiChoi1 > soLuongQuanNguoiChoi2) {
                return 1;
            } else {
                return -1;
            }
        }
        return 2;//tran dau chua ket thuc
    }

    void win() {
        int xacDinhThangThua = nguoiThang();
        if (xacDinhThangThua == 2) {
            return;
        }
        if (xacDinhThangThua == 0) {
            JOptionPane.showMessageDialog(null, "Draw", "Notification", 1);
        }
        String xdNguoiChoi = "";
        if (rdMay.isSelected() && xacDinhThangThua == -1) {
            xdNguoiChoi = "Machine";
        } else if (xacDinhThangThua == 1) {
            if (rdMay.isSelected()) {
                xdNguoiChoi = "You";
            } else {
                xdNguoiChoi = "Player 1";
            }
        } else if (xacDinhThangThua == -1) {
            xdNguoiChoi = "Player 2";
        }
        JOptionPane.showMessageDialog(null, xdNguoiChoi + " has win", "Notification", 1);
    }

    void thayDoi() {

        new Thread() {
            @Override
            public void run() {
                try {
                    int j = 0;
                    if (rdMay.isSelected()) {
                        if (rdNguoiChoi1.isSelected()) {
                            rdNguoiChoi2.setSelected(true);
                        } else {
                            rdNguoiChoi1.setSelected(true);
                        }
                    }
                    while (true) {
                        sleep(500);
                        if (j >= dsThayDoi.size()) {
                            break;
                        }
                        listBtn.get(dsThayDoi.get(j).getViTri()).setText(dsThayDoi.get(j).getSoLuongDa() + "");
                        j++;
                    }
                    dsThayDoi.clear();

                    if (rdNguoiChoi1.isSelected()) {
                        rdNguoiChoi2.setSelected(true);
                    } else {
                        rdNguoiChoi1.setSelected(true);
                    }

                    lbQuanNguoiChoi2.setText(soLuongQuanNguoiChoi2 + "");
                    lbQuanNguoiChoi1.setText(soLuongQuanNguoiChoi1 + "");
                    win();
                } catch (InterruptedException e) {
                }
            }
        }.start();

    }
    private void mnINewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnINewActionPerformed
        // TODO add your handling code here:
        list = new dsO();
        khoiTao();
    }//GEN-LAST:event_mnINewActionPerformed

    private void btnDan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDan1ActionPerformed
        // TODO add your handling code here:
        int thuTuO = Integer.parseInt(evt.getActionCommand());
        if (!ktraNguoiChoi(thuTuO)) {
            return;
        }
        Object[] option = {"Left", "Right", "Cancel"};
        int choose = JOptionPane.showOptionDialog(null, "Which direction do you want to go?", "Notification", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, 1);
        if (choose == JOptionPane.NO_OPTION || choose == JOptionPane.YES_OPTION) {
            boolean checkHuong = true;
            if (choose == JOptionPane.NO_OPTION) {
                checkHuong = false;
            }
            try {
                run(thuTuO, checkHuong);
                if (!ktraTranKetThuc() && rdMay.isSelected()) {
                    runAI();
                    ktraTranKetThuc();
                }
                thayDoi();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + evt.getActionCommand(), "Notification", 1);
            }
        }
    }//GEN-LAST:event_btnDan1ActionPerformed

    private void rdNguoiChoi1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdNguoiChoi1MousePressed
        // TODO add your handling code here:
        return;
    }//GEN-LAST:event_rdNguoiChoi1MousePressed

    private void rdNguoiChoi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNguoiChoi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNguoiChoi1ActionPerformed

    private void rdNguoiChoi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNguoiChoi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNguoiChoi2ActionPerformed

    private void rdNguoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNguoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNguoiActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDan1;
    private javax.swing.JButton btnDan10;
    private javax.swing.JButton btnDan2;
    private javax.swing.JButton btnDan3;
    private javax.swing.JButton btnDan4;
    private javax.swing.JButton btnDan5;
    private javax.swing.JButton btnDan6;
    private javax.swing.JButton btnDan7;
    private javax.swing.JButton btnDan8;
    private javax.swing.JButton btnDan9;
    private javax.swing.JButton btnQuan1;
    private javax.swing.JButton btnQuan2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lbQuanNguoiChoi1;
    private javax.swing.JLabel lbQuanNguoiChoi2;
    private javax.swing.JMenuItem mnINew;
    private javax.swing.JMenuItem mnitemThoat;
    private javax.swing.JRadioButton rdMay;
    private javax.swing.JRadioButton rdNguoi;
    private javax.swing.JRadioButton rdNguoiChoi1;
    private javax.swing.JRadioButton rdNguoiChoi2;
    // End of variables declaration//GEN-END:variables
}
