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
public class RestaurantDirectory {
    private List<Restaurant> restaurantList;
    
    public RestaurantDirectory()
    {
        restaurantList=new ArrayList<Restaurant>();
    }
    
    public Restaurant searchRestaurantByAdmin(String adminName)
    {
        for(Restaurant r:this.restaurantList)
        {
            if(r.getRestaurantAdmins().contains(adminName))
                return r;
        }
        return null;
    }
    public Restaurant searchRestaurantByName(String name)
    {
        for(Restaurant r:this.restaurantList)
        {
            if(r.getRestaurantName().equals(name))
                return r;
        }
        return null;
    }
    public void addRestaurant(Restaurant res)
    {
        this.restaurantList.add(res);
    }
    
    public void removeRestaurant(Restaurant res)
    {
        this.restaurantList.remove(res);
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }
}
