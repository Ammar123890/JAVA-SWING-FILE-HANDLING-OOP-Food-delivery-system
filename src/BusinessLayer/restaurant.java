/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLayer;
/**
 *
 * @author syeda
 */
import DataLayer.RestuarantData;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author syeda
 */
public class restaurant extends USER implements Serializable {
    private String address;
    private String restaurant_name;
    private boolean status=false;
    public ArrayList<Items> Item;
    public ArrayList<Customer> cust;
    

    public restaurant(String address, String rest_Name, String username, String password, String phoneNumber, String email) {
        super(username, password, phoneNumber, email);
        this.address = address;
        this.restaurant_name = rest_Name;
        Item= new ArrayList<>();
        cust=new ArrayList<Customer>();
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public String getEmail() {
        return email;
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }
    
    //////////////////////////////////////////
    ////////Connecting to Data Layer /////////
    //////////////////////////////////////////
        
       public static void read_R()
        {
            RestuarantData obj=new RestuarantData();
            obj.read_R();
        }
        public static void write_R()
        {
            RestuarantData obj=new RestuarantData();
            obj.write_R();
        }
         public boolean ActiveCustomers()
      {
          RestuarantData obj=new RestuarantData();
          return obj.ActiveCustomers();
        
      }
    
         public ArrayList<restaurant> getData()
      {
          return RestuarantData.getRest();
      }
         
         
    //////////////////////////////////////////
    ////////////Functionalities///////////////
    /////////////////////////////////////////
    
    public int TotalRestaurants()
    {
        return RestuarantData.getRest().size();
    }
    
    
 
        public restaurant () {
   
    }
        
    
        public String[] restaurantsNames()
        {
              ArrayList<restaurant> rest=getData();
              String[] restuarantArray=new String[rest.size()];
              for(int i=0;i<rest.size();i++)
                {
                    restuarantArray[i]= rest.get(i).getRestaurant_name();
                  
                }
              return restuarantArray;
        }
        public String[] restaurantItem(String specificRestaurant)
        {
              ArrayList<restaurant> rest=getData();
              for(restaurant Restaurants:rest)
                {
                    if(Restaurants.getRestaurant_name().equals(specificRestaurant))
            {
           
                String[] itemArray=new String[Restaurants.Item.size()];
                for(int i=0;i<Restaurants.Item.size();i++)
                
                     itemArray[i]= Restaurants.Item.get(i).getName()+" of RS "+Restaurants.Item.get(i).getPrize();

                return itemArray;
            }
            }
              return null;
              
        }
        
        
        public boolean checkItemExistance(String Restaurant,String ItemName)
        {
            for(restaurant a:getData())
            {
                if(a.getEmail().endsWith(Restaurant))
                {
                    for(int i=0;i<a.Item.size();i++)
                    {
                        if(a.Item.get(i).getName().equals(ItemName))
                        {
                            
                            return true;
                        }
                    } 
                    break;
                }
            }
            return false;
        }
        public void addItem(String item, String restaurant,String price)
        {
            Items it =new Items(item,price);
            for(restaurant a:getData())
            {
                if(a.getEmail().equals(restaurant))
                {
                    a.Item.add(it);
                    write_R();
                    break;
                    
                }
            }
        }
        
     
      
      public boolean verification(String id, String pass)
      {
        for(restaurant b:getData())
           {
               if(b.getEmail().equals(id) && 
                       b.getPassword().equals(pass)&&b.isStatus()==true) 
               {
                   return true;       
               }               
           }
        return false;
          
      }
      
      public boolean checkRegisteration(String id)
      {
         for(restaurant b:getData())
           {
               if(b.getEmail().equals(id))     
                   return true;    
      }
                  return false;
      }
      
       public boolean verification(String id)
      {
        for(restaurant b:getData())
           {
               if(b.getEmail().equals(id) && 
                    b.isStatus()==true) 
               {
                   return true;       
               }               
           }
        return false;
          
      }
      

      public boolean CheckAvailability(String id, String pass)
      {
                  for(restaurant b:getData())
           {
               if(b.getEmail().equals(id) && 
                       b.getPassword().equals(pass))     
                   return true;    
      }
                  return false;
          
      }
        
      public void deleteItem(String restaurant, int item)
      {
        for(restaurant r:getData())
        {
            if(r.getEmail().equals(restaurant))
            {
                     r.Item.remove(item);
                     write_R();
                     break;
            }
        }
          
      }
      
      public void updateItem(String restaurant, int item, String price)
      {
       for(restaurant r:getData())
          
        {
            if(r.getEmail().equals(restaurant))
            {
                     r.Item.get(item).setPrize(price);
                     write_R();
                     break;
            }
        }
      }
        
        


        

             
}

