/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Faculdade
 */
public class TelaResp extends javax.swing.JFrame {

    /**
     * Creates new form Resp
     */
    public TelaResp() {
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

        jToggleButtonVoltar = new javax.swing.JToggleButton();
        jToggleButtonCadastrar = new javax.swing.JToggleButton();
        jToggleButtonPesq = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jToggleButtonVoltar.setText("Voltar");
        jToggleButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonVoltar);
        jToggleButtonVoltar.setBounds(190, 310, 100, 40);

        jToggleButtonCadastrar.setText("Cadastrar");
        jToggleButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonCadastrar);
        jToggleButtonCadastrar.setBounds(60, 125, 110, 80);

        jToggleButtonPesq.setText("Pesquisar");
        jToggleButtonPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPesqActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonPesq);
        jToggleButtonPesq.setBounds(200, 125, 110, 80);

        setSize(new java.awt.Dimension(516, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonVoltarActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButtonVoltarActionPerformed

    private void jToggleButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonCadastrarActionPerformed

    private void jToggleButtonPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonPesqActionPerformed

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
            java.util.logging.Logger.getLogger(TelaResp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaResp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaResp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaResp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaResp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jToggleButtonCadastrar;
    private javax.swing.JToggleButton jToggleButtonPesq;
    private javax.swing.JToggleButton jToggleButtonVoltar;
    // End of variables declaration//GEN-END:variables
}
