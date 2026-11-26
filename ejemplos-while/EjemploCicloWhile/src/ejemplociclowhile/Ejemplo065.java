/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo065 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        String pais;
        String capital;
        int poblacion;
        String reporte = "";
        while(bandera==true){ // true == true // false == true
            System.out.println("Ingrese un país"); 
            pais = entrada.nextLine();
            
            System.out.println("Ingrese un la capital del país"); 
            capital = entrada.nextLine();
            
            System.out.println("Ingrese la población");
            poblacion = entrada.nextInt();
            entrada.nextLine();
            reporte = String.format("%s%s\t%s\t%d\n", reporte, pais, 
                    capital, poblacion);
            String salir;
            System.out.println("Desea salir del ciclo, ingrese si.");
            salir = entrada.nextLine(); 
            if(salir.equals("si")){ 
                bandera = false;
            }
        }
        
        System.out.printf("%s\n", reporte);
    
    }
}
/*
El error es que en la linea 33 faltaba el "entrada.nextLine();" que con ello 
haciamos una limpieza de bufer por que pasamos de cadena a enteros 
*/