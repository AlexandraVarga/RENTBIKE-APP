package interfata;

import accesBD.ParolaBD;
import accesBD.UtilizatorBD;
import database.ConnectionClass;
import tabele.Utilizator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchimbareParola {

    public static boolean b;
    private JFrame frame;
    private JTextField username_text;
    private JPasswordField o_password_text;
    private JPasswordField n_password_text;

    private static int id;

    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SchimbareParola window = new SchimbareParola(b);
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/
    ConnectionClass con = new ConnectionClass("rentbike");
    public SchimbareParola(Boolean b) {
        initialize();
        frame.setVisible(b);
    }
    private void initialize ()
    {
        frame = new JFrame();
        frame.setUndecorated(true);
        frame.setBounds(100, 100, 450, 320);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        //frame.setVisible(true);

        JLabel login_label = new JLabel("Schimbare Parola");
        login_label.setFont(new Font("Tahoma", Font.BOLD, 18));
        login_label.setBounds(150, 25, 200, 36);
        frame.getContentPane().add(login_label);

        JLabel username_label = new JLabel("User");
        username_label.setFont(new Font("Tahoma", Font.BOLD , 15));
        username_label.setBounds(50, 96, 87, 26);
        frame.getContentPane().add(username_label);

        JLabel o_password_label = new JLabel("Parola veche");
        o_password_label.setFont(new Font("Tahoma", Font.BOLD, 15));
        o_password_label.setBounds(50, 143, 104, 32);
        frame.getContentPane().add(o_password_label);

        JLabel n_password_label = new JLabel("Parola noua");
        n_password_label.setFont(new Font("Tahoma", Font.BOLD, 15));
        n_password_label.setBounds(50, 190, 104, 32);
        frame.getContentPane().add(n_password_label);

        ///text fields
        username_text = new JTextField();
        username_text.setColumns(10);
        username_text.setBounds(163, 99, 140, 24);
        frame.getContentPane().add(username_text);

        o_password_text = new JPasswordField();
        o_password_text.setBounds(163, 149, 140, 24);
        frame.getContentPane().add(o_password_text);

        n_password_text = new JPasswordField();
        n_password_text.setBounds(163, 199, 140, 24);
        frame.getContentPane().add(n_password_text);

        JButton connsect_button = new JButton("Schimbare");
        connsect_button.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent arg0) {

                ParolaBD ut = new ParolaBD(con);
                UtilizatorBD user = new UtilizatorBD(con);

                String username = username_text.getText();
                String password1 = o_password_text.getText();
                String password2 = n_password_text.getText();

                if (username.equals("") || password1.equals("") || password2.equals("") || user.checkLogin(username, password1) == false)
                {
                        JOptionPane.showMessageDialog(null, "Username or Password incorrect...", "Error", JOptionPane.ERROR_MESSAGE);
                } else
                    {
                        Utilizator parola = new Utilizator(username,password1,password2);
                        ut.changePass(parola);
                        id = user.giveMeID(username, password1);
                        JOptionPane.showMessageDialog(null,"Parola a fost schimbata cu succes!");
                        username_text.setText("");
                        o_password_text.setText("");
                        n_password_text.setText("");
                    }
                }

        });

        connsect_button.setFont(new Font("Tahoma", Font.BOLD, 13));
        connsect_button.setBounds(174, 240, 116, 26);
        frame.getContentPane().add(connsect_button);

        // to Log In
        JButton contNou = new JButton("Back");
        contNou.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                LogIn logIn = new LogIn(true);

            }
        });

        contNou.setFont(new Font("Tahoma", Font.BOLD, 13));
        contNou.setBounds(174, 280, 116, 26);
        frame.getContentPane().add(contNou);


    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        //LogIn.id = id;
    }
}
