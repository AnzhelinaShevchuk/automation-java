package net.absoft.mortalwombat;


import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class AgeCheckerTest {
    public void testAgedUserCanPlay() {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(18), "Aged user cant play game" );

    }

}
