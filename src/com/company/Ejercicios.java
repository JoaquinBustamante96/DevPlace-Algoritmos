package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios {

    private Scanner input = new Scanner(System.in);

    private boolean isPrime(int number){
        int count = 0;
        for(int i = 2; i<number/2;i++){
            if(number%i == 0){
                count++;
            }
        }
        return count == 0;
    }

    public void primerEjercicio(){
        System.out.println("ingresa un numero");
        int number = input.nextInt();
        System.out.println("El numero "+number+" es primo: " + isPrime(number));
    }

    public void segundo(){

        System.out.println("ingrese una contraseña");
        String password = input.nextLine();
        String newPassword;
        int attempts = 0;

        do {
            attempts++;
            System.out.println("ingrese nuevamente su password");
            newPassword = input.nextLine();
            if(!password.equals(newPassword)){
                System.out.println("Contraseña incorrecta");
            }
        }while(!password.equals(newPassword) && attempts<3);

        if(attempts == 3){
            System.out.println("tenes que ejercitar la memoria");
        }else{
            System.out.println("Felicitaciones, recordas tu contraseña");
        }

    }

    public void tercer(){
        System.out.println("ingrese el valor hora del empleado");
        double hourlyRate = input.nextDouble();
        input.nextLine();
        System.out.println("ingrese nombre del empleado");
        String name = input.nextLine();
        System.out.println("ingrese antiguedad");
        int workedYears = input.nextInt();
        System.out.println("ingrese cantidad de horas trabajadas en el mes");
        int workedHours = input.nextInt();

        double salary = workedHours*hourlyRate;

        if(workedYears>10){
            salary = salary + workedYears*30;
        }

        System.out.println("El empleado "+name+" tiene una antiguedad de "+workedYears+" el total a cobrar es: "+salary);
    }

    public void cuarto(){
        Random random = new Random();
        int randomNumber = random.nextInt(1001);

        System.out.println("Se ha generado un numero aleatorio entre 0 y 1000 ingrese un numero para adivinar cual es");
        Scanner input = new Scanner(System.in);

        int inputNumber = input.nextInt();
        do {
            if(inputNumber>randomNumber){
                System.out.println("es menor, intente de nuevo");
            }
            if(inputNumber<randomNumber){
                System.out.println("es mayor, intente de nuevo");
            }
            inputNumber = input.nextInt();
        }while(inputNumber!=randomNumber);
        System.out.println("correcto el numero era: "+randomNumber);
    }

    private int askForNumber(){
        int number;
        System.out.println("ingrese un numero, -1 para terminar");
        return input.nextInt();
    }

    public void quinto(){
        int biggestNumber = 0;
        int smallestNumber = 0;
        int total = 0;

        int number = askForNumber();
        if(number == -1){
        System.out.println("no se ingreso ningun numero");
        }else
        {
        biggestNumber = number;
        smallestNumber = number;
        total = total + number;

        number = askForNumber();
        while( number!=-1 ){
            total = number + total;

            if (biggestNumber < number){
                biggestNumber = number;
            }
            if (smallestNumber > number){
                smallestNumber = number;
            }
            number = askForNumber();
        }

        System.out.println("numero mas grande: "+ biggestNumber);
        System.out.println("numero mas chico: "+ smallestNumber);
        System.out.println("Suma total: "+total);
    }

    }


}
