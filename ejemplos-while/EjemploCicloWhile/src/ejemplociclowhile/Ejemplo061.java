/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejemplo061 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;

        while (bandera == true) {//true == true//false == true  
            System.out.println("Estoy en ciclo");//Estoy en el ciclo 

            int salir;
            System.out.println("Desea salir del ciclo, ingrese -100.");
            salir = entrada.nextInt();//100 -100
            if (salir == -100) {//-100 == -100
                bandera = false;
                
                
            }
        }
    }
}
/*
En este codigo estamos haciendo un ciclo que no tiene fin mostrando "desea
salir del ciclo hasta que salga -100", hasta que el usuario
de forma manual pueda finalizar el ciclo.
*/