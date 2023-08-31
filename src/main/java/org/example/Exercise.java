package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Exercise {
    public static void main(String[] args) {
        iniciarPrograma();
    }

    private static void iniciarPrograma(){
        int dimension;
        int primes=0; // Contador de números primos

        dimension = readDim();
        int [] vector; // Se declara arreglo unidimensional que recibe números enteros
        vector = new int [dimension]; // Se inicializa el arreglo

        fillVector(vector); // Se rellena de números enteros
        System.out.println("Arreglo de números");
        showVector(vector); // Se muestran los números del arreglo

        for (int pos=0; pos < vector.length; pos++) {
            if(isPrime(vector[pos])) primes++;
        }

        int [] vectorPrimes = new int [primes]; // Arreglo que almacenará los números primos

        copyVectors(vector, vectorPrimes);
        System.out.println("Números primos");
        showVector(vectorPrimes); // Mostrar arreglos de números primos
    }

    private static int readDim(){
        System.out.println("Ingrese la cantidad de columnas del arreglo:");
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        return dimension;
    }

    private static void fillVector(int vec[]) {
        Random random = new Random();

        for(int i=0; i<vec.length; i++) {
            vec[i] = random.nextInt(100);
        }

    }

    private static void showVector(int [] vec){
        for(int numero: vec) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public static boolean isPrime(int number){
        boolean prime = true;
        if (number <= 0) { // Se agregó el <= a 0, para que no considere como primos a los números negativos
            prime = false;
        }
        if (number == 1) {
            prime = false;
        }
        for (int cont=2; cont < number; cont++) {
            if (number%cont == 0){
                prime = false;
            }
        }
        return prime;
    }

    private static void copyVectors(int [] vec, int [] otherVec){
        int otherPos = 0; // Mostrar e ingresar datos no se valida
        for (int pos=0; pos < vec.length; pos++) {
            if (isPrime(vec[pos])) {
                otherVec[otherPos] = vec[pos];
                otherPos++;
            }
        }
    }
}