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
public class Ejemplo063 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        String pais;
        String capital;
        String reporte = "";

        while (bandera == true) {
            System.out.println("Ingrese un pais");
            pais = entrada.nextLine();

            System.out.println("Ingrese la capital del pais");
            capital = entrada.nextLine();

            reporte = String.format("%s%s\t%s\n", reporte, pais, capital);

            String salir;
            System.out.println("Desea salir del ciclo, ingrese si.");
            salir = entrada.nextLine();
            if (salir.equals("si")) {
                bandera = false;

            }
        }
        System.out.printf("%s\n", reporte);
    }
}
/*
En este codigo estamos haciendo un ciclo que no tiene fin mostrando "desea
salir del ciclo hasta que salga -100", hasta que el usuario
de forma manual pueda finalizar el ciclo.
*/
