package funcionNumero;

import java.util.Scanner;

/**
 * Problema que va multiplicando las unidades del numero pasado hasta obtener un unico digito.
 * f(21) -> 2*1 = 2 -> pasos 1
 * f(54) -> 5*4 = 20 = 2*0 = 0 -> pasos 2
 * f(443) -> 4*4*3 = 48 = 4*8 = 32 = 3*2 = 6 -> pasos 3
 * @author Andres
 */
public class JavaFuncion1Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el numero a calcular: ");
        int numero = Math.abs(scanner.nextInt());
        
        int original = numero; //guardar original para comparar con el logaritmo
        
        int pasos = 0; //Obtener el numero de pasos necesarios
        while(true)
        if( String.valueOf(numero).length() == 1){
            System.out.println("TERMINA " + pasos);
            
            //Explicacion matematica de como saber el numero de pasos
            if(Math.round(Math.log10(original)) == pasos) System.out.println("Los pasos coinciden");
            else System.out.println("Los pasos no coinciden");
            break;
        }else{  //Llamada recursiva
            numero = funcion(numero);
            pasos++;
        }
    }
    
    /**
     * Funcion que calcula las multiplicacion de los digitos del numero pasado.
     * @param numero numero a multiplicar
     * @return multiplicacion obtenida de los digitos del valor pasado.
     */
    public static int funcion(int numero){
        int resultado = 1;
        
        while(true){
            if(numero <= 0){
                return resultado;
            }else{
                resultado *= numero % 10;
                numero = numero/10;
            }
        }
    }
}
