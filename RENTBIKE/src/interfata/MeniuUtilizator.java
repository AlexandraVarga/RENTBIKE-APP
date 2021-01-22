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

public class MeniuUtilizator {

    ConnectionClass con = new ConnectionClass("rentbike");
    private JFrame frame;

    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MeniuUtilizator window = new MeniuUtilizator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/

    public MeniuUtilizator() {
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
        JLabel tl = new JLabel("CLIENT - RENTBIKE");
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


        ///form pentru disponibilitate bicicleta
        JButton dp = new JButton("Disponibilitate bicicleta");
        dp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                VerificareDisponibilitate verificareDisponibilitate = new VerificareDisponibilitate();

            }
        });
        dp.setFont(new Font("Tahoma", Font.BOLD, 15));
        dp.setBounds(250, 400, 300, 34);
        frame.getContentPane().add(dp);


        ///form pentru adaugare rezervare
        JButton rez = new JButton("Rezervare bicicleta");
        rez.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                AdaugareRezervare adaugareRezervare = new AdaugareRezervare();

            }
        });
        rez.setFont(new Font("Tahoma", Font.BOLD, 15));
        rez.setBounds(250, 350, 300, 34);
        frame.getContentPane().add(rez);

        ///form pentru anulare rezervare
        JButton rezA = new JButton("Anulare rezervare");
        rezA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                AnulareRezervare anulareRezervare = new AnulareRezervare();

            }
        });
        rezA.setFont(new Font("Tahoma", Font.BOLD, 15));
        rezA.setBounds(250, 300, 300, 34);
        frame.getContentPane().add(rezA);

        ///form pentru a vedea oferte
        JButton of = new JButton("Raport oferte biciclete");
        of.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //frame.dispose();
                RaportOferteBiciclete raportOferteBiciclete = new RaportOferteBiciclete();

            }
        });
        of.setFont(new Font("Tahoma", Font.BOLD, 15));
        of.setBounds(250, 250, 300, 34);
        frame.getContentPane().add(of);

    }



}
