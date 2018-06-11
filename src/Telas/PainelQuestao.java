/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

/**
 *
 * @author jacks
 */
public class PainelQuestao extends javax.swing.JPanel {

    /**
     * Creates new form PainelQuestao
     */
    
    public int ID;
    
    public PainelQuestao(int id, String tipo, String quantidade, String alt1, String alt2, String alt3, String alt4, String alt5, String justificativa, String tema, String disciplina, String enunciado) {
        initComponents();
        ID = id;
        jLblDisciplina.setText(disciplina);
        jLblTema.setText(tema);
        jTextEnunciado.setText(enunciado);
        if(tipo.equals("Disertativa")){
            JTextPane painelDisertativa = new JTextPane();
            
            jPnlResposta.add(painelDisertativa);
            painelDisertativa.setText(justificativa);
        }else if(tipo.equals("Verdadeiro e Falso")){
            JLabel jLbl1 = new JLabel();
            JLabel jLbl2 = new JLabel();
            
            jPnlResposta.add(jLbl1);
            jPnlResposta.add(jLbl2);
            jLbl1.setText(alt1);
            jLbl1.setFont(new Font("Tahoma", 2, 14));
            jLbl2.setText(alt2);
            jLbl2.setFont(new Font("Tahoma", 2, 14));
        }else if(tipo.equals("Alternativa")){
            if(quantidade.equals("5")){
                JLabel jLbl1 = new JLabel();
                JLabel jLbl2 = new JLabel();
                JLabel jLbl3 = new JLabel();
                JLabel jLbl4 = new JLabel();
                JLabel jLbl5 = new JLabel();
                
                jPnlResposta.setLayout(new GridLayout(5, 1));
                jPnlResposta.add(jLbl1);
                jPnlResposta.add(jLbl2);
                jPnlResposta.add(jLbl3);
                jPnlResposta.add(jLbl4);
                jPnlResposta.add(jLbl5);
                
                jLbl1.setText(alt1);
                jLbl2.setText(alt2);
                jLbl3.setText(alt3);
                jLbl4.setText(alt4);
                jLbl5.setText(alt5);
                jLbl1.setFont(new Font("Tahoma", 1, 14));
                jLbl2.setFont(new Font("Tahoma", 1, 14));
                jLbl3.setFont(new Font("Tahoma", 1, 14));
                jLbl4.setFont(new Font("Tahoma", 1, 14));
                jLbl5.setFont(new Font("Tahoma", 1, 14));
            }else if(quantidade.equals("4")){
                JLabel jLbl1 = new JLabel();
                JLabel jLbl2 = new JLabel();
                JLabel jLbl3 = new JLabel();
                JLabel jLbl4 = new JLabel();
                
                jPnlResposta.setLayout(new GridLayout(4, 1));
                jPnlResposta.add(jLbl1);
                jPnlResposta.add(jLbl2);
                jPnlResposta.add(jLbl3);
                jPnlResposta.add(jLbl4);
                
                jLbl1.setText(alt1);
                jLbl2.setText(alt2);
                jLbl3.setText(alt3);
                jLbl4.setText(alt4);
                jLbl1.setFont(new Font("Tahoma", 1, 14));
                jLbl2.setFont(new Font("Tahoma", 1, 14));
                jLbl3.setFont(new Font("Tahoma", 1, 14));
                jLbl4.setFont(new Font("Tahoma", 1, 14));
            }else if(quantidade.equals("3")){
                JLabel jLbl1 = new JLabel();
                JLabel jLbl2 = new JLabel();
                JLabel jLbl3 = new JLabel();
                
                jPnlResposta.setLayout(new GridLayout(3, 1));
                jPnlResposta.add(jLbl1);
                jPnlResposta.add(jLbl2);
                jPnlResposta.add(jLbl3);
                
                jLbl1.setText(alt1);
                jLbl2.setText(alt2);
                jLbl3.setText(alt3);
                jLbl1.setFont(new Font("Tahoma", 1, 14));
                jLbl2.setFont(new Font("Tahoma", 1, 14));
                jLbl3.setFont(new Font("Tahoma", 1, 14));
            }else if(quantidade.equals("2")){
                JLabel jLbl1 = new JLabel();
                JLabel jLbl2 = new JLabel();
                
                jPnlResposta.setLayout(new GridLayout(2, 1));
                jPnlResposta.add(jLbl1);
                jPnlResposta.add(jLbl2);
                
                jLbl1.setText(alt1);
                jLbl2.setText(alt2);
                jLbl1.setFont(new Font("Tahoma", 1, 14));
                jLbl2.setFont(new Font("Tahoma", 1, 14));
            }
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

        jPanel2 = new javax.swing.JPanel();
        jTextEnunciado = new javax.swing.JTextPane();
        jLblTema = new javax.swing.JLabel();
        jLblDisciplina = new javax.swing.JLabel();
        jPnlResposta = new javax.swing.JPanel();
        jLblFoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        jTextEnunciado.setEditable(false);

        jLblTema.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLblTema.setText("Modelo Relacional");

        jLblDisciplina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblDisciplina.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLblDisciplina.setText("Banco de Dados");

        jPnlResposta.setLayout(new java.awt.GridLayout(5, 1, 0, 2));

        jLblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblFoto.setText("Ilustração");
        jLblFoto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 51)));

        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Plus_Math_26px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Edit_26px_2.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_26px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLblTema, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLblDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                    .addComponent(jTextEnunciado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPnlResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblTema, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPnlResposta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "ID: " + ID);
    }//GEN-LAST:event_jLabel1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblDisciplina;
    private javax.swing.JLabel jLblFoto;
    private javax.swing.JLabel jLblTema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPnlResposta;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextEnunciado;
    // End of variables declaration//GEN-END:variables
}
