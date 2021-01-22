package accesBD;
import tabele.Bicicleta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.ConnectionClass;
import tabele.Utilizator;

public class ViewIstoricComenziBD {
    ConnectionClass Connection;
    public ViewIstoricComenziBD(ConnectionClass Connection)
    {
        this.Connection= Connection;
    }
    public String [][] viewIstoricComenzi()
    {
        PreparedStatement stmt;
        try
        {
            stmt=Connection.getConnection().prepareStatement("SELECT * FROM istoric_comenzi");
            ResultSet rs = stmt.executeQuery();
            int i=0;
            String [][] data = new String[1000][4];
            while (rs.next())
            {
                Bicicleta bicicleta = new Bicicleta();
                bicicleta.setNumeBicicleta(rs.getString("Bicicleta"));
                bicicleta.setNrOre(rs.getInt("nr_ore"));
                bicicleta.setData(rs.getString("data"));
                bicicleta.setPretTotal(rs.getInt("pret_total"));

                data[i][0]=bicicleta.getNumeBicicleta();
                data[i][1]=String.valueOf(bicicleta.getNrOre());
                data[i][2]=bicicleta.getData();
                data[i][3]=String.valueOf(bicicleta.getPretTotal());

                i++;
                //System.out.println(bicicleta.viewIstoricComenzi());
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
        ViewIstoricComenziBD v = new ViewIstoricComenziBD(con);
        String [][] data = v.viewIstoricComenzi();

        ///afisare oferte din string
        int ok=0;
        for(int i=0;i<1000;i++)
        {
            for (int j=0;j<4;j++)
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
