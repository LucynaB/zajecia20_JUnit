import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinPodzielnaTest {

    @Test
    public void shouldReturn2520(){
       int result= MinPodzielna.check(10);
        Assert.assertThat(result,CoreMatchers.is(2520));
    }

    @Test
    public void shouldReturn60(){
        int result= MinPodzielna.check(5);
        Assert.assertThat(result,CoreMatchers.is(60));
    }

}