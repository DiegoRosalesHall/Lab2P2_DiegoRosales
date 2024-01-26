package lab2p2_diegorosales;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_DiegoRosales {
public static Scanner mcgregor = new Scanner(System.in);
public static Scanner mcgregorstring = new Scanner(System.in);
    public static void main(String[] args) {
        int a=1;
        while (a==1){
        System.out.println("Menu");
        System.out.println("1.  Iniciar sesion ");
        System.out.println("2. Salir ");
        int opcionMenu1 = mcgregor.nextInt();
                
        if(opcionMenu1 ==1){
            ArrayList<Usuarios> usuariosValidos = new ArrayList<>();
            
            Usuarios estudiante = new Usuarios("Luis","Luisitoelpillo","estudiante");
            usuariosValidos.add(estudiante);
            Usuarios profesor = new Usuarios("Josue","Josuesito","profesor");
            usuariosValidos.add(profesor);
            Usuarios bibliotecario = new Usuarios("Diego","2305","bibliotecario");
            usuariosValidos.add(bibliotecario);
            
            System.out.println("Ingrese su nombre de usuario: ");
            String nombreUsuario = mcgregorstring.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String contrasenaUsuario = mcgregorstring.nextLine();
            int nUsuario = 0;
            int contValidez = 0;
        
            for (int i = 0; i < usuariosValidos.size(); i++) {
                if(usuariosValidos.get(i).getNombreUsuario().equals(nombreUsuario) && usuariosValidos.get(i).getContrasenaUsuario().equals(contrasenaUsuario)){
                    contValidez++;
                  
                }
                
              
                
                if(contValidez==1){
                    System.out.println("Valido");
                    nUsuario=i;
                    break;
                }
                  else {
                    
                    contValidez=0;
                }
                
            }
            
            if(contValidez==1){
                System.out.println("Has iniciado sesion con exito! Bienvenido "+usuariosValidos.get(nUsuario).getNombreUsuario());
            }
            
            else{
                System.out.println("El usuario/contraseña ingresado no es valido");
            }
            
            
            
        }// Inicio de sesion
        
        
        
        
        
        else if(opcionMenu1 ==2){
            a=0;
        }// Salir
        else{
            System.out.println("Error, seleccion no valida");
        } // Eleccion invalida
        
    }
        
    }
    
}
