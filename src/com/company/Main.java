package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SuperList<Integer> lista1 = new SuperList<Integer>();
            /*Añadir cuatro elementos*/
            lista1.addElement(1);
            lista1.addElement(2);
            lista1.addElement(3);
            lista1.addElement(4);
            System.out.println(lista1);

            /*Eliminar elemento de la posición 3*/
            lista1.removeElement(2);

            /*Mostrar lista*/
            System.out.println("Mostrando lista...");
            lista1.showElements();


            /*Mostrar lista en orden inverso*/
            System.out.println("Mostrando lista en orden inverso...");
            lista1.showReversedElements();





    }
}
