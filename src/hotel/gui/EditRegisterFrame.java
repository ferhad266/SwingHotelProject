/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.gui;

import hotel.model.Item;
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
public class EditRegisterFrame extends javax.swing.JFrame {

    private HotelService hotelService;
    private long selectedRow;

    /**
     * Creates new form NewRegisterFrame
     */
    public EditRegisterFrame() {
        initComponents();
    }

    public EditRegisterFrame(long selectedRow, HotelService hotelService) {
        try {
            initComponents();
            this.hotelService = hotelService;
            this.selectedRow = selectedRow;
            Register register = hotelService.getRegisterById(selectedRow);
            editWorkerCombo(register);
            editRoomCombo(register);
            nameTxt.setText(register.getName());
            surnameTxt.setText(register.getSurname());
            BirthDateTxt.setDate(register.getDob());
            fatherNameTxt.setText(register.getFatherName());
            adultTxt.setText(register.getAdultCount());
            childTxt.setText(register.getChildCount());
            PhoneTxt.setText(register.getPhone());
            emailTxt.setText(register.getEmail());
//        jDateChooser2.setDate(Date.valueOf(register.getCheck_in());
//        jDateChooser3.setDate(Date.valueOf(register.getCheck_out()));
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

        childTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PhoneTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        workerCmb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        BirthDateTxt = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        surnameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fatherNameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        adultTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        roomCmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel8.setText("Email");

        jLabel9.setText("Check In");

        jLabel10.setText("Check Out");

        jLabel1.setText("Name");

        jLabel11.setText("Worker");

        jLabel2.setText("Surname");

        save.setText("Update");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel3.setText("Birth");

        jLabel4.setText("Fname");

        jLabel5.setText("Adult C");

        jLabel6.setText("Child Count");

        jLabel7.setText("Phone");

        jLabel12.setText("Room");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel11))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(surnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fatherNameTxt)
                                .addComponent(adultTxt)
                                .addComponent(BirthDateTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel10))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(workerCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(childTxt)
                    .addComponent(PhoneTxt)
                    .addComponent(emailTxt)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTxt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(surnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BirthDateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fatherNameTxt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adultTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(workerCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(roomCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(childTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(PhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)))
                .addGap(15, 15, 15)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            Item workItem = (Item) workerCmb.getSelectedItem();
            Item roomItem = (Item) roomCmb.getSelectedItem();
            if (workItem.getId() == 0) {
                JOptionPane.showMessageDialog(null, "Please select worker!", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if (roomItem.getId() == 0) {
                JOptionPane.showMessageDialog(null, "Please select room!", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                Register register = new Register();
                Worker worker = new Worker();
                Room room = new Room();
                String name = String.valueOf(nameTxt.getText());
                String surname = String.valueOf(surnameTxt.getText());
//                Date dob = Date.valueOf(dateTxt.getDate());
                String fatherName = String.valueOf(fatherNameTxt.getText());
                String adultC = String.valueOf(adultTxt.getText());
                String childC = String.valueOf(childTxt.getText());
                String phone = String.valueOf(PhoneTxt.getText());
                String email = String.valueOf(emailTxt.getText());
//                Date  checkIn = Date.valueOf(checkInTxt.getText())
//                Date  checkOut = Date.valueOf(checkOutTxt.getText())
                register.setName(name);
                register.setSurname(surname);
//                register.setDob(dob);
                register.setFatherName(fatherName);
                register.setAdultCount(adultC);
                register.setChildCount(childC);
                register.setPhone(phone);
                register.setEmail(email);
//                register.setCheck_in(check_in);
//                register.setCheck_out(check_out);
                worker.setId(workItem.getId());
                room.setId(roomItem.getId());
                register.setRoom(room);
                register.setWorker(worker);
                boolean isUpdated = hotelService.updateRegister(register, selectedRow);
                if (isUpdated) {
                    JOptionPane.showMessageDialog(null, "Register has been succesfully updated!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Problem! Register has been succesfully updated!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Problem! Payment has been succesfully added!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser BirthDateTxt;
    private javax.swing.JTextField PhoneTxt;
    private javax.swing.JTextField adultTxt;
    private javax.swing.JTextField childTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField fatherNameTxt;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
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
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox<String> roomCmb;
    private javax.swing.JButton save;
    private javax.swing.JTextField surnameTxt;
    private javax.swing.JComboBox<String> workerCmb;
    // End of variables declaration//GEN-END:variables

    private void editWorkerCombo(Register register) {
        try {
            DefaultComboBoxModel workerCombo = new DefaultComboBoxModel();
            workerCmb.setModel(workerCombo);
            workerCombo.addElement(new Item((long) 0, "Select worker!"));
            List<Worker> workerList = hotelService.getWorkerList();
            for (Worker worker : workerList) {
                workerCombo.addElement(new Item(worker.getId(), worker.getName() + " " + worker.getSurname()));
            }
            workerCombo.setSelectedItem(new Item(register.getWorker().getId(), register.getWorker().getName() + " " + register.getWorker().getSurname()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void editRoomCombo(Register register) {
        try {
            DefaultComboBoxModel roomCombo = new DefaultComboBoxModel();
            roomCmb.setModel(roomCombo);
            roomCombo.addElement(new Item((long) 0, "Select room!"));
            List<Room> roomList = hotelService.getRoomList();
            for (Room room : roomList) {
                roomCombo.addElement(new Item(room.getId(), room.getRoomNumber()));
            }
            roomCombo.setSelectedItem(new Item(register.getRoom().getId(), register.getRoom().getRoomNumber()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
