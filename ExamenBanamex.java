/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examenbanamex;

import javax.swing.JOptionPane;

/**
 *
 * @author comp
 */
public class ExamenBanamex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        int bana [][]= new int[2][5]; 
        
        for (int i=0;i<bana.length;i++)
        {
        
        for (int x=0;x<bana[i].length;x++)
        {
        bana[i][x]=Integer.parseInt(JOptionPane.showInputDialog("nota depositos de mas de 10,000 obtienen camiseta y mas de 5 pero menos de 9,999 obtienen balon \n"+" Objetos " + i +" repartidos en el dia " + x));
        
        }
        
        }
        
      String data="";  
      
      for (int i=0;i<bana.length;i++)
        {
        
        for (int x=0;x<bana[i].length;x++)
        {
        data = data + bana[i][x]+ "  ";
        }
        
        data = data + " \n";
        
        
        }
        
      JOptionPane.showMessageDialog(null, data);
        
        
    }
}
