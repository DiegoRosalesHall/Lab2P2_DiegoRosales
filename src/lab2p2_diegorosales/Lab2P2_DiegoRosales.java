package lab2p2_diegorosales;

import java.util.Scanner;

public class Lab2P2_DiegoRosales {
public static Scanner mcgregor = new Scanner(System.in);
    public static void main(String[] args) {
        int a=1;
        while (a==1){
        System.out.println("Menu");
        System.out.println("1.  Iniciar sesion ");
        System.out.println("2. Salir ");
        int opcionMenu1 = mcgregor.nextInt();
                
        if(opcionMenu1 ==1){
           
        }// Inicio de sesion
        else if(opcionMenu1 ==2){
            a=0;
        }// Salir
        else{
            System.out.println("Error, seleccion no valida");
        }
        
    }
        
    }
    
}
