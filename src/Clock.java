//Alexander Gustavsen | 21.03.2018

/*
 *Clock-klassen er en subklasse av Meter, og her legges
 * til de ekstra verdiene som klokken skal inneholde.
 * */

public class Clock extends Meter
{
    private String minClock;

    public Clock() {}

    public Clock(String regNummer, String plassKode, String status, String minClock) {
        super(regNummer, plassKode, status);
        this.minClock = minClock;
    }

    public String getMinClock() {
        return minClock;
    }

    public void setMinClock(String minClock) {
        this.minClock = minClock;
    }

    @Override
    public String toString() {
        return "Klokke" + "\n"
            + "(Minste tidsintervall: " + minClock + " s)" + "\n"
            + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clock)) return false;

        Clock clock = (Clock) o;

        return getMinClock() != null ? getMinClock().equals(clock.getMinClock()) : clock.getMinClock() == null;
    }
}

