package app;

import java.util.Scanner;

public class ProductInfo {
    static String name;
    static double weight;
    static int quantity;
    static Product product;
    static double totalWeight;
    static String totalWeightRounded;
    static private final String MEASURE = "кг";


    public static void main(String[] args) {
        doInputs();
    }
    static private void doInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Наименование товара: ");
        name = scanner.nextLine();
        System.out.print("Вес товара" + " (" + MEASURE + "): ");
        weight = scanner.nextDouble();
        System.out.print("Количество товара (шт.): ");
        quantity = scanner.nextInt();
        scanner.close();
    }
}
