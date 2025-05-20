package Comparator;

import Comparator.entities.Product;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 2900.0));
        list.add(new Product("Computador", 5500.0));
        list.add(new Product("Mouse", 250.0));

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName()));

        for(Product po: list){
            System.out.println(po);
        }
    }
}
