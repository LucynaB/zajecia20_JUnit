import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {


    @Test
    public void shouldReturn10() {
        int result = Fibonacci.sum(10);

        Assert.assertThat(result,CoreMatchers.is(10));
    }

    @Test
    public void shouldReturn44() {
        int result = Fibonacci.sum(100);

        Assert.assertThat(result,CoreMatchers.is(44));
    }

    @Test
    public void shouldReturn188() {
        int result = Fibonacci.sum(200);

        Assert.assertThat(result,CoreMatchers.is(188));
    }


}
