/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.udesc.trabalhoarquivo.view;

import br.com.udesc.trabalhoarquivo.controller.CadastroCidade;
import br.com.udesc.trabalhoarquivo.controller.CadastroCidadeArquivo;
import br.com.udesc.trabalhoarquivo.model.Cidades;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * @versão 01 desenvolvimento rj
 * @author Robson de Jesus
 */
public class TelaCadastro extends javax.swing.JFrame {

    private CadastroCidadeArquivo cadastro;
    
    public TelaCadastro() {
        try{
            cadastro = new CadastroCidadeArquivo(); //inicializar com o servico de cadastro
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Ocorreu uma falha ao abrir o arquivo!");
        }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Text_cidade = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        btn_atualizar = new javax.swing.JButton();
        btn_deletar = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        Formatte_cep = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        text_uf = new javax.swing.JTextField();
        btn_buscarCEP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CEP Cidade:");

        jLabel2.setText("Nome Cidade:");

        btn_buscar.setText("Buscar pelo nome");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel3.setText("UF da Cidade:");

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_atualizar.setText("Atualizar");

        btn_deletar.setText("Deletar");
        btn_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarActionPerformed(evt);
            }
        });

        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        try {
            Formatte_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome Cidades", "CEP Cidades", "UF da Cidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        btn_buscarCEP.setText("Buscar pelo CEP");
        btn_buscarCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarCEPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addGap(22, 22, 22)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_salvar)
                                .addGap(23, 23, 23)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_atualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_deletar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_limpar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Formatte_cep)
                                    .addComponent(Text_cidade, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(text_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_buscarCEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_atualizar, btn_deletar, btn_limpar, btn_salvar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Formatte_cep, Text_cidade});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Text_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Formatte_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_buscarCEP)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(text_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_atualizar)
                    .addComponent(btn_deletar)
                    .addComponent(btn_limpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_atualizar, btn_deletar, btn_limpar, btn_salvar});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Formatte_cep, Text_cidade});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        
        String nome = Text_cidade.getText();// pegando o campo da tela, campo cidade
        String cep = Formatte_cep.getText();// pegando o campo da tela, campo cep
        String uf = text_uf.getText();// pegando o campo da tela, campo uf
        
        Cidades c = new Cidades(nome, uf, cep);
        
        try{
            if(cadastro.create(c)){
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            limparTela();
        }else{
            JOptionPane.showMessageDialog(null, "Já existe uma cidade com esse CEP!");
        }
        }catch(IOException |ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Ocorreu uma falha ao abrir o arquivo!");
            
        }
        
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        // TODO add your handling code here:
        Text_cidade.setText("");
        Formatte_cep.setText("");
        text_uf.setText("");
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        Cidades c = null;
                
            try{
                c = cadastro.buscar(Text_cidade.getText());
            }catch(IOException | ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Ocorreu uma falha ao abrir o arquivo!");
            }
        
        if(c == null){
            JOptionPane.showMessageDialog(null, "Não existe nenhuma cidade com esse nome!");
        }else{
            Text_cidade.setText(c.getNome());
            Formatte_cep.setText(c.getCep());
            text_uf.setText(c.getUf());
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarActionPerformed
        
        String nome = Text_cidade.getText();// pegando o campo da tela, campo cidade
        String cep = Formatte_cep.getText();// pegando o campo da tela, campo cep
        String uf = text_uf.getText();// pegando o campo da tela, campo uf
        
        
        Cidades c = new Cidades(nome, uf, cep);
        
        try{
            if(cadastro.delete(c)){
            JOptionPane.showMessageDialog(null, "Removido com sucesso");
            limparTela();
        }else{
            JOptionPane.showMessageDialog(null, "Falha ao deletar");
        }
        }catch(IOException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Ocorreu uma falha ao abrir o arquivo!");
        }
    }//GEN-LAST:event_btn_deletarActionPerformed

    private void btn_buscarCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarCEPActionPerformed

        Cidades c = null;
                
            try{
                c = cadastro.buscarCEP(Formatte_cep.getText());
            }catch(IOException | ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Ocorreu uma falha ao abrir o arquivo!");
            }
        
        if(c == null){
            JOptionPane.showMessageDialog(null, "Não existe nenhuma cidade com esse CEP!");
        }else{
            Text_cidade.setText(c.getNome());
            Formatte_cep.setText(c.getCep());
            text_uf.setText(c.getUf());
        }
    }//GEN-LAST:event_btn_buscarCEPActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Formatte_cep;
    private javax.swing.JTextField Text_cidade;
    private javax.swing.JButton btn_atualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscarCEP;
    private javax.swing.JButton btn_deletar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField text_uf;
    // End of variables declaration//GEN-END:variables

    private void limparTela() {
        Text_cidade.setText("");
        Formatte_cep.setText("");
        text_uf.setText("");
        
    }
}
