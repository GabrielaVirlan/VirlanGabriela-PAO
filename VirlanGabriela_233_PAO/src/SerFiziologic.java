import java.util.Date;

public class SerFiziologic extends Utilizabil {

    private Date dataExpirare;

    public SerFiziologic(String denumire, int cantitate, Date dataExpirare){
        super(denumire, cantitate);
        this.dataExpirare=dataExpirare;
    }

    public Date getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(Date dataExpirare) {
        this.dataExpirare = dataExpirare;
    }
}
