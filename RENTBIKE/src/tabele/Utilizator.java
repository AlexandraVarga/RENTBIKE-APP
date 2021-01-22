package tabele;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Utilizator {

    private int idDateLogare;
    private BigDecimal idCNP;
    private String nume;
    private String prenume;
    private int telefon;
    private String email;
    private String username;
    private String parola;
    private String parolaNoua;
    private String oras;
    private String strada;
    private int numar;
    private int codPostal;
    private BigDecimal cont;
    private String dataExpirare;
    private int codSiguranta;
    private String tip;
    private int ore;
    private String model;

    public Utilizator ()
    {
        super();
    }
    ///creare cont nou utilizator
    public Utilizator(BigDecimal idCNP, String nume, String prenume, int telefon, String email, String username, String parola, String oras, String strada, int numar, int codPostal, BigDecimal cont, String dataExpirare, int codSiguranta, String tip) {
        this.idCNP = idCNP;
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
        this.email = email;
        this.username = username;
        this.parola = parola;
        this.oras = oras;
        this.strada = strada;
        this.numar = numar;
        this.codPostal = codPostal;
        this.cont = cont;
        this.dataExpirare = dataExpirare;
        this.codSiguranta = codSiguranta;
        this.tip = tip;
    }

    ///schimbare parola cont existent
    public Utilizator (String username, String parola, String parolaNoua)
    {
        this.username=username;
        this.parola=parola;
        this.parolaNoua=parolaNoua;
    }

    public int getIdDateLogare() {
        return idDateLogare;
    }

    public BigDecimal getIdCNP() {
        return idCNP;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getParola() {
        return parola;
    }

    public String getParolaNoua() {
        return parolaNoua;
    }

    public String getOras() {
        return oras;
    }

    public String getStrada() {
        return strada;
    }

    public int getNumar() {
        return numar;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public BigDecimal getCont() {
        return cont;
    }

    public String getDataExpirare() {
        return dataExpirare;
    }

    public int getCodSiguranta() {
        return codSiguranta;
    }

    public String getTip() {
        return tip;
    }

    public int getOre() {
        return ore;
    }

    public String getModel() {
        return model;
    }

    public void setIdCNP(BigDecimal idCNP) {
        this.idCNP = idCNP;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setParolaNoua(String parolaNoua) {
        this.parolaNoua = parolaNoua;
    }
    public void setOras(String oras) {
        this.oras = oras;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public void setCont(BigDecimal cont) {
        this.cont = cont;
    }

    public void setDataExpirare(String dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public void setCodSiguranta(int codSiguranta) {
        this.codSiguranta = codSiguranta;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setIdDateLogare(int idDateLogare) {
        this.idDateLogare = idDateLogare;
    }

    @Override
    public String toString() {
        return "Utilizator{" +
                "idCNP=" + idCNP +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", telefon=" + telefon +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", parola='" + parola + '\'' +
                ", oras='" + oras + '\'' +
                ", strada='" + strada + '\'' +
                ", numar=" + numar +
                ", codPostal=" + codPostal +
                ", cont=" + cont +
                ", dataExpirare='" + dataExpirare + '\'' +
                ", codSiguranta=" + codSiguranta +
                ", tip='" + tip + '\'' +
                '}';
    }
    /// vedere client_bic
    public String viewClient1() {
        return "Utilizator{" +
                "idCNP=" + idCNP +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", ore=" + ore +
                ", model='" + model + '\'' +
                '}';
    }

    public String viewClienti() {
        return "Utilizator{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }
}
