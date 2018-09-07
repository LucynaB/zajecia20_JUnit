public class Main {
    public static void main(String[] args) {

        int eulerSum = Euler.sum(1000);
        System.out.println("Euler: " + eulerSum);


        int fibonacciSum = Fibonacci.sum(4000000);
        System.out.println("Fibonacci: " + fibonacciSum);


        int result = MinPodzielna.check(20);
        System.out.println("Min. podzielna: " + result);
    }
}
