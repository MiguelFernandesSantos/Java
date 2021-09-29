package ime_usp;
import java.lang.Math;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class Ime_usp {


    public static void main(String[] args) {

        Integer[] AlunosNotas = new Integer[4];
           
        Integer tamanho = AlunosNotas.length - 1;
        
        for (Integer i = tamanho; i >= 0; i--){
            
            AlunosNotas[i] = (int)(Math.random() * 100);
            
        }
        
        Integer maior = 0;
        Integer menor = AlunosNotas[3];
        
        for (Integer i = tamanho; i >= 0; i--){
            
            if (maior < AlunosNotas[i]){
                
                maior = AlunosNotas[i];
                
            }
            
            if (menor > AlunosNotas[i]){
                
                menor = AlunosNotas[i];
                
            }
            
        }
        
        System.out.println("Maior: " + maior + "  Menor: " + menor);
        
    }
    
}
