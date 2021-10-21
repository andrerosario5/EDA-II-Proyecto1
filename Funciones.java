import java.util.*;
import java.io.*;
public class Funciones {
    public static void Crear(String name){
        Scanner stdIn = new Scanner(System.in);
        Scanner stdIn2 = new Scanner(System.in);
        PrintWriter fileOut;
        try{
            String nombre = name;
            fileOut = new PrintWriter(nombre);
            fileOut.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void Agregar(Alumno all1, String name){
        Scanner stdIn = new Scanner(System.in);
        Scanner stdIn2= new Scanner(System.in);
        PrintWriter fileOut;
        try{
            fileOut = new PrintWriter(new FileWriter(name,true));
            fileOut.println(all1.getNombre()+","+all1.getApellido()+","+all1.getCuenta());
            fileOut.close();
        }
        catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    } 
    public static void Modificar(String name, Alumno aux ){
        Scanner stdIn = new Scanner(System.in);
        Scanner stdIn2= new Scanner(System.in);
        PrintWriter fileOut;
        String text ;
        try{
            fileOut = new PrintWriter(new FileWriter(name));
            fileOut.println(aux.getNombre()+","+aux.getApellido()+","+aux.getCuenta());
            fileOut.close();
        }
        catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }
    public static void Modificar2(String name, Alumno aux ){
        Scanner stdIn = new Scanner(System.in);
        Scanner stdIn2= new Scanner(System.in);
        PrintWriter fileOut;
        String text ;
        try{
            fileOut = new PrintWriter(new FileWriter(name));
            fileOut.println(aux.getNombre()+" "+aux.getApellido()+" "+aux.getCuenta());
            fileOut.close();
        }
        catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }
    public static void Agregar2(Alumno all1, String name){
        Scanner stdIn = new Scanner(System.in);
        Scanner stdIn2= new Scanner(System.in);
        PrintWriter fileOut;
        try{
            System.out.print("Introduzca el nombre de un archivo existente: ");
            fileOut = new PrintWriter(new FileWriter(name,true));
            System.out.println("Ingrese el contenido a añadir");
            fileOut.println(aux.getNombre()+" "+aux.getApellido()+" "+aux.getCuenta());
            fileOut.close();
        }
        catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    } 
    public static void Leer(String name,List<Alumno>ax) {
        List<Alumno> list=new LinkedList<>();
        List<String> list2=new LinkedList<>();
        Scanner stdIn = new Scanner(System.in);
        Scanner fileIn;
        String line;
        String txt;
        try {
            fileIn = new Scanner(new FileReader(name));
            while (fileIn.hasNextLine()) {
                line = fileIn.nextLine();
                StringTokenizer tokens =new StringTokenizer(line,",");
                while(tokens.hasMoreTokens()){
                    txt=tokens.nextToken();
                    list2.add(txt);
                }
                int count=Integer.valueOf(list2.get(2));
                Alumno aux=new Alumno(list2.get(0),list2.get(1),count);
                ax.add(aux);
                list2.clear();
            }
            fileIn.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}