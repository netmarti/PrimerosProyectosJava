/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examenextra;

import javax.swing.JOptionPane;

/**
 *
 * @author comp
 */
public class ExamenExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor=1;
        
        int tb=0, tc=0;
        double tt=0;
        int bp,cp;
        int bana [][]= new int[5][2]; 
        
        
        cp=Integer.parseInt(JOptionPane.showInputDialog("Precio por Camiseta?"));
        bp=Integer.parseInt(JOptionPane.showInputDialog("Precio por Valon?"));
        
        
        for (int i=0;i<bana.length;i++)
        {
        for (int x=0;x<bana[i].length;x++)
        {
        bana[i][x]=0;
        }
        }
        
        
        
        while (valor==1)
        {
            
        valor=Integer.parseInt(JOptionPane.showInputDialog("Que decea Hacer? \n 1. Introducir Valores \n 2. Terminar"));
        
        if (valor==1)
        {
           int dia;
        dia=Integer.parseInt(JOptionPane.showInputDialog("en que dia de la semana desea depositar? \n 1. Lunes \n 2. Viernes (ect)"));
        int cant;
       
                cant = Integer.parseInt(JOptionPane.showInputDialog("cuantos depositos tiene?"));
                
                for (int y=0;y<cant;y++)
                {
                double nv = Double.parseDouble(JOptionPane.showInputDialog("Cuanto se deposito en el deposito" + y));
                
                tt=tt+nv;
                if (nv>10000)
                {
                bana[(dia-1)][0]=bana[(dia-1)][0]+1;
                }
                
                if (nv>5000 && nv < 9999)
                {
                    bana[(dia-1)][1]=bana[(dia-1)][1]+1;
                
                }
                
                }
                
                
                
        
        
        
        }
        
        
        }
        
         String data="Camisetas \t balones \n";  
      
      for (int i=0;i<bana.length;i++)
        {
        
        for (int x=0;x<bana[i].length;x++)
        {
        data = data + bana[i][x]+ " \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t";
        }
        
        data = data + " \n";
        
        
        }
      
      for (int i=0;i<bana.length;i++)
        {
        tc=tc+bana[i][0];
        }
      for (int i=0;i<bana.length;i++)
        {
        tb=tb+bana[i][1];
        }
      
      
      double ttp = tc * cp;
      ttp = ttp + (tb*bp);
      double total = tt-ttp;
      
      JOptionPane.showMessageDialog(null, data);
      
      JOptionPane.showMessageDialog(null, "se otorgaron un total de: " + tc + " camisetas y " +tb + " balones.");
      JOptionPane.showMessageDialog(null, "Se deposito un total de:" + tt + " \n Se gasto un total de:"+ ttp + " en valones y camistas"
              + "y uvo un total de " + total + " en ganancias.");
      
      
      JOptionPane.showMessageDialog(null, "Gracias por usar mi servicio att: Daniel Lozano \n Examen de Progra.. \n espero puntos extras por esto :)!");  
        
    }
}
