package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
   
        //Paso 2
        double numero1;
        double numero2;
        char operacion;
        double resultado=0;
   
       //Paso 3
    Scanner scanner = new Scanner(System.in);
   System.out.println("Ingrese un número:");
    numero1= scanner.nextDouble();
   System.out.println("Ingrese un segundo número");
   numero2=scanner.nextDouble();
   System.out.println("Ingrese la operación a realizar");
   operacion= scanner.next().charAt(0);
   
   //Paso 4
   if (operacion == '+') {resultado = numero1 + numero2;} 
    else if (operacion == '-') {resultado = numero1 - numero2;} 
    else if (operacion == '*') {resultado = numero1 * numero2;} 
    else if (operacion == '/') {if (numero2 != 0) {resultado = numero1 / numero2; } 
    else {System.out.println("Error: División por cero no es permitida"); return;}}
     else if (operacion == '%') {if (numero2 != 0) {resultado = numero1 % numero2;} 
     else { System.out.println("Error: División por cero no es permitida");return;}} 
     else {System.out.println("Operación inválida");}
  
   //Paso 5
   System.out.println("Resultado:" + resultado);
   
   //Paso 6
   if (numero1>numero2) {System.out.println("El primer número es mayor");}
  else if (numero1==numero2) {System.out.println("Los números son iguales");}
   else{System.out.println("El segundo número es mayor");}
   //Paso 7 
   if (resultado %2==0) {System.out.println("El resultado es par");}
   else{System.out.println("El resultado es impar");}
   
   //Paso 8
   
   int resultadoEntero= (int) resultado;
System.out.println("Tu resultado en entero es:" + resultadoEntero);

//Paso 9 
if (numero1>=10 && numero2>=10) {System.out.println("Los dos números son positivos y mayores que 10");}
else if (numero1<=0 || numero2<=0) {System.out.println("Uno de los dos número es menor o igual a cero");}
else{System.out.println("No se cumple ninguna de las opciones");}

    }
}





























