package Comparator.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Consumer {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product2> list = new ArrayList<>();
        list.add(new Product2("TV", 2900.0));
        list.add(new Product2("Computador", 5500.0));
        list.add(new Product2("Mouse", 250.0));

        double aumentoPreco = 1.1;

        list.forEach(prod -> prod.setPrice(prod.getPrice() * aumentoPreco));
        list.forEach(System.out::println);
    }
}
