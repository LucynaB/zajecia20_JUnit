import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class EulerTest {

    @Test
    public void shouldReturn0(){
        int result= Euler.sum(0);

        Assert.assertThat(result,CoreMatchers.is(0));

    }

    @Test
    public void shouldReturn23(){
        int result= Euler.sum(10);

        Assert.assertThat(result,CoreMatchers.is(23));

    }

    @Test
    public void shouldReturn3(){
        int result= Euler.sum(5);

        Assert.assertThat(result,CoreMatchers.is(3));

    }



}