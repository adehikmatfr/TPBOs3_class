/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoelektronikade;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class ProductBrand {

    private final Integer id;
    private String name;
    private String type;

    public ProductBrand() {
        this.id = new Random().nextInt(100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getID() {
        return this.id;
    }
}
