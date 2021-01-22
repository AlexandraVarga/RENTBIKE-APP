package accesBD;
import java.math.BigDecimal;

import database.ConnectionClass;
import tabele.Utilizator;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UtilizatorBD {

    private ConnectionClass Connection;
    public UtilizatorBD(ConnectionClass Connection) {
        this.Connection = Connection;
    }

    public boolean addUtilizator(Utilizator utilizator) {

        CallableStatement stmt;
        try
        {
            stmt=Connection.getConnection().prepareCall("{call ADUGARE_CLIENT_NOU(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            stmt.setBigDecimal(1,utilizator.getIdCNP());
            stmt.setString(2,utilizator.getNume());
            stmt.setString(3,utilizator.getPrenume());
            stmt.setInt(4,utilizator.getTelefon());
            stmt.setString(5,utilizator.getEmail());
            stmt.setString(6,utilizator.getUsername());
            stmt.setString(7,utilizator.getParola());
            stmt.setString(8,utilizator.getOras());
            stmt.setString(9,utilizator.getStrada());
            stmt.setInt(10,utilizator.getNumar());
            stmt.setInt(11,utilizator.getCodPostal());
            stmt.setBigDecimal(12,utilizator.getCont());
            stmt.setString(13,utilizator.getDataExpirare());
            stmt.setInt(14,utilizator.getCodSiguranta());
            stmt.setString(15,utilizator.getTip());

            stmt.execute();
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public int giveMeID(String username, String password) {

        PreparedStatement statement;

        try {
            statement = Connection.getConnection().prepareStatement(
                    "SELECT idDate_logare FROM date_logare WHERE Username = ? AND Parola = ?"
            );

            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet rs = statement.executeQuery();

            while(rs.next()) {

                Utilizator uti = new Utilizator();
                uti.setIdDateLogare(rs.getInt("idDate_logare"));
                return uti.getIdDateLogare();
            }

        }
        catch(Exception e) {
            e.printStackTrace();
            return -1;
        }

        return -1;
    }

    public boolean checkLogin(String username, String password) {

        boolean login = false;

        PreparedStatement statement;

        try {
            statement = Connection.getConnection().prepareStatement(
                    "SELECT idDate_logare FROM date_logare WHERE Username = ? AND Parola = ?"
            );

            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet rs = statement.executeQuery();

            if(rs.next()) {
                login = true;
            }
            else {
                login = false;
            }

        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return login;
    }


    /*public static void main(String[] args) {

        ConnectionClass con = new ConnectionClass("rentbike");
        UtilizatorBD ut = new UtilizatorBD(con);
        Utilizator utilizator = new Utilizator(new BigDecimal("1234567891111"),"Vintan","Amalia",721257282,"amalia@yahoo.com","amalia","123","Brasov","Bacovia",13,335,new BigDecimal("999999999"),"2027-02-02",1,"MasterCard");
        ut.addUtilizator(utilizator);

    }*/

}
