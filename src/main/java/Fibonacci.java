import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    public static int sum(int max) {
        List<Long> list = new ArrayList<Long>();
        int sum = 0;
        list.add(1L);
        list.add(2L);

        while (list.get(list.size() - 1) + list.get(list.size() - 2) < max) {
            list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                sum += list.get(i);
            }
        }

        return sum;
    }
}
