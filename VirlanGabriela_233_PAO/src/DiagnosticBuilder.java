public class DiagnosticBuilder {
    
    private final Diagnostic target = new Diagnostic();

    public DiagnosticBuilder cuDenumire(String denumire) {
        target.setDenumire(denumire);
        return this;
    }

    public DiagnosticBuilder cuId(int id) {
        target.setId(id);
        return this;
    }

    public DiagnosticBuilder cuCod(int cod) {
        target.setCod(cod);
        return this;
    }

    public Diagnostic build() {
        return target;
    }
}
