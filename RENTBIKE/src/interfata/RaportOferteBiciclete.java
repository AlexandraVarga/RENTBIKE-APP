package interfata;

import accesBD.ViewOferteBD;
import database.ConnectionClass;

import javax.swing.*;
import java.awt.*;

public class RaportOferteBiciclete {

    ConnectionClass con = new ConnectionClass("rentbike");
    // frame
    private JFrame frame;
    // Table
    private JTable table;

    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RaportOferteBiciclete window = new RaportOferteBiciclete();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/
    public RaportOferteBiciclete() {
        initialize();
    }

    private void initialize()
    {
        // Frame initiallization
        frame = new JFrame();
        frame.setLocationRelativeTo(null);

        // Frame Title
        frame.setTitle("Raport oferte biciclete");

        // Data to be displayed in the JTable

        ViewOferteBD v = new ViewOferteBD(con);
        String [][] data = v.viewOferte();

        // Column Names
        String[] columnNames = {"Model", "Pret Nou", "Pret Vechi","Data inceput","Data sfarsit"};

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
