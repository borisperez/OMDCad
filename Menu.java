package omdcad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Menu extends JFrame {

    public static JDesktopPane desktopPane;
    private Cadastro cadastro;

    public Menu() {
        super("Cadastro OMD");

        JMenu ArquivoMenu = new JMenu("Arquivo"); 
        ArquivoMenu.setMnemonic('A'); 

        JMenuItem sairItem = new JMenuItem("Sair"); 
        sairItem.setMnemonic('S');

        ArquivoMenu.add(sairItem); 
        sairItem.addActionListener(
                new ActionListener() 
                {

                    @Override
                    public void actionPerformed(ActionEvent event) {
                        System.exit(0); 
                    } 
                } 
                ); 

        JMenu AcoesMenu = new JMenu("Cadastro");
        AcoesMenu.setMnemonic('A');

        JMenuItem Cadastro_QA = new JMenuItem("Cadastro QA");
        Cadastro_QA.setMnemonic('C'); 

        AcoesMenu.add(Cadastro_QA); 
        Cadastro_QA.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        try {
                            if (cadastro == null) {
                                Qa qa = new Qa();
                                cadastro = new Cadastro(qa);
                            }
                            cadastro.setSize(1335, 739);
                            cadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            cadastro.setVisible(true);
                            cadastro.setMaximizable(true);
                            cadastro.setClosable(true);
                            desktopPane = new JDesktopPane();
                            desktopPane.add(cadastro);
                            setContentPane(desktopPane);
                        } catch (ParseException e) {
                            JOptionPane.showMessageDialog(Menu.this, "Erro Cadastro", "Erro Cadastro", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                } 
                );
        

        JMenuItem Cadastro_CH = new JMenuItem("Cadastro Chamado");
        Cadastro_CH.setMnemonic('D'); 
                AcoesMenu.add(Cadastro_CH);
                 Cadastro_CH.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        try {
                            if (cadastro == null) {
                                Qa qa = new Qa();
                                cadastro = new Cadastro(qa);
                            }
                            cadastro.setSize(1335, 739);
                            cadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            cadastro.setVisible(true);
                            cadastro.setMaximizable(true);
                            cadastro.setClosable(true);
                            desktopPane = new JDesktopPane();
                            desktopPane.add(cadastro);
                            setContentPane(desktopPane);
                        } catch (ParseException e) {
                            JOptionPane.showMessageDialog(Menu.this, "Erro Cadastro", "Erro Cadastro", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                } 
                );

        JMenuBar barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        barraMenu.add(ArquivoMenu);
        barraMenu.add(AcoesMenu);
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  
             Menu menu = new Menu(); 
             menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             menu.setSize(1350, 797); 
             menu.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}


