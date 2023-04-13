/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataLayer;



import BusinessLayer.restaurant;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author syeda
 */
public class RestuarantData {
    
    private static ArrayList<restaurant> rest=new ArrayList<>();
    public static ArrayList<restaurant> getRest() {
        return rest;
    }
    public static void setRest(ArrayList<restaurant> rest) {
        RestuarantData.rest = rest;
    }
           
           public static void read_R()
    { 
         
        try
        {
            FileInputStream file=new FileInputStream("RESTAURANT__DATA.dat");
            ObjectInputStream  InputFile= new ObjectInputStream(file);
            boolean end=false;
            while(!end)
            {
                
               try
               {
                   rest.add ((restaurant)InputFile.readObject());  
               }
               catch(EOFException e)
               {
                 end=true;  
               }
               catch(Exception f)
               {
                    JOptionPane.showMessageDialog(null, f.getMessage());
               }
            }
            InputFile.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
      
      public static void write_R()
      {
          try
          {
              FileOutputStream file=new FileOutputStream("RESTAURANT__DATA.dat");
              ObjectOutputStream outFile=new ObjectOutputStream(file);
              for(int i=0;i< rest.size();i++)
              {
                  outFile.writeObject( rest.get(i));
              }
              outFile.close();
              
              
          }
          catch(IOException e)
          {
              JOptionPane.showMessageDialog(null,e.getMessage());
          }
         
          
      }
      
      public boolean ActiveCustomers()
      {
          File customers=new File("RESTAURANT__DATA.dat");
           if(customers.length()==0)
               return true;
           return false; 
        
      }
    
}
