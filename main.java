/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seminario15;
import java.util.*;
/**
 *
 * @author Alumno del CECyTEM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int op;
       Scanner leer=new Scanner(System.in);
        System.out.println("Selecciona una opcion");
       System.out.println("1.-Vector");
       System.out.println("2.- Matriz");
       op=leer.nextInt();
       switch (op)
       {
           case 1:
               int i,j,num;
               int vector[]=new int[15];
               
               System.out.println("LLenar el vector");
               for (i=0;i<15;i++)
               {
               System.out.println("Dame numero");
               num=leer.nextInt();
               vector[i]=num;
               }
               
               
               System.out.println("Mostrar el vector");
               for(i=0;i<15;i++)
               
                   System.out.print(" "+vector[i]);
                   
                   
               
              
                System.out.println("Mostrar el vector INVERSO");
               for (j=14;j>=0;j--)
                     
                    System.out.print(" "+vector[j]);
               
             
               
               
               break;
               
           case 2:
                
        
               int [][] m1=new int [3][2];
               int [][] m2=new int [2][3];
               int nume=1,o=0,p=0;
        for(o=0; o<3;o++)
        
        for (p=0;p<2;p++)
        {
         System.out.println("Dame un numero");
         nume=leer.nextInt();
            m1[o][p]=nume;
            nume++;
        }
       for(o=0;o<3;o++)
             {
         for(p=0;p<2;p++)
         {
         
         System.out.print(" "+m1[o][p]);
         
          
         }
         System.out.println();
    }//for impresion num
               
               for(p=0;p<2;p++)
               {
               for(o=0;o<3;o++)
               {
               m2[p][o]=m1[o][p];
               System.out.print(" "+m2[p][o]);
               
               }
               }
                          
               
          
               
               
               
               
       }//fin del swtich
       
       }//main
       
    }//class}

