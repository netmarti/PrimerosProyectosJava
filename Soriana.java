/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soriana;

import javax.swing.JOptionPane;

/**
 *
 * @author comp
 */
public class Soriana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       double ventas [][] = new double [5][3];
               double cantidad = 0;
        
        for (int i = 0; i<=4 ; i++)    
        {
        
            
            for (int x =0 ; x<=2 ; x++)
            {
            
              ventas[i][x] =Double.parseDouble(JOptionPane.showInputDialog("Ventas del dia " + (i+1) + " en la categoria " + (x+1)));  
              
             
              cantidad=cantidad+ventas[i][x];
              
              
              
            }
        
        }
        String data = "";
        
        for (int i = 0; i<=4 ; i++)    
        {
        
            
            for (int x =0 ; x<=2 ; x++)
            {
            
                data = data + ventas [i][x] + " ";
              
            }
            data = data + "\n" ;
        
        }
        double igual = cantidad * .20;
        
        data = data + " Gananzias" +  igual;
        
        JOptionPane.showMessageDialog(null, data); 
    }
}
