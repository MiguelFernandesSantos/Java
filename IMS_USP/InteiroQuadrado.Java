//####################################################
//                                                   #
//    NOME: MIGUEL FERNANDES SANTOS.                 #
//    DATA: 27/09/2021                               #
//    PROJETO: Inteiro Quadrado.                     #
//                                                   #
//####################################################

package ime_usp;
import java.lang.Math;
import java.util.Random;

public class Ime_usp {


    public static void main(String[] args) {

        Integer[] numeros = new Integer[13];
        
        Integer tamanho = numeros.length - 1;
        
        for (Integer i = tamanho; i >= 0; i--){
            
            numeros[i] = (int) (Math.random() * 101);
            System.out.print(numeros[i]);
            numeros[i] = numeros[i] * numeros[i];
            System.out.println(" || " + numeros[i]);

        }

    }
    
}
