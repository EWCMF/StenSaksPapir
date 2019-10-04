import java.util.Scanner;

public class SSP {

    public static void startSpillet() {
        SSP runde1 = new SSP() ;

        int win = 0;
        int lose = 0;
        int draw = 0;

        int count = 1;
        while (count >= 0) {

            // Indlæse spillerns hånd
            System.out.println("Runde " + count + " - Hvad slår du? (sten, saks, papir)");
            Scanner scanner = new Scanner(System.in);
            Haand spillerensHaand = null;
            String spillerenString = scanner.next();
            if (spillerenString.equalsIgnoreCase("sten")) {
                spillerensHaand = Haand.STEN;
            }
            if (spillerenString.equalsIgnoreCase("saks")) {
                spillerensHaand = Haand.SAKS;
            }
            if (spillerenString.equalsIgnoreCase("papir")) {
                spillerensHaand = Haand.PAPIR;
            }
            if (spillerenString.equalsIgnoreCase("afslut")) {
                System.out.println("Du vandt: " + win + " gang(e)");
                System.out.println("Du tabte: " + lose + " gang(e)");
                System.out.println("Det blev uafgjort: " + draw + " gang(e)");
                break;
            }
            System.out.println("Spiller slår " + spillerensHaand);

            // Computer genererer en hånd
            Haand computerensHaand = null;
            int haandInt = (int) (Math.random() * 3 + 1);
            // Korte nørklet kode  computersHaand = Haand.values()[haandInt];
            if (haandInt == 1) {
                computerensHaand = Haand.STEN;
            }
            if (haandInt == 2) {
                computerensHaand = Haand.SAKS;
            }
            if (haandInt == 3) {
                computerensHaand = Haand.PAPIR;
            }
            System.out.println("Computer slår " + computerensHaand);


            // Sammenligne med slaa() metoden
            int resultat = runde1.slaa(spillerensHaand, computerensHaand);

            // Udråbe en vinder
            if (resultat == 1) {
                System.out.println("Du har vundet");
                count++;
                win++;
            }
            if (resultat == 2) {
                System.out.println("Du har tabt");
                count++;
                lose++;
            }
            if (resultat == 0) {
                System.out.println("Det er uafgjort");
                count++;
                draw++;
            }
            if (resultat == -1) {
                System.out.println("Fejl");
            }
        }
    }

    /** Hvis den første hånd vinder, returneres 1
     * Hvis den første hånd vinder, returneres 2
     * Hvis uafgjort, returneres 0
     * Hvis fejl, returneres -1 */
    static int slaa(Haand a, Haand b) {

        int resultat = -1;

        // første hånd sten.
        if (a == Haand.STEN) {
            // Anden hånd b kan være sten.
            if (b == Haand.STEN) {
                resultat = 0;
            }
            // Anden hånd b kan være saks.
            if (b == Haand.SAKS) {
                resultat = 1;
            }
            // Anden hånd b kan være papir.
            if (b == Haand.PAPIR) {
                resultat = 2;
            }
        }

        // første hånd saks.
        if (a == Haand.SAKS) {
            // Anden hånd b kan være sten.
            if (b == Haand.STEN) {
                resultat = 2;
            }
            // Anden hånd b kan være saks.
            if (b == Haand.SAKS) {
                resultat = 0;
            }
            // Anden hånd b kan være papir.
            if (b == Haand.PAPIR) {
                resultat = 1;
            }
        }

        // første hånd papir.
        if (a == Haand.PAPIR) {
            // Anden hånd b kan være sten.
            if (b == Haand.STEN) {
                resultat = 1;
            }
            // Anden hånd b kan være saks.
            if (b == Haand.SAKS) {
                resultat = 2;
            }
            // Anden hånd b kan være papir.
            if (b == Haand.PAPIR) {
                resultat = 0;
            }
        }

        return resultat;
    }
}
