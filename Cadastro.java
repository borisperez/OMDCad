/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package omdcad;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.TableModel;

/**
 *
 * @author Boris
 */
public class Cadastro extends JInternalFrame{

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private JCalendar jComboBox2;
    private JCalendar jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private JCalendar jComboBox6;
    private javax.swing.JFormattedTextField jFormattedTextField1;
 //   private javax.swing.JFrame jFrame1;
 //   private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    
    private Qa qa = new Qa();
    private List<Qa> ListaQa;
    private AcaoSql acaoSql;
    private QaTable tabela;


    public Cadastro(Qa qa) throws ParseException {
        initComponents();
        this.qa = qa;
        setCadastro(qa);
        setConnection();
        this.setPreferredSize(new Dimension(993,778));
    }


    @SuppressWarnings("unchecked")
    private void initComponents() throws ParseException{

      //  jFrame1 = new javax.swing.JFrame();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
     //   jInternalFrame1 = new javax.swing.JInternalFrame();
        panel1 = new java.awt.Panel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new JCalendar();
        jComboBox3 = new JCalendar();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox6 = new JCalendar();
        jSeparator2 = new javax.swing.JSeparator();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(buttonAcao);
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(buttonAcao);
        jButton3 = new javax.swing.JButton();
        jButton3.addActionListener(buttonAcao);
        jButton4 = new javax.swing.JButton();
        jButton4.addActionListener(buttonAcao);
        jButton5 = new javax.swing.JButton();
        jButton5.addActionListener(buttonAcao);
        jButton6 = new javax.swing.JButton();
        jButton6.addActionListener(buttonAcao);
        jButton7 = new javax.swing.JButton();
        jButton7.addActionListener(buttonAcao);
        panel2 = new java.awt.Panel();


//        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
//        jFrame1.getContentPane().setLayout(jFrame1Layout);
//        jFrame1Layout.setHorizontalGroup(
//            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 400, Short.MAX_VALUE)
//        );
//        jFrame1Layout.setVerticalGroup(
//            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 //           .addGap(0, 300, Short.MAX_VALUE)
//        );

        jTextField5.setText("jTextField5");

        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      //  jInternalFrame1.setVisible(true);

        jTextField1.setText("Job");

        jTextField2.setText("Projeto");
        jTextField2.setToolTipText("");

        jTextField3.setText("Ambiente");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Item 1", "Item 2", "Item 3", "Item 4" }));
                jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "","Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "","Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Nome Job:");
        jLabel1.setToolTipText("");

        jLabel2.setText("Nome Projeto:");

        jLabel3.setText("Nome Ambiente:");
        jLabel3.setToolTipText("");

        jLabel4.setText("Data Inicio");

        jLabel5.setText("Data Fim");

        jLabel6.setText("Analise");

        jLabel7.setText("Analista");
        jLabel7.setToolTipText("");



        jLabel8.setText("QA");

        jLabel9.setText("Tempo Analise");
        jLabel9.setToolTipText("");

        jLabel10.setText("Data Envio");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##:##:##"))));

        jButton1.setText("Consulta");

        jButton2.setText("Atualizar");

        jButton3.setText("Salvar");

        jButton4.setText("Remover");

        jButton5.setText("Limpar");

        jButton6.setText("Sair");

        jButton7.setText("Limpa Lista");

    //    jFormattedTextField1.setFormatterFactory("hh:mm:ss");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField3))))
                        .addContainerGap())
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(295, 295, 295))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jTable1);
        jButton7.setText("limpaCadastro");

        jButton6.setText("limpaLista");

        jButton5.setText("Sair");

        jButton4.setText("Remover");

        jButton3.setText("Salvar");

        jButton2.setText("Atualizar");

        jButton1.setText("Consulta");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)))
        );


        
        ListaQa = new ArrayList<>();
        ListaQa.add(qa);
        tabela = new QaTable(ListaQa);
        jTable1 = new JTable(tabela);
        jTable1.addMouseListener(mouseAcao); 
        jTable1.setPreferredScrollableViewportSize(new Dimension(400, 15));
        jScrollPane1.setViewportView(jTable1);
        
        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800,Short.MAX_VALUE)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE,800, Short.MAX_VALUE)
              
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(jInternalFrame1)
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
//        );


     //   add(jScrollPane1, BorderLayout.CENTER);
        
        pack();
    }

ActionListener buttonAcao = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent event) {
            acaoSql = new AcaoSql(setConnection(), getCadastro());
            if (event.getSource() == jButton1) {
                acaoConsulta();
                setConnection().FecharConexao();
            } else if (event.getSource() == jButton2) {
                acaoAtualizar();
                setConnection().FecharConexao();
            } else if (event.getSource() == jButton3) {
                acaoSalvar();
                setConnection().FecharConexao();
            } else if (event.getSource() == jButton4) {
                acaoRemover();
                setConnection().FecharConexao();
            } else if (event.getSource() == jButton5) {
                dispose();
            } else if (event.getSource() == jButton6) {
                tabela.limpaLista();
            } else if (event.getSource() == jButton7) {
                limpaCadastro();
            }
    }            
};
    
