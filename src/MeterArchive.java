//Alexander Gustavsen | 21.03.2018

/*
* MeterArchive-klassen inneholder alle metodene for å legge til, slette, endre, skrive ut
* og hente objekter fra Meter-klassen. Den oppretter også listen som inneholder alle objektene.
* */

import java.util.ArrayList;
import java.util.List;

public class MeterArchive
{
    private Meter meter;
    private List<Meter> meters;

    public MeterArchive(){
        meters = new ArrayList();
    }
    //Oppretter nye objekter og legger de til i en liste.
    public void makeList() {
        addInstrument(new Clock("K402", "R20H2", "I orden", "1.0E-4"));
        addInstrument(new Clock("K405", "R10H1", "I uorden", "1.0E-2"));
        addInstrument(new Thermometer("T305", "R40H6", "I uorden", 0.001, 100));
        addInstrument(new Thermometer("T645", "R42H8", "I orden", 0.1, 200));
        addInstrument(new Weight("V235", "R72H3", "I orden", 0.1, 10));
        addInstrument(new Weight("V251", "R81H2", "I orden", 0.1, 100));
    }
    //metode for å legge til et nytt objekt i lista
    public void addInstrument(Meter meter) {
        meters.add(meter);
    }
    //metode for å returnere et objekt med et spesifikt regnummer
    public Meter getInstrument(String regNummer) {
        System.out.println("Henter instrument med regnummer: " + regNummer);
        for (Meter meter : meters) {
            if(regNummer.equals(meter.getReg())) {
                System.out.println("Hentet!" + "\n");
                return meter;
            }
        }
        return null;
    }
    //metode for å endre plassering ved å oppgi regnummer og ny plassering
    public boolean changeLocation(String regNummer, String plassering) {
        System.out.println("Endrer posisjon for instrument med regnummer: " + regNummer);
        for (Meter meter : meters) {
            if(regNummer.equals(meter.getReg())) {
                meter.setPlass(plassering);
                System.out.println("Endret!" + "\n");
                return true;
            }
        }
        System.out.println("Ukjent regnummer!" + "\n");
        return false;
    }
    //metode for å endre status ved å oppgi regnummer og ny status
    public boolean changeStatus(String regNummer, String status) {
        System.out.println("Setter instrument med regnummer " + regNummer + " til " + status);
        for (Meter meter : meters) {
            if(regNummer.equals(meter.getReg())) {
                meter.setStatus(status);
                System.out.println("Endret!" + "\n");
                return true;
            }
        }
        System.out.println("Ukjent regnummer!" + "\n");
        return false;
    }
    //metode for å slette et objekt i listen
    public boolean deleteInstrument(String regNummer) {
        System.out.println("Sletter instrument med regnummer: " + regNummer);
        for (Meter meter : meters) {
            if(regNummer.equals(meter.getReg())) {
                meters.remove(meter);
                System.out.println("Slettet!" + "\n");
                return true;
            }
        }
        System.out.println("Ukjent regnummer!" + "\n");
        return false;
    }
    //metode for å skrive ut alle objektene i listen
    public String getAllMeters() {
        System.out.println("Oversikt over alle instrumenter nå: ");
        String meterString = "";
        for(Meter meter : meters) {
            meterString += meter + "\n" + "\n";
        }
        return meterString;
    }

}

