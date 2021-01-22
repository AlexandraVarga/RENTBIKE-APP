package accesBD;

import database.ConnectionClass;
import tabele.Bicicleta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewOferteBD {
    ConnectionClass Connection;
    public ViewOferteBD(ConnectionClass Connection)
    {
        this.Connection= Connection;
    }
    public String[][] viewOferte()
    {
        PreparedStatement stmt;
        try
        {
            stmt=Connection.getConnection().prepareStatement("SELECT * FROM oferte_biciclete");
            ResultSet rs = stmt.executeQuery();

            String [][] data = new String[1000][5];
            int i=0;

            while (rs.next())
            {
                Bicicleta bicicleta = new Bicicleta();
                bicicleta.setModel(rs.getString("model"));
                bicicleta.setPretVechi(rs.getInt("pret_vechi"));
                bicicleta.setPretNou(rs.getInt("pret_nou"));
                bicicleta.setDataInceput(rs.getString("Start_oferta"));
                bicicleta.setDataSfarsit(rs.getString("Sfarsit_oferta"));
                //System.out.println(bicicleta.viewOferte());

                if(!bicicleta.getModel().equals(null)&&!String.valueOf(bicicleta.getPretVechi()).equals(null)&&!String.valueOf(bicicleta.getPretNou()).equals(null)&&!bicicleta.getDataInceput().equals(null)&&!bicicleta.getDataSfarsit().equals(null))
                {
                    data[i][0]=bicicleta.getModel();
                    data[i][1]=String.valueOf(bicicleta.getPretVechi());
                    data[i][2]=String.valueOf(bicicleta.getPretNou());
                    data[i][3]=bicicleta.getDataInceput();
                    data[i][4]=bicicleta.getDataSfarsit();
                    i++;
                }

            }
            //System.out.println(i);
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
        ViewOferteBD v = new ViewOferteBD(con);
        String [][] data = v.viewOferte();

        ///afisare oferte din string
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
