import junit.framework.TestCase;

public class SSPTest extends TestCase {

    public void testSlaa() {
        Haand input1 = Haand.STEN;
        Haand input2 = Haand.STEN;

        int output = SSP.slaa(input1, input2);
        assertEquals(0, output);

        input1 = Haand.STEN;
        input2 = Haand.SAKS;

        output = SSP.slaa(input1, input2);
        assertEquals(1, output);

        input1 = Haand.STEN;
        input2 = Haand.PAPIR;

        output = SSP.slaa(input1, input2);
        assertEquals(2, output);
    }
}