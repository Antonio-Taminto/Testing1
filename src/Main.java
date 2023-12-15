import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ArrayList<Integer> numeri = new ArrayList<>();
        numeri.add(10);
        numeri.add(10);
        numeri.add(10);

        System.out.println(calculator.sum(numeri));
        System.out.println(calculator.sub(numeri));
        System.out.println(calculator.molt(numeri));
        System.out.println(calculator.div(numeri));
    }
}