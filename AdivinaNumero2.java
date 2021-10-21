import java.util.*;    //Para usar Scanner
class AdivinaNumero2{
public static void main(String[]args){
    //Definir variables int, Scanner, y aleatorio utilizando Math.random
int aleatorio= 0;
aleatorio = (int) (1000*Math.random()+1);

int entrada=0;
int contador=0;
String seguir="S";
int vidas=12;
Scanner teclado = new Scanner(System.in);

System.out.println("*!! Escoge un numero entero entre 1 y 1000 !!*");
System.out.println(" ");

// bucle hasta que el usuario adivine el numero


do{

do {

// Pedir un numero al usuario
System.out.println("Ingresa un numero: ");
entrada=teclado.nextInt();
/*System.out.println(entrada);*/  //Solo se utiliza de prueba

if(entrada>aleatorio) {              //si no adivina imprime una de las opciones
System.out.println("Menos");

 
}else if(entrada<aleatorio ) {
System.out.println("Mas");


}
vidas--;
contador++;  
  //Cuenta numero de aciertos e incrementa variable
 
} while(vidas> 0 && entrada!=aleatorio);

if (entrada!=aleatorio){
     System.out.println("* GAME OVER !! *");  //Al terminar las vidas el juego se termina
       }else{
     System.out.println("Felicidades !! \n");
     System.out.println("acertaste en " + contador + " intentos.");
       }
System.out.println("Quieres volver a jugar?? ");
System.out.println(" S / N ");
teclado.nextLine();
seguir = teclado.nextLine();
if(seguir.equals("S")){
aleatorio = (int) (1000*Math.random()+1);
teclado.nextLine();
}
   }while(!seguir.equals("n")&&!seguir.equals("N"));


}//Fin del main
}//Fin del class

//hola
