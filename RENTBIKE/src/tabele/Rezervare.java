package tabele;

public class Rezervare {
    private String username;
    private String model;
    private String producator;
    private String data;
    private int oraInceput;
    private int oraFinal;
    private String numeLocatie;

    ///creeare rezervare
    public Rezervare(String username, String model, String producator, String data, int oraInceput, int oraFinal, String numeLocatie) {
        this.username = username;
        this.model = model;
        this.producator = producator;
        this.data = data;
        this.oraInceput = oraInceput;
        this.oraFinal = oraFinal;
        this.numeLocatie = numeLocatie;
    }

    ///anulare rezervare
    public Rezervare(String username, String model, String producator, String data, int oraInceput, int oraFinal) {
        this.username = username;
        this.model = model;
        this.producator = producator;
        this.data = data;
        this.oraInceput = oraInceput;
        this.oraFinal = oraFinal;
    }

    ///disponibilitate rezervare bicicleta
    public Rezervare(String model, String data, int oraInceput, int oraFinal)
    {
        this.model = model;
        this.data = data;
        this.oraInceput = oraInceput;
        this.oraFinal = oraFinal;
    }


    public String getUsername() {
        return username;
    }

    public String getModel() {
        return model;
    }

    public String getProducator() {
        return producator;
    }

    public String getData() {
        return data;
    }

    public int getOraInceput() {
        return oraInceput;
    }

    public int getOraFinal() {
        return oraFinal;
    }

    public String getNumeLocatie() {
        return numeLocatie;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOraInceput(int oraInceput) {
        this.oraInceput = oraInceput;
    }

    public void setOraFinal(int oraFinal) {
        this.oraFinal = oraFinal;
    }

    public void setNumeLocatie(String numeLocatie) {
        this.numeLocatie = numeLocatie;
    }


    @Override
    public String toString() {
        return "Rezervare{" +
                "username='" + username + '\'' +
                ", model='" + model + '\'' +
                ", producator='" + producator + '\'' +
                ", data='" + data + '\'' +
                ", oraInceput=" + oraInceput +
                ", oraFinal=" + oraFinal +
                ", numeLocatie='" + numeLocatie + '\'' +
                '}';
    }
}
