public class Euler {

    public static int sum(int max) {
        int sum = 0;
        int i = 1;
        while (i < max) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }

            i++;
        }

        return sum;
    }
}
