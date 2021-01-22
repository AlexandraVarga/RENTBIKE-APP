package interfata;

import accesBD.ViewClientBicBD;
import accesBD.ViewOferteBD;
import database.ConnectionClass;

import javax.swing.*;
import java.awt.*;

public class RaportClientiBC {

    ConnectionClass con = new ConnectionClass("rentbike");
    // frame
    private JFrame frame;
    // Table
    private JTable table;

    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RaportClientiBC window = new RaportClientiBC();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/
    public RaportClientiBC() {
        initialize();
    }

    private void initialize()
    {
        // Frame initiallization
        frame = new JFrame();
        frame.setLocationRelativeTo(null);

        // Frame Title
        frame.setTitle("Raport inchirieri biciclete");

        // Data to be displayed in the JTable

        ViewClientBicBD v = new ViewClientBicBD(con);
        String [][] data = v.viewClientBic();

        // Column Names
        String[] columnNames = {"CNP", "Nume", "Prenume","Numar ore","Model"};

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
