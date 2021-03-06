/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.gui;

import hotel.model.Item;
import hotel.model.Payment;
import hotel.model.Register;
import hotel.model.Room;
import hotel.model.Worker;
import hotel.service.HotelService;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ferha
 */
public class EditPaymentFrame extends javax.swing.JFrame {

    private long selectedRow;
    private HotelService hotelService;
    /**
     * Creates new form editPaymentFrame
     */
    public EditPaymentFrame() {
        initComponents();
    }

    public EditPaymentFrame(long selectedRow, HotelService hotelService) {
        try {
            initComponents();
            this.hotelService = hotelService;
            this.selectedRow = selectedRow;
            Payment payment = hotelService.getPaymentById(selectedRow);
            editRegisterCombo(payment);
            editRoomCombo(payment);
            editWorkerCombo(payment);
            jTextField1.setText(String.valueOf(payment.getAmount()));
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

        jLabel5 = new javax.swing.JLabel();
        registerCmb = new javax.swing.JComboBox<>();
        workerCmb = new javax.swing.JComboBox<>();
        roomCmb = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("AZN");

        registerCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        workerCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        workerCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workerCmbActionPerformed(evt);
            }
        });

        jLabel1.setText("Register");

        jLabel2.setText("Worker");

        jLabel3.setText("Room");

        jLabel4.setText("Amount");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(registerCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(workerCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roomCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(workerCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(51, 51, 51)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try {
            Item registerItem = (Item) registerCmb.getSelectedItem();
            Item workItem = (Item) workerCmb.getSelectedItem();
            Item roomItem = (Item) roomCmb.getSelectedItem();
            if(workItem.getId() == 0){
                JOptionPane.showMessageDialog(null, "Please select worker!", "Warning", JOptionPane.ERROR_MESSAGE);
            }else if(registerItem.getId() == 0){
                JOptionPane.showMessageDialog(null, "Please select register!", "Warning", JOptionPane.ERROR_MESSAGE);
            }else if(roomItem.getId() == 0){
                JOptionPane.showMessageDialog(null, "Please select room!", "Warning", JOptionPane.ERROR_MESSAGE);
            }else{
                Float amount = Float.valueOf(jTextField1.getText());
                Payment payment = new Payment();
                Register register = new Register();
                register.setId(registerItem.getId());
                payment.setRegister(register);
                Worker worker = new Worker();
                worker.setId(roomItem.getId());
                payment.setWorker(worker);
                Room room = new Room();
                room.setId(roomItem.getId());
                payment.setRoom(room);
                payment.setAmount(amount);
                boolean isUpdated = hotelService.updatePayment(payment,selectedRow);
                if (isUpdated) {
                    JOptionPane.showMessageDialog(null, "Payment has been succesfully updated!","Success",JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Problem! Payment has been succesfully updated!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Problem! Payment has been succesfully updated!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void workerCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workerCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workerCmbActionPerformed

    
    
    private void editWorkerCombo(Payment payment) {
        try {
            DefaultComboBoxModel workerCombo = new DefaultComboBoxModel();
            workerCmb.setModel(workerCombo);
            workerCombo.addElement(new Item((long)0, "Select worker!"));
            List<Worker> workerList = hotelService.getWorkerList();
            for (Worker worker : workerList) {
                workerCombo.addElement(new Item(worker.getId(), worker.getName() + " " + worker.getSurname()));
            }
            workerCombo.setSelectedItem(new Item(payment.getWorker().getId(), payment.getWorker().getName() + " " + payment.getWorker().getSurname()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void editRegisterCombo(Payment payment) {
        try {
            DefaultComboBoxModel registerCombo = new DefaultComboBoxModel();
            registerCmb.setModel(registerCombo);
            registerCombo.addElement(new Item((long)0,"Select register!"));
            List<Register> registerList = hotelService.getRegisterList();
            for (Register register : registerList) {
                registerCombo.addElement(new Item(register.getId(), register.getName() + " " + register.getSurname()));
            }
            registerCombo.setSelectedItem(new Item(payment.getRegister().getId(), payment.getRegister().getName() + " " + payment.getRegister().getSurname()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void editRoomCombo(Payment payment) {
        try {
            DefaultComboBoxModel roomCombo = new DefaultComboBoxModel();
            roomCmb.setModel(roomCombo);
            roomCombo.addElement(new Item((long)0, "Select room!"));
            List<Room> roomList = hotelService.getRoomList();
            for (Room room : roomList) {
                roomCombo.addElement(new Item(room.getId(), room.getRoomNumber()));
            }
            roomCombo.setSelectedItem(new Item(payment.getRoom().getId(), payment.getRoom().getRoomNumber()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> registerCmb;
    private javax.swing.JComboBox<String> roomCmb;
    private javax.swing.JButton updateBtn;
    private javax.swing.JComboBox<String> workerCmb;
    // End of variables declaration//GEN-END:variables
}
