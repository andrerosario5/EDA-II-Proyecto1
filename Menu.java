import java.util.*;
import java.io.*;
public class Menu {
    Funciones metodos=new Funciones();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc=0;
        System.out.println("\n\n\t\t\tBIENVENIDO\t\t\t");
        do{
            System.out.println("¿ Que algoritmo desea utilizar para ordenar la informacion del documento?");
            System.out.println("1.-Polifase");
            System.out.println("2.-Mezcla Equilibrada");
            System.out.println("3.-Radix Externo");
            System.out.println("4.-Salir");
            opc=sc.nextInt();
            switch(opc){
                case 1: {
                    System.out.println("Ha seleccionado Polifase");
                    break;
                }
                case 2: {
                    
                    /*.out.println("Ingrese el nombre del archivo que desea acomodar con extension Ejemplo Yo.txt");
                    nom=sc.nextLine();*/
                    Mezcla.Ordenamiento();
                    break;
                }
                case 3:{
                    System.out.println("Ha seleccionado Radix Externo");

                    
                    
                    break;
                }
                case 4: //Salir
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;    
            }
        }while(opc != 4);
    }
}