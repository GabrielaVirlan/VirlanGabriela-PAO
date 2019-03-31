import jdk.jshell.Diag;

import java.rmi.activation.ActivationSystem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.lang.Object;

public class ServiciiCabinet {

    SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
    Scanner scanner = new Scanner(System.in);
    Calendar calendar=Calendar.getInstance();

    private Utilizabil[] utilizabils=
            new Utilizabil[]{
                    new Injectie("Injectie", 50, 5),
                    new SerFiziologic("SerFiziologic", 10, d.parse("01-01-2021"))
            };

    private Diagnostic[] diagnostics=
            new Diagnostic[]{
                    new DiagnosticBuilder()
                            .cuId(1)
                            .cuCod(0)
                            .cuDenumire("FaraDiagnosctic")
                            .build(),
                    new DiagnosticBuilder()
                            .cuId(2)
                            .cuCod(62)
                            .cuDenumire("Oreon")
                            .build(),
                    new DiagnosticBuilder()
                            .cuId(3)
                            .cuCod(266)
                            .cuDenumire("Avitaminoza")
                            .build(),
                    new DiagnosticBuilder()
                            .cuId(4)
                            .cuCod(684)
                            .cuDenumire("InsuficientRenala")
                            .build(),
                    new DiagnosticBuilder()
                            .cuId(5)
                            .cuCod(749)
                            .cuDenumire("Diabet")
                            .build(),
                    new DiagnosticBuilder()
                            .cuId(6)
                            .cuCod(499)
                            .cuDenumire("Sinuzita")
                            .build()
            };

    private CadruMedical[] cadruMedicals=
            new CadruMedical[] {
                    new Asistent(1, "Gavrilescu_Gabriela", 20, 1, 10),
                    new Asistent(2, "Mihailescu_Mihaela", 25, 2, 9),
                    new Medic(3, "Antonescu_Antonia", 30, 1, "Medic specializat pe control general al sanatatii pacientului"),
                    new Medic(4, "Dancila_Daniel", 40, 2, "Medic specializat pe control general al sanatatii copiilor")
            };

    private Pacient[] pacients=
            new Pacient[]{
                    new PacientBuilder()
                            .cuId(1)
                            .cuNume("Barbulescu_Barbu")
                            .cuDataNastere(d.parse("01-01-1970"))
                            .cuVarsta(49)
                            .cuDiagnostic(diagnostics[0])
                            .cuMedic((Medic)cadruMedicals[2])
                            .build(),
                    new PacientBuilder()
                            .cuId(2)
                            .cuNume("Muntenescu_Magura")
                            .cuDataNastere(d.parse("02-02-1980"))
                            .cuVarsta(39)
                            .cuDiagnostic(diagnostics[1])
                            .cuMedic((Medic)cadruMedicals[2])
                            .build(),
                    new PacientBuilder()
                            .cuId(3)
                            .cuNume("Ionescu_Ion")
                            .cuDataNastere(d.parse("03-03-2002"))
                            .cuVarsta(17)
                            .cuDiagnostic(diagnostics[0])//voi seta diagnosticul
                            .cuMedic((Medic)cadruMedicals[3])
                            .build(),
                    new PacientBuilder()
                            .cuId(4)
                            .cuNume("Alexandrescu_Alex")
                            .cuDataNastere(d.parse("03-03-2012"))
                            .cuVarsta(7)
                            .cuDiagnostic(diagnostics[3])
                            .cuMedic((Medic)cadruMedicals[3])
                            .build()
            };

    private Reteta[] retetas=
            new Reteta[]{
                    new RetetaBuilder()
                            .cuSerie("AAAA")
                            .cuNumar(1111)
                            .cuPacient(pacients[0])
                            .cuDataPrescriere(d.parse("29-03-2019"))
                            .cuMedicatie("PicaturiAuriculare")
                            .cuDiagnostic(diagnostics[0])
                            .build(),
                    new RetetaBuilder()
                            .cuSerie("BBBB")
                            .cuNumar(2222)
                            .cuPacient(pacients[3])
                            .cuDataPrescriere(d.parse("20-03-2019"))
                            .cuMedicatie("VitaminaA")
                            .cuDiagnostic(diagnostics[1])
                            .build()

            };

    int indexPacient=pacients.length;
    public void adaugarePacientNou() throws ParseException {

        int id=indexPacient+1;
        System.out.println("Introducere pacient nou:"+"\n"+"Introduceti numele:");
        String nume;
        nume = scanner.next();
        System.out.println("Introduceti data nasterii (format: dd-mm-yyyy):");
        String dataNastere;
        dataNastere=scanner.next();
        System.out.println("Introduceti varsta:");
        int varsta;
        varsta=scanner.nextInt();

        Pacient pacientNou=new Pacient(id,nume,d.parse(dataNastere),varsta);

        Pacient[] pacients2=new Pacient[indexPacient+1];
        for(int i=0;i<indexPacient;i++)
            pacients2[i]=pacients[i];
        pacients2[indexPacient]=pacientNou;
        pacients=new Pacient[indexPacient+1];
        for(int i=0;i<=indexPacient;i++)
            pacients[i]=pacients2[i];
        indexPacient++;
    }

    int indexCadruMedical=cadruMedicals.length;
    public void adaugareMedicNou(){

        //System.out.println(pacients.length);
        int id=indexCadruMedical;
        System.out.println("Introducere medic nou:"+"\n"+"Introduceti numele:");
        String nume;
        nume = scanner.next();
        System.out.println("Introduceti varsta:");
        int varsta;
        varsta=scanner.nextInt();
        System.out.println("Introduceti medicId:");
        int medicId=scanner.nextInt();
        System.out.println("Introduceti descriere medic:");
        String descriere;
        descriere=scanner.next();

        Medic medicNou=new Medic(id,nume,varsta,medicId,descriere);

        CadruMedical[] cadruMedicals2=new CadruMedical[indexCadruMedical+1];
        for(int i=0;i<indexCadruMedical;i++)
            cadruMedicals2[i]=cadruMedicals[i];
       cadruMedicals2[indexCadruMedical]=medicNou;
        cadruMedicals=new CadruMedical[indexCadruMedical+1];
        for(int i=0;i<=indexCadruMedical;i++)
            cadruMedicals[i]=cadruMedicals2[i];
        indexCadruMedical++;
    }

    private static ServiciiCabinet instanta;
    public static ServiciiCabinet getInstanta(){
        //System.out.println("Se apeleaza getInstanta.");
        if(instanta == null){
            try{
                instanta =  new ServiciiCabinet();
            }
            catch (Exception ex) {
                System.out.println("Erroare la crearea obiectului!");
            }
        }
        return instanta;
    }

    private Pacient pacientDupaNume(String nume) {
        Pacient pacientSelectat = null;
        for (int i = 0; i < pacients.length; i++) {
            if (pacients[i].getNume().equals(nume)) {
                pacientSelectat= pacients[i];
            }
        }
        if(pacientSelectat == null){
            System.out.println("Nu a fost gasit un pacient cu numele: "+nume+"!");
        }
        return pacientSelectat;
    }

    private Medic medicDupaNume(String nume) {
        CadruMedical medicSelectat = null;
        for (int i = 0; i < cadruMedicals.length; i++) {
            if(cadruMedicals[i].getClass()==Medic.class) {
                if (cadruMedicals[i].getNume().equals(nume)) {
                    medicSelectat = cadruMedicals[i];
                }
            }
        }
        if(medicSelectat == null){
            System.out.println("Nu a fost gasit un medic cu numele: "+nume+"!");
        }
        return ((Medic)medicSelectat);
    }


    Rezervare[] rezervares=new Rezervare[1];
    int indexRezervare=0;
    public void adaugareRezervare() throws ParseException {

        System.out.println("Introduceti o rezervare noua:");
        System.out.println("Introduceti numele pacientului:");
        String nume;
        nume=scanner.next();
        Pacient pacient = pacientDupaNume(nume);

        System.out.println("Introduceti numele medicului:");
        String nume2;
        nume2=scanner.next();
        Medic medic = medicDupaNume(nume2);

        System.out.println("Introduceti data programarii:");
        String data;
        data=scanner.next();

        System.out.println("Introduceti ora (hh:mm)");
        String ora;
        ora=scanner.next();

        Rezervare rezervare=new Rezervare(pacient,medic, d.parse(data), ora);

        rezervares[indexRezervare]=rezervare;
        indexRezervare++;//1

        Rezervare[] rezervares2=new Rezervare[indexRezervare+1];//2
        for(int i=0;i<rezervares.length;i++)
            rezervares2[i]=rezervares[i];

        rezervares=new Rezervare[indexRezervare+1];

        for(int i=0;i<rezervares.length;i++)
            rezervares[i]=rezervares2[i];

        //rezervare[0]=completata si rezolvare[1]=goala
    }

    public void aflareNumarRezervariLunare(){

        int nrProgramari=0;
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int lunaActuala = localDate.getMonthValue();

        if(rezervares.length==2)
            System.out.println("Nu exista rezervari pe luna asta!");
        else {
            for (int i = 0; i < rezervares.length - 1; i++) {
                Date data = rezervares[i].getDataRezervare();
                calendar.setTime(data);
                int lunaProgramare = calendar.get(Calendar.MONTH);
                lunaProgramare++;
                System.out.println(lunaProgramare);
                if (lunaProgramare == lunaActuala)
                    nrProgramari++;
            }
        }
        System.out.println("Numarul de programari din luna actuala este: "+nrProgramari+".");

    }

    public void stergereRezervare() throws ParseException {
        System.out.println("Stergere rezervare:");
        System.out.println("Introduceti data (dd-MM-yyyy):");
        String dataDeSters;
        dataDeSters=scanner.next();
        Date dataDeSters2=d.parse(dataDeSters);
        System.out.println("Introduceti ora(hh:mm):");
        String ora;
        ora=scanner.next();
        Rezervare rezervareDeSters=null;
        int iDeSters=0;
        for(int i=0;i<rezervares.length-1;i++)
            if((rezervares[i].getDataRezervare().compareTo(dataDeSters2) == 0) &
                    (rezervares[i].getOraRezervare().equals(ora))) {
                rezervareDeSters = rezervares[i];
                System.out.println(rezervareDeSters.getMedic().getNume());
                iDeSters = i;
                System.out.println(iDeSters);
                System.out.println(rezervares.length);

            }
        if(rezervareDeSters==null) {
            System.out.println("Nu a fost gasita nici o programare la data si ora respective!");
        }
        else {
            for(int i = iDeSters; i < (rezervares.length - 1); i++){
                rezervares[i]=rezervares[i+1];
            }
        }

        //rezervare[0]=goala si rezervare[1]=goala

        rezervares[(rezervares.length)-1]=null;

        //rezervare[0]=goala rezervare[1]=null
        System.out.println("Stergerea a fost reazlizata cu succes!");
    }


    private Diagnostic diagnosticDupaNume(String nume) {
        Diagnostic diagnosticSelectat = null;
        for (int i = 0; i < diagnostics.length; i++) {
            if (diagnostics[i].getDenumire().equals(nume)) {
                diagnosticSelectat= diagnostics[i];
            }
        }
        if(diagnosticSelectat == null){
            System.out.println("Nu a fost gasit un diagnostic cu numele: "+nume+"!");
        }
        return diagnosticSelectat;
    }

    public void setareDiagnostic(String nume){
        System.out.println("Setare diagnostic pacient:");
        System.out.println("Introduceti diagnosticul pe care il atribuiti pacientului "+nume+":");
        String diagnosticNume=scanner.next();
        Diagnostic diagnostic=diagnosticDupaNume(diagnosticNume);
        Pacient pacient=pacientDupaNume(nume);
        for(int i=0;i<pacients.length;i++){
            if(pacients[i].getNume().equals(nume)){
                pacient.setDiagnostic(diagnostic);
            }
        }
        System.out.println("Diagnosticul a fost setat cu succes!");
    }

    public void modificareNumarUtilizabile(){
        System.out.println("Modificare numar utilizabile:");
        System.out.println("Numar actual de injectii:");
        int nrInjectii=scanner.nextInt();
        utilizabils[0].setCantitate(nrInjectii);
        System.out.println("Numar actual de sticle de ser fiziologic :");
        int nrSerFiziologic=scanner.nextInt();
        utilizabils[1].setCantitate(nrSerFiziologic);


        System.out.println("Aveti la dispozitie "+utilizabils[0].getCantitate()+" injectii si "+utilizabils[1].getCantitate()+" sticle de ser fiziologic.");

    }

    public void actualizareDescriereMedic(String nume){
        Medic medic=medicDupaNume(nume);
        System.out.println("Introduceti descriere pentru medicul "+nume+":");
        String descriereNoua=scanner.next();
        medic.setDescriere(descriereNoua);
    }

    public void aflareAsistentFruntas() {
        int nota = 0;
        Asistent asistentFruntas = null;
        for (int i = 0; i <= cadruMedicals.length; i++)
            if (cadruMedicals[1].getClass().getName().equals("Asistent")) {
                Asistent asistent = (Asistent) cadruMedicals[i];
                if (asistent.getNotaLicenta() > nota) {
                    nota = asistent.getNotaLicenta();
                    asistentFruntas = asistent;
                }
                if (asistentFruntas == null)
                    System.out.println("Nu s-a gasit nici un asistent (fruntas)!");
                else
                    System.out.println("Asistentul fruntas este " + asistentFruntas.getNume());
            }
    }

    public ServiciiCabinet() throws ParseException {
    }

    public void nrInsi(){
        System.out.println(pacients.length);
        System.out.println(cadruMedicals.length);
    }
}


