package ime_usp;
import java.lang.Math;
import java.util.Random;

public class Ime_usp {


    public static void main(String[] args) {

        Integer tamanho = (int) (Math.random() * 101);
        Integer auxiliar = 1;
        
        for (Integer i = 1; i < tamanho; i++){
            
            System.out.println(auxiliar);
            auxiliar += 2;
            
        }
        
    }
    
}
