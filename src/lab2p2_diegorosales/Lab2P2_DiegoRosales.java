package lab2p2_diegorosales;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_DiegoRosales {
public static Scanner mcgregor = new Scanner(System.in);
public static Scanner mcgregorstring = new Scanner(System.in);
    public static void main(String[] args) {
        int a=1;
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
        while (a==1){
        System.out.println("Menu");
        System.out.println("1.  Iniciar sesion ");
        System.out.println("2. Salir ");
        int opcionMenu1 = mcgregor.nextInt();
                
        if(opcionMenu1 ==1){
          
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
                    else{
                        continue;
                    }

                    if (contValidez == 1) {
                        
                        nUsuario = i;
                        break;
                    } 
                    else {

                        contValidez = 0;
                    }
                }
            
            
            if(contValidez!=1){
                
                int c=1;
                while(c==1){
                System.out.println("Error, usuario/contrasena invalido, desea seguir?");
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
                else if(opcionx!=1 && opcionx!=2){
                    c=1;
                    System.out.println("Seleccion invalida");
            }
                }
            }

            else 
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
                    if(libros.isEmpty() && articulos.isEmpty() && cursos.isEmpty() && conferencias.isEmpty()){
                        System.out.println("No hay nada que listar! ");
                    }
                    else{
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
                    else{
                        System.out.println("Error, seleccion invalida, vuelve a intentarlo");
                    }
                    }
        
                    
                    else if (!usuariosValidos.get(nUsuario).getTipoUsuario().equals("profesor") || usuariosValidos.get(nUsuario).getTipoUsuario().equals("bibliotecario")){
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
                             if(libros.isEmpty()){
                                 System.out.println("No hay libros que eliminar");
                             }
                             else{
                             System.out.println("Selecciona el libro a eliminar por su indice: ");
                             int cont=1;
                              for(Libros libro : libros){
                       System.out.println(cont+". " + libro.getTitulo());
                     cont++;
                   }
                              int indiceEliminado=mcgregor.nextInt();
                              if(indiceEliminado>libros.size()){
                                  System.out.println("Ha intentado eliminar un elemento no existente, porfavor vuelva a intentarlo");
                              }
                              else if(indiceEliminado<=libros.size()){
                              libros.remove(indiceEliminado-1);
                              }
                             }
                         }
                         
                         else if(opcionr==2){
                             if(articulos.isEmpty()){
                                 System.out.println("No hay articulos que eliminar");
                             }
                             else{
                             System.out.println("Selecciona el articulo a eliminar por su indice: ");
                              for(Articulos articulo : articulos){
                                  int cont=1;
                       System.out.print(cont+". " + articulo.getTitulo());
                      cont++;
                   }
                              int indiceEliminado=mcgregor.nextInt();
                              if(indiceEliminado > articulos.size()){
                                  System.out.println("Ha intentado eliminar un elemento no existente, porfavor vuelva a intentarlo");
                              }
                              else if(indiceEliminado <= articulos.size()){
                              articulos.remove(indiceEliminado-1);
                              }
                             }
                         }
                         else if(opcionr==3){
                             if(conferencias.isEmpty()){
                                 System.out.println("No hay conferencias que eliminar");
                             }
                             else{
                            System.out.println("Selecciona la conferencia a eliminar por su indice: ");
                                     int cont=1;
                                        for(Conferencias conferencia : conferencias){
                       System.out.print(cont+". " + conferencia.getTitulo());

                   }
                                        int indiceEliminado=mcgregor.nextInt();
                                        if(indiceEliminado>conferencias.size()){
                                            System.out.println("Ha intentado eliminar un elemento no existente, porfavor vuelva a intentarlo");
                                        }
                                        else if(indiceEliminado<= conferencias.size()){
                                        conferencias.remove(indiceEliminado-1);
                                        }
                             }
                                        }
                         else if(opcionr==4){
                             if(cursos.isEmpty()){
                                 System.out.println("No hay cursos que eliminar");
                             }
                             else{
                             System.out.println("Selecciona el curso a eliminar por su indice: ");
                             int cont=1;
                              for(Cursos curso : cursos){
                       System.out.print(cont+". " + curso.getTitulo());
                                  
                   }
                              System.out.println("");
                              int indiceEliminado=mcgregor.nextInt();
                              if(indiceEliminado > cursos.size()){
                                  System.out.println("Ha intentado eliminar un elemento no existente, porfavor vuelva a intentarlo");
                              }
                              else if(indiceEliminado<=conferencias.size()){
                                 
                              cursos.remove(indiceEliminado-1);
                         }
                          else{
                        System.out.println("Error, seleccion invalida, vuelve a intentarlo");
                    }
                         
                             }
                         
                    }
                     else if (!usuariosValidos.get(nUsuario).getTipoUsuario().equals("bibliotecario")){
                        System.out.println("Esta seccion no es accesible para ti, porfavor elige algo dentro de tus parametros ");
                    }
                     }
                }// Eliminar recursos
                
                else if(opcionGestor==4){
                    if(usuariosValidos.get(nUsuario).getTipoUsuario().equals("bibliotecario")){
                        System.out.println("Selecciona el tipo de recurso a modificar de forma total: ");
                         System.out.println("1. Libros");
                        System.out.println("2. Articulos ");
                        System.out.println("3. Conferencias ");
                        System.out.println("4. Cursos ");
                         int opcionr=mcgregor.nextInt();
                         
                         if(opcionr==1){
                             if(libros.isEmpty()){
                                 System.out.println("No hay libros que modificar");
                             }
                             
                             else{
                    System.out.println("Elige el libro que deseas modificar de forma total por su indice: ");
                    int cont=1;
                   for(Libros libro : libros){
                       System.out.print(cont+". Titulo: " + libro.getTitulo());
                       System.out.print(" Autor: "+libro.getAutor());
                       System.out.print(" Genero: "+libro.getGenero());
                       System.out.print(" Año: "+libro.getAño());
                       System.out.println(" Disponibilidad : "+libro.getDisponibilidad());
                       cont++;
                   }
                    System.out.println(""); 
                    int indiceMod=mcgregor.nextInt()-1;
                    if(indiceMod+1 > libros.size()){
                        System.out.println("Error, has intentado modificar un elemento no existente, porfavor vuelve a intentarlo");
                    }
                    else if(indiceMod+1 <= libros.size()){
                             System.out.println("Ingrese el nuevo titulo del libro: ");
                             String nuevoTitulo = mcgregorstring.nextLine();
                             libros.get(indiceMod).setTitulo(nuevoTitulo);
                             System.out.println("Ingrese el nuevo autor del libro: ");
                             String nuevoAutor = mcgregorstring.nextLine();
                             libros.get(indiceMod).setAutor(nuevoAutor);
                             System.out.println("Ingrese el nuevo genero del libro: ");
                             String nuevoGenero = mcgregorstring.nextLine();
                             libros.get(indiceMod).setGenero(nuevoGenero);
                             System.out.println("Ingrese su nuevo de lanzamiento año del libro: ");
                             String nuevoAño=mcgregorstring.nextLine();
                             libros.get(indiceMod).setAño(nuevoAño);
                             System.out.println("Ingrese su nueva disponibilidad: (si/no)");
                             String nuevaDisp = mcgregorstring.nextLine();
                             libros.get(indiceMod).setDisponibilidad(nuevaDisp);
                         }
                         }
                         }
                         else if(opcionr==2){
                             if(articulos.isEmpty()){
                                 System.out.println("No hay articulso que modificar");
                             }
                             else{
                             System.out.println("Elige el articulo que quieras modificar de forma total por su indice: ");
                             int cont=1;
                             for(Articulos articulo : articulos){
                       System.out.print(cont+". Titulo: " + articulo.getTitulo());
                       System.out.print(" Autor: "+articulo.getAutor());
                       System.out.print(" Tema: "+articulo.getTema());
                       System.out.print(" Fecha de publicacion: "+articulo.getPublicacion());
                       System.out.println(" Disponibilidad : "+articulo.getAcceso());
                       cont++;
                   }
                    System.out.println("");
                    
                    int indiceMod = mcgregor.nextInt()-1;
                    if(indiceMod+1 > articulos.size()){
                        System.out.println("Error, has intentado modificar un articulo no existente, porfavor vuelve a intentarlo");
                    }
                    else if(indiceMod+1 <= articulos.size()){
                             System.out.println("Ingrese el nuevo titulo del articulo: ");
                            String nuevoTitulo = mcgregorstring.nextLine();
                            articulos.get(indiceMod).setTitulo(nuevoTitulo);
                             System.out.println("Ingrese el nuevo autor del articulo: ");
                             String nuevoAutor=mcgregorstring.nextLine();
                             articulos.get(indiceMod).setAutor(nuevoAutor);
                             System.out.println("Ingrese el nuevo tema del articulo: ");
                             String nuevoTema = mcgregorstring.nextLine();
                             articulos.get(indiceMod).setTema(nuevoTema);
                             System.out.println("Ingrese la nueva fecha de publicacion del articulo: " );
                             String nuevaFecha = mcgregorstring.nextLine();
                             articulos.get(indiceMod).setPublicacion(nuevaFecha);
                             System.out.println("Ingresa el nuevo acceso: ");
                             String nuevaDisp = mcgregorstring.nextLine();
                             articulos.get(indiceMod).setAcceso(nuevaDisp);  
                         }
                             }
                         }
                         
                         else if(opcionr==3){
                             if(conferencias.isEmpty()){
                                 System.out.println("No hay conferencias que modificar");
                             }
                                 else{
                       System.out.println("Elige la conferencia que quieras modificar por indice: ");
                       int cont=1;
                       for(Conferencias conferencia : conferencias){
                       System.out.print(cont+ ". Titulo: " + conferencia.getTitulo());
                       System.out.print(" Conferencista: "+conferencia.getConferencista());
                       System.out.print(" Fecha: "+conferencia.getFecha());
                       System.out.print(" Duracion: "+conferencia.getDuracion());
                       System.out.println(" Enlace : "+conferencia.getEnlace());
                       cont++;
                   }
                             System.out.println("");
                             int indiceMod=mcgregor.nextInt()-1;
                             if(indiceMod+1>conferencias.size()){
                                 System.out.println("Error, has intentado modificar una conferencia no existente, porfavor vuelve a intentarlo");
                             }
                             else if(indiceMod <= conferencias.size()){
                             System.out.println("Ingrese el nuevo titulo de la conferencia: ");
                             String nuevoTitulo = mcgregorstring.nextLine();
                             conferencias.get(indiceMod).setTitulo(nuevoTitulo);
                             System.out.println("Ingrese el nuevo conferencista: ");
                             
                             String nuevoConferencista = mcgregorstring.nextLine();
                             conferencias.get(indiceMod).setConferencista(nuevoConferencista);
                             System.out.println("Ingrese la fecha: ");
                             String nuevaFecha = mcgregorstring.nextLine();
                             conferencias.get(indiceMod).setFecha(nuevaFecha);
                            
                             System.out.println("Ingrese la nueva duracion de la conferencia: ");
                             String nuevaDuracion = mcgregorstring.nextLine();
                             conferencias.get(indiceMod).setDuracion(nuevaDuracion);
                             System.out.println("Ingrese el nuevo enlace: ");
                             String nuevoEnlace = mcgregorstring.nextLine();
                             conferencias.get(indiceMod).setEnlace(nuevoEnlace);
                             }
                             
                         }
                             
                             }
                         else if(opcionr==4){
                             if(cursos.isEmpty()){
                                 System.out.println("No hay cursos que modificar");
                             }
                             else{
                             int cont=1;
                             System.out.println("Seleccione el curso a modificar por su indice: ");
                     for(Cursos curso : cursos){
                       System.out.print(cont+". Titulo: " + curso.getTitulo());
                       System.out.print(" Conferencista: "+curso.getInstructor());
                       System.out.print(" Duracion del curso: "+curso.getDuracion());
                       System.out.print(" Plataforma: "+curso.getPlataforma());
                         System.out.println("");
                         cont++;
                   }
                     System.out.println("");
                     int indiceMod= mcgregor.nextInt()-1;
                     if(indiceMod+1>cursos.size()){
                         System.out.println("Error, has intentado modificar un curso no existente, porfavor vuelve a intentarlo");
                     }
                     else if(indiceMod+1<=cursos.size()){
                             System.out.println("Ingrese el nuevo titulo del curso: ");
                             String nuevoTitulo = mcgregorstring.nextLine();
                             cursos.get(indiceMod).setTitulo(nuevoTitulo);
                             System.out.println("Ingrese el nuevo instructor del curso: ");
                             String nuevoInstructor = mcgregorstring.nextLine();
                             cursos.get(indiceMod).setInstructor(nuevoInstructor);
                             System.out.println("Ingrese la nueva duracion del curso: ");
                             String nuevaDuracion = mcgregorstring.nextLine();
                             cursos.get(indiceMod).setDuracion(nuevaDuracion);
                             System.out.println("Ingrese la nuevaplataforma");
                             String nuevaPlataforma = mcgregorstring.nextLine();
                             cursos.get(indiceMod).setPlataforma(nuevaPlataforma);
                     }
                         }
                         }
                         else{
                             System.out.println("Error, seleccion invalida");
                         }
                    }
                    else if (!usuariosValidos.get(nUsuario).getTipoUsuario().equals("bibliotecario")){
                        System.out.println("Esta seccion no es accesible para ti, porfavor elige algo dentro de tus parametros ");
                    }  
                } // Modificar recursos
                
                else if(opcionGestor==5){
                    d=0;
                    b=0;
                    
                    System.out.println("Has cerrado sesion con exito!");
                    System.out.println("");
                }
                
                
                
                
                else {
                    System.out.println("Seleccion invalida, vuelva a intentarlo");
                    
                
            }
                
               }
                }
            
            else if(contValidez ==0){
                System.out.println("El usuario/contraseña ingresado no es valido, intentalo de nuevo!");
            }
                
                
                
                
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }// fin de while
        
        
        }
        
        
        else if(opcionMenu1 ==2){
            a=0;
        }
            
        else if (opcionMenu1 != 1 && opcionMenu1 !=2){
            System.out.println("Error, opcion fuera de rango, vuelva a intentarlo");
        }
        


        }
    }// Fin del main
        
    }// Fin de la clase
    


