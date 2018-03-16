//Alexander Gustavsen | 21.03.2018

/*
* Client-klassen har en main-metode som brukes til å utføre flere ulike
* oppgaver ved å opprette et objekt av klassen MeterArchive.
* */

public class Client
{


    public Client() {

    }

    public static void main(String[] args) {

        MeterArchive archive = new MeterArchive();

        //Oppretter listen
        archive.makeList();
        //Viser alt innholdet i lista
        System.out.println(archive.getAllMeters());

        //Her henter man ut et instrument fra listen
        archive.getInstrument("K402");
        //endrer "V251" sin status til "I uorden"
        archive.changeStatus("V251", "I uorden");
        //endrer plassering på "T305" til "R41H5"
        archive.changeLocation("T305", "R41H5");
        //sletter "V251 "
        archive.deleteInstrument("V235");
        //Ser alle endringene som har skjedd
        System.out.println(archive.getAllMeters());

    }
}
