package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise {
    public static void main(String[] args) {
        int dimension;
        int primes=0;

        dimension = readDim();
        int [] vector;
        vector = new int [dimension];

        fillVector(vector);
        System.out.println("Arreglo de números");
        showVector(vector);

        for (int pos=0; pos < vector.length; pos++) {
            if(isPrime(vector[pos])) primes++;
        }

        int [] vectorPrimes = new int [primes];

        copyVectors(vector, vectorPrimes);
        System.out.println("Números primis");
        showVector(vectorPrimes);
    }


    private static int readDim(){
        return 3;
    }

    private static void fillVector(int vec[]) {

    }

    private static void showVector(int [] vec){

    }

    private static boolean isPrime(int number){
        boolean prime = true;
        if (number == 0) {
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