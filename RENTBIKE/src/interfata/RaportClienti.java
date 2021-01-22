package interfata;

import accesBD.ViewClientBicBD;
import accesBD.ViewClientiBD;
import accesBD.ViewOferteBD;
import database.ConnectionClass;

import javax.swing.*;
import java.awt.*;

public class RaportClienti {

    ConnectionClass con = new ConnectionClass("rentbike");
    // frame
    private JFrame frame;
    // Table
    private JTable table;

    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RaportClienti window = new RaportClienti();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/
    public RaportClienti() {
        initialize();
    }

    private void initialize()
    {
        // Frame initiallization
        frame = new JFrame();
        frame.setLocationRelativeTo(null);

        // Frame Title
        frame.setTitle("Raport Clienti");

        // Data to be displayed in the JTable

        ViewClientiBD v = new ViewClientiBD(con);
        //v.viewClienti();
        String [][] data = v.viewClienti();

        // Column Names
        String[] columnNames = {"Nume", "Prenume"};

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
