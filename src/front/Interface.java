package front;

import classes.Resultado;
import classes.NNaturais;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFatorial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resposta = new javax.swing.JTextArea();
        erro = new javax.swing.JLabel();
        btnNumPerfeito = new javax.swing.JButton();
        btnCapicua = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        inputNumero1 = new javax.swing.JTextField();
        inputNumero2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnQuadradoPerfeito = new javax.swing.JButton();
        btnNumeroPrimo = new javax.swing.JButton();
        btnBase10_2 = new javax.swing.JButton();
        btnBase10_8 = new javax.swing.JButton();
        btnBase10_16 = new javax.swing.JButton();
        btnMDC = new javax.swing.JButton();
        btnMMC = new javax.swing.JButton();
        btnPrimosEntreSi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFatorial.setText("Fatorial");
        btnFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFatorialActionPerformed(evt);
            }
        });

        resposta.setColumns(20);
        resposta.setRows(5);
        jScrollPane1.setViewportView(resposta);

        btnNumPerfeito.setText("Numero Perfeito");
        btnNumPerfeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumPerfeitoActionPerformed(evt);
            }
        });

        btnCapicua.setText("Capicua");
        btnCapicua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapicuaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Primeiro Numero");

        jLabel2.setText("Segundo Numero");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(inputNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(inputNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnQuadradoPerfeito.setText("Quadrado Perfeito");
        btnQuadradoPerfeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuadradoPerfeitoActionPerformed(evt);
            }
        });

        btnNumeroPrimo.setText("Numero Primo");
        btnNumeroPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroPrimoActionPerformed(evt);
            }
        });

        btnBase10_2.setText("Base 10-2");
        btnBase10_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBase10_2ActionPerformed(evt);
            }
        });

        btnBase10_8.setText("Base 10-8");
        btnBase10_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBase10_8ActionPerformed(evt);
            }
        });

        btnBase10_16.setText("Base 10-16");
        btnBase10_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBase10_16ActionPerformed(evt);
            }
        });

        btnMDC.setText("MDC");
        btnMDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMDCActionPerformed(evt);
            }
        });

        btnMMC.setText("MMC");
        btnMMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMMCActionPerformed(evt);
            }
        });

        btnPrimosEntreSi.setText("Primos Entre Si");
        btnPrimosEntreSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimosEntreSiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFatorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumPerfeito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCapicua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuadradoPerfeito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumeroPrimo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBase10_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBase10_8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBase10_16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMDC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMMC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrimosEntreSi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(51, 51, 51))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFatorial)
                    .addComponent(btnNumPerfeito)
                    .addComponent(btnCapicua)
                    .addComponent(btnQuadradoPerfeito)
                    .addComponent(btnNumeroPrimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBase10_2)
                    .addComponent(btnBase10_8)
                    .addComponent(btnBase10_16)
                    .addComponent(btnMDC)
                    .addComponent(btnMMC)
                    .addComponent(btnPrimosEntreSi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFatorialActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{            
            resposta.setText(resultado.fatorial());
            erro.setText("");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnFatorialActionPerformed

    private void btnNumPerfeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumPerfeitoActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            resposta.setText(resultado.numPerfeito());
            erro.setText("");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnNumPerfeitoActionPerformed

    private void btnCapicuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapicuaActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            resposta.setText(resultado.capicua());
            erro.setText("");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnCapicuaActionPerformed

    private void btnQuadradoPerfeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuadradoPerfeitoActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            resposta.setText(resultado.quadradoPerfeito());

            erro.setText("");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnQuadradoPerfeitoActionPerformed

    private void btnNumeroPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroPrimoActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            resposta.setText(resultado.NumeroPrimo());
            erro.setText("");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnNumeroPrimoActionPerformed

    private void btnBase10_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBase10_2ActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            resposta.setText(resultado.base10_2());
            erro.setText("");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnBase10_2ActionPerformed

    private void btnBase10_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBase10_8ActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            resposta.setText(resultado.base10_8());
            erro.setText("");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnBase10_8ActionPerformed

    private void btnBase10_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBase10_16ActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            resposta.setText(resultado.base10_16());
            erro.setText("");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnBase10_16ActionPerformed

    private void btnMDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMDCActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            resposta.setText(resultado.MDC());
            erro.setText("");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnMDCActionPerformed

    private void btnMMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMMCActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            resposta.setText(resultado.MMC());
            erro.setText("");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnMMCActionPerformed

    private void btnPrimosEntreSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimosEntreSiActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            resposta.setText(resultado.primosEntreSi());
            erro.setText("");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnPrimosEntreSiActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBase10_16;
    private javax.swing.JButton btnBase10_2;
    private javax.swing.JButton btnBase10_8;
    private javax.swing.JButton btnCapicua;
    private javax.swing.JButton btnFatorial;
    private javax.swing.JButton btnMDC;
    private javax.swing.JButton btnMMC;
    private javax.swing.JButton btnNumPerfeito;
    private javax.swing.JButton btnNumeroPrimo;
    private javax.swing.JButton btnPrimosEntreSi;
    private javax.swing.JButton btnQuadradoPerfeito;
    private javax.swing.JLabel erro;
    private javax.swing.JTextField inputNumero1;
    private javax.swing.JTextField inputNumero2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resposta;
    // End of variables declaration//GEN-END:variables
}