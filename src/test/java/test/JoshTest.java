package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import uk.ac.uos.i2p.envelope.Envelope;


public class JoshTest {

      @Test
      public void testFullName() {
            String expected = "Josh Richard Owens";
            String actual = Envelope.getFullName("Josh", "Richard", "Owens");
            assertEquals(expected, actual);
      }
}
