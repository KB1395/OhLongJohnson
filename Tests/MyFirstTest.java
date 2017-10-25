import com.company.Ages;
import org.junit.Assert;
import org.junit.Test;

public class MyFirstTest {
    @Test
    public void firstTest() {
        Ages dude = new Ages();
        Assert.assertEquals("should be 22",(dude.Year-dude.DOB), dude.CheckAge());
        Assert.assertEquals("Should be true",true,dude.ChangeDOB(1993));
        dude.ChangeDOB(1993);
        Assert.assertEquals("should be 24",22, dude.CheckAge());

    }
}