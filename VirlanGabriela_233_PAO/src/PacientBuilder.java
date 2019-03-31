import java.util.Date;

public class PacientBuilder {
    
    private  final Pacient target = new Pacient();

    public PacientBuilder cuId(int id) {
        target.setId(id);
        return this;
    }

    public PacientBuilder cuNume(String Nume) {
        target.setNume(Nume);
        return this;
    }

    public PacientBuilder cuDataNastere(Date dataNastere) {
        target.setDataNastere(dataNastere);
        return this;
    }

    public PacientBuilder cuVarsta(int varsta) {
        target.setVarsta(varsta);
        return this;
    }

    public PacientBuilder cuDiagnostic(Diagnostic diagnostic) {
        target.setDiagnostic(diagnostic);
        return this;
    }

    public PacientBuilder cuMedic(Medic medic) {
        target.setMedic(medic);
        return this;
    }

    public Pacient build() {
        return target;
    }
}
