/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.gui;

import hotel.model.Register;
import hotel.service.HotelService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ferha
 */
public class RegisterFrame extends javax.swing.JFrame {

    private HotelService hotelService;

    /**
     * Creates new form HomeFrame
     */
    public RegisterFrame() {
        initComponents();
    }

    public RegisterFrame(HotelService hotelService) {
        try {
            initComponents();
            this.hotelService = hotelService;
            showRegisterData(hotelService.getRegisterList());
        } catch (Exception ex) {
            ex.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        delBtn = new javax.swing.JButton();
        keywordTxt = new javax.swing.JTextField();
        newBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        delBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferha\\Downloads\\delete.png")); // NOI18N
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        keywordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keywordTxtActionPerformed(evt);
            }
        });

        newBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferha\\Downloads\\add.png")); // NOI18N
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        searchBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferha\\Downloads\\research.png")); // NOI18N
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        editBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferha\\Downloads\\edit.png")); // NOI18N
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferha\\Downloads\\back (1).png")); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 707, Short.MAX_VALUE)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(keywordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(keywordTxt)
                        .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keywordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keywordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keywordTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        MainFrame mainFrame = new MainFrame(hotelService);
        mainFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        try {
            NewRegisterFrame newRegisterFrame = new NewRegisterFrame(hotelService);
            newRegisterFrame.setVisible(true);
        } catch (Exception ex) {
              ex.printStackTrace();
        }
    }//GEN-LAST:event_newBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try {
            int rowIndex = jTable1.getSelectedRow();
            Long selectedRow = (Long) jTable1.getValueAt(rowIndex, 0);
            EditRegisterFrame editRegFrame = new EditRegisterFrame(selectedRow, hotelService);
            editRegFrame.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        try {
            int rowIndex = jTable1.getSelectedRow();
            long selectedRow = (long) jTable1.getValueAt(rowIndex, 0);
            int isMessage = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete worker", JOptionPane.YES_NO_OPTION);
            if (isMessage == JOptionPane.YES_OPTION) {
                boolean isDeleted = hotelService.deleteRegister(selectedRow);
                if (isDeleted) {
                    JOptionPane.showMessageDialog(null, "Register has been succesfully deleted!");
                    showRegisterData(hotelService.getRegisterList());
                } else {
                    JOptionPane.showMessageDialog(null, "Problem! Register has not been succesfully deleted!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            editBtnActionPerformed(null);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try {
            String keyword = keywordTxt.getText();
            List<Register> registerList = hotelService.searchRegisterData(keyword);
            showRegisterData(registerList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    private void showRegisterData(List<Register> registerList) {
        try {
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            jTable1.setModel(model);
            model.addColumn("ID");
            model.addColumn("No");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Date of birth");
            model.addColumn("Father's name");
            model.addColumn("Adult count");
            model.addColumn("Child count");
            model.addColumn("Phone");
            model.addColumn("Email");
            model.addColumn("Check In");
            model.addColumn("Check Out");
            model.addColumn("Worker");
            model.addColumn("Room Number");
            model.addColumn("Room Type");
            for (Register register : registerList) {
                Object[] data = new Object[]{
                    register.getId(), register.getR(), register.getName(), register.getSurname(), register.getDob(), register.getFatherName(),
                    register.getAdultCount(), register.getChildCount(), register.getPhone(), register.getEmail(), register.getCheck_in(),
                    register.getCheck_out(), register.getWorker().getName() + " " + register.getWorker().getSurname(), register.getRoom().getRoomNumber(), register.getRoom().getRoomType()
                };
                model.addRow(data);
            }
            jTable1.getColumnModel().getColumn(0).setWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField keywordTxt;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
