import java.util.Date;

public class Reteta {

    private String serie;
    private int numar;
    private Pacient pacient;
    private Date dataPrescriere;
    private String medicatie;
    private Diagnostic diagnostic;

    public  Reteta(){}

    public Reteta(String serie, int numar, Pacient pacient, Date dataPrescriere, String medicatie, Diagnostic diagnostic){
        this.serie=serie;
        this.numar=numar;
        this.pacient=pacient;
        this.dataPrescriere=dataPrescriere;
        this.medicatie=medicatie;
        this.diagnostic=diagnostic;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Date getDataPrescriere() {
        return dataPrescriere;
    }

    public void setDataPrescriere(Date dataPrescriere) {
        this.dataPrescriere = dataPrescriere;
    }

    public String getMedicatie() {
        return medicatie;
    }

    public void setMedicatie(String medicatie) {
        this.medicatie = medicatie;
    }

    public Diagnostic getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(Diagnostic diagnostic) {
        this.diagnostic = diagnostic;
    }
}
