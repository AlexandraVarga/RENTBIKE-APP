package accesBD;

import tabele.Rezervare;
import database.ConnectionClass;
import java.sql.CallableStatement;

public class RezervareBD {
    private ConnectionClass Connection;
    public RezervareBD (ConnectionClass Connection)
    {
        this.Connection=Connection;
    }

    public boolean addRent (Rezervare rezervare)
    {
        CallableStatement stmt;
        try
        {
            stmt=Connection.getConnection().prepareCall("{call CREARE_REZERVARE(?,?,?,?,?,?,?)}");
            stmt.setString(1,rezervare.getUsername());
            stmt.setString(2, rezervare.getModel());
            stmt.setString(3, rezervare.getProducator());
            stmt.setString(4, rezervare.getData());
            stmt.setInt(5, rezervare.getOraInceput());
            stmt.setInt(6, rezervare.getOraFinal());
            stmt.setString(7, rezervare.getNumeLocatie());
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
        RezervareBD ut = new RezervareBD(con);
        Rezervare rezervare = new Rezervare("ale","ATX 27.5","Giant","2022-01-01",9,10,"Rentbike1");
        ut.addRent(rezervare);
    }*/
}
