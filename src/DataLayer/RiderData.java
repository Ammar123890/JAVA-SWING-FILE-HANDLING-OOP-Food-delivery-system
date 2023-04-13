/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataLayer;

import BusinessLayer.Rider;
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
public class RiderData {
    public static ArrayList<Rider> riderArr=new ArrayList<Rider>();
    public static void read()
    { 
         
        try
        {
            FileInputStream file=new FileInputStream("RIDER_DATA.dat");
            ObjectInputStream  InputFile= new ObjectInputStream(file);
            boolean end=false;
            while(!end)
            {
                
               try
               {
                   
               
                   riderArr.add ((Rider)InputFile.readObject()); 
               
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
    
      
      public static void write()
      {
          try
          {
              FileOutputStream file=new FileOutputStream("RIDER_DATA.dat");
              ObjectOutputStream outFile=new ObjectOutputStream(file);
              for(int i=0;i< riderArr.size();i++)
              {
                  outFile.writeObject( riderArr.get(i));
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
          File riders=new File("RIDER_DATA.dat");
           if(riders.length()==0)
               return true;
           return false; 
        
      }
    
}
