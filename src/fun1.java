import java.util.Scanner;
public class fun1 {
	static int mayor(int numero1, int numero2){
    	      	  if (numero1<numero2){
    	      		  System.out.print("El numero menor es: ");
    	      		return numero1;
    	      	  } else if (numero2<numero1) {
    	      		  System.out.print("El numero menor es: ");
    	      		  return numero2;
    	      	  }else{
    	      		  System.out.print("Los nuemros son Iguales");
    	      		  return 0;
    	      	  }
      }
	
    	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner mi_escaner= new Scanner (System.in);
  System.out.print("Ingrese el 1er valor: ");
  int num1= mi_escaner.nextInt();
  System.out.print("Ingrese el 2do valor: ");
  int num2= mi_escaner.nextInt();
  System.out.print(mayor(num1,num2));
	}

}
