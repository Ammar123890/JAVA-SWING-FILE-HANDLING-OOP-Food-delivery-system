/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLayer;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author syed anoush
 */
public class Orders  implements Serializable {
    
    private String restaurant;
    private int quantity;
    private String Item;
    private int price;
    private static boolean flag= true;// to check applicable for order
    private String status="cooking";
    private static boolean isPickedUp=false;
    private static boolean cancel=true;

    public static boolean isCancel() {
        return cancel;
    }

    public static void setCancel(boolean cancel) {
        Orders.cancel = cancel;
    }
    

    public boolean isIsPickedUp() {
        return isPickedUp;
    }

    public void setIsPickedUp(boolean isPickedUp) {
        this.isPickedUp = isPickedUp;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Orders(String restaurant, int quantity, String Item, int price) {
        this.restaurant = restaurant;
        this.quantity = quantity;
        this.Item = Item;
        this.price = price;
    }

    public Orders() {
        //To change body of generated methods, choose Tools | Templates.
    }

   

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItem() {
        return Item;
    }
    static ArrayList<Orders>orders=new ArrayList<>();

    public void setItem(String Item) {
        this.Item = Item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    //////////////////////////////////////////
    ////////////Functionalities///////////////
    //////////////////////////////////////////
    
    
    public ArrayList<Customer> isPickedUp()
    {
        ArrayList<Customer> unpicked=new ArrayList();
        for(Customer cust:Customer.getData())
            for(int i=0;i<cust.orders.size();i++)         
                if(cust.obj.isIsPickedUp()==false)
                    unpicked.add(cust);
        return unpicked; 
    }
        
    
    
    
    
    public static Orders newOrder(String restaurant, String quantity, String Item, String price)
    {
        Orders obj=new Orders(restaurant,Integer.parseInt(quantity),Item,Integer.parseInt(price));
        return obj;
       
    }
}
