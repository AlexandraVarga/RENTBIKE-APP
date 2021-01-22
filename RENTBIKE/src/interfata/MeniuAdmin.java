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

public class MeniuAdmin {
    ConnectionClass con = new ConnectionClass("rentbike");

    private JFrame frame;

    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MeniuAdmin window = new MeniuAdmin();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/

    public MeniuAdmin() {
        initialize();
    }
    private void initialize ()
    {
        ///setari fereastra de meniu utilizator
        frame = new JFrame();
        frame.setUndecorated(true);
        frame.setBounds(100, 100, 847, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);

        ///titlu
        JLabel tl = new JLabel("ADMIN - RENTBIKE");
        tl.setFont(new Font("Microsoft New Tai Lue", Font.BOLD | Font.ITALIC, 20));
        tl.setBounds(300, 150, 500, 34);
        frame.getContentPane().add(tl);

        ///delogare din meniu magazin rezervari
        JButton back = new JButton("Log out");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                LogIn li = new LogIn(true);

            }
        });
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.setBounds(250, 450, 300, 34);
        frame.getContentPane().add(back);


        ///form pentru biciclete inchiriate
        JButton dp = new JButton("Raport biciclete inchiriate");
        dp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //frame.dispose();
                RaportClientiBC raportClientiBC = new RaportClientiBC();

            }
        });
        dp.setFont(new Font("Tahoma", Font.BOLD, 15));
        dp.setBounds(250, 400, 300, 34);
        frame.getContentPane().add(dp);


        ///form pentru istoric comenzi
        JButton rez = new JButton("Raport istoric comenzi");
        rez.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //frame.dispose();
                RaportIstoricComenzi raportIstoricComenzi = new RaportIstoricComenzi();

            }
        });
        rez.setFont(new Font("Tahoma", Font.BOLD, 15));
        rez.setBounds(250, 350, 300, 34);
        frame.getContentPane().add(rez);

        ///form pentru clienti magazin online
        JButton rezA = new JButton("Raport clienti magazin");
        rezA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //frame.dispose();
                RaportClienti raportClienti = new RaportClienti();

            }
        });
        rezA.setFont(new Font("Tahoma", Font.BOLD, 15));
        rezA.setBounds(250, 300, 300, 34);
        frame.getContentPane().add(rezA);

        ///form pentru a adauga biciclete
        JButton of = new JButton("Adaugare bicicleta");
        of.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                AdaugaBicicleta adaugaBicicleta = new AdaugaBicicleta();
            }
        });
        of.setFont(new Font("Tahoma", Font.BOLD, 15));
        of.setBounds(250, 250, 300, 34);
        frame.getContentPane().add(of);

    }



}
