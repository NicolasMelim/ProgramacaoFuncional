package Comparator.entities;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Predicate {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product2> list = new ArrayList<>();
        list.add(new Product2("TV", 2900.0));
        list.add(new Product2("Computador", 5500.0));
        list.add(new Product2("Mouse", 250.0));

        double min = 250.0;

        list.removeIf(prod -> prod.getPrice() <= min);

            for (Product2 p : list) {
                System.out.println(p);
            }
        }
    }
