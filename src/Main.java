import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean cond = true;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (cond) {
            System.out.print("Введите дробное число: ");
            String entNumber = in.readLine();
            try {
                float number = Float.parseFloat(entNumber);
                System.out.printf("Введенное число равно %.1f\n", number);
                cond = false;
            } catch (Exception e) {
                System.out.printf("Неверный ввод. Введите дробное число!!!");
                System.out.println();

            }
        }
    }
}
