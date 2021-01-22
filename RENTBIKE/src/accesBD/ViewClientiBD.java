package accesBD;

import database.ConnectionClass;
import tabele.Utilizator;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewClientiBD {
    private ConnectionClass Connection;
    public ViewClientiBD (ConnectionClass Connection)
    {
        this.Connection = Connection;
    }
    public String [][] viewClienti ()
    {
        PreparedStatement stmt;
        try
        {
            stmt=Connection.getConnection().prepareStatement("SELECT * FROM lista_clienti");
            ResultSet rs = stmt.executeQuery();
            int i=0;
            String [][] data = new String[1000][2];
            while(rs.next())
            {
                Utilizator utilizator = new Utilizator();
                utilizator.setNume(rs.getString("nume"));
                utilizator.setPrenume(rs.getString("prenume"));
                //System.out.println(utilizator.viewClienti());
                data[i][0]=utilizator.getNume();
                data[i][1]=utilizator.getPrenume();
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
        ViewClientiBD v = new ViewClientiBD(con);
        //v.viewClienti();
        String [][] data = v.viewClienti();
        int ok=0;
        for(int i=0;i<1000;i++)
        {
            for (int j=0;j<2;j++)
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
