import java.util.Date;

public class Rezervare {

    private Pacient pacient;
    private Medic medic;
    private Date dataRezervare;
    private String oraRezervare;

    public  Rezervare(){}

    public Rezervare(Pacient pacient, Medic medic, Date dataRezervare, String oraRezervare){
        this.pacient=pacient;
        this.medic=medic;
        this.dataRezervare=dataRezervare;
        this.oraRezervare=oraRezervare;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Medic getMedic() {
        return medic;
    }

    public void setMedic(Medic medic) {
        this.medic = medic;
    }

    public Date getDataRezervare() {
        return dataRezervare;
    }

    public void setDataRezervare(Date dataRezervare) {
        this.dataRezervare = dataRezervare;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }

    public void setOraRezervare(String oraRezervare) {
        this.oraRezervare = oraRezervare;
    }
}
