package accesBD;

import database.ConnectionClass;
import tabele.Utilizator;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ViewClientBicBD {
    private ConnectionClass Connection;
    public ViewClientBicBD (ConnectionClass Connection)
    {
        this.Connection=Connection;
    }
    public String[][] viewClientBic ()
    {
        PreparedStatement stmt;
        try
        {
            stmt=Connection.getConnection().prepareStatement("SELECT * FROM client_bic");
            ResultSet rs = stmt.executeQuery();

            String [][] data = new String[1000][5];
            int i=0;

            while (rs.next())
            {
                Utilizator utilizator = new Utilizator();
                utilizator.setIdCNP(rs.getBigDecimal("CNP_client"));
                utilizator.setNume(rs.getString("nume"));
                utilizator.setPrenume(rs.getString("prenume"));
                utilizator.setOre(rs.getInt("ore"));
                utilizator.setModel(rs.getString("model"));
                //System.out.println(utilizator.viewClient1());

                data[i][0]=String.valueOf(utilizator.getIdCNP());
                data[i][1]=utilizator.getNume();
                data[i][2]=utilizator.getPrenume();
                data[i][3]=String.valueOf(utilizator.getOre());
                data[i][4]=utilizator.getModel();

                i++;
            }
            return data;

        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
        return new String[0][];

    }

    /*public static void main(String[] args) {
        ConnectionClass con = new ConnectionClass("rentbike");
        ViewClientBicBD v = new ViewClientBicBD(con);
        //v.viewClientBic();
        String [][] data = v.viewClientBic();
        int ok=0;
        for(int i=0;i<1000;i++)
        {
            for (int j=0;j<5;j++)
            {
                if(data[i][j]!=null)
                {
                    System.out.print(data[i][j]+" ");
                }
                else {
                    ok=1;
                    break;
                }
            }
            if(ok==1)
                break;
            System.out.print("\n");
        }

    }*/
}
