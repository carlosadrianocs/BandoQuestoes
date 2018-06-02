/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import bancodequestoes2.SqlConn;
import java.awt.Frame;
import java.io.File;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Carlos
 */
public class Cadastra extends javax.swing.JFrame {

     public Cadastra() {
        initComponents();
        jTextArea2.setVisible(false);
        jLblMark1.setVisible(false);
        jLblMark2.setVisible(false);
        jLblMark3.setVisible(false);
        jLblMark4.setVisible(false);
        jLblMark5.setVisible(false);
        jLblMark6.setVisible(false);
        // Componentes Ocultos
        jTextField1.setVisible(false);
        jCheckBox1.setVisible(false);
        jTextField2.setVisible(false);
        jCheckBox2.setVisible(false);
        jTextField3.setVisible(false);
        jCheckBox3.setVisible(false);
        jTextField4.setVisible(false);
        jCheckBox4.setVisible(false);
        jTextField5.setVisible(false);
        jCheckBox5.setVisible(false);
        jLabel4.setVisible(false);
        jLabel3.setVisible(false);
        jQuantQuest.setVisible(false);
        jLabel5.setVisible(false);
        jTQuestion.setVisible(false);
        jScrollPane3.setVisible(false);
        jButton1.setVisible(false);
        jLabel6.setVisible(false);
        tDisciplina.setVisible(false);
        
        ArrayList<String> temas = new ArrayList();
        ArrayList<String> disciplina = new ArrayList();
         try {
                SqlConn.abrirConexão();
            } catch (Exception ex) {
                System.out.println("Erro ao conectar");
            }
         temas = SqlConn.getTemas();
         disciplina = SqlConn.getDisciplinas();
          try{
                SqlConn.fecharConexão(SqlConn.getConnection());
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão");
            }
        
        for(int i = 0; i < temas.size(); i ++){
            jTQuestion.addItem(temas.get(i));
        }
        
         for(int i = 0; i < disciplina.size(); i ++){
            tDisciplina.addItem(disciplina.get(i));
        }
        jTQuestion.addItem("Adicionar");
        tDisciplina.addItem("Adicionar");    
    }
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        exit1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTpQuest = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jQuantQuest = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTQuestion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLblIcon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLblMark2 = new javax.swing.JLabel();
        jLblMark3 = new javax.swing.JLabel();
        jLblMark4 = new javax.swing.JLabel();
        jLblMark5 = new javax.swing.JLabel();
        jLblMark1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tDisciplina = new javax.swing.JComboBox<>();
        jLblMark6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1040, 680));
        setMinimumSize(new java.awt.Dimension(1040, 680));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1040, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(45, 118, 232));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit1.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setText("-");
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit1MousePressed(evt);
            }
        });
        jPanel3.add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 30, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Exit_25px.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 20, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(44, 62, 80));
        jPanel1.setMaximumSize(new java.awt.Dimension(1040, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(1040, 640));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 118, 232));
        jLabel1.setText("Enunciado");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(jTextArea1);

        jTpQuest.setForeground(new java.awt.Color(51, 51, 51));
        jTpQuest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alternativa", "Verdadeiro e Falso", "Discursiva" }));
        jTpQuest.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        jTpQuest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTpQuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpQuestActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 118, 232));
        jLabel2.setText("Tipo da Questão");

        jQuantQuest.setForeground(new java.awt.Color(51, 51, 51));
        jQuantQuest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "5", "4", "3", "2" }));
        jQuantQuest.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        jQuantQuest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jQuantQuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuantQuestActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 118, 232));
        jLabel3.setText("Quantidade de Alternativas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 118, 232));
        jLabel4.setText("Selecione a Alternativa Correta");

        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));

        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232)));

        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));

        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));

        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));

        jButton1.setBackground(new java.awt.Color(45, 118, 232));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Salvar Questão");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        jScrollPane3.setViewportView(jTextArea2);

        jTQuestion.setForeground(new java.awt.Color(51, 51, 51));
        jTQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jTQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        jTQuestion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTQuestionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTQuestionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTQuestionMouseExited(evt);
            }
        });
        jTQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTQuestionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 118, 232));
        jLabel5.setText("Tema Questão");

        jLblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblIcon.setText("Imagem");
        jLblIcon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        jLblIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblIconMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(45, 118, 232));
        jLabel8.setText("Ilustração");

        jLblMark2.setForeground(new java.awt.Color(255, 0, 0));
        jLblMark2.setText("*");

        jLblMark3.setForeground(new java.awt.Color(255, 0, 0));
        jLblMark3.setText("*");

        jLblMark4.setForeground(new java.awt.Color(255, 0, 0));
        jLblMark4.setText("*");

        jLblMark5.setForeground(new java.awt.Color(255, 0, 0));
        jLblMark5.setText("*");

        jLblMark1.setForeground(new java.awt.Color(255, 0, 0));
        jLblMark1.setText("*");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(45, 118, 232));
        jLabel6.setText("Disciplina");

        tDisciplina.setForeground(new java.awt.Color(51, 51, 51));
        tDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        tDisciplina.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 118, 232), 1, true));
        tDisciplina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tDisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDisciplinaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tDisciplinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tDisciplinaMouseExited(evt);
            }
        });
        tDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDisciplinaActionPerformed(evt);
            }
        });

        jLblMark6.setForeground(new java.awt.Color(255, 0, 0));
        jLblMark6.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(jLblMark1)
                        .addGap(797, 797, 797)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(jLblMark2))
                            .addComponent(jTpQuest, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(2, 2, 2)
                                .addComponent(jLblMark3))
                            .addComponent(jQuantQuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblMark4))
                            .addComponent(jTQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblMark6))
                            .addComponent(tDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLblMark5))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox1)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox2)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox3)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox4)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox5)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLblMark1))
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLblMark2)
                    .addComponent(jLabel3)
                    .addComponent(jLblMark3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLblMark4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLblMark6)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTpQuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQuantQuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLblMark5)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 1040, 700));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTpQuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpQuestActionPerformed
        // TODO add your handling code here:
        if(jTpQuest.getSelectedItem() == "Selecione"){
            jScrollPane3.setVisible(false);
            jLblMark3.setVisible(false);
            jLblMark4.setVisible(false);
            jLblMark5.setVisible(false);
            jButton1.setVisible(false);
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
            jCheckBox3.setVisible(false);
            jCheckBox4.setVisible(false);
            jCheckBox5.setVisible(false);
            jTextField1.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jLabel4.setVisible(false);
            jLabel3.setVisible(false);
            jQuantQuest.setVisible(false);
            jLabel5.setVisible(false);
            jTQuestion.setVisible(false);
            jLabel6.setVisible(false);
            tDisciplina.setVisible(false);
        }
        if(jTpQuest.getSelectedItem() == "Verdadeiro e Falso"){
            jScrollPane3.setVisible(false);
            jButton1.setVisible(true);
            jTextArea2.setVisible(false);
            jQuantQuest.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jTQuestion.setVisible(true);
            jTextField1.setVisible(true);
            jCheckBox1.setVisible(true);
            jTextField1.setSize(202, 20);
            jTextField2.setVisible(true);
            jCheckBox2.setVisible(true);
            jTextField2.setSize(202, 20);
            jTextField3.setVisible(false);
            jCheckBox3.setVisible(false);
            jTextField4.setVisible(false);
            jCheckBox4.setVisible(false);
            jTextField5.setVisible(false);
            jCheckBox5.setVisible(false);
            tDisciplina.setVisible(true);
            jLabel6.setVisible(true);
        }else if(jTpQuest.getSelectedItem() == "Alternativa"){
            jScrollPane3.setVisible(false);
            jButton1.setVisible(true);
            jTextArea2.setVisible(false);
            jQuantQuest.setVisible(true);
            jLabel3.setVisible(true);
            jLabel5.setVisible(true);
            jTQuestion.setVisible(true);
            tDisciplina.setVisible(true);
            jLabel6.setVisible(true);
            jQuantQuest.setSelectedItem("Selecione");
            if(jQuantQuest.getSelectedItem() == "Selecione"){
                jLabel4.setVisible(false);
                jCheckBox1.setVisible(false);
                jCheckBox2.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jCheckBox5.setVisible(false);
                jTextField1.setVisible(false);
                jTextField2.setVisible(false);
                jTextField3.setVisible(false);
                jTextField4.setVisible(false);
                jTextField5.setVisible(false);
            }else if(jQuantQuest.getSelectedItem() == "2"){
                jTpQuest.setSelectedItem("Verdadeiro e Falso");
            }else if(jQuantQuest.getSelectedItem() == "3"){
                jLabel4.setVisible(true);
                jCheckBox1.setVisible(true);
                jCheckBox2.setVisible(true);
                jCheckBox3.setVisible(true);
                jCheckBox4.setVisible(false);
                jCheckBox5.setVisible(false);
                jTextField1.setVisible(true);
                jTextField2.setVisible(true);
                jTextField3.setVisible(true);
                jTextField4.setVisible(false);
                jTextField5.setVisible(false);
            }else if(jQuantQuest.getSelectedItem() == "4"){
                jLabel4.setVisible(true);
                jCheckBox1.setVisible(true);
                jCheckBox2.setVisible(true);
                jCheckBox3.setVisible(true);
                jCheckBox4.setVisible(true);
                jCheckBox5.setVisible(false);
                jTextField1.setVisible(true);
                jTextField2.setVisible(true);
                jTextField3.setVisible(true);
                jTextField4.setVisible(true);
                jTextField5.setVisible(false);
            }else if(jQuantQuest.getSelectedItem() == "5"){
                jLabel4.setVisible(true);
                jCheckBox1.setVisible(true);
                jCheckBox2.setVisible(true);
                jCheckBox3.setVisible(true);
                jCheckBox4.setVisible(true);
                jCheckBox5.setVisible(true);
                jTextField1.setVisible(true);
                jTextField2.setVisible(true);
                jTextField3.setVisible(true);
                jTextField4.setVisible(true);
                jTextField5.setVisible(true);
            }
        }else if(jTpQuest.getSelectedItem() == "Discursiva"){
            jTQuestion.setVisible(true);
            jLabel5.setVisible(true);
            jScrollPane3.setVisible(true);
            jButton1.setVisible(true);
            jTextArea2.setVisible(true);
            jQuantQuest.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jTextField1.setVisible(false);
            jCheckBox1.setVisible(false);
            jTextField2.setVisible(false);
            jCheckBox2.setVisible(false);
            jTextField3.setVisible(false);
            jCheckBox3.setVisible(false);
            jTextField4.setVisible(false);
            jCheckBox4.setVisible(false);
            jTextField5.setVisible(false);
            jCheckBox5.setVisible(false);
        }
    }//GEN-LAST:event_jTpQuestActionPerformed

    private void jQuantQuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuantQuestActionPerformed
        // TODO add your handling code here:
        if(jQuantQuest.getSelectedItem() == "Selecione"){
            jButton1.setVisible(false);
        }else if(jQuantQuest.getSelectedItem() == "2"){
            jTpQuest.setSelectedItem("Verdadeiro e Falso");
            jButton1.setVisible(true);
            /*
            jTextField1.setVisible(true);
            jCheckBox1.setVisible(true);
            jTextField1.setSize(202, 20);
            jTextField2.setVisible(true);
            jCheckBox2.setVisible(true);
            jTextField2.setSize(202, 20);
            jTextField3.setVisible(false);
            jCheckBox3.setVisible(false);
            jTextField4.setVisible(false);
            jCheckBox4.setVisible(false);
            jTextField5.setVisible(false);
            jCheckBox5.setVisible(false);*/
        }else if(jQuantQuest.getSelectedItem() == "3"){
            jLabel4.setVisible(true);
            jTextField1.setVisible(true);
            jCheckBox1.setVisible(true);
            jCheckBox1.setText("");
            jTextField1.disable();
            //jTextField1.setSize(202, 20);
            jTextField2.setVisible(true);
            jCheckBox2.setVisible(true);
            //jTextField2.setSize(202, 20);
            jTextField3.setVisible(true);
            jCheckBox3.setVisible(true);
            //jTextField3.setSize(202, 20);
            jTextField4.setVisible(false);
            jCheckBox4.setVisible(false);
            jTextField5.setVisible(false);
            jCheckBox5.setVisible(false);
            jButton1.setVisible(true);
        }else if(jQuantQuest.getSelectedItem() == "4"){
            jLabel4.setVisible(true);
            jTextField1.setVisible(true);
            jCheckBox1.setVisible(true);
            //jTextField1.setSize(202, 20);
            jTextField2.setVisible(true);
            jCheckBox2.setVisible(true);
            //jTextField2.setSize(202, 20);
            jTextField3.setVisible(true);
            jCheckBox3.setVisible(true);
            //jTextField3.setSize(202, 20);
            jTextField4.setVisible(true);
            jCheckBox4.setVisible(true);
            //jTextField4.setSize(202, 20);
            jTextField5.setVisible(false);
            jCheckBox5.setVisible(false);
            jButton1.setVisible(true);
        }else if(jQuantQuest.getSelectedItem() == "5"){
            jLabel4.setVisible(true);
            jTextField1.setVisible(true);
            jCheckBox1.setVisible(true);
            //jTextField1.setSize(202, 20);
            jTextField2.setVisible(true);
            jCheckBox2.setVisible(true);
            //jTextField2.setSize(202, 20);
            jTextField3.setVisible(true);
            jCheckBox3.setVisible(true);
            //jTextField3.setSize(202, 20);
            jTextField4.setVisible(true);
            jCheckBox4.setVisible(true);
            //jTextField4.setSize(202, 20);
            jTextField5.setVisible(true);
            jCheckBox5.setVisible(true);
            //jTextField5.setSize(202, 20);
            jButton1.setVisible(true);
        }
    }//GEN-LAST:event_jQuantQuestActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox2.isSelected()){
            jCheckBox1.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox3.isSelected()){
            jCheckBox2.setSelected(false);
            jCheckBox1.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox4.isSelected()){
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox1.setSelected(false);
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox5.isSelected()){
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean mensage = false;

        if(jTextArea1.getText().equals("")){
            jLblMark1.setVisible(true);
            mensage = true;
        }else{
            jLblMark1.setVisible(false);
        }

        if(jTpQuest.getSelectedItem()== "Selecione"){
            jLblMark2.setVisible(true);
            mensage = true;
        }else{
            jLblMark2.setVisible(false);
        }

        if(jTQuestion.getSelectedItem() == "Selecione" && jTQuestion.isVisible() == true){
            jLblMark4.setVisible(true);
            mensage = true;
        }else{
            jLblMark4.setVisible(false);
        }

        if(jQuantQuest.getSelectedItem() == "Selecione" && jQuantQuest.isVisible() == true){
            jLblMark3.setVisible(true);
            mensage = true;
        }else{
            jLblMark3.setVisible(false);
        }

        if(tDisciplina.getSelectedItem() == "Selecione" && tDisciplina.isVisible() == true){
            jLblMark6.setVisible(true);
            mensage = true;
        }else{
            jLblMark6.setVisible(false);
        }

        if(jTpQuest.getSelectedItem() == "Alternativa" || jTpQuest.getSelectedItem() == "Verdadeiro e Falso"){
            jLblMark5.setVisible(false);
            if(jTextField1.isVisible() == true && jTextField1.getText().equals("") && jLabel4.isVisible()){
                jLblMark5.setVisible(true);
                mensage = true;
            }
            if(jTextField2.isVisible() == true && jTextField2.getText().equals("") && jLabel4.isVisible()){
                jLblMark5.setVisible(true);
                mensage = true;
            }
            if(jTextField3.isVisible() == true && jTextField3.getText().equals("") && jLabel4.isVisible()){
                jLblMark5.setVisible(true);
                mensage = true;
            }
            if(jTextField4.isVisible() == true && jTextField4.getText().equals("") && jLabel4.isVisible()){
                jLblMark5.setVisible(true);
                mensage = true;
            }
            if(jTextField5.isVisible() == true && jTextField5.getText().equals("") && jLabel4.isVisible()){
                jLblMark5.setVisible(true);
                mensage = true;
            }
            if(jCheckBox1.isSelected() == false && jCheckBox2.isSelected() == false && jCheckBox3.isSelected() == false && jCheckBox4.isSelected() == false && jCheckBox5.isSelected() == false && jLabel4.isVisible()){
                jLblMark5.setVisible(true);
                mensage = true;
            }
        }
        if(mensage){
            JOptionPane.showMessageDialog(null, "(*) Campo Obrigatório!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                SqlConn.abrirConexão();
            } catch (Exception ex) {
                System.out.println("Erro ao conectar");
            }

            if(jTpQuest.getSelectedItem() == "Verdadeiro e Falso"){
                SqlConn.inserirQuestaoVF(jTextArea1.getText(), jTpQuest.getSelectedItem().toString(), jTQuestion.getSelectedItem().toString(),  jCheckBox1, jCheckBox2, jTextField1.getText(), jTextField2.getText());
                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
            }else if(jTpQuest.getSelectedItem() == "Discursiva"){
                SqlConn.inserirQuestaoD(jTextArea1.getText(), jTpQuest.getSelectedItem().toString(), jTQuestion.getSelectedItem().toString(),  jTextArea2.getText());
                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
            }
            else if(jTpQuest.getSelectedItem() == "Alternativa"){
                if(jQuantQuest.getSelectedItem() == "2"){
                    SqlConn.inserirQuestaoVF(jTextArea1.getText(), jTpQuest.getSelectedItem().toString(), jTQuestion.getSelectedItem().toString(),  jCheckBox1, jCheckBox2, jTextField1.getText(), jTextField2.getText());
                    JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
                }else if(jQuantQuest.getSelectedItem() == "3"){
                    SqlConn.inserirEmAlternativas3(jTextArea1.getText(), jTpQuest.getSelectedItem().toString(), jTQuestion.getSelectedItem().toString(), jCheckBox1, jCheckBox2, jCheckBox3, jTextField1.getText(), jTextField2.getText(), jTextField3.getText());
                    JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
                }else if(jQuantQuest.getSelectedItem() == "4"){
                    SqlConn.inserirEmAlternativas4(jTextArea1.getText(), jTpQuest.getSelectedItem().toString(), jTQuestion.getSelectedItem().toString(), jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), jTextField4.getText());
                    JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
                }else if(jQuantQuest.getSelectedItem() == "5"){
                    SqlConn.inserirEmAlternativas5(jTextArea1.getText(), jTpQuest.getSelectedItem().toString(), jTQuestion.getSelectedItem().toString(), jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5, jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), jTextField4.getText(), jTextField5.getText());
                    JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
                }
            }

            try{
                SqlConn.fecharConexão(SqlConn.getConnection());
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão");
            }
            JOptionPane.showMessageDialog(null, "Questão Salva!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTQuestionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTQuestionMouseClicked

    private void jTQuestionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTQuestionMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTQuestionMouseEntered

    private void jTQuestionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTQuestionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTQuestionMouseExited

    private void jTQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTQuestionActionPerformed
        // TODO add your handling code here:
        if(jTQuestion.getSelectedItem() == "Adicionar"){
            String str = JOptionPane.showInputDialog(null, "Adicionar tema:");
            System.out.println("teste");
            if(str == null || str == ""){
                jTQuestion.setSelectedItem("Selecione");
            }else{
                jTQuestion.removeItem("Adicionar");
                jTQuestion.addItem(str);
                jTQuestion.addItem("Adicionar");
                jTQuestion.setSelectedItem(str);
            }
        }
        /*if(jTQuestion.getSelectedItem() == "Adicionar"){
            String fodase = JOptionPane.showInputDialog(null, "Digite");
        }*/
    }//GEN-LAST:event_jTQuestionActionPerformed

    private void jLblIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblIconMouseClicked
        // TODO add your handling code here:
        String foto = "E:\\Pasta Compartilhada\\Imagens\\Icones\\Color\\Businessman_528px.png";
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Apenas imagens JPG e PNG", "jpg", "png");
        filechooser.setFileFilter(filtro);
        filechooser.addChoosableFileFilter(filtro);
        if(filechooser.showOpenDialog(jLblIcon) == JFileChooser.APPROVE_OPTION){
            File arquivo = filechooser.getSelectedFile();
            if(arquivo != null){
                foto = arquivo.getPath();
            }
            ImageIcon imagem = new ImageIcon(foto);
            imagem.setImage(imagem.getImage().getScaledInstance(jLblIcon.getWidth(), jLblIcon.getHeight(), 0));
            Icon icon = imagem;
            jLblIcon.setIcon(icon);
        }
    }//GEN-LAST:event_jLblIconMouseClicked

    private void tDisciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDisciplinaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tDisciplinaMouseClicked

    private void tDisciplinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDisciplinaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tDisciplinaMouseEntered

    private void tDisciplinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDisciplinaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tDisciplinaMouseExited

    private void tDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDisciplinaActionPerformed
        // TODO add your handling code here:
        if(tDisciplina.getSelectedItem() == "Adicionar"){
            String str = JOptionPane.showInputDialog(null, "Adicionar disciplina:");
            if(str == null || str == ""){
                tDisciplina.setSelectedItem("Selecione");
            }else{
                tDisciplina.removeItem("Adicionar");
                tDisciplina.addItem(str);
                tDisciplina.addItem("Adicionar");
                tDisciplina.setSelectedItem(str);
            }
        }
    }//GEN-LAST:event_tDisciplinaActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        //Retornar ao menu principal
        Principal pp = new Principal();
        pp.setVisible(true);
        pp.pack();
        pp.setLocationRelativeTo(null);
        pp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void exit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MousePressed
        this.setState(Frame.ICONIFIED);//MINIMIZANDO TELA PRINCIPAL
    }//GEN-LAST:event_exit1MousePressed

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exit1MouseClicked
    int xx, xy;
    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel3MouseDragged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblIcon;
    private javax.swing.JLabel jLblMark1;
    private javax.swing.JLabel jLblMark2;
    private javax.swing.JLabel jLblMark3;
    private javax.swing.JLabel jLblMark4;
    private javax.swing.JLabel jLblMark5;
    private javax.swing.JLabel jLblMark6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jQuantQuest;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jTQuestion;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JComboBox<String> jTpQuest;
    private javax.swing.JComboBox<String> tDisciplina;
    // End of variables declaration//GEN-END:variables
}
