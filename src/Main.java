public class Main {
    public static void main(String[] args) {
        System.out.println("Sten saks papir.");

        // Test enum.
        Haand spiller1 = Haand.PAPIR;
        Haand spiller2 = Haand.SAKS;

        // Her starter spillet
        SSP runde1 = new SSP();
        System.out.println(runde1.slaa(spiller1, spiller2));

        // Computer generer en hånd.
        Haand computersHaand;
        int haandTal = (int) Math.random() * 3 + 1;
        Haand.values(0);
        // Indlæse spillerens hånd.
        // Sammenlign med slaa() metoden.
        // Udråbe en vinder.
    }
}
