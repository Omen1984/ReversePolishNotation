import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        Deque<String> sign = new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическую формулу");

        String input = scanner.nextLine();

        String[] arrayValues = input.split(" ");
    }

    private static boolean checkingForNumber (String value) {
        Number number;

        try {
            number = Double.parseDouble(value);
        } catch (NullPointerException e) {
            return false;
        }

        return true;
    }
}
