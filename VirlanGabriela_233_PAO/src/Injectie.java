import java.util.Date;

public class Injectie extends Utilizabil {

    private int mL;

    public Injectie(String denumire, int cantitate, int mL){
        super(denumire, cantitate);
        this.mL=mL;
    }

    public int getmL() {
        return mL;
    }

    public void setmL(int mL) {
        this.mL = mL;
    }
}
