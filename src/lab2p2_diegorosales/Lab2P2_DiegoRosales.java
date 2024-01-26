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
            ArrayList<Libros> libros = new ArrayList<>();
            ArrayList<Articulos> articulos = new ArrayList<>();
            ArrayList<Conferencias> conferencias = new ArrayList<>();
            ArrayList<Cursos> cursos = new ArrayList<>();
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
                    System.out.println("");
                    System.out.println("Libros: ");
                   for(Libros libro : libros){
                       System.out.print("Titulo: " + libro.getTitulo());
                       System.out.print(" Autor: "+libro.getAutor());
                       System.out.print(" Genero: "+libro.getGenero());
                       System.out.print(" Año: "+libro.getAño());
                       System.out.println(" Disponibilidad : "+libro.getDisponibilidad());
                   }
                    System.out.println("");
                    System.out.println("Articulos: ");
                    for(Articulos articulo : articulos){
                       System.out.print("Titulo: " + articulo.getTitulo());
                       System.out.print(" Autor: "+articulo.getAutor());
                       System.out.print(" Tema: "+articulo.getTema());
                       System.out.print(" Fecha de publicacion: "+articulo.getPublicacion());
                       System.out.println(" Disponibilidad : "+articulo.getAcceso());
                   }
                    System.out.println("");
                    System.out.println("Conferencias: ");
                                        for(Conferencias conferencia : conferencias){
                       System.out.print("Titulo: " + conferencia.getTitulo());
                       System.out.print(" Conferencista: "+conferencia.getConferencista());
                       System.out.print(" Fecha: "+conferencia.getFecha());
                       System.out.print(" Duracion: "+conferencia.getDuracion());
                       System.out.println(" Enlace : "+conferencia.getEnlace());
                   }
                                        System.out.println("");
                    System.out.println("Cursos: ");
                     for(Cursos curso : cursos){
                       System.out.print("Titulo: " + curso.getTitulo());
                       System.out.print(" Conferencista: "+curso.getInstructor());
                       System.out.print(" Duracion del curso: "+curso.getDuracion());
                       System.out.print(" Plataforma: "+curso.getPlataforma());
                         System.out.println("");
                   }              
                    
                } //Listar Recursos
                
                else if(opcionGestor==2){
                    if(usuariosValidos.get(nUsuario).getTipoUsuario().equals("profesor") || usuariosValidos.get(nUsuario).getTipoUsuario().equals("bibliotecario")){
                        
                        
                    System.out.println("Selecciona el tipo de recurso que deseas añadir: ");
                    System.out.println("1. Libros");
                    System.out.println("2. Articulos ");
                    System.out.println("3. Conferencias ");
                    System.out.println("4. Cursos ");
                    int opcionRec=mcgregor.nextInt();
                    
                    if(opcionRec==1){
                        System.out.println("Ingresa el titulo del libro: ");
                        String titulo = mcgregorstring.nextLine();
                        System.out.println("Ingresa el autor del libro: ");
                        String autor = mcgregorstring.nextLine();
                        System.out.println("Ingresa el genero del libro: ");
                        String genero = mcgregorstring.nextLine();
                        System.out.println("Ingresa el año del libro: ");
                        String año = mcgregorstring.nextLine();
                        
                        Libros libro = new Libros(titulo,autor,genero,año,"si");
                        libros.add(libro);
                    }
                    else if(opcionRec==2){
                        System.out.println("Ingrese el titulo del articulo: ");
                        String titulo = mcgregorstring.nextLine();
                        System.out.println("Ingrese el autor del articulo: ");
                        String autor = mcgregorstring.nextLine();
                        System.out.println("Ingrese el tema del articulo: ");
                        String tema = mcgregorstring.nextLine();
                        System.out.println("Ingrese la fecha de publicacion del articulo en formato 'dd/mm/yyyy' : ");
                        String fecha = mcgregorstring.nextLine();
                        
                        Articulos articulo = new Articulos(titulo,autor,tema,fecha,"si");
                        articulos.add(articulo);
                        
                        
                    }
                    
                    else if(opcionRec==3){
                        System.out.println("Ingrese el titulo de la conferencia: ");
                        String titulo = mcgregorstring.nextLine();
                        System.out.println("Ingrese el nombre del conferencista: ");
                        String conferencista = mcgregorstring.nextLine();
                        System.out.println("Ingrese la fecha de la conferencia en formato 'dd/mm/yyyy' : ");
                        String fecha = mcgregorstring.nextLine();
                        System.out.println("Ingrese la duracion de la conferencia : ");
                        String duracion = mcgregorstring.nextLine();
                        System.out.println("Ingrese el enlace de la conferencia: ");
                        String enlace = mcgregorstring.nextLine();
                        
                        Conferencias conferencia = new Conferencias(titulo, conferencista, fecha, duracion, enlace);
                        conferencias.add(conferencia);
                    }
                    else if(opcionRec==4){
                        System.out.println("Ingrese el titulo del curso: ");
                        String titulo = mcgregorstring.nextLine();
                        System.out.println("Ingrese el nombre del instructor: ");
                        String instructor = mcgregorstring.nextLine();
                        System.out.println("Ingrese la duracion del curso en semanas: ");
                        String duracion = mcgregorstring.nextLine();
                        System.out.println("Ingrese la plataforma del curso: ");
                        String plataforma = mcgregorstring.nextLine();
                        
                        Cursos curso = new Cursos(titulo,instructor,duracion,plataforma);
                        cursos.add(curso);
                        
                    }
                    }
                    
                    
                    
                    
                    
                    else{
                        System.out.println("Esta seccion no es accesible para ti, porfavor elige algo dentro de tus parametros ");
                    }
                } // Crear Recursos
                
                else if(opcionGestor==3){
                     if(usuariosValidos.get(nUsuario).getTipoUsuario().equals("bibliotecario")){
                         System.out.println("Selecciona el tipo de recurso a eliminar: ");
                         System.out.println("1. Libros");
                        System.out.println("2. Articulos ");
                        System.out.println("3. Conferencias ");
                        System.out.println("4. Cursos ");
                         int opcionr=mcgregor.nextInt();
                         if(opcionr==1){
                             System.out.println("Selecciona el libro a eliminar por su indice");
                             int cont=1;
                              for(Libros libro : libros){
                       System.out.println(cont+". Titulo: " + libro.getTitulo());
                     cont++;
                   }
                              int indiceEliminado=mcgregor.nextInt();
                              libros.remove(indiceEliminado-1);
                         }
                         
                         else if(opcionr==2){
                             
                         }
                         else if(opcionr==3){
                             
                         }
                         else if(opcionr==4){
                             
                         }
                         
                         
                         
                    }
                    else{
                        System.out.println("Esta seccion no es accesible para ti, porfavor elige algo dentro de tus parametros ");
                    }
                } // Eliminar recursos
                
                else if(opcionGestor==4){
                    if(usuariosValidos.get(nUsuario).getTipoUsuario().equals("bibliotecario")){
                        System.out.println("Ha entrado con exito");
                    }
                    else{
                        System.out.println("Esta seccion no es accesible para ti, porfavor elige algo dentro de tus parametros ");
                    }  
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

