import java.util.Date;

public class Pacient {

    private int id;
    private String nume;
    private Date dataNastere;
    private int varsta;
    private Diagnostic diagnostic;
    private Medic medic;

    public Pacient(){}

    public Pacient(int id, String nume, Date dataNastere, int varsta){
        this.id=id;
        this.nume=nume;
        this.dataNastere=dataNastere;
        this.varsta=varsta;
    }

    public Pacient(int id, String nume, Date dataNastere, int varsta, Diagnostic diagnostic, Medic medic){
        this.id=id;
        this.nume=nume;
        this.dataNastere=dataNastere;
        this.varsta=varsta;
        this.diagnostic=diagnostic;
        this.medic=medic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Date getDataNastere() {
        return dataNastere;
    }

    public void setDataNastere(Date dataNastere) {
        this.dataNastere = dataNastere;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Diagnostic getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(Diagnostic diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Medic getMedic() {
        return medic;
    }

    public void setMedic(Medic medic) {
        this.medic = medic;
    }
}
