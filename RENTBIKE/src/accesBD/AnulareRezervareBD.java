package accesBD;

import tabele.Rezervare;
import database.ConnectionClass;
import java.sql.CallableStatement;

public class AnulareRezervareBD {
    private ConnectionClass Connection;
    public AnulareRezervareBD (ConnectionClass Connection)
    {
        this.Connection= Connection;
    }
    public boolean deleteRent (Rezervare rezervare)
    {
        CallableStatement stmt;
        try
        {
            stmt=Connection.getConnection().prepareCall("{call ANULARE_REZERVARE(?,?,?,?,?,?)}");
            stmt.setString(1,rezervare.getUsername());
            stmt.setString(2, rezervare.getModel());
            stmt.setString(3, rezervare.getProducator());
            stmt.setString(4, rezervare.getData());
            stmt.setInt(5, rezervare.getOraInceput());
            stmt.setInt(6, rezervare.getOraFinal());
            stmt.execute();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /*public static void main(String[] args) {
        ConnectionClass con = new ConnectionClass("rentbike");
        AnulareRezervareBD ut = new AnulareRezervareBD(con);
        Rezervare rezervare = new Rezervare("ale","ATX 27.5","Giant","2022-01-01",9,10);
        ut.deleteRent(rezervare);

    }*/
}
