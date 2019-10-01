public class SSP {

    /** Hvis den første hånd vinder, returneres 1
     * Hvis den første hånd vinder, returneres 2
     * Hvis uafgjort, returneres 0
     * Hvis fejl, returneres -1 */
    int slaa(Haand a, Haand b) {

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

    // TODO: flereKampe(){}
}
