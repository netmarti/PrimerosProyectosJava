/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telcel;

import javax.swing.JOptionPane;

/**
 *
 * @author comp
 */
public class Telcel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          
       double ventas [][] = new double [4][3];
               int cantidad = 0;
        
        for (int i = 0; i<=3 ; i++)    
        {
        
            
            for (int x =0 ; x<=2 ; x++)
            {
            
              ventas[i][x] =Double.parseDouble(JOptionPane.showInputDialog("Ventas de la Socursal " + (i+1) + " el dia " + (x+1)));  
              
              if (ventas [i][x]>=700)
              {
              cantidad=cantidad+1;
              
              }
              
            }
        
        }
        String data = "";
        
        for (int i = 0; i<=3 ; i++)    
        {
        
            
            for (int x =0 ; x<=2 ; x++)
            {
            
                data = data + ventas [i][x] + " ";
              
            }
            data = data + "\n" ;
        
        }
        double igual = cantidad * .20;
        
        data = data + " planes vendidos a mas de 700 " +  cantidad;
        
        JOptionPane.showMessageDialog(null, data); 
        
    }
}
