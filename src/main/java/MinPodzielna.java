import java.util.Arrays;

public class MinPodzielna {


    public static int check(int max){
        int[] tab = new int[max];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;

        }
        int number = 1;
        int i = 0;
        do {
            if (number % tab[i] != 0) {//nie jest podzielne
                number++;
                i = 0;
            } else {
                i++;
            }

        } while (i < tab.length);
        return number;
    }




    }