MouseAdapter mouseAcao = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                try {
                    setCadastro(geraQaDaLinha());
		} catch (ParseException e1) {
                    e1.printStackTrace();
		}
            }
        }
};

    private Conexao setConnection() {
        Conexao conexao = new Conexao();
        try {
            conexao.Conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexao;
    }

    private void acaoConsulta() {
        acaoSql = new AcaoSql(setConnection(), getCadastro());
        ListaQa = acaoSql.Consulta();
        tabela.limpaLista();
        tabela.adicionaLista(ListaQa);
    }

    private void acaoAtualizar() {
        acaoSql.Atualizar();
        limpaCadastro();
        acaoConsulta();

    }

    private void acaoSalvar() {
        acaoSql.Salvar();
        limpaCadastro();
        acaoConsulta();


    }

    private void acaoRemover() {
        acaoSql.Remover();
        limpaCadastro();
        acaoConsulta();

    }

    private Qa geraQaDaLinha() {
        qa = new Qa();
        int[] Linha = jTable1.getSelectedRows();
        if (Linha.length > 0) {
            TableModel tm = jTable1.getModel();
            qa.setIdQa(Integer.parseInt(tm.getValueAt(Linha[0], 0).toString()));
            qa.setNomeJob(tm.getValueAt(Linha[0], 1).toString());
            qa.setNomeProjeto(tm.getValueAt(Linha[0], 2).toString());
            qa.setNomeAmbiente(tm.getValueAt(Linha[0], 3).toString());
            qa.setDurExecucao(tm.getValueAt(Linha[0], 4).toString());
            qa.setDataIni(tm.getValueAt(Linha[0], 5).toString());
            qa.setDataFim(tm.getValueAt(Linha[0], 6).toString());
            qa.setStatusExecucao(tm.getValueAt(Linha[0], 7).toString());
            qa.setDataEnvio(tm.getValueAt(Linha[0], 8).toString());
            qa.setAnalista(tm.getValueAt(Linha[0], 9).toString());
            qa.setStatusQA(tm.getValueAt(Linha[0], 10).toString());

        }
        return qa;
    }
    
    private void setCadastro(Qa qa) throws ParseException {
    	jTextField1.setText(qa.getNomeJob());
    	jTextField2.setText(qa.getNomeProjeto());
    	jTextField3.setText(qa.getNomeAmbiente());
    	jFormattedTextField1.setText(qa.getDurExecucao());
    	jComboBox4.setSelectedItem(qa.getStatusExecucao());
    	jComboBox1.setSelectedItem(qa.getAnalista());
    	jComboBox5.setSelectedItem(qa.getStatusQA());
    	jComboBox2.setText(qa.getDataIni());
    	jComboBox3.setText(qa.getDataFim());
    	jComboBox6.setText(qa.getDataEnvio());
    }


    private void limpaCadastro() {
    	jTextField1.setText("");
    	jTextField2.setText("");
    	jTextField3.setText("");
    	jFormattedTextField1.setText("");
    	jComboBox4.setSelectedIndex(0);
    	jComboBox1.setSelectedIndex(0);
    	jComboBox5.setSelectedIndex(0);
    	jComboBox2.setText("");
    	jComboBox3.setText("");
    	jComboBox6.setText("");
        qa = new Qa();
    }

    private Qa getCadastro() {
        Qa qaNew = new Qa();
        qaNew.setIdQa(qa.getIdQa());
        if (!jTextField1.getText().isEmpty()) {
            qaNew.setNomeJob(jTextField1.getText());
        }
        if (!jTextField2.getText().isEmpty()) {
            qaNew.setNomeProjeto(jTextField2.getText());
        }
        if (!jTextField3.getText().isEmpty()) {
            qaNew.setNomeAmbiente(jTextField3.getText());
        }
        if (!jFormattedTextField1.getText().isEmpty()) {
            qaNew.setDurExecucao(jFormattedTextField1.getText());
        }
        if (!jComboBox2.getText().isEmpty()) {
            qaNew.setDataIni(jComboBox2.getText());
        }
        if (!jComboBox3.getText().isEmpty()) {
            qaNew.setDataFim(jComboBox3.getText());
        }

        if ((!jComboBox4.getSelectedItem().toString().isEmpty())) {
            qaNew.setStatusExecucao(jComboBox4.getSelectedItem().toString());
        }
        if (!jComboBox6.getText().isEmpty()) {
            qaNew.setDataEnvio(jComboBox6.getText());
        }
        if (!jComboBox1.getSelectedItem().toString().isEmpty()) {
            qaNew.setAnalista(jComboBox1.getSelectedItem().toString());
        }
        if (!jComboBox5.getSelectedItem().toString().isEmpty()) {
            qaNew.setStatusQA(jComboBox5.getSelectedItem().toString());
        }
        return qaNew;
    }
    
}

