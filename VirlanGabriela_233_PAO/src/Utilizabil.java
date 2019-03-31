public class Utilizabil {

    private String denumire;
    private int cantitate;

    public Utilizabil(String denumire, int cantitate){
        this.denumire=denumire;
        this.cantitate=cantitate;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}
