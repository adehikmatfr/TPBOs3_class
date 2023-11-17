/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokoelektronikade;

/**
 *
 * @author Administrator
 */
public class TokoElektronikAde {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shop shop = new Shop();
        shop.setName("Toko Elektronik Ade Hikmat");

        ProductCategory category = new ProductCategory();
        category.setName("Elektonik HP");

        for (int i = 0; i < 10; i++) {
            ProductBrand brand = new ProductBrand();
            brand.setName("Samsung");
            brand.setType("S10 Pro " + i);

            Product product = new Product();
            product.setCategory(category);
            product.setBrand(brand);
            product.setName("HP Murah Meriah merek samsung di jamin terpercaya " + i);
            float price = ((1000000 / 100) * i) + 1000000;
            product.setPrice(price);

            shop.addProduct(product);
        }

        System.out.println("Name shop " + shop.getName());
        shop.displayProducts();
    }

}
