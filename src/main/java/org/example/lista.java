package org.example;

public class lista {

    public pistones pistonnnes=new pistones();
    public nodo cabeza;
    public class nodo{
        public naranjas naranja;
        public nodo siguiente=null;

        public nodo(naranjas or){
            this.naranja=or;
        }
    }

    public void contructor(naranjas nara){
       nodo NODO=new nodo(nara);
       NODO.siguiente=cabeza;
       cabeza=NODO;
       pistonnnes.apagar();
    }

    public void mostrar(){
        nodo NODO=cabeza;
        while(NODO!=null){
            System.out.print("("+NODO.naranja.tamano+" "+NODO.naranja.tiempo+")");
            NODO=NODO.siguiente;
        }
        System.out.println(" ");
    }

    public void reducir(){
        nodo NODO=cabeza;
        while(NODO!=null){
            NODO.naranja.reduce();
            NODO=NODO.siguiente;
            comparar();
        }

    }

    public void comparar(){
        int contador=0;
        nodo NODO=cabeza;
        while(NODO!=null){
            if(NODO.naranja.tiempo==0){
                encenderpiston(NODO.naranja.tamano);
                eliminar();
                contador=-1;
                NODO=cabeza;
            }else{
                contador++;
                NODO=NODO.siguiente;
            }
        }
    }

    public void eliminar(){
        nodo actual = cabeza;
        nodo anterior = null;

        while (actual != null) {
            if (actual.naranja.tiempo == 0) {
                if (anterior == null) {
                    cabeza = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
            } else {
                anterior = actual;
            }
            actual = actual.siguiente;
        }
    }

    public void encenderpiston(int tam) {
        pistonnnes.pistones(tam);
    }
}
