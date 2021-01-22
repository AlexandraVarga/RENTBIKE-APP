package tabele;
public class Bicicleta {

    private String producator;
    private String model;
    private String numeBicicleta;
    private int tarif;
    private String culoare;
    private int nrViteze;
    private String tipFrana;
    private int diamatruRoata;
    private String tip;
    private int nrOre;
    private String data;
    private int pretTotal;
    private int pretNou;
    private int pretVechi;
    private String dataInceput;
    private String dataSfarsit;

    public Bicicleta ()
    {
        super();
    }

    ///adaugare bicicleta
    public Bicicleta(String producator, String model, int tarif, String culoare, int nrViteze, String tipFrana, int diamatruRoata, String tip) {
        this.producator = producator;
        this.model = model;
        this.tarif = tarif;
        this.culoare = culoare;
        this.nrViteze = nrViteze;
        this.tipFrana = tipFrana;
        this.diamatruRoata = diamatruRoata;
        this.tip = tip;
    }

    public String getProducator() {
        return producator;
    }

    public String getModel() {
        return model;
    }

    public int getTarif() {
        return tarif;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getNrViteze() {
        return nrViteze;
    }

    public String getTipFrana() {
        return tipFrana;
    }

    public int getDiamatruRoata() {
        return diamatruRoata;
    }

    public String getTip() {
        return tip;
    }

    public int getPretNou() {
        return pretNou;
    }

    public int getPretVechi() {
        return pretVechi;
    }

    public String getDataInceput() {
        return dataInceput;
    }

    public String getDataSfarsit() {
        return dataSfarsit;
    }

    public int getNrOre() {
        return nrOre;
    }

    public String getData() {
        return data;
    }

    public int getPretTotal() {
        return pretTotal;
    }

    public String getNumeBicicleta() {
        return numeBicicleta;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setNrViteze(int nrViteze) {
        this.nrViteze = nrViteze;
    }

    public void setTipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
    }

    public void setDiamatruRoata(int diamatruRoata) {
        this.diamatruRoata = diamatruRoata;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setNrOre(int nrOre) {
        this.nrOre = nrOre;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPretTotal(int pretTotal) {
        this.pretTotal = pretTotal;
    }

    public void setNumeBicicleta(String numeBicicleta) {
        this.numeBicicleta = numeBicicleta;
    }

    public void setPretNou(int pretNou) {
        this.pretNou = pretNou;
    }

    public void setPretVechi(int pretVechi) {
        this.pretVechi = pretVechi;
    }

    public void setDataInceput(String dataInceput) {
        this.dataInceput = dataInceput;
    }

    public void setDataSfarsit(String dataSfarsit) {
        this.dataSfarsit = dataSfarsit;
    }


    @Override
    public String toString() {
        return "Bicicleta{" +
                "producator='" + producator + '\'' +
                ", model='" + model + '\'' +
                ", tarif=" + tarif +
                ", culoare='" + culoare + '\'' +
                ", nrViteze=" + nrViteze +
                ", tipFrana='" + tipFrana + '\'' +
                ", diamatruRoata=" + diamatruRoata +
                ", tip='" + tip + '\'' +
                '}';
    }

    ///istoric comenzi
    public String viewIstoricComenzi() {
        return "Bicicleta{" +
                "numeBicicleta='" + numeBicicleta + '\'' +
                ", nrOre=" + nrOre +
                ", data='" + data + '\'' +
                ", pretTotal=" + pretTotal +
                '}';
    }

    ///oferte biciciclete
    public String viewOferte() {
        return "Bicicleta{" +
                "model='" + model + '\'' +
                ", pretNou=" + pretNou +
                ", pretVechi=" + pretVechi +
                ", dataInceput='" + dataInceput + '\'' +
                ", dataSfarsit='" + dataSfarsit + '\'' +
                '}';
    }
}
