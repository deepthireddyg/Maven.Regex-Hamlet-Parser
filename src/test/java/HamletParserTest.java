import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        int expectedCount=0;
        //When
        HamletParser objHamletParser=new HamletParser();
        String modified=objHamletParser.changeHamletToLeon(hamletText);
        int actualCount=objHamletParser.findHamlet(modified);
        //Then
        Assert.assertEquals(expectedCount,actualCount);
    }

    @Test
    public void testChangeHoratioToTariq() {
        int expectedCount=0;
        //When
        HamletParser objHamletParser=new HamletParser();
        String modified=objHamletParser.changeHoratioToTariq(hamletText);
        int actualCount=objHamletParser.findHamlet(modified);
        //Then
        Assert.assertEquals(expectedCount,actualCount);
    }

    @Test
    public void testFindHoratio() {
        int expectedCount=158;
        //When
        HamletParser objHamletParser=new HamletParser();
        int actualCount=objHamletParser.findHoratio(hamletText);
        //Then
        Assert.assertEquals(expectedCount,actualCount);
    }

    @Test
    public void testFindHamlet() {
        int expectedCount=472;
        //When
        HamletParser objHamletParser=new HamletParser();
        int actualCount=objHamletParser.findHamlet(hamletText);
        //Then
        Assert.assertEquals(expectedCount,actualCount);
    }
}