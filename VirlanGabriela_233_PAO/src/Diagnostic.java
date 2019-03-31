public class Diagnostic {

    private int id;
    private int cod;
    private String denumire;

    public Diagnostic(){}

    public Diagnostic(int id, int cod, String denumire){
        this.id=id;
        this.cod=cod;
        this.denumire=denumire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
}
