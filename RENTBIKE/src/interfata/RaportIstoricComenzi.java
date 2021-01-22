package interfata;

import accesBD.ViewIstoricComenziBD;
import accesBD.ViewOferteBD;
import database.ConnectionClass;

import javax.swing.*;
import java.awt.*;

public class RaportIstoricComenzi {

    ConnectionClass con = new ConnectionClass("rentbike");
    // frame
    private JFrame frame;
    // Table
    private JTable table;

    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RaportIstoricComenzi window = new RaportIstoricComenzi();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/
    public RaportIstoricComenzi() {
        initialize();
    }

    private void initialize()
    {
        // Frame initiallization
        frame = new JFrame();
        frame.setLocationRelativeTo(null);

        // Frame Title
        frame.setTitle("Raport istoric comenzi");

        // Data to be displayed in the JTable

        ViewIstoricComenziBD v = new ViewIstoricComenziBD(con);
        String [][] data = v.viewIstoricComenzi();

        // Column Names
        String[] columnNames = {"Bicicleta", "Nr. ore inchiriere", "Data","Pret total"};

        // Initializing the JTable
        table = new JTable(data, columnNames);
        table.setBounds(100, 100, 500, 500);


        // adding it to JScrollPane
        JScrollPane jScrollPane = new JScrollPane(table);
        frame.add(jScrollPane);
        // Frame Size
        frame.setSize(847, 600);
        // Frame Visible = true
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
