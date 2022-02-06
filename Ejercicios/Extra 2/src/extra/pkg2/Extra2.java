/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<CantanteFamoso> losCantantes = new ArrayList();

        CantanteFamoso c1 = new CantanteFamoso();
        CantanteFamoso c2 = new CantanteFamoso();
        CantanteFamoso c3 = new CantanteFamoso();
        CantanteFamoso c4 = new CantanteFamoso();
        CantanteFamoso c5 = new CantanteFamoso();

        ServicioCantante.crear(c1);
        ServicioCantante.crear(c2);
        ServicioCantante.crear(c3);
        ServicioCantante.crear(c4);
        ServicioCantante.crear(c5);

        losCantantes.add(c1);
        losCantantes.add(c2);
        losCantantes.add(c3);
        losCantantes.add(c4);
        losCantantes.add(c5);

        System.out.println("Los nombes de cada cantante y su disco con más ventas son:");

        for (CantanteFamoso losCantante : losCantantes) {
            System.out.println(losCantante);
        }

        String respuesta = "";

        do {
            System.out.println("");

            System.out.println("Ingrese una de las siguientes opciones" + "\n"
                    + "1 - Agregar un Cantante más" + "\n"
                    + "2 - Mostrar todos los cantantes" + "\n"
                    + "3 - Eliminar un cantante" + "\n"
                    + "4 - Salir");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    String rta = "";
                    do {
                    CantanteFamoso c = new CantanteFamoso();
                    ServicioCantante.crear(c1);
                    losCantantes.add(c1);
                        System.out.println("Desea ingresar otro cantante (no/si)");
                        rta = sc.next();
                    } while (rta.equalsIgnoreCase("si"));
                    break;
                case 2:
                    System.out.println("Los nombes de cada cantante y su disco con más ventas son:");

                    for (CantanteFamoso losCantante : losCantantes) {
                        System.out.println(losCantante);
                    }
                    break;
                case 3:
                    System.out.println("Que producto quiere eliminar?");
                String cantanteEliminar = sc.next();
                
                losCantantes.remove(cantanteEliminar);
                                
                System.out.println("La tienda quedó compuesta de la sgt. manera:");
                
                for (CantanteFamoso losCantante : losCantantes) {
                        System.out.println(losCantante);
                    }
                    break;
                case 4:
                    System.out.println("Seguro que desea salir?");
                    respuesta = sc.next();

            }
            

        } while (respuesta.equalsIgnoreCase("si"));

    }
}
