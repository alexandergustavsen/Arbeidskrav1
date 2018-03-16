//Alexander Gustavsen | 21.03.2018

/*
 * Meter-klassen er en abstrakt superklasse som inneholder viktige verdier
 * til instrumentene som regNummer, plassKode, og status.
 * */

public abstract class Meter {

    private String regNummer;
    private String plassKode;
    private String status;

    public Meter() {}

    public Meter(String regNummer, String plassKode, String status) {
        this.regNummer = regNummer;
        this.plassKode = plassKode;
        this.status = status;
    }

    public String getReg() {
        return regNummer;
    }

    public void setReg(String regNummer) {
        this.regNummer = regNummer;
    }

    public String getPlass() {
        return plassKode;
    }

    public void setPlass(String plassKode) {
        this.plassKode = plassKode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "Regnummer: " + regNummer + "\n"
            + "Plassering: " + plassKode + "\n"
            + "Status: " + status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meter)) return false;

        Meter meter = (Meter) o;

        if (regNummer != null ? !regNummer.equals(meter.regNummer) : meter.regNummer != null) return false;
        if (plassKode != null ? !plassKode.equals(meter.plassKode) : meter.plassKode != null) return false;
        return getStatus() != null ? getStatus().equals(meter.getStatus()) : meter.getStatus() == null;
    }
}
