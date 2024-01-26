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
            int b = 1;
            int nUsuario = 0;
            int contValidez = 0;
            while(b==1){
            System.out.println("Ingrese su nombre de usuario: ");
            String nombreUsuario = mcgregorstring.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String contrasenaUsuario = mcgregorstring.nextLine();
            
        
                for (int i = 0; i < usuariosValidos.size(); i++) {
                    if (usuariosValidos.get(i).getNombreUsuario().equals(nombreUsuario) && usuariosValidos.get(i).getContrasenaUsuario().equals(contrasenaUsuario)) {
                        contValidez++;

                    }

                    if (contValidez == 1) {
                        
                        nUsuario = i;
                        break;
                    } else {

                        contValidez = 0;
                    }
                }
            
            
            if(contValidez!=1){
                System.out.println("Error, usuario/contrasena invalido, desea seguir?");
                int c=1;
                while(c==1){
                
                System.out.println("1. Volver a intentar");
                System.out.println("2. Volver atras");
                int opcionx= mcgregor.nextInt();
                if(opcionx==1){
                    c=0;
                   
                }
                else if(opcionx==2){
                    c=0;
                    b=0;
                }
                else{
                    c=1;
                    System.out.println("Seleccion invalida");
            }
                }
            }

            if(contValidez==1){
               int d=1;
               System.out.println("Has iniciado sesion con exito! Bienvenido "+usuariosValidos.get(nUsuario).getNombreUsuario());
               while(d==1){
               
                System.out.println("Selecciona lo que quieres hacer : ");
                System.out.println("1. Listar recursos ");
                System.out.println("2. Crear recursos");
                System.out.println("3. Eliminar recursos");
                System.out.println("4. Modificar recursos");
                System.out.println("5. Cerrar sesion");
                int opcionGestor = mcgregor.nextInt();
                if(opcionGestor ==1){
                    if(usuariosValidos.get(nUsuario).getTipoUsuario().equals("estudiante") ||usuariosValidos.get(nUsuario).getTipoUsuario().equals("profesor") || usuariosValidos.get(nUsuario).getTipoUsuario().equals("bibliotecario")){
                        System.out.println("Ha entrado con exito");
                    }
                    
                } //Listar Recursos
                
                else if(opcionGestor==2){
                    if(usuariosValidos.get(nUsuario).getTipoUsuario().equals("profesor") || usuariosValidos.get(nUsuario).getTipoUsuario().equals("bibliotecario")){
                        System.out.println("Ha entrado con exito");
                    }
                    else{
                        System.out.println("Esta seccion no es accesible para ti, porfavor elige algo dentro de tus parametros ");
                    }
                } // Crear Recursos
                
                else if(opcionGestor==3){
                    
                } // Eliminar recursos
                
                else if(opcionGestor==4){
                    
                } // Modificar recursos
                
                else if(opcionGestor==5){
                    d=0;
                    b=0;
                    
                    System.out.println("Has cerrado sesion con exito!");
                    System.out.println("");
                }
                
                
                
                
                else{
                    System.out.println("Seleccion invalida, vuelva a intentarlo");
                    
                
            }
                }
            }
            
            else{
                System.out.println("El usuario/contraseña ingresado no es valido, intentalo de nuevo!");
            }
                
                
                
                
            
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }// fin de while
        
        
        
        
        
        if(opcionMenu1 ==2){
            a=0;
        }// Salir

        
    }
        
    }
    
}

