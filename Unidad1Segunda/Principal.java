package Unidad1Segunda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("De cuantos datos quieres tu arreglo?");
        int a = leer.nextInt();
        String arreglo[] = new String[a];
        System.out.println("**** Insertar datos en arreglo*******");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el dato " + (i + 1) + ": ");
            arreglo[i] = leer.next();
        }
        System.out.println("");
        System.out.println("********** Datos del arreglo *********");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        System.out.println("***********Pasando a lista los datos del arreglo***********");
        List<String> cosillas = new ArrayList<String>();
        for (int i = 0; i < arreglo.length; i++) {
            cosillas.add(arreglo[i]);
        }
        System.out.println("*********Los datos de la lista son ************");
        for (int i = 0; i < cosillas.size(); i++) {
            System.out.print(cosillas.get(i) + " ");
        }
        System.out.println("");
        boolean seguir = true;
        String nelem;
        do {
            int op;
            System.out.println("Deseas agregar otro dato?   1. Si    2. No");
            op = leer.nextInt();
            if (op == 1) {
                System.out.print("Elemento a insertar: ");
                nelem = leer.next();
                cosillas.add(nelem);
                System.out.println("");
            } else {
                System.out.println("********Los nuevos datos de la lista son***********");
                for (int i = 0; i < cosillas.size(); i++) {
                    System.out.print(cosillas.get(i) + " ");
                }
                seguir = false;
            }
        } while (seguir);
    }
}
