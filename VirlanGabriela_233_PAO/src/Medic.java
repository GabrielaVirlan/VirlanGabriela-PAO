public class Medic extends CadruMedical {

    private int medicId;
    private String descriere;

    public Medic(int id, String nume, int varsta, int medicId, String descriere)
    {
        super(id,nume,varsta);
        this.descriere=descriere;
        this.medicId=medicId;
    }

    public int getMedicId() {
        return medicId;
    }

    public void setMedicId(int medicId) {
        this.medicId = medicId;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
}
