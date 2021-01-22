package accesBD;
import database.ConnectionClass;
import tabele.Rezervare;
import java.sql.CallableStatement;
import java.sql.Types;

public class DisponibilitateBicicletaBD {
    private ConnectionClass Connection;
    public DisponibilitateBicicletaBD(ConnectionClass Connection) {
        this.Connection = Connection;
    }
    public int verifBicicleta(Rezervare bicicleta) {
        int ok = 0;//verificare parametru iesire
        CallableStatement stmt;
        try
        {
            stmt=Connection.getConnection().prepareCall("{call DISPONIBILITATE_BICICLETA(?,?,?,?,?)}");
            stmt.setString(1,bicicleta.getModel());
            stmt.setString(2, bicicleta.getData());
            stmt.setInt(3,bicicleta.getOraInceput());
            stmt.setInt(4,bicicleta.getOraFinal());
            stmt.registerOutParameter(5, Types.INTEGER);//output parameter
            stmt.executeUpdate();
            ok = stmt.getInt(5); //valoare parametru iesire

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ok;
    }

    /*public static void main(String[] args) {
        ConnectionClass con = new ConnectionClass("rentbike");
        DisponibilitateBicicletaBD ut = new DisponibilitateBicicletaBD(con);
        Rezervare bicicleta= new Rezervare("ATX 27.5", "2021-03-30", 8, 10);

        //verificare disponibilitate in functie de parametru iesire
        if(ut.verifBicicleta(bicicleta) == -1)
            System.out.println("Bicicleta indisponibila!");
        else
            if (ut.verifBicicleta(bicicleta) == 1)
                System.out.println("Bicicleta disponibila!");

    }*/

}
