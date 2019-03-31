import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println("Cabinet Medical General");
        //lista de actiuni;

        ServiciiCabinet serviciiCabinet=ServiciiCabinet.getInstanta();
        //serviciiCabinet.adaugarePacientNou();
       // serviciiCabinet.adaugareMedicNou();

       // serviciiCabinet.nrInsi();

        //serviciiCabinet.adaugareRezervare();
       // serviciiCabinet.aflareNumarRezervariLunare();
        //serviciiCabinet.setareDiagnostic("Ionescu_Ion");
       // serviciiCabinet.adaugareRezervare();;
        //serviciiCabinet.aflareNumarRezervariLunare();
       // serviciiCabinet.stergereRezervare();;
      //  serviciiCabinet.aflareNumarRezervariLunare();
        //serviciiCabinet.modificareNumarUtilizabile();
        //serviciiCabinet.actualizareDescriereMedic("Dancila_Daniel");
        serviciiCabinet.aflareAsistentFruntas();

    }
}