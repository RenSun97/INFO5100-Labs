/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String restaurantName;
    private String restaurantInfo;
    private List<String> restaurantAdmins=new ArrayList<String>();
    private List<MenuItem> menus=new ArrayList<MenuItem>();
    private List<Order> orders=new ArrayList<Order>();

    public Restaurant()
    {
        
    }
    public Restaurant(String restaurantName,String adminName)
    {
        this.restaurantName=restaurantName;
        this.restaurantAdmins.add(adminName);
    }
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantInfo() {
        return restaurantInfo;
    }

    public void setRestaurantInfo(String restaurantInfo) {
        this.restaurantInfo = restaurantInfo;
    }

    public List<String> getRestaurantAdmins() {
        return restaurantAdmins;
    }
    
    
    public boolean addRestaurantAdmin(String adminName)
    {
        if(!this.restaurantAdmins.contains(adminName))
        {
            this.restaurantAdmins.add(adminName);
            return true;
        }
        else
            return false;
    }
    
    public boolean removeRestaurantAdmin(String adminName)
    {
        if(!this.restaurantAdmins.contains(adminName))
        {
            this.restaurantAdmins.remove(adminName);
            return true;
        }
        else
            return false;
    }
    
    public boolean addMenu(String dish,double price)
    {
        for(MenuItem m:this.menus)
        {
            if(m.getDishName().equals(dish))
                return false;
        }
        this.menus.add(new MenuItem(dish,price));
        return true;
    }
    
    public boolean updateMenu(String oldDish,String dish,double price)
    {
        for(MenuItem m:this.menus)
        {
            if(m.getDishName().equals(oldDish))
            {
                m.setDishName(dish);
                m.setPrice(price);
                return true;
            }     
        }
        return false;
    }

    public List<MenuItem> getMenus() {
        return menus;
    }

    public List<Order> getOrders() {
        return orders;
    }
    
    public Order searchOrderByCusName(String custname)
    {
        for(Order i:this.orders)
        {
            if(i.getCusName().equals(custname))
                return i;
        }
        return null;
    }
    
    public void addOrder(Order newOrder)
    {
        this.orders.add(newOrder);
    }
    
    @Override
    public String toString()
    {
        return this.restaurantName;
    }
}
