import java.util.*;
import java.io.*;
public class  Mezcla{
    public static void Ordenamiento() {
        List<Alumno>lista=new LinkedList<>();
        List<Integer>list=new LinkedList<>();
        List<Integer>list2=new LinkedList<>();
        List<Integer>list3=new LinkedList<>();
        List<Alumno>lista2=new LinkedList<>();
        List<Alumno>lista3=new LinkedList<>();
        System.out.println("Ha seleccionado Mezcla Equilibrada");
        String a0,a1,a2,a3,nom;
        a0="F0.txt";
        a1="F1.txt";
        a2="F2.txt";
        nom=a0;
        Funciones.Leer(nom,lista);
        int x=lista.size();
        int j=1;
        for(int i=0;i<x-1;i++){
            Alumno al1=new Alumno();
            Alumno al2=new Alumno();
            al1=lista.get(i+1);
            al2=lista.get(i);
            if(al1.getNombre().compareTo(al2.getNombre())>0){
                j++;
            }
            else{
                if(j>0){
                    list.add(j);
                }
                j=0;
                j++;
            }
        }
        list.add(j);
        listas(list,list2,list3);
        bloques(lista,list,a1,a2);
        suma(list,list2,list3);
        posiciones(list2);
        posiciones(list3);
        Funciones.Leer(a1,lista2);
        Funciones.Leer(a2,lista3);
        j=0;
        int k=0;
        int tam=tamano(list2,list3);
        for(int i=0;i<tam;i++){
            if(i<list2.size()){
                rango(j,list2.get(i),lista,lista2);
            }
            if(i<list3.size()){
                rango(k,list3.get(i),lista,lista3);
            }
            j=list2.get(i);
            k=list3.get(i);
        }
        posiciones(list);
        j=0;
        for(Alumno var:lista){
            var.verDatos();
        }
        for(int i=0;i<lista.size();i++){
            if(i==0){
                Alumno al1=new Alumno();
                al1=lista.get(i);
                Funciones.Modificar(nom,al1);
            }
            else{
                Alumno al1=new Alumno();
                al1=lista.get(i);
                Funciones.Agregar(al1,nom);
            }
        }
        for(int i=0;i<list.size();i++){
            ordenar(lista,j,list.get(i));
            j=list.get(i);
        }
        System.out.println("...");
        for(Alumno var:lista){
            var.verDatos();
        }
        
    }
    public static void bloques(List<Alumno>ax,List<Integer>aux,String nom1,String nom2) {
        int j;
        for(int i=1;i<aux.size();i++){
            int sum=aux.get(i-1)+aux.get(i);
            aux.set(i,sum);
        }
        int y=aux.size();
        j=0;
        int con=0;
        int con2=0;
        for(int i=0;i<y;i++){
            if((i+1)%2==1){
                while(j<aux.get(i)){
                    if(con==0){
                        Alumno al1=new Alumno();
                        al1=ax.get(j);
                        Funciones.Modificar(nom1,al1);
                    }
                    else{
                        Alumno al1=new Alumno();
                        al1=ax.get(j);
                        Funciones.Agregar(al1,nom1);
                    }
                    con++;
                    j++;
                }
            }
            if((i+1)%2==0){
                while(j<aux.get(i)){
                    if(con2==0){
                        Alumno al1=new Alumno();
                        al1=ax.get(j);
                        Funciones.Modificar(nom2,al1);
                    }
                    else{
                        Alumno al1=new Alumno();
                        al1=ax.get(j);
                        Funciones.Agregar(al1,nom2);
                    }
                    con2++;
                    j++;
                }
            }
        }
        
    }
    public static void listas(List<Integer>aux,List<Integer>aux1,List<Integer>aux2) {
        for(int i=0;i<aux.size();i++){
            if((i+1)%2==1){
                aux1.add(aux.get(i));
            }
            if((i+1)%2==0){
                aux2.add(aux.get(i));
            }
        }
    }
    public static void suma(List<Integer>aux,List<Integer>aux1,List<Integer>aux2) {
        int x,y,z;
        aux.removeAll(aux);
        if(aux1.size()>aux2.size()){
            for(int i=0;i<aux1.size();i++){
                if(i<aux2.size()){
                    y=aux2.get(i);
                }
                else{
                    y=0;
                }
                if(i<aux1.size()){
                    z=aux1.get(i);
                }
                else{
                     z=0;
                }
                x=z+y;
                aux.add(x);
            }
        }
        if(aux2.size()>aux1.size()){
            for(int i=0;i<aux2.size();i++){
                if(i<aux2.size()){
                    y=aux2.get(i);
                }
                else{
                    y=0;
                }
                if(i<aux1.size()){
                    z=aux1.get(i);
                }
                else{
                     z=0;
                }
                x=z+y;
                aux.add(x);
            }
        }
        if(aux2.size()==aux1.size()){
            for(int i=0;i<aux2.size();i++){
                if(i<aux2.size()){
                    y=aux2.get(i);
                }
                else{
                    y=0;
                }
                if(i<aux1.size()){
                    z=aux1.get(i);
                }
                else{
                     z=0;
                }
                x=z+y;
                aux.add(x);
            }
        }

        aux1.removeAll(aux1);
        aux2.removeAll(aux2);
    }
    public static void rango(int inicio,int tamano,List<Alumno>aux,List<Alumno>aux1) {
        int in=inicio;
        int tam=tamano;
        for(int i=in;i<tam;i++){
            Alumno au=new Alumno();
            au=aux1.get(i);
            aux.add(au);
        }
    }
    public static void posiciones(List<Integer>aux) {
        for(int i=1;i<aux.size();i++){
            int sum=aux.get(i-1)+aux.get(i);
            aux.set(i,sum);
        }
    }
    public static int tamano(List<Integer>aux,List<Integer>aux1) {
        int x=0;
        if(aux.size()>aux1.size()){
            x=aux.size();
        }
        if(aux1.size()>aux.size()){
            x=aux1.size();
        }
        if(aux.size()==aux1.size()){
            x=aux.size();
        }
        return x;
    }
    public static void ordenar(List<Alumno>aux, int inicio,int fin) {
        int x=inicio;
        int y=fin;
        for(int i=y-1;i>0;i--){
            for(int j=x;j<i;j++){
                Alumno a1=new Alumno();
                Alumno a2=new Alumno();
                a1=aux.get(j);
                a2=aux.get(j+1);
                if(a1.getNombre().compareTo(a2.getNombre())>0){
                    swap(aux,j,a1,j+1,a2);
                }
            }
        }
    }
    public static void swap(List<Alumno>aux,int p1,Alumno a,int p2,Alumno  b) {
        aux.set(p1,b);
        aux.set(p2,a);
    }
}