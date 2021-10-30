//####################################################
//                                                   #
//    NOME: MIGUEL FERNANDES SANTOS.                 #
//    DATA: 27/09/2021                               #
//    PROJETO: Natural Triangular.                   #
//                                                   #
//####################################################

package ime_usp;
import java.lang.Math;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class Ime_usp {


    public static void main(String[] args) {

      Integer numero = (int)(Math.random() * 100);
      
      Integer num1;
      Integer num2 = 1;
      Integer num3;
      
      Integer valor = 0;
      
      while (valor < numero){
        
        num1 = num2;
        num2 = num1 + 1;
        num3 = num2 + 1;
        
        valor = num1 * num2 * num3;
        
        if (valor == numero){
            
            System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + numero);
            
            return;
        }
        
      }
 
      System.out.println("O numero " + numero + " nao é um numero natural triangular");
      
    }
    
}
