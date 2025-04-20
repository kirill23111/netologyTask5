import java.util.Arrays;
import java.util.Scanner;

public class ArrTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};

        int[] cart = new int[products.length];

        System.out.println("Список возможных товаров для покупки:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб/шт");
        }

        int sumProducts = 0;

        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            }
            String[] parts = input.split(" ");

            int productNumber = Integer.parseInt(parts[0]) - 1; // -1, потому что индексация с 0
            int productCount = Integer.parseInt(parts[1]);

            cart[productNumber] += productCount;


        }

        System.out.println("Ваша корзина:");
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] > 0) {
                int productSum = cart[i] * prices[i];
                sumProducts += productSum;
                System.out.println(products[i] + " " + cart[i] + " шт " + prices[i] + " руб/шт " + productSum + " руб в сумме");
            }
        }
        System.out.println("Итого " + sumProducts + " руб");
    }
}
