//####################################################
//                                                   #
//    NOME: MIGUEL FERNANDES SANTOS.                 #
//    DATA: 27/09/2021                               #
//    PROJETO: ESTATISTICA (DIDATICO).               #
//                                                   #
//####################################################

package javaapplication2;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Map;
import java.util.HashMap;
import java.lang.Math;

/**
 *
 * @author Maria
 */
public class JavaApplication2 {

    public static void main(String[] args) {
               
       Map<String, Double[]> valores = new HashMap<String, Double[]>();
      
       Double[] numeros = {10.0, 10.0, 1.0, 45.0, 63.0, 74.0, 32.0, 67.0, 31.0, 54.0, 21.0, 56.0, 23.0};
       Double[] pesos = { 1.0, 2.0, 3.0, 5.0, 6.0, 1.0, 8.0, 1.0, 2.0, 4.0, 2.0, 6.0, 3.0 };
       
       valores.put("Numeros", numeros);
       valores.put("Pesos", pesos);
     
       Tudo(valores);
       
    }
    
    public static void Tudo (Map<String, Double[]> numeros){
        
        double[] estatistica = new double[8];
        estatistica[0] = MediaSimples(numeros.get("Numeros"));
        estatistica[1] = MediaPonderada(numeros.get("Numeros"), numeros.get("Pesos"));
        estatistica[2] = PrimeiroQuartil(numeros.get("Numeros"));
        estatistica[3] = SegundoQuartil(numeros.get("Numeros"));
        estatistica[4] = TerceiroQuartil(numeros.get("Numeros"));
        estatistica[5] = Amplitude(numeros.get("Numeros"));
        estatistica[6] = VarianciaSimples(numeros.get("Numeros"));
        estatistica[7] = VarianciaQuadrada(numeros.get("Numeros"));
      
        
        for (Integer i = 0; i <= 7; i++){
            
            System.out.println(estatistica[i]);
            
        }
        
    }
    
    public static Double MediaSimples (Double[] numeros){
        
        Integer tamanho = numeros.length;
        Double media = 0.0;
        Integer auxiliar = tamanho - 1;
        
        for (Integer i = auxiliar; i >= 0; i-- ){
                        
                media = media + numeros[i];
            
        }
        
        media = media / tamanho;
        
        return media;
        
    }
    
    public static Double MediaPonderada (Double[] numeros, Double[] pesos){
        
        Double somaValores = 0.0;
        Double somaPesos =  0.0;
        Double auxiliar = 0.0;
        
        Integer tamanho = numeros.length;
        Integer auxiliarFor = tamanho - 1;
        
        for (Integer i = auxiliarFor; i >= 0; i--){
            
            auxiliar = numeros[i] * pesos[i];
            somaValores += auxiliar;
            somaPesos += pesos[i];
        
        }
        
        auxiliar = somaValores / somaPesos;
        
        return auxiliar;
    }
    
    public static Double PrimeiroQuartil (Double[] numeros){
    
    Arrays.sort(numeros);
    
    Integer quantidade = numeros.length;
    
    Double numeroExato = quantidade / 4.0;
    
    Integer min = (int) Math.floor(numeroExato);
    Integer max = min + 1;
    
    if (numeroExato > min && numeroExato < max){
        
        numeroExato = Math.floor(numeroExato);
        
    }
    
    Integer indice = numeroExato.intValue();
    
    return numeros[indice];
    
    }
    
    public static Double SegundoQuartil (Double[] numeros){
        
        Arrays.sort(numeros);
    
        Integer quantidade = numeros.length;

        Double numeroExato = quantidade / 2.0;

        Integer min = (int) Math.floor(numeroExato);
        Integer max = min + 1;

        if (numeroExato > min && numeroExato < max){

            numeroExato = Math.floor(numeroExato);

        }

        Integer indice = numeroExato.intValue();
        
        return numeros[indice];
    }
    
    public static Double TerceiroQuartil (Double[] numeros){
        
        Arrays.sort(numeros);
        
        Integer quantidade = numeros.length;
        
        quantidade = quantidade *3;
        
        Double numeroExato = quantidade / 4.0;
        
        Integer min = (int) Math.floor(numeroExato);
        
        Integer max = min + 1;
        
        if (numeroExato > min && numeroExato < max){
            
            numeroExato = Math.floor(numeroExato);
            
        }
        
        Integer indice = numeroExato.intValue();
        
        return numeros[indice];
        
    }
    
    public static Double Amplitude (Double[] numeros){
        
        Integer tamanho = numeros.length;
        Integer auxiliarFor = tamanho - 1;

        Double maior = 0.0;
        Double menor = numeros[auxiliarFor];
        
        for (Integer i = auxiliarFor; i >=0; i--){
            
            if (maior < numeros[i]){
                
                maior = numeros[i];
                
            }
            
            if (menor > numeros[i]){
                
                menor = numeros[i];
                
            }
            
        }
        
        Double numero = maior - menor;
        
        return numero;
    }

    public static Double VarianciaSimples (Double[] numeros){
        
        Double media = MediaSimples(numeros);
        Integer tamanho = numeros.length;
        Integer auxiliarFor = tamanho - 1;
        
        Double[] variancias = new Double[tamanho];
        Double soma = 0.0;
        
        for (Integer i = auxiliarFor; i >= 0; i--){
            
            Double valor = numeros[i] - media;
            variancias[i] = valor;
            soma += valor;
            
        }
        
        soma = Math.floor(soma);
        
        return soma;
    }
    
    public static Double VarianciaQuadrada (Double[] numeros){
        
        Double media = MediaSimples(numeros);
        Integer tamanho = numeros.length;
        Integer auxiliarFor = tamanho - 1;

        
        Double[] varianciasQuadrada = new Double[tamanho];
        
        Double soma = 0.0;
        
        for (Integer i = auxiliarFor; i >= 0; i--){
            
            Double valor = numeros[i] - media;
            valor = valor * valor;
            
            soma += valor;
            
            varianciasQuadrada[i] = valor;
            
        }
        
        Integer divisor = varianciasQuadrada.length - 1;
        
        soma = soma / divisor;
        
        soma = Math.sqrt(soma);
        
        return soma;
        
    }
}
