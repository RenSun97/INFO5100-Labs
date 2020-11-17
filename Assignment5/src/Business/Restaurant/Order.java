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
 * @author wang
 */
public class Order {
    private String cusName;
    private String resName;
    private List<OrderItem> items=new ArrayList<OrderItem>();
    private String status="initial";
    private String deliveryManName="";
    private String comment="";
    public Order(String cusName,String resName)
    {
        this.cusName=cusName;
        this.resName=resName;
    }

    public String getCusName() {
        return cusName;
    }
    
    public void addOrderItem(OrderItem i)
    {
        for(OrderItem o:items)
        {
            if(o.getDishAndPrice().getDishName().equals(i.getDishAndPrice().getDishName()))
            {
                o.setNum(o.getNum()+1);
                return;
            }
        }
        this.items.add(i);
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
    
    public double totalPrice()
    {
        double total=0;
        for(OrderItem i:items)
        {
            total+=(i.getDishAndPrice().getPrice()*i.getNum());
        }
        return total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString()
    {
        return this.resName;
    }

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
