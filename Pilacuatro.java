/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilacuatro;

import java.util.Scanner;

/**
 *
 * @author sale7
 */
public class Pilacuatro {
   
       char pilabc[] = new char [26];
    int tope = 0;
    public  void Llenar (){
        char letras ='A';
         for (int i=0; i<26; i++){
             if(tope < 26){  
               char rnd=(char)(letras + Math.random()*25);
                  pilabc[tope]=rnd;
               tope++;       
             }
         }
     }
    public void Mostrar(){
        for(int i= tope -1; i >= 0; i--){
            System.out.print(" "+pilabc[i]);        
        }
    }
    public void Eliminar() {
    tope--;
    System.out.println("Se elimino el dato");
    }

    public void Ordenar(){
        int aux;
        for(int i=0; i<26; i++){
            for(int j=0; j<i; j++){
                if(pilabc[i]<pilabc[j]);
                aux=pilabc[i];
                pilabc[i]=pilabc[j];
                pilabc[j]=(char)aux;
                
            }
        }
    }
    public static void main (String[] args){
        Pilacuatro c = new Pilacuatro();
        Scanner sc = new Scanner (System.in);
        int opt=0;
         do {
            System.out.println("\nSelecciona la opcion que deseas llenar\n"
                    + "1 Llenar\n"
                    + "2 Mostrar\n"
                    + "3 Eliminar\n"
                    + "4 Ordenar\n"
                    + "5 Salir\n");
            
            switch (opt = sc.nextInt()) {
                case 1:
                    c.Llenar();
                    System.out.println("Las pilas estan correctamente llenas..");
                    break;
                case 2:
                    c.Mostrar();
                    break;
                case 3:
                    c.Eliminar();
                break;
                case 4:
                    c.Ordenar();
                    
                 break;
            }
        } while (opt != 5);
    }
}
        
      