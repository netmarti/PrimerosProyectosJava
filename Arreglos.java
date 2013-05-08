/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author comp
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       double ventas [][] = new double [3][5];
               double cantidad =0;
        
        for (int i = 0; i<=2 ; i++)    
        {
        
            
            for (int x =0 ; x<=4 ; x++)
            {
            
              ventas[i][x] =Double.parseDouble(JOptionPane.showInputDialog("Ventas de la categoria " + (i+1) + " el dia " + (x+1)));  
              cantidad = cantidad + ventas [i] [x];
              
            }
        
        }
        String data = "";
        
        for (int i = 0; i<=2 ; i++)    
        {
        
            
            for (int x =0 ; x<=4 ; x++)
            {
            
                data = data + ventas [i][x] + " ";
              
            }
            data = data + "\n" ;
        
        }
        double igual = cantidad * .20;
        
        data = data + " Ganancias igual a " +  igual;
        
        JOptionPane.showMessageDialog(null, data); 
        
        
        
       
        
    }
}
