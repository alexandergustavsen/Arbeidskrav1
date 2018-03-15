import java.util.ArrayList;
import java.util.List;

public class MeterArchive
{
    private Meter meter;
    List<Meter> meters;

    public MeterArchive(){
        meters = new ArrayList();
    }

    public void addInstrument(Meter maaleinstrument) {
        meters.add(maaleinstrument);
    }

    public Meter getInstrument(String id) {
        System.out.println("Henter instrument med regnummer: " + id);
        for (Meter meter : meters) {
            if(meter.getReg().equals(id)) {
                System.out.println("Hentet!");
                return meter;
            }
        }
        return null;
    }

    public boolean changeLocation(String id, String plassering) {
        System.out.println("Endrer posisjon for instrument med regnummer: " + id);
        for (Meter meter : meters) {
            if(id.equals(meter.getReg())) {
                meter.setPlass(plassering);
                System.out.println("Endret!");
                return true;
            }
        }
        System.out.println("Ukjent regnummer!");
        return false;
    }

    public boolean changeStatus(String id, String status) {
        System.out.println("Setter instrument med regnummer " + id + "til" + status);
        for (Meter meter : meters) {
            if(meter.equals(id)) {
                meter.setStatus(status);
                System.out.println("Endret!");
                return true;
            }
        }
        System.out.println("Ukjent regnummer!");
        return false;
    }

    public boolean deleteInstrument(String id) {
        System.out.println("Sletter instrument med regnummer: " + id);
        for (Meter meter : meters) {
            if(meter.equals(id)) {
                meters.remove(id);
                System.out.println("Slettet!");
                return true;
            }
        }
        System.out.println("Ukjent regnummer!");
        return false;
    }

}

