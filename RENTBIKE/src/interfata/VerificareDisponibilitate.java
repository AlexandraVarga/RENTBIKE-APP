package interfata;

import accesBD.AnulareRezervareBD;
import accesBD.BicicletaBD;
import accesBD.DisponibilitateBicicletaBD;
import accesBD.RezervareBD;
import database.ConnectionClass;
import tabele.Bicicleta;
import tabele.Rezervare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerificareDisponibilitate {
    ConnectionClass con = new ConnectionClass("rentbike");

    private JFrame frame;
    private JTextField model;
    private JTextField data;
    private JTextField oraInceput;
    private JTextField oraSfarsit;


    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VerificareDisponibilitate window = new VerificareDisponibilitate();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/

    public VerificareDisponibilitate() {
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

        JLabel lblAdaugaUtilizator = new JLabel("Verificare disponibilitate ");
        lblAdaugaUtilizator.setFont(new Font("Microsoft New Tai Lue", Font.BOLD , 20));
        lblAdaugaUtilizator.setBounds(300, 30, 250, 34);
        frame.getContentPane().add(lblAdaugaUtilizator);

        ///label text
        JLabel label = new JLabel("Model ");
        label.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label.setBounds(250, 143, 80, 14);
        frame.getContentPane().add(label);

        JLabel label_1 = new JLabel("Data ");
        label_1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_1.setBounds(250, 168, 74, 14);
        frame.getContentPane().add(label_1);

        JLabel label_2 = new JLabel("Ora initiala ");
        label_2.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_2.setBounds(250, 193, 80, 14);
        frame.getContentPane().add(label_2);

        JLabel label_3 = new JLabel("Ora finala ");
        label_3.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_3.setBounds(250, 218, 61, 14);
        frame.getContentPane().add(label_3);

        ///text fields
        model = new JTextField();
        model.setBounds(350, 140, 155, 20);
        frame.getContentPane().add(model);
        model.setColumns(10);

        data = new JTextField();
        data.setBounds(350, 165, 155, 20);
        frame.getContentPane().add(data);
        data.setColumns(10);

        oraInceput = new JTextField();
        oraInceput.setBounds(350, 190, 155, 20);
        frame.getContentPane().add(oraInceput);
        oraInceput.setColumns(10);

        oraSfarsit = new JTextField();
        oraSfarsit.setBounds(350, 215, 155, 20);
        frame.getContentPane().add(oraSfarsit);
        oraSfarsit.setColumns(10);


        ///buton verificare disponibilitate
        JButton inregistreaza = new JButton("Verifica!");

        inregistreaza.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DisponibilitateBicicletaBD ut = new DisponibilitateBicicletaBD(con);
                if(model.getText().equals("") || data.getText().equals("")||oraInceput.getText().equals("")||oraSfarsit.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Nu ati introdus date!!", "                                       ERROR", JOptionPane.ERROR_MESSAGE);
                else
                {
                    Rezervare bc = new Rezervare(model.getText(),data.getText(),Integer.valueOf(oraInceput.getText()),Integer.valueOf(oraSfarsit.getText()));
                    if(ut.verifBicicleta(bc) == -1)
                        JOptionPane.showMessageDialog(null, "Bicicleta indisponibila!");
                    else
                    if (ut.verifBicicleta(bc) == 1)
                        JOptionPane.showMessageDialog(null, "Bicicleta disponibila!");

                    model.setText("");
                    data.setText("");
                    oraInceput.setText("");
                    oraSfarsit.setText("");
                }

            }
        });

        inregistreaza.setFont(new Font("Tahoma", Font.BOLD, 15));
        inregistreaza.setBounds(250, 330, 146, 34);
        frame.getContentPane().add(inregistreaza);

        ///back to menu
        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                MeniuUtilizator meniuUtilizator = new MeniuUtilizator();

            }
        });
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.setBounds(400, 330, 146, 34);
        frame.getContentPane().add(back);

    }



}
