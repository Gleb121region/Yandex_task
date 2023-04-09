import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String params = in.nextLine();
        int n = Integer.parseInt(params.split(" ")[0]);
        int m = Integer.parseInt(params.split(" ")[1]);
        String[] bokal = new String[n];
        for (int i = 0; i < n; i++) {
            bokal[i] = in.nextLine();
        }
        int k = Integer.parseInt(in.nextLine()); // количество ингредиентов
        for (int i = 0; i < k; i++) {
            String ingredients = in.nextLine();
            int sliceCount = Integer.parseInt(ingredients.split(" ")[1]);
            char symbol = ingredients.split(" ")[2].charAt(0);
            for (int j = 0; j < sliceCount; j++) {
                int index = n - 2;
                bokal[index] = bokal[index].replace(" ", String.valueOf(symbol));
                n--;
            }
        }
        Arrays.stream(bokal).forEach(System.out::println);
    }
}