/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoelektronikade;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.text.DecimalFormat;

/**
 *
 * @author Administrator
 */
public class Shop {

    private final Integer id;
    private String name;
    private final List<Product> products;

    public Shop() {
        this.id = new Random().nextInt(100);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void displayProducts() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        System.out.println("List of Products:");
        for (Product product : products) {
            System.out.println("Category: " + product.getCategory().getName());
            System.out.println("Brand: " + product.getBrand().getName());
            System.out.println("Brand Type: " + product.getBrand().getType());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + decimalFormat.format(product.getPrice()));
            System.out.println("------------------------");
        }
    }
}
