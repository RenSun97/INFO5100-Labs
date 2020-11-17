/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author wang
 */
public class MenuItem {
     private String dishName;
    private double price;
    private double discount;
    
    public MenuItem()
    {
        
    }
    public MenuItem(String name,double price)
    {
        this.dishName=name;
        this.price=price;
    }
    public MenuItem(String name,double price,double discount)
    {
        this.dishName=name;
        this.price=price;
        this.discount=discount;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    @Override
    public String toString()
    {
        return this.dishName;
    }
}
