/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_2019;

/**
 *
 * @author david
 */
public class Boletin3_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Consumo obx1 = new Consumo();

        System.out.println("Objeto1= " + obx1.getlitros() + " litros");

        obx1.setlitros(50);

        System.out.println("Objeto1= " + obx1.getlitros() + " litros");

        System.out.println("Objeto1= " + obx1.getpGas() + " precio litro gasolina");

        obx1.setpGas(1.57f);

        System.out.println("Objeto1= " + obx1.getpGas() + " precio litro gasolina");

        Consumo obx2 = new Consumo(90, 20, 130, 1.30f, 3);

        System.out.println("Objeto2= " + obx2.getpGas() + " precio litro gasolina");
        System.out.println("Objeto2= " + obx2.getlitros() + " litros");

        System.out.println("Consumo medio = " + obx2.consumoMedio());
        
        
        obx2.setlitros(10f);

        System.out.println("Consumo medio = " + obx2.consumoMedio());

    System.out.println("Velocidad media = " + obx2.getvMed());

}}
