package org.example;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        boolean i=true;
        lista list=new lista();
        do{
            try{
                Thread.sleep(50);
                int tam=(int)(Math.random()*10+1);
                if(tam!=0){
                    naranjas nara=new naranjas(tam);
                    nara.tiempo(tam);
                    list.contructor(nara);
                    list.reducir();
                }else{
                    System.out.println(" ");
                }

            }catch(InterruptedException e){
                System.out.println("Se terminaron las naranjas");
            }
           try{
               Thread.sleep(1000);
               list.mostrar();
               list.pistonnnes.VerPistones();
               System.out.println("\n");
           }catch(InterruptedException e){
               System.out.println("Se interrumpió el procesamiento de las naranjas");
           }

        }while(i);
    }
}
