/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ife;

import javax.swing.JOptionPane;

/**
 *
 * @author comp
 */
public class IFE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    double opcion = Integer.parseInt(JOptionPane.showInputDialog("Que decea hacer? \n 1. Votar \n 2.Terminar Conteo"));
    String data = " Nombre \t Federal \t Municipal\n";
    int pri=0,prd=0,pan=0,ve=0,tot=0;
    int pri2=0,prd2=0,pan2=0,ve2=0,tot2=0;
    while (opcion!=2)
    {
    if (opcion !=1)
    {
    JOptionPane.showMessageDialog(null, "Ah ingresado un un numero de opcion incorrecto solo use 1 oh 2, sin puntos ni chistosadas. \n Si no entiende regrese ala escuela no deviera de estar votando \n gracias por su comprecion");

    }
    if (opcion==1)
    {
    
        String nombre=JOptionPane.showInputDialog("Su Nombre?");
        data = data + nombre;
        
        int voto = Integer.parseInt(JOptionPane.showInputDialog("Por quien desea votar para PRESIDENTE FEDERAL?"
                + "\n1)PAN \n2)PRI \n3)PRD \n4)VE"));
        
        JOptionPane.showMessageDialog(null, "Gracias por Votar!" + nombre);
        
           
        switch (voto)
        {
            case 1:
                data = data + "\t PRD";
                pan++;
                break;
            case 2:
                data = data + "\t PRI";
                pri++;
                break;
            case 3:
                data = data + "\t PRD";
                prd++;
                break;
            case 4:
                data = data + "\t VE";
                ve++;
                break;
        
        }
        
        tot++;
        
       
        int voto2 = Integer.parseInt(JOptionPane.showInputDialog("Por quien desea votar para PRESIDENTE Municipal?"
                + "\n1)PAN \n2)PRI \n3)PRD \n4)VE"));
        
       
           
        switch (voto2)
        {
            case 1:
                data = data + " \t PRD";
                pan2++;
                break;
            case 2:
                data = data + " \t PRI";
                pri2++;
                break;
            case 3:
                data = data + "\t PRD";
                prd2++;
                break;
            case 4:
                data = data + " \t VE";
                ve2++;
                break;
        
        }
        
        tot2++;
        
        
    data = data + "\n";
    }
    
    opcion = Integer.parseInt(JOptionPane.showInputDialog("Que decea hacer? \n 1. Votar \n 2.Terminar Conteo"));
    
    
    
    
    
    }
     
    String extradata = "VOTOS"
            + "\n Federal PAN: " + pan + " PRI: " + pri + " PRD: " + prd + "PV: " + ve + "Total" + tot;
    
    String extradata2 = "\n"
            + "\n Municipal PAN: " + pan2 + " PRI: " + pri2 + " PRD: " + prd2 + "PV: " + ve2 + "Total" + tot2;
    
            
    data = data + extradata + extradata2 ;
    JOptionPane.showMessageDialog(null, data);
            
    }        
    }
