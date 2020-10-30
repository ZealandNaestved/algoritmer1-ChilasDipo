import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Algorithms1Test {

    @org.junit.jupiter.api.Test
    void randomBoyName() {
        Algorithms1 algorithms1 = new Algorithms1();
        String randomName = algorithms1.randomBoyName();
        assertEquals(randomName,"Kamel");
    }

    @Test
    void randomGirlName() {
            Algorithms1 algorithms1 = new Algorithms1();
            String randomName = algorithms1.randomGirlName();
            assertEquals(randomName,"Gift");
        }

    @Test
    void randomName() {
        String[] expected = new String[10];
        for (int i = 0; i < expected.length; i=i+2) {
            expected[i] = "Gift" ; expected[i+1] = "Kamel"; }
        Algorithms1 algorithms1 = new Algorithms1();
        String[] randomName = algorithms1.randomName();
        assertArrayEquals(randomName,expected);


    }
}