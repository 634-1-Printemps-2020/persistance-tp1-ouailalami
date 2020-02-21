package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) throws CounterException {
        System.out.println("Hello World!");
        UpperLimitedPositiveCounter u = new UpperLimitedPositiveCounter(0, 3);
        System.out.println(u);

        u.inc();
        System.out.println(u);

        u.add(2);
        System.out.println(u);

        u.inc();
        System.out.println(u);

    }
}
