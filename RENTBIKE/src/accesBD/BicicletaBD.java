package accesBD;

import database.ConnectionClass;
import tabele.Bicicleta;
import java.sql.CallableStatement;

public class BicicletaBD {
    private ConnectionClass Connection;
    public BicicletaBD(ConnectionClass Connection) {
        this.Connection = Connection;
    }
    public boolean addBicicleta(Bicicleta bicicleta) {

        CallableStatement stmt;
        try
        {
            stmt=Connection.getConnection().prepareCall("{call ADAUGARE_BICICLETA(?,?,?,?,?,?,?,?)}");
            stmt.setString(1,bicicleta.getProducator());
            stmt.setString(2, bicicleta.getModel());
            stmt.setInt(3,bicicleta.getTarif());
            stmt.setString(4,bicicleta.getCuloare());
            stmt.setInt(5,bicicleta.getNrViteze());
            stmt.setString(6,bicicleta.getTipFrana());
            stmt.setInt(7,bicicleta.getDiamatruRoata());
            stmt.setString(8,bicicleta.getTip());
            stmt.execute();
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /*public static void main(String[] args) {

        ConnectionClass con = new ConnectionClass("rentbike");
        BicicletaBD ut = new BicicletaBD(con);
        Bicicleta bicicleta = new Bicicleta("Velo BMX","BVelo",120,"mov",7,"pe disc",16,"city bike");
        ut.addBicicleta(bicicleta);
    }*/
}
