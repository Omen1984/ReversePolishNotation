import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        Deque<String> sign = new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическую формулу");

        String input = scanner.nextLine();

        String[] arrayValues = input.split(" ");

        for (int i = 0; i < arrayValues.length; i++) {
            String value = arrayValues[i];
            if (checkingForNumber(value)) {
                numbers.offer(Integer.parseInt(value));
            } else {
                sign.push(value);
            }
        }

        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }

        while (!sign.isEmpty()) {
            System.out.println(sign.pop() + " ");
        }
        
    }

    private static boolean checkingForNumber (String value) {
        Number number;
        try {
            number = Integer.parseInt(value);
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
