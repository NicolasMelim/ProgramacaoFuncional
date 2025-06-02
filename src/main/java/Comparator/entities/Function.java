package Comparator.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Function {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product2> list = new ArrayList<>();
        list.add(new Product2("TV", 2900.0));
        list.add(new Product2("Computador", 5500.0));
        list.add(new Product2("Mouse", 250.0));

        List<String> names = list.stream().map(prod -> prod.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}
