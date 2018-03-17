package front;

import classes.Resultado;
import java.awt.Color;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
        setResizable(false);
        btnFatorial.setBackground(Color.WHITE);
        btnNumPerfeito.setBackground(Color.WHITE);
        btnCapicua.setBackground(Color.WHITE);
        btnQuadradoPerfeito.setBackground(Color.WHITE);
        btnBase10_2.setBackground(Color.WHITE);
        btnBase10_8.setBackground(Color.WHITE);
        btnBase10_16.setBackground(Color.WHITE);
        btnMMC.setBackground(Color.WHITE);
        btnMDC.setBackground(Color.WHITE);
        btnPrimosEntreSi.setBackground(Color.WHITE);
        btnNumeroPrimo.setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        resposta = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        inputNumero1 = new javax.swing.JTextField();
        inputNumero2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        erro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnFatorial = new javax.swing.JButton();
        btnNumPerfeito = new javax.swing.JButton();
        btnCapicua = new javax.swing.JButton();
        btnQuadradoPerfeito = new javax.swing.JButton();
        btnBase10_2 = new javax.swing.JButton();
        btnBase10_8 = new javax.swing.JButton();
        btnBase10_16 = new javax.swing.JButton();
        btnMMC = new javax.swing.JButton();
        btnMDC = new javax.swing.JButton();
        btnPrimosEntreSi = new javax.swing.JButton();
        btnNumeroPrimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        resposta.setColumns(20);
        resposta.setRows(5);
        jScrollPane1.setViewportView(resposta);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Primeiro Numero");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Segundo Numero");

        erro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        erro.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(inputNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNumero2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("OPERAÇÕES");

        btnFatorial.setBackground(new java.awt.Color(255, 255, 255));
        btnFatorial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFatorial.setForeground(new java.awt.Color(0, 153, 153));
        btnFatorial.setText("Fatorial");
        btnFatorial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFatorialActionPerformed(evt);
            }
        });

        btnNumPerfeito.setBackground(new java.awt.Color(255, 255, 255));
        btnNumPerfeito.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNumPerfeito.setForeground(new java.awt.Color(0, 153, 153));
        btnNumPerfeito.setText("Numero Perfeito");
        btnNumPerfeito.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNumPerfeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumPerfeitoActionPerformed(evt);
            }
        });

        btnCapicua.setBackground(new java.awt.Color(255, 255, 255));
        btnCapicua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCapicua.setForeground(new java.awt.Color(0, 153, 153));
        btnCapicua.setText("Capicua");
        btnCapicua.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCapicua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapicuaActionPerformed(evt);
            }
        });

        btnQuadradoPerfeito.setBackground(new java.awt.Color(255, 255, 255));
        btnQuadradoPerfeito.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuadradoPerfeito.setForeground(new java.awt.Color(0, 153, 153));
        btnQuadradoPerfeito.setText("Quadrado Perfeito");
        btnQuadradoPerfeito.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnQuadradoPerfeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuadradoPerfeitoActionPerformed(evt);
            }
        });

        btnBase10_2.setBackground(new java.awt.Color(255, 255, 255));
        btnBase10_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBase10_2.setForeground(new java.awt.Color(0, 153, 153));
        btnBase10_2.setText("Base 10-2");
        btnBase10_2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBase10_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBase10_2ActionPerformed(evt);
            }
        });

        btnBase10_8.setBackground(new java.awt.Color(255, 255, 255));
        btnBase10_8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBase10_8.setForeground(new java.awt.Color(0, 153, 153));
        btnBase10_8.setText("Base 10-8");
        btnBase10_8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBase10_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBase10_8ActionPerformed(evt);
            }
        });

        btnBase10_16.setBackground(new java.awt.Color(255, 255, 255));
        btnBase10_16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBase10_16.setForeground(new java.awt.Color(0, 153, 153));
        btnBase10_16.setText("Base 10-16");
        btnBase10_16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBase10_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBase10_16ActionPerformed(evt);
            }
        });

        btnMMC.setBackground(new java.awt.Color(255, 255, 255));
        btnMMC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMMC.setForeground(new java.awt.Color(0, 153, 153));
        btnMMC.setText("MMC");
        btnMMC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMMCActionPerformed(evt);
            }
        });

        btnMDC.setBackground(new java.awt.Color(255, 255, 255));
        btnMDC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMDC.setForeground(new java.awt.Color(0, 153, 153));
        btnMDC.setText("MDC");
        btnMDC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMDCActionPerformed(evt);
            }
        });

        btnPrimosEntreSi.setBackground(new java.awt.Color(255, 255, 255));
        btnPrimosEntreSi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrimosEntreSi.setForeground(new java.awt.Color(0, 153, 153));
        btnPrimosEntreSi.setText("Primos Entre Si");
        btnPrimosEntreSi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPrimosEntreSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimosEntreSiActionPerformed(evt);
            }
        });

        btnNumeroPrimo.setBackground(new java.awt.Color(255, 255, 255));
        btnNumeroPrimo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNumeroPrimo.setForeground(new java.awt.Color(0, 153, 153));
        btnNumeroPrimo.setText("Numero Primo");
        btnNumeroPrimo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNumeroPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroPrimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBase10_2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBase10_8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPrimosEntreSi, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBase10_16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumeroPrimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumPerfeito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCapicua, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuadradoPerfeito, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumPerfeito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapicua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuadradoPerfeito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBase10_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBase10_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMMC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBase10_16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumeroPrimo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimosEntreSi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMDC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFatorialActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            if("".equals(inputNumero1.getText()) && "".equals(inputNumero2.getText())){
                throw new Exception("Campos vazios! Preencha os campos com um numero inteiro.");
            }else if("".equals(inputNumero1.getText())) {
                throw new Exception("Campo 1 vazio! Preencha o campo com um numero inteiro.");
            }else if("".equals(inputNumero2.getText())){
                throw new Exception("Campo 2 vazio! Preencha o campo com um numero inteiro.");
            }else{
                resposta.setText(resultado.fatorial());
            }
            erro.setText("");
        }catch(NumberFormatException er){
            erro.setText("Campo com caractere invalido! Preencha o campo com um numero inteiro.");
        } catch (Exception ex) {
            erro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnFatorialActionPerformed

    private void btnNumPerfeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumPerfeitoActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            if("".equals(inputNumero1.getText()) && "".equals(inputNumero2.getText())){
                throw new Exception("Campos vazios! Preencha os campos com um numero inteiro.");
            }else if("".equals(inputNumero1.getText())) {
                throw new Exception("Campo 1 vazio! Preencha o campo com um numero inteiro.");
            }else if("".equals(inputNumero2.getText())){
                throw new Exception("Campo 2 vazio! Preencha o campo com um numero inteiro.");
            }else{
                resposta.setText(resultado.numPerfeito());
            }
            erro.setText("");
        }catch(NumberFormatException er){
            erro.setText("Campo com caractere invalido! Preencha o campo com um numero inteiro.");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnNumPerfeitoActionPerformed

    private void btnCapicuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapicuaActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            if("".equals(inputNumero1.getText()) && "".equals(inputNumero2.getText())){
                throw new Exception("Campos vazios! Preencha os campos com um numero inteiro.");
            }else if("".equals(inputNumero1.getText())) {
                throw new Exception("Campo 1 vazio! Preencha o campo com um numero inteiro.");
            }else if("".equals(inputNumero2.getText())){
                throw new Exception("Campo 2 vazio! Preencha o campo com um numero inteiro.");
            }else{
                resposta.setText(resultado.capicua());
            }
            erro.setText("");
        }catch(NumberFormatException er){
            erro.setText("Campo com caractere invalido! Preencha o campo com um numero inteiro.");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnCapicuaActionPerformed

    private void btnQuadradoPerfeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuadradoPerfeitoActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            if("".equals(inputNumero1.getText()) && "".equals(inputNumero2.getText())){
                throw new Exception("Campos vazios! Preencha os campos com um numero inteiro.");
            }else if("".equals(inputNumero1.getText())) {
                throw new Exception("Campo 1 vazio! Preencha o campo com um numero inteiro.");
            }else if("".equals(inputNumero2.getText())){
                throw new Exception("Campo 2 vazio! Preencha o campo com um numero inteiro.");
            }else{
                resposta.setText(resultado.quadradoPerfeito());
            }

            erro.setText("");
        }catch(NumberFormatException er){
            erro.setText("Campo com caractere invalido! Preencha o campo com um numero inteiro.");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnQuadradoPerfeitoActionPerformed

    private void btnNumeroPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroPrimoActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            if("".equals(inputNumero1.getText()) && "".equals(inputNumero2.getText())){
                throw new Exception("Campos vazios! Preencha os campos com um numero inteiro.");
            }else if("".equals(inputNumero1.getText())) {
                throw new Exception("Campo 1 vazio! Preencha o campo com um numero inteiro.");
            }else if("".equals(inputNumero2.getText())){
                throw new Exception("Campo 2 vazio! Preencha o campo com um numero inteiro.");
            }else{
                resposta.setText(resultado.NumeroPrimo());
            }
            erro.setText("");
        }catch(NumberFormatException er){
            erro.setText("Campo com caractere invalido! Preencha o campo com um numero inteiro.");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnNumeroPrimoActionPerformed

    private void btnBase10_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBase10_2ActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            if("".equals(inputNumero1.getText()) && "".equals(inputNumero2.getText())){
                throw new Exception("Campos vazios! Preencha os campos com um numero inteiro.");
            }else if("".equals(inputNumero1.getText())) {
                throw new Exception("Campo 1 vazio! Preencha o campo com um numero inteiro.");
            }else if("".equals(inputNumero2.getText())){
                throw new Exception("Campo 2 vazio! Preencha o campo com um numero inteiro.");
            }else{
                resposta.setText(resultado.base10_2());
            }
            erro.setText("");
        }catch(NumberFormatException er){
            erro.setText("Campo com caractere invalido! Preencha o campo com um numero inteiro.");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnBase10_2ActionPerformed

    private void btnBase10_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBase10_8ActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            if("".equals(inputNumero1.getText()) && "".equals(inputNumero2.getText())){
                throw new Exception("Campos vazios! Preencha os campos com um numero inteiro.");
            }else if("".equals(inputNumero1.getText())) {
                throw new Exception("Campo 1 vazio! Preencha o campo com um numero inteiro.");
            }else if("".equals(inputNumero2.getText())){
                throw new Exception("Campo 2 vazio! Preencha o campo com um numero inteiro.");
            }else{
                resposta.setText(resultado.base10_8());
            }
            erro.setText("");
        }catch(NumberFormatException er){
            erro.setText("Campo com caractere invalido! Preencha o campo com um numero inteiro.");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnBase10_8ActionPerformed

    private void btnBase10_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBase10_16ActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            if("".equals(inputNumero1.getText()) && "".equals(inputNumero2.getText())){
                throw new Exception("Campos vazios! Preencha os campos com um numero inteiro.");
            }else if("".equals(inputNumero1.getText())) {
                throw new Exception("Campo 1 vazio! Preencha o campo com um numero inteiro.");
            }else if("".equals(inputNumero2.getText())){
                throw new Exception("Campo 2 vazio! Preencha o campo com um numero inteiro.");
            }else{
                resposta.setText(resultado.base10_16());
            }
            erro.setText("");
        }catch(NumberFormatException er){
            erro.setText("Campo com caractere invalido! Preencha o campo com um numero inteiro.");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnBase10_16ActionPerformed

    private void btnMDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMDCActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            if("".equals(inputNumero1.getText()) && "".equals(inputNumero2.getText())){
                throw new Exception("Campos vazios! Preencha os campos com um numero inteiro.");
            }else if("".equals(inputNumero1.getText())) {
                throw new Exception("Campo 1 vazio! Preencha o campo com um numero inteiro.");
            }else if("".equals(inputNumero2.getText())){
                throw new Exception("Campo 2 vazio! Preencha o campo com um numero inteiro.");
            }else{
                resposta.setText(resultado.MDC());
            }
            erro.setText("");
        }catch(NumberFormatException er){
            erro.setText("Campo com caractere invalido! Preencha o campo com um numero inteiro.");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnMDCActionPerformed

    private void btnMMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMMCActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            if("".equals(inputNumero1.getText()) && "".equals(inputNumero2.getText())){
                throw new Exception("Campos vazios! Preencha os campos com um numero inteiro.");
            }else if("".equals(inputNumero1.getText())) {
                throw new Exception("Campo 1 vazio! Preencha o campo com um numero inteiro.");
            }else if("".equals(inputNumero2.getText())){
                throw new Exception("Campo 2 vazio! Preencha o campo com um numero inteiro.");
            }else{
                resposta.setText(resultado.MMC());
            }
            erro.setText("");
        }catch(NumberFormatException er){
            erro.setText("Campo com caractere invalido! Preencha o campo com um numero inteiro.");
        }catch(Exception er){
            erro.setText(er.getMessage());
        }
    }//GEN-LAST:event_btnMMCActionPerformed

    private void btnPrimosEntreSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimosEntreSiActionPerformed
        Resultado resultado = new Resultado(inputNumero1.getText(), inputNumero2.getText());
        try{
            if("".equals(inputNumero1.getText()) && "".equals(inputNumero2.getText())){
                throw new Exception("Campos vazios! Preencha os campos com um numero inteiro.");
            }else if("".equals(inputNumero1.getText())) {
                throw new Exception("Campo 1 vazio! Preencha o campo com um numero inteiro.");
            }else if("".equals(inputNumero2.getText())){
                throw new Exception("Campo 2 vazio! Preencha o campo com um numero inteiro.");
            }else{
                resposta.setText(resultado.primosEntreSi());
            }
            erro.setText("");
        }catch(NumberFormatException er){
            erro.setText("Campo com caractere invalido! Preencha o campo com um numero inteiro.");
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resposta;
    // End of variables declaration//GEN-END:variables
}