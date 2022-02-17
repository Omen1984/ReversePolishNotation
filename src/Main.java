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

        StringBuilder divisionAndMultiplication = new StringBuilder();
        StringBuilder additionAndSubtraction = new StringBuilder();

        while (!sign.isEmpty()) {
            if (sign.peek().equals("/") || sign.peek().equals("*")){
                divisionAndMultiplication.append(sign.pop() + " ");
            } else {
                additionAndSubtraction.append(sign.pop() + " ");
            }
        }

        System.out.print(divisionAndMultiplication.toString());
        System.out.print(additionAndSubtraction.toString());

    }

    private static boolean checkingForNumber(String value) {
        try {
            int number = Integer.parseInt(value);
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }
}
