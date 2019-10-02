import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sten saks papir.");

        // Test enum.
        Haand spiller1 = Haand.PAPIR;
        Haand spiller2 = Haand.SAKS;

        // Her starter spillet
        SSP runde1 = new SSP();
        System.out.println(runde1.slaa(spiller1, spiller2));

        // Computer genererer en hånd
        Haand computerensHaand = null;
        int haandInt =(int) (Math.random()*3+1);
        // Korte nørklet kode  computersHaand = Haand.values()[haandInt];
        if (haandInt == 1) { computerensHaand = Haand.STEN; }
        if (haandInt == 2) { computerensHaand = Haand.SAKS; }
        if (haandInt == 3) { computerensHaand = Haand.PAPIR; }
        System.out.println("Computer slår " + computerensHaand);

        // Indlæse spillerns hånd
        Scanner scanner = new Scanner(System.in);
        Haand spillerensHaand = null;
        String spillerenString = scanner.next();
        if (spillerenString.equals("sten")) { spillerensHaand = Haand.STEN; }
        if (spillerenString.equals("saks")) { spillerensHaand = Haand.SAKS; }
        if (spillerenString.equals("papir")) { spillerensHaand = Haand.PAPIR; }
        System.out.println("Spiller slår " + spillerensHaand);

        // Sammenligne med slaa() metoden
        int resultat = runde1.slaa(computerensHaand, spillerensHaand);

        // Udråbe en vinder
        System.out.println("Resultatet er " + resultat);
        // TODO vis resultatet mere meningsfuldt
    }
}
