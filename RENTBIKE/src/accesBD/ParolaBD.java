package accesBD;

import database.ConnectionClass;

import tabele.Utilizator;

import java.sql.CallableStatement;

public class ParolaBD {
    private ConnectionClass Connection;
    public ParolaBD(ConnectionClass Connection) {
        this.Connection = Connection;
    }
    public boolean changePass (Utilizator parola)
    {
        try
        {
            CallableStatement stmt;
            stmt=Connection.getConnection().prepareCall("{call SCHIMBARE_PAROLA(?,?,?)}");
            stmt.setString(1,parola.getUsername());
            stmt.setString(2, parola.getParola());
            stmt.setString(3, parola.getParolaNoua());
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
        ParolaBD ut = new ParolaBD(con);
        Utilizator parola = new Utilizator("ale","Nuuu","he he he");
        ut.changePass(parola);
    }*/
}
