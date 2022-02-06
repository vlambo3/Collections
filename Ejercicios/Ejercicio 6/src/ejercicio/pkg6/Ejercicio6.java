/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Vanina
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        HashMap<String, Integer> tiendas = new HashMap();

        System.out.println("Bienvenido, para comenzar debe ingresar un producto:");

        String respuesta = " ";
        do {
            System.out.println("Ingrese el nombre de un producto");
            String producto = sc.next();

            System.out.println("Ingrese el precio de dicho producto");
            int precio = sc.nextInt();

            tiendas.put(producto, precio);

            System.out.println("Desea ingresar otro articulo?");
            respuesta = sc.next();

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("Ingrese una de las siguientes opciones" + "\n"
                + "1 - Modificar el precio de un producto ya ingresado" + "\n"
                + "2 - Eliminar un producto ya ingresado" + "\n"
                + "3 - Mostrar los productos con su precio" + "\n"
                + "4 - Salir");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("A que producto le quiere modificar el precio?");
                String articuloAModificar = sc.next();
                System.out.println("Ingrese el nuevo precio");
                int nuevoPrecio = sc.nextInt();
                                                
                //deberé agregar un bucle para que busque el producto y pueda tener todos los parametros de REPLACE
//                tiendas.replace(articuloAModificar, opcion, nuevoPrecio);
                
                for (Map.Entry<String, Integer> entry : tiendas.entrySet()) {                    
                    if (articuloAModificar.equalsIgnoreCase(entry.getKey())) {                       
                        tiendas.put(articuloAModificar, nuevoPrecio);
                    }                    
                }                
                                
                
                System.out.println("La tienda quedó compuesta de la sgt. manera:");
                  
                for (HashMap.Entry<String, Integer> entry : tiendas.entrySet()) {
                    System.out.println("Artículo=" + entry.getKey() + ", Precio=" + entry.getValue());
                }
                        
                break;
            case 2:
                System.out.println("Que producto quiere eliminar?");
                String articuloEliminar = sc.next();
                
                tiendas.remove(articuloEliminar);
                                
                System.out.println("La tienda quedó compuesta de la sgt. manera:");
                
                for (HashMap.Entry<String, Integer> entry : tiendas.entrySet()) {
                    System.out.println("Artículo=" + entry.getKey() + ", Precio=" + entry.getValue());
                }
                break;
            case 3:
                TreeMap<String, Integer> tiendasTree = new TreeMap(); 
                
                for (Map.Entry<String, Integer> entry : tiendas.entrySet()) {
                    System.out.println("Artículo=" + entry.getKey() + ", Precio=" + entry.getValue());
                }
                break;
            case 4:
                System.out.println("Bye");              
                break;
            default:
                System.out.println("El numero ingresado no está todavia en nuestro programa");
        }

    }

}
