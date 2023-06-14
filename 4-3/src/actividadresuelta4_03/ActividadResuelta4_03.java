/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta4_03;
import java.util.*;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta4_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);
        int tipoCalculo;
        double radio, alt;
        
        System.out.print("Introduzca radio: ");
        radio = sc.nextDouble();
        
        System.out.print("Introduzca altura: ");
        alt = sc.nextDouble();
        
        System.out.print("¿Qué desea calcular? (1 (área) / 2 (volumen)) ");
        tipoCalculo = sc.nextInt();
        
        areaVolumenCilindro(radio, alt, tipoCalculo);
        
    }
    
    //Funciones.
    
    static void areaVolumenCilindro(double radio, double altura, int opcion) {
        
        double volumen, area;
        
        switch (opcion) {
            case 1 -> {
                area = 2 * Math.PI * radio * (altura + radio);
                System.out.println("El área es = " + area);
            }
            case 2 -> {
                volumen = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("El volumen es = " + volumen);
            }
            default -> System.out.println("Indicador de cálculo erróneo.");
        }
        
    }
}