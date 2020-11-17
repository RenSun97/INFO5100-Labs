/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author Alex Zhu
 */
public class OrderItem {
    private MenuItem dishAndPrice;
    private int num;
    
    public OrderItem()
    {
        
    }

    public OrderItem(MenuItem dishAndPrice, int num) {
        this.dishAndPrice = dishAndPrice;
        this.num = num;
    }

    public MenuItem getDishAndPrice() {
        return dishAndPrice;
    }

    public void setDishAndPrice(MenuItem dishAndPrice) {
        this.dishAndPrice = dishAndPrice;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    @Override
    public String toString()
    {
        return this.dishAndPrice.getDishName();
    }
}
