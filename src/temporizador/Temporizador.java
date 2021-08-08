/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador;

import javax.swing.*;
import java.util.*;
/**
 *
 * @author pipea
 */
public class Temporizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
      JOptionPane.showMessageDialog(null,"Programa Temporizador");  
        
      String[] tempo = {"Ascendiente","Descendiente"};
      
      String opera = (String)JOptionPane.showInputDialog(null,"Seleccione una opcion","Elegir", JOptionPane.QUESTION_MESSAGE,null,tempo,tempo[0]);
    
      switch(opera){
          case "Ascendiente":
              int x;
             
              x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor inicial de la hora"));
              
              if (x<0 || x>24){
              JOptionPane.showMessageDialog(null,"Numero fuera de rango");
              
              }else{
              int x1;
              
              x1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor final de la hora"));
               if (x1<0 || x1>24){
              JOptionPane.showMessageDialog(null,"Numero fuera de rango");
              
              }else{
               if (x>x1){
               JOptionPane.showMessageDialog(null,"EL VALOR INICIAL DE LA HORA NO PUEDE SER MAYOR QUE EL VALOR FINAL");
               
               }else{
               int y;
               y = Integer.parseInt(JOptionPane.showInputDialog("Digite valor inicial de los minutos"));
               if(y<0 || y>60){
               
               JOptionPane.showMessageDialog(null,"Numero fuera de rango");
               }else{
               int y1;
               y1 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor final de los minutos"));
               
               if (y1<0 || y1>60){
               JOptionPane.showMessageDialog(null,"Numero fuera de rango");
               
               }else{
               if (y>y1){
               JOptionPane.showMessageDialog(null,"EL VALOR INICIAL DE MINUTOS NO PUEDE SER MAYOR QUE EL VALOR FINAL");
               }else{
              int z;
               z = Integer.parseInt(JOptionPane.showInputDialog("Digite valor inicial de los segundos"));
              if (z<0 || z>60){
              JOptionPane.showMessageDialog(null,"Numero fuera de rango");
              
              }else{
              int z1;
              z1 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor final de los segundos"));
              if (z1<0 || z1>60){
              JOptionPane.showMessageDialog(null,"Numero fuera de rango");
              
              }else{
                  
              if (z>z1){
              JOptionPane.showMessageDialog(null,"EL VALOR INICIAL DE LOS SEGUNDOS NO PUEDE SER MAYOR QUE EL VALOR FINAL");
              
              }else{
 
              //aqui sigue el cilo for 
              for (int hora = x;hora<=x1;hora++){
              for (int minuto = y;minuto<=y1;minuto++){
              for (int seg = z;seg<=z1;seg++){
              System.out.println("\n");
             System.out.print(" hora "+hora+" minutos "+minuto+" segundos "+seg);
             milisegundos();
              
              }
              
              
              
              }
              
              
              }
              
              }
              
              
              }
              
              
              }
               
               }
               
               }
               }
               
               }
               
               
               }
              }
              
              break;
              
          case "Descendiente":
              
              
              
              
              break;
    
    
    
    
    
    }
    
    
    
    
    
    
    
    }
    private static void milisegundos(){
    
    try{
    
    Thread.sleep(1000);
    
    
    }catch(InterruptedException e){}
    
    
    
    
    }
}
