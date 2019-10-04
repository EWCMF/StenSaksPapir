import junit.framework.TestCase;

public class SSPTest extends TestCase {

    public void testSlaaSten() {
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

    public void testSlaaSaks() {
        Haand input1 = Haand.SAKS;
        Haand input2 = Haand.SAKS;

        int output = SSP.slaa(input1, input2);
        assertEquals(0, output);

        input1 = Haand.SAKS;
        input2 = Haand.PAPIR;

        output = SSP.slaa(input1, input2);
        assertEquals(1, output);

        input1 = Haand.SAKS;
        input2 = Haand.STEN;

        output = SSP.slaa(input1, input2);
        assertEquals(2, output);
    }

    public void testSlaaPapir() {
        Haand input1 = Haand.PAPIR;
        Haand input2 = Haand.PAPIR;

        int output = SSP.slaa(input1, input2);
        assertEquals(0, output);

        input1 = Haand.PAPIR;
        input2 = Haand.STEN;

        output = SSP.slaa(input1, input2);
        assertEquals(1, output);

        input1 = Haand.PAPIR;
        input2 = Haand.SAKS;

        output = SSP.slaa(input1, input2);
        assertEquals(2, output);
    }
}