//Alexander Gustavsen | 21.03.2018

/*
 * Weight-klassen er en subklasse av Meter, og her legges
 * til de ekstra verdiene som vekten skal inneholde.
 * */

public class Weight extends Meter
{
    private double minWeight;
    private double maxWeight;

    public Weight() {}

    public Weight(String regNummer, String plassKode, String status, double minWeight, double maxWeight) {
        super(regNummer, plassKode, status);
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(int MinWeight) {
        this.minWeight = MinWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int MaxWeight) {
        this.maxWeight = MaxWeight;
    }

    @Override
    public String toString() {
        return "Vekt" + "\n"
            + "(Måleintervall:" + minWeight + " - " + maxWeight + ")" + "\n"
            + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weight)) return false;

        Weight weight = (Weight) o;

        if (Double.compare(weight.getMinWeight(), getMinWeight()) != 0) return false;
        return Double.compare(weight.getMaxWeight(), getMaxWeight()) == 0;
    }
}
