package Comparator.entities;

import java.util.Set;

public class Prod {
    private String name;
    private Integer qtd;
    private Double price;
    private Set<String> categorias;


    public Prod(String name, Integer qtd, Double price) {
        this.name = name;
        this.qtd = qtd;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double getPrice() {
        return price;
    }

    public double valorTotalEmEstoque() {
        return getQtd() * getPrice();
    }

    public void adicionarCategoria(String categoria) {
        categorias.add(categoria);
    }

    public void removerCategoria(String categoria) {
        categorias.remove(categoria);
    }
}
