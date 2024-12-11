package com.ebac.modulo51;

public class Operadores {

    public static void main(String[] args) {
        /*Aritmeticos*/
        int numeroA = 10;
        int numeroB = 5;

        //Suma
        int suma = numeroA + numeroB;
        System.out.println("El resultado de " + numeroA + " + " + numeroB + " es igual a: " + suma);

        //Resta
        int resta = numeroA - numeroB;
        System.out.println("El resultado de " + numeroA + " - " + numeroB + " es igual a: " + resta);

        //Multiplicacion
        int multiplicacion = numeroA * numeroB;
        System.out.println("El resultado de " + numeroA + " * " + numeroB + " es igual a: " + multiplicacion);

        //Division
        int division = numeroA / numeroB;
        System.out.println("El resultado de " + numeroA + " entre " + numeroB + " es igual a: " + division);

        //Modulo
        int modulo = (numeroA % numeroB);
        System.out.println("El valor residual de " + numeroA + " entre " + numeroB + " es " + modulo );

        //Incremento
        int x = 1;
        System.out.println("El valor de x es igual a: " + x);
        x++;
        System.out.println("El resultado de x + 1 es igual a: " + x);

        //Decremento
        int y = 1;
        System.out.println("El valor de y es igual a: " + y);
        y--;
        System.out.println("El resultado de y - 1 es igual a: " + y);

        /*Asignacion*/
        int numeroX = 10;
        System.out.println("El valor de numeroX es: " + numeroX);

        //Suma y asignacion
        numeroX += 5;
        System.out.println("El nuevo valor de numeroX es: " + numeroX);

        //Resta y asignacion
        numeroX -= 5;
        System.out.println("El nuevo valor de numeroX es: " + numeroX);

        //Multiplicacion y asignacion
        numeroX *= 5;
        System.out.println("El nuevo valor de numeroX es: " + numeroX);

        //Division y asignacion
        numeroX /= 5;
        System.out.println("El nuevo valor de numeroX es: " + numeroX);

        /*Relacionales*/
        int numero1 = 8;
        int numero2 = 3;

        //Mayor que
        boolean mayorQue = numero1 > numero2;
        System.out.println("¿" + numero1 + " es mayor que " + numero2 +"? " + mayorQue);

        //Menor que
        boolean menorQue = numero1 > numero2;
        System.out.println("¿" + numero1 + " es menor que " + numero2 +"? " + menorQue);

        //Igual a
        boolean igualA = numero1 == numero2;
        System.out.println("¿" + numero1 + " es igual a " + numero2 +"? " + igualA);

        //Menor que
        boolean distintoDe = numero1 != numero2;
        System.out.println("¿" + numero1 + " es distinto de " + numero2 +"? " + distintoDe);
    }
}
