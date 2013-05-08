/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examenarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author comp
 */
public class ExamenArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ArrayList califica = new ArrayList(5);
        
       
        
     /**   for(int i=0;i<4;i++)
        {
        califica.add(Integer.parseInt(JOptionPane.showInputDialog("calificacion " + i )));
        
        
        }
        */
        
        califica.add(10);
        califica.add(100);
        califica.add(50);
        califica.add(100);
        califica.add(100);
        
        
        Iterator<Integer> iter = califica.iterator();
int pass=0,rep=0;
        while (iter.hasNext())
{
 
    if(iter.next()<70)
{
pass++;
}
    else{
    
    rep++;
    }
}       
        JOptionPane.showMessageDialog(null, "Pasaron: " + pass + " Reprovaron: " + rep);

//Ahora agreguemos 10000 elementos al vector
}
}
    

