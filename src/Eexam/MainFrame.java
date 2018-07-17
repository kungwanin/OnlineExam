/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eexam;

/**
 *
 * @author Neeraj
 */
public class MainFrame extends javax.swing.JFrame {

    private String username;

    public MainFrame(String u) {
        this();	
        username = u;
        setTitle("Welcome " + u + " in eExam App");
        if (username.equals("admin")) {
            mnuAdmin.setVisible(true);
            mnuExams.setVisible(false);
        } else {
            mnuAdmin.setVisible(false);
            mnuExams.setVisible(true);
        }
    }

    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuExams = new javax.swing.JMenu();
        mnuSelectExam = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        mnuAdmin = new javax.swing.JMenu();
        mnuQuestionsFrame = new javax.swing.JMenuItem();
        mnuResults = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuPrint = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuAboutUs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuExams.setMnemonic('x');
        mnuExams.setText("Exams");
        mnuExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExamsActionPerformed(evt);
            }
        });

        mnuSelectExam.setText("Select Exam");
        mnuSelectExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSelectExamActionPerformed(evt);
            }
        });
        mnuExams.add(mnuSelectExam);

        mnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnuExams.add(mnuExit);

        jMenuBar1.add(mnuExams);

        mnuAdmin.setText("Admin");

        mnuQuestionsFrame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnuQuestionsFrame.setText("QuestionsFrame");
        mnuQuestionsFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQuestionsFrameActionPerformed(evt);
            }
        });
        mnuAdmin.add(mnuQuestionsFrame);
        mnuQuestionsFrame.getAccessibleContext().setAccessibleDescription("To known about our Company");

        mnuResults.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnuResults.setText("Results");
        mnuResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuResultsActionPerformed(evt);
            }
        });
        mnuAdmin.add(mnuResults);
        mnuAdmin.add(jSeparator1);

        mnuPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnuPrint.setText("Print");
        mnuPrint.setToolTipText("To Print the Result");
        mnuPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrintActionPerformed(evt);
            }
        });
        mnuAdmin.add(mnuPrint);

        jMenuBar1.add(mnuAdmin);

        mnuHelp.setText("Help");

        mnuAboutUs.setText("About Us");
        mnuAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutUsActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuAboutUs);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPrintActionPerformed

    private void mnuQuestionsFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQuestionsFrameActionPerformed
        // TODO add your handling code here:
       new QuestionsFrame(username).setVisible(true);
    }//GEN-LAST:event_mnuQuestionsFrameActionPerformed

    private void mnuExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExamsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuExamsActionPerformed

    private void mnuSelectExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSelectExamActionPerformed
        // TODO add your handling code here:
         new ExamDialog(this, true, username).setVisible(true);
    }//GEN-LAST:event_mnuSelectExamActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutUsActionPerformed
        // TODO add your handling code here:
        new AboutUsDialog(this,true).setVisible(true);
    }//GEN-LAST:event_mnuAboutUsActionPerformed

    private void mnuResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuResultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuResultsActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame("jayesh").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuAboutUs;
    private javax.swing.JMenu mnuAdmin;
    private javax.swing.JMenu mnuExams;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuItem mnuPrint;
    private javax.swing.JMenuItem mnuQuestionsFrame;
    private javax.swing.JMenuItem mnuResults;
    private javax.swing.JMenuItem mnuSelectExam;
    // End of variables declaration//GEN-END:variables
}
