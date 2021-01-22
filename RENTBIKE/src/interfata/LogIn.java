package interfata;

import accesBD.UtilizatorBD;
import database.ConnectionClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn {

    public static boolean b;
    private JFrame frame;
    private JTextField username_text;
    private JPasswordField password_text;
    private static int id;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LogIn window = new LogIn(b);
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    ConnectionClass con = new ConnectionClass("rentbike");
    public LogIn(Boolean b) {
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

        JLabel login_label = new JLabel("Login");
        login_label.setFont(new Font("Tahoma", Font.BOLD, 18));
        login_label.setBounds(186, 25, 117, 36);
        frame.getContentPane().add(login_label);

        JLabel username_label = new JLabel("Username");
        username_label.setFont(new Font("Tahoma", Font.BOLD , 15));
        username_label.setBounds(50, 96, 87, 26);
        frame.getContentPane().add(username_label);

        JLabel password_label = new JLabel("Password");
        password_label.setFont(new Font("Tahoma", Font.BOLD, 15));
        password_label.setBounds(50, 143, 104, 32);
        frame.getContentPane().add(password_label);

        username_text = new JTextField();
        username_text.setColumns(10);
        username_text.setBounds(163, 99, 140, 24);
        frame.getContentPane().add(username_text);

        password_text = new JPasswordField();
        password_text.setBounds(163, 149, 140, 24);
        frame.getContentPane().add(password_text);

        JButton connsect_button = new JButton("Connect");
        connsect_button.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent arg0) {

                UtilizatorBD user = new UtilizatorBD(con);

                String username = username_text.getText();
                String password = password_text.getText();

                ///verificare logare admin
                if(username.equals("admin") && password.equals("admin"))
                {
                    frame.dispose();
                    MeniuAdmin admin = new MeniuAdmin();
                    //username_text.setText("");
                    //password_text.setText("");

                }
                else {
                    if (username.equals("") || password.equals("") || user.checkLogin(username, password) == false)
                    {
                        JOptionPane.showMessageDialog(null, "Username or Password incorrect...", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        frame.dispose();
                        MeniuUtilizator mn = new MeniuUtilizator();
                        id = user.giveMeID(username, password);
                    }
                }
            }

        });

        connsect_button.setFont(new Font("Tahoma", Font.BOLD, 13));
        connsect_button.setBounds(174, 203, 116, 26);
        frame.getContentPane().add(connsect_button);

        // to AdaugaUtilizator
        JButton contNou = new JButton("Cont nou");
        contNou.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                AdaugaUtilizator ad = new AdaugaUtilizator();

            }
        });

        contNou.setFont(new Font("Tahoma", Font.BOLD, 13));
        contNou.setBounds(174, 237, 116, 26);
        frame.getContentPane().add(contNou);

        //exit
        JButton back = new JButton("Exit");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        back.setFont(new Font("Tahoma", Font.BOLD, 13));
        back.setBounds(174, 270, 116, 26);
        frame.getContentPane().add(back);

        ///schimbare parola
        JButton pr = new JButton("Schimbare parola");
        pr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                SchimbareParola schimbareParola = new SchimbareParola(true);
            }
        });
        pr.setFont(new Font("Tahoma", Font.BOLD, 13));
        pr.setBounds(290, 5, 150, 26);
        frame.getContentPane().add(pr);




    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        LogIn.id = id;
    }
}
