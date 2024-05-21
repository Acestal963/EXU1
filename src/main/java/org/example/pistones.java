package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class pistones {
   public int[] piston ={1,2,3,4,5,6,7,8,9,10};
   public int[] activos=new int [10];

    public void pistones(int tam){
        if(tam>0 && tam<11){
            activos[tam-1]=1;
        }
    }

    public void apagar(){
        for(int i=0;i<activos.length;i++){
            activos[i]=0;
        }
    }
    public void VerPistones(){
        for(int i=0;i<piston.length;i++){
            System.out.println(piston[i]+" "+activos[i]);
        }
    }
}
