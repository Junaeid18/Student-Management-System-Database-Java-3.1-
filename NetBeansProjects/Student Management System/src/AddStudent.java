
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NiPa
 */
public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
        initComponents();
    }
    String i;
    public AddStudent(String val) {
        initComponents();
        this.i = val;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Semester = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        asname = new javax.swing.JTextField();
        asdob = new javax.swing.JTextField();
        asyear = new javax.swing.JTextField();
        assem = new javax.swing.JTextField();
        asphn = new javax.swing.JTextField();
        assub = new javax.swing.JButton();
        asret = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        asdept = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        aspass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(655, 602));

        jLabel1.setText("Name:");

        jLabel2.setText("Date of Birth:");

        jLabel3.setText("Year:");

        Semester.setText("Semester:");

        jLabel5.setText("Phone no:");

        asyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asyearActionPerformed(evt);
            }
        });

        asphn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asphnActionPerformed(evt);
            }
        });

        assub.setText("Submit");
        assub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assubActionPerformed(evt);
            }
        });

        asret.setText("Return");
        asret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asretActionPerformed(evt);
            }
        });

        jLabel4.setText("Department:");

        asdept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asdeptActionPerformed(evt);
            }
        });

        jLabel6.setText("Password:");

        aspass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aspassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(asret, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(Semester)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(asname, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(asdob)
                            .addComponent(asyear)
                            .addComponent(assem)
                            .addComponent(asphn)
                            .addComponent(asdept)
                            .addComponent(aspass)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(assub, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(asret, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(asname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(asdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asdept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Semester))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asphn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aspass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(50, 50, 50)
                .addComponent(assub, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void asphnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asphnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asphnActionPerformed

    private void asyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asyearActionPerformed

    private void asdeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asdeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asdeptActionPerformed

    private void assubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assubActionPerformed
        // TODO add your handling code here:
        String name = asname.getText().trim();
        String dob = asdob.getText().trim();
        String year = asyear.getText().trim();
        String sem = assem.getText().trim();
        String phn = asphn.getText().trim();
        String dept = asdept.getText().trim();
        String pass = aspass.getText().trim();
        
        if(name.equals("") || dob.equals("") || year.equals("") || sem.equals("") || phn.equals("") || dept.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(null,"Every field must be filled");
        }
        else{
            
            JOptionPane.showMessageDialog(null,"Successful");
            
             try{ 
                                  
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SMS;integratedSecurity=true");  
   
     Statement statement = connection.createStatement();  
               
     statement.execute("insert into student(name,dob,year,semester,phn,d_id,password) "
             + "values('"+name+"', '"+dob+"','"+year+"','"+sem+"','"+phn+"','"+dept+"','"+pass+"') ");  
            
           asname.setText(null);
           asdob.setText(null);
           asyear.setText(null);
           assem.setText(null);
           asphn.setText(null);
           asdept.setText(null);
           aspass.setText(null);
           this.setVisible(true);
  
         } catch (Exception e) {  
             e.printStackTrace();  
         }  
        }
    }//GEN-LAST:event_assubActionPerformed

    private void aspassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aspassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aspassActionPerformed

    private void asretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asretActionPerformed
        new Administrator(i).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_asretActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Semester;
    private javax.swing.JTextField asdept;
    private javax.swing.JTextField asdob;
    private javax.swing.JTextField asname;
    private javax.swing.JTextField aspass;
    private javax.swing.JTextField asphn;
    private javax.swing.JButton asret;
    private javax.swing.JTextField assem;
    private javax.swing.JButton assub;
    private javax.swing.JTextField asyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
