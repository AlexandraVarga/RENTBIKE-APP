package interfata;

import accesBD.BicicletaBD;
import accesBD.UtilizatorBD;
import database.ConnectionClass;
import tabele.Bicicleta;
import tabele.Utilizator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import static javax.swing.SwingConstants.CENTER;

public class AdaugaBicicleta {
    ConnectionClass con = new ConnectionClass("rentbike");

    private JFrame frame;
    private JTextField producator;
    private JTextField model;
    private JTextField tarif;
    private JTextField culoare;
    private JTextField nrViteze;
    private JTextField tipFrana;
    private JTextField diametruRoata;
    private JTextField tip;

    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdaugaBicicleta window = new AdaugaBicicleta();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/

    public AdaugaBicicleta() {
        initialize();
    }
    private void initialize ()
    {
        frame = new JFrame();
        frame.setUndecorated(true);
        frame.setBounds(100, 100, 800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);

        JLabel lblAdaugaUtilizator = new JLabel("Adaugare Bicicleta ");
        lblAdaugaUtilizator.setFont(new Font("Microsoft New Tai Lue", Font.BOLD , 20));
        lblAdaugaUtilizator.setBounds(330, 30, 197, 34);
        frame.getContentPane().add(lblAdaugaUtilizator);

        ///label text
        JLabel label = new JLabel("Producator ");
        label.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label.setBounds(250, 118, 80, 14);
        frame.getContentPane().add(label);

        JLabel label_1 = new JLabel("Model ");
        label_1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_1.setBounds(250, 143, 74, 14);
        frame.getContentPane().add(label_1);

        JLabel label_2 = new JLabel("Tarif ");
        label_2.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_2.setBounds(250, 168, 61, 14);
        frame.getContentPane().add(label_2);

        JLabel label_3 = new JLabel("Culoare ");
        label_3.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_3.setBounds(250, 193, 61, 14);
        frame.getContentPane().add(label_3);

        JLabel label_4 = new JLabel("Numar viteze ");
        label_4.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_4.setBounds(250, 218, 100, 14);
        frame.getContentPane().add(label_4);

        JLabel label_5 = new JLabel("Tip frana ");
        label_5.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_5.setBounds(250, 243, 61, 14);
        frame.getContentPane().add(label_5);

        JLabel label_6 = new JLabel("Diametru roata ");
        label_6.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_6.setBounds(250, 268, 90, 14);
        frame.getContentPane().add(label_6);

        JLabel label_7 = new JLabel("Tip ");
        label_7.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_7.setBounds(250, 293, 89, 14);
        frame.getContentPane().add(label_7);


        ///text fields
        producator = new JTextField();
        producator.setBounds(350, 115, 155, 20);
        frame.getContentPane().add(producator);
        producator.setColumns(10);

        model = new JTextField();
        model.setBounds(350, 140, 155, 20);
        frame.getContentPane().add(model);
        model.setColumns(10);

        tarif = new JTextField();
        tarif.setBounds(350, 165, 155, 20);
        frame.getContentPane().add(tarif);
        tarif.setColumns(10);

        culoare = new JTextField();
        culoare.setBounds(350, 190, 155, 20);
        frame.getContentPane().add(culoare);
        culoare.setColumns(10);

        nrViteze = new JTextField();
        nrViteze.setBounds(350, 215, 155, 20);
        frame.getContentPane().add(nrViteze);
        nrViteze.setColumns(10);

        tipFrana = new JTextField();
        tipFrana.setBounds(350, 240, 155, 20);
        frame.getContentPane().add(tipFrana);
        tipFrana.setColumns(10);

        diametruRoata = new JTextField();
        diametruRoata.setBounds(350, 265, 155, 20);
        frame.getContentPane().add(diametruRoata);
        diametruRoata.setColumns(10);

        tip = new JTextField();
        tip.setBounds(350, 290, 155, 20);
        frame.getContentPane().add(tip);
        tip.setColumns(10);

        ///buton inregistrare bicicleta noua
        JButton inregistreaza = new JButton("Inregistreaza!");

        inregistreaza.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BicicletaBD uti = new BicicletaBD(con);
                if(producator.getText().equals("") || model.getText().equals("")||tip.getText().equals("")||culoare.getText().equals("")||tipFrana.getText().equals("")||diametruRoata.getText().equals("")||tarif.getText().equals("")||nrViteze.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Nu ati introdus date!!", "                                       ERROR", JOptionPane.ERROR_MESSAGE);
                else
                {
                    Bicicleta bc = new Bicicleta(producator.getText(),model.getText(),Integer.valueOf(tarif.getText()),culoare.getText(),Integer.valueOf(nrViteze.getText()),tipFrana.getText(),Integer.valueOf(diametruRoata.getText()),tip.getText());
                    uti.addBicicleta(bc);
                    JOptionPane.showMessageDialog(null, "Bicicleta adaugata cu succes!");
                    producator.setText("");
                    model.setText("");
                    tarif.setText("");
                    culoare.setText("");
                    nrViteze.setText("");
                    tipFrana.setText("");
                    diametruRoata.setText("");
                    tip.setText("");
                }

            }
        });

        inregistreaza.setFont(new Font("Tahoma", Font.BOLD, 15));
        inregistreaza.setBounds(250, 350, 146, 34);
        frame.getContentPane().add(inregistreaza);

        ///back to menu
        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                MeniuAdmin meniuAdmin = new MeniuAdmin();

            }
        });
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.setBounds(400, 350, 146, 34);
        frame.getContentPane().add(back);

    }



}
