public class Client
{


    public Client() {

    }

    public static void main(String[] args) {

        MeterArchive mArchive = new MeterArchive();


        Clock clock1 = new Clock("K402", "R201H2", "I orden", "1.0E-4");
        System.out.println("\n" + clock1.toString());
        Clock clock2 = new Clock("K502", "R21H4", "I uorden", "1.0E-5");
        System.out.println("\n" + clock2.toString());


        //mArchive.addInstrument(clock2);

        //mArchive.getInstrument("K402");

        //mArchive.deleteInstrument("K402");

        mArchive.changeStatus("K502", "R402H5");

    }
}
