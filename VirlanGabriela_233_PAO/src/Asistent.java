public class Asistent extends CadruMedical{

    private int idAsistent;
    private int notaLicenta;

    public Asistent(int id, String nume, int varsta){
        super(id,nume,varsta);
    }

    public Asistent(int id, String nume, int varsta, int idAsistent, int notaLicenta){
        super(id, nume, varsta);
        this.idAsistent=idAsistent;
        this.notaLicenta=notaLicenta;
    }

    public int getIdAsistent() {
        return idAsistent;
    }

    public void setIdAsistent(int idAsistent) {
        this.idAsistent = idAsistent;
    }

    public int getNotaLicenta() {
        return notaLicenta;
    }

    public void setNotaLicenta(int notaLicenta) {
        this.notaLicenta = notaLicenta;
    }
}
