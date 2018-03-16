//Alexander Gustavsen | 21.03.2018

/*
 * Thermometer-klassen er en subklasse av Meter, og her legges
 * til de ekstra verdiene som termometeret skal inneholde.
 * */

public class Thermometer extends Meter
{
    private double minTemp;
    private double maxTemp;

    public Thermometer() {}

    public Thermometer(String regNummer, String plassKode, String status, double minTemp, double MaxTemp) {
        super(regNummer, plassKode, status);
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int thermo) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public String toString() {
        return "Termometer" + "\n"
            +"(Min- og maks temp:" + minTemp + " - " + maxTemp + ")" + "\n"
            + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Thermometer)) return false;

        Thermometer that = (Thermometer) o;

        if (Double.compare(that.getMinTemp(), getMinTemp()) != 0) return false;
        return Double.compare(that.getMaxTemp(), getMaxTemp()) == 0;
    }
}

