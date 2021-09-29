package ime_usp;
import java.lang.Math;
import java.util.Random;

public class Ime_usp {


    public static void main(String[] args) {

        Integer[] numeros = new Integer[13];
        
        Integer tamanho = numeros.length - 1;
        
        Integer soma = 0;
        
        System.out.println("Numeros:");
        
        for (Integer i = tamanho; i >= 0; i--){
            
            numeros[i] = (int) (Math.random() * 101);
            soma = soma + numeros[i];
            System.out.println(numeros[i]);

        }
        
        
        System.out.println("Soma: " + soma);

    }
    
}
