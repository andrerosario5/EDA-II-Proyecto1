import java.util.*;
import java.io.*;
public class Radix{
    static void RadixExterno(){
        List<Alumno>lista=new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,f0;
        a0="A0.txt";
        a1="A1.txt";
        a2="A2.txt";
        a3="A3.txt";
        a4="A4.txt";
        a5="A5.txt";
        a6="A6.txt";
        a7="A7.txt";
        a8="A8.txt";
        a9="A9.txt";
        System.out.println("Ingrese el nombre del archivo del cual quiere ordenar los elementos");
        System.out.println("Por ejemplo F0.txt");
        f0=sc.nextLine();
        int division=1;
        for(int i=0;i<9;i++){
            Funciones.Leer(f0,lista);
            int tam=lista.size();
            iteracion(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,tam,lista,division);
            pasar(f0,lista);
            limpiar(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,lista);
            division=division*10;
        }
    }
    public static void pasar( String n0,List<Alumno>aux){
        for(int i=0;i<aux.size();i++){
            Alumno al1=new Alumno();
            al1=aux.get(i);
            if(i==0){
                Funciones.Modificar(n0,al1);
            }
            else{
                Funciones.Agregar(al1,n0);
            }
        }
    }
    public static void limpiar( String n0,String n1,String n2,String n3,String n4,String n5,String n6,String n7,String n8,String n9,List<Alumno>aux){
        File fic0=new File(n0);
        File fic1=new File(n1);
        File fic2=new File(n2);
        File fic3=new File(n3);
        File fic4=new File(n4);
        File fic5=new File(n5);
        File fic6=new File(n6);
        File fic7=new File(n7);
        File fic8=new File(n8);
        File fic9=new File(n9);
        fic0.delete();
        fic1.delete();
        fic2.delete();
        fic3.delete();
        fic4.delete();
        fic5.delete();
        fic6.delete();
        fic7.delete();
        fic8.delete();
        fic9.delete();
        aux.removeAll(aux);
    }
    public static void iteracion( String n0,String n1,String n2,String n3,String n4,String n5,String n6,String n7,String n8,String n9,int tam,List<Alumno>aux,int div){
        Funciones.Crear(n0);
        Funciones.Crear(n1);
        Funciones.Crear(n2);
        Funciones.Crear(n3);
        Funciones.Crear(n4);
        Funciones.Crear(n5);
        Funciones.Crear(n6);
        Funciones.Crear(n7);
        Funciones.Crear(n8);
        Funciones.Crear(n9);
        int mod,i;
        int con0,con1,con2,con3,con4,con5,con6,con7,con8,con9;
        con0=0;
        con1=0;
        con2=0;
        con3=0;
        con4=0;
        con5=0;
        con6=0;
        con7=0;
        con8=0;
        con9=0;
        for(i=0;i<tam;i++){
            Alumno au=new Alumno();
            au=aux.get(i);
            int cuenta=(int) (au.getCuenta());
            mod=cuenta/div;
            mod=mod%10;
            if(mod==0){
                if(con0==0){
                    Funciones.Modificar(n0,au);
                }
                else{
                    Funciones.Agregar(au,n0);
                }
                con0++;
            }
            if(mod==1){
                if(con1==0){
                    Funciones.Modificar(n1,au);
                }
                else{
                    Funciones.Agregar(au,n1);
                }
                con1++;
            }
            if(mod==2){
                if(con2==0){
                    Funciones.Modificar(n2,au);
                }
                else{
                    Funciones.Agregar(au,n2);
                }
                con2++;
            }
            if(mod==3){
                if(con3==0){
                    Funciones.Modificar(n3,au);
                }
                else{
                    Funciones.Agregar(au,n3);
                }
                con3++;
            }
            if(mod==4){
                if(con4==0){
                    Funciones.Modificar(n4,au);
                }
                else{
                    Funciones.Agregar(au,n4);
                }
                con4++;
            }
            if(mod==5){
                if(con5==0){
                    Funciones.Modificar(n5,au);
                }
                else{
                    Funciones.Agregar(au,n5);
                }
                con5++;
            }
            if(mod==6){
               if(con6==0){
                    Funciones.Modificar(n6,au);
                }
                else{
                    Funciones.Agregar(au,n6);
                }
                con6++;
            }
            if(mod==7){
                if(con7==0){
                    Funciones.Modificar(n7,au);
                }
                else{
                    Funciones.Agregar(au,n7);
                }
                con7++;
            }
            if(mod==8){
                if(con0==0){
                    Funciones.Modificar(n8,au);
                }
                else{
                    Funciones.Agregar(au,n8);
                }
                con0++;
            }
            if(mod==9){
                if(con9==0){
                    Funciones.Modificar(n9,au);
                }
                else{
                    Funciones.Agregar(au,n9);
                }
                con9++;
            }

            
        }
        aux.removeAll(aux);
        Funciones.Leer(n0,aux);
        Funciones.Leer(n1,aux);
        Funciones.Leer(n2,aux);
        Funciones.Leer(n3,aux);
        Funciones.Leer(n4,aux);
        Funciones.Leer(n5,aux);
        Funciones.Leer(n6,aux);
        Funciones.Leer(n7,aux);
        Funciones.Leer(n8,aux);
        Funciones.Leer(n9,aux);
    }

}