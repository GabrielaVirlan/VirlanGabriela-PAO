import jdk.jshell.Diag;

import java.util.Date;
public class RetetaBuilder {

    private final Reteta target= new Reteta();

    public RetetaBuilder cuSerie(String serie){
        target.setSerie(serie);
        return this;
    }

    public RetetaBuilder cuNumar(int numar){
        target.setNumar(numar);
        return this;
    }

    public RetetaBuilder cuPacient(Pacient pacient){
        target.setPacient(pacient);
        return this;
    }

    public RetetaBuilder cuDataPrescriere(Date data){
        target.setDataPrescriere(data);
        return this;
    }

    public RetetaBuilder cuMedicatie(String medicatie){
        target.setMedicatie(medicatie);
        return this;
    }

    public RetetaBuilder cuDiagnostic(Diagnostic diagnostic){
        target.setDiagnostic(diagnostic);
        return this;
    }

    public Reteta build(){
        return target;
    }
}
