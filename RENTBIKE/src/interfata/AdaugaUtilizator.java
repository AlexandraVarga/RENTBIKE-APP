package interfata;

import accesBD.UtilizatorBD;
import database.ConnectionClass;
import tabele.Utilizator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import static javax.swing.SwingConstants.CENTER;

public class AdaugaUtilizator {
    ConnectionClass con = new ConnectionClass("rentbike");

    private JFrame frame;
    private JTextField cnp;
    private JTextField nume;
    private JTextField prenume;
    private JTextField telefon;
    private JTextField email;
    private JTextField username;
    private JTextField parola;
    private JTextField oras;
    private JTextField strada;
    private JTextField numar;
    private JTextField codPostal;
    private JTextField cont;
    private JTextField dataExpirare;
    private JTextField codSiguranta;
    private JTextField tip;

    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdaugaUtilizator window = new AdaugaUtilizator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/

    public AdaugaUtilizator() {
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

        JLabel lblAdaugaUtilizator = new JLabel("Cont Nou ");
        lblAdaugaUtilizator.setFont(new Font("Microsoft New Tai Lue", Font.BOLD , 20));
        lblAdaugaUtilizator.setBounds(330, 11, 197, 34);
        frame.getContentPane().add(lblAdaugaUtilizator);

        ///label text
        JLabel label = new JLabel("CNP ");
        label.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label.setBounds(250, 118, 61, 14);
        frame.getContentPane().add(label);

        JLabel label_1 = new JLabel("Nume ");
        label_1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_1.setBounds(250, 143, 74, 14);
        frame.getContentPane().add(label_1);

        JLabel label_2 = new JLabel("Prenume ");
        label_2.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_2.setBounds(250, 168, 61, 14);
        frame.getContentPane().add(label_2);

        JLabel label_3 = new JLabel("Telefon ");
        label_3.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_3.setBounds(250, 193, 61, 14);
        frame.getContentPane().add(label_3);

        JLabel label_4 = new JLabel("Email ");
        label_4.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_4.setBounds(250, 218, 74, 14);
        frame.getContentPane().add(label_4);

        JLabel lblUsername = new JLabel("Username ");
        lblUsername.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        lblUsername.setBounds(250, 68, 74, 14);
        frame.getContentPane().add(lblUsername);

        JLabel lblNewLabel = new JLabel("Parola ");
        lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        lblNewLabel.setBounds(250, 93, 60, 14);
        frame.getContentPane().add(lblNewLabel);

        JLabel label_5 = new JLabel("Oras ");
        label_5.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_5.setBounds(250, 243, 61, 14);
        frame.getContentPane().add(label_5);

        JLabel label_6 = new JLabel("Strada ");
        label_6.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_6.setBounds(250, 268, 74, 14);
        frame.getContentPane().add(label_6);

        JLabel label_7 = new JLabel("Nr. Strada ");
        label_7.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_7.setBounds(250, 293, 89, 14);
        frame.getContentPane().add(label_7);

        JLabel label_8 = new JLabel("Cod Postal ");
        label_8.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_8.setBounds(250, 318, 108, 14);
        frame.getContentPane().add(label_8);

        JLabel label_9 = new JLabel("Cont Bancar ");
        label_9.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_9.setBounds(250, 343, 108, 14);
        frame.getContentPane().add(label_9);

        JLabel label_10 = new JLabel("Data expirare ");
        label_10.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_10.setBounds(250, 368, 100, 14);
        frame.getContentPane().add(label_10);

        JLabel label_11 = new JLabel("CVV/CVC ");
        label_11.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_11.setBounds(250, 393, 100, 14);
        frame.getContentPane().add(label_11);

        JLabel label_12 = new JLabel("Tip card ");
        label_12.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
        label_12.setBounds(250, 418, 74, 14);
        frame.getContentPane().add(label_12);

        ///text fields
        username = new JTextField();
        username.setBounds(330, 65, 155, 20);
        frame.getContentPane().add(username);
        username.setColumns(10);

        parola = new JTextField();
        parola.setBounds(330, 90, 155, 20);
        frame.getContentPane().add(parola);
        parola.setColumns(10);

        cnp = new JTextField();
        cnp.setBounds(330, 115, 155, 20);
        frame.getContentPane().add(cnp);
        cnp.setColumns(10);

        nume = new JTextField();
        nume.setBounds(330, 140, 155, 20);
        frame.getContentPane().add(nume);
        nume.setColumns(10);

        prenume = new JTextField();
        prenume.setBounds(330, 165, 155, 20);
        frame.getContentPane().add(prenume);
        prenume.setColumns(10);

        telefon = new JTextField();
        telefon.setBounds(330, 190, 155, 20);
        frame.getContentPane().add(telefon);
        telefon.setColumns(10);

        email = new JTextField();
        email.setBounds(330, 215, 155, 20);
        frame.getContentPane().add(email);
        email.setColumns(10);

        oras = new JTextField();
        oras.setBounds(330, 240, 155, 20);
        frame.getContentPane().add(oras);
        oras.setColumns(10);

        strada = new JTextField();
        strada.setBounds(330, 265, 155, 20);
        frame.getContentPane().add(strada);
        strada.setColumns(10);

        numar = new JTextField();
        numar.setBounds(330, 290, 155, 20);
        frame.getContentPane().add(numar);
        numar.setColumns(10);

        codPostal = new JTextField();
        codPostal.setBounds(330, 315, 155, 20);
        frame.getContentPane().add(codPostal);
        codPostal.setColumns(10);

        cont = new JTextField();
        cont.setBounds(330, 340, 155, 20);
        frame.getContentPane().add(cont);
        cont.setColumns(10);

        dataExpirare = new JTextField();
        dataExpirare.setBounds(330, 365, 155, 20);
        frame.getContentPane().add(dataExpirare);
        dataExpirare.setColumns(10);

        codSiguranta = new JTextField();
        codSiguranta.setBounds(330, 390, 155, 20);
        frame.getContentPane().add(codSiguranta);
        codSiguranta.setColumns(10);

        tip = new JTextField();
        tip.setBounds(330, 415, 155, 20);
        frame.getContentPane().add(tip);
        tip.setColumns(10);


        ///buton inregistrare client nou
        JButton inregistreaza = new JButton("Inregistreaza!");

        inregistreaza.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UtilizatorBD uti = new UtilizatorBD(con);
                if(username.getText().equals("") || parola.getText().equals("")||nume.getText().equals("")||prenume.getText().equals("")||cnp.getText().equals("")||telefon.getText().equals("")||email.getText().equals("")||oras.getText().equals("")||strada.getText().equals("")||numar.getText().equals("")||codPostal.getText().equals("")||cont.getText().equals("")||dataExpirare.getText().equals("")||codSiguranta.getText().equals("")||tip.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Nu ati introdus date!!", "                                       ERROR", JOptionPane.ERROR_MESSAGE);
                    else
                    {
                        //frame.dispose();
                        BigDecimal cnpB = new BigDecimal(cnp.getText());
                        BigDecimal contB = new BigDecimal(cont.getText());
                        Utilizator utilizatorNou = new Utilizator(cnpB, nume.getText(), prenume.getText(), Integer.valueOf(telefon.getText()), email.getText(), username.getText(), parola.getText(), oras.getText(), strada.getText(), Integer.valueOf(numar.getText()), Integer.valueOf(codPostal.getText()), contB, dataExpirare.getText(), Integer.valueOf(codSiguranta.getText()), tip.getText());
                        uti.addUtilizator(utilizatorNou);
                        JOptionPane.showMessageDialog(null, "Contul nou a fost creat cu succes!");
                        cnp.setText("");
                        nume.setText("");
                        prenume.setText("");
                        telefon.setText("");
                        email.setText("");
                        username.setText("");
                        parola.setText("");
                        oras.setText("");
                        strada.setText("");
                        numar.setText("");
                        codPostal.setText("");
                        cont.setText("");
                        dataExpirare.setText("");
                        codSiguranta.setText("");
                        tip.setText("");

                    }

            }
        });

        inregistreaza.setFont(new Font("Tahoma", Font.BOLD, 15));
        inregistreaza.setBounds(250, 450, 146, 34);
        frame.getContentPane().add(inregistreaza);

        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                LogIn li = new LogIn(true);

            }
        });
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.setBounds(400, 450, 146, 34);
        frame.getContentPane().add(back);

    }



}
