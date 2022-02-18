import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos_de_Busqueda {
    public static void main (String[] args) {
        System.out.println();
        System.out.println("1.- Búsqueda Secuencial");
        System.out.println("2.- Búsqueda Binaria");
        System.out.println("3.- Salir");
        Scanner sc = new Scanner(System.in);

        int op = sc.nextInt();
        
        do {
            
            switch(op) {
                case 1: //Switch case de la Búsqueda Secuencial

                    int arrayS [] = new int [10];
                    arrayS[0] = (int)(Math.random() * 10);
                    arrayS[1] = (int)(Math.random() * 10);
                    arrayS[2] = (int)(Math.random() * 10);
                    arrayS[3] = (int)(Math.random() * 10);
                    arrayS[4] = (int)(Math.random() * 10);
                    arrayS[5] = (int)(Math.random() * 10);
                    arrayS[6] = (int)(Math.random() * 10);
                    arrayS[7] = (int)(Math.random() * 10);
                    arrayS[8] = (int)(Math.random() * 10);
                    arrayS[9] = (int)(Math.random() * 10);    

                    System.out.println("");
                    System.out.println("Los datos del array son: ");
                    imprimirArreglo(arrayS);//Imprimimos el Array

                    int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dato a buscar: "));

                    int busqueda = BusquedaSecuencial(arrayS, dato);

                    if (busqueda != -1) {
                        JOptionPane.showMessageDialog(null, "El dato se encuentra en la posición " + busqueda);
                    } else {
                        JOptionPane.showMessageDialog(null, "El dato no se encuentra");
                    }
                    break;

                case 2: //Switch case de la Búsqueda Binaria 
                    int arrayB [] = new int [10];
                    arrayB[0] = (int)(Math.random() * 10);
                    arrayB[1] = (int)(Math.random() * 10);
                    arrayB[2] = (int)(Math.random() * 10);
                    arrayB[3] = (int)(Math.random() * 10);
                    arrayB[4] = (int)(Math.random() * 10);
                    arrayB[5] = (int)(Math.random() * 10);
                    arrayB[6] = (int)(Math.random() * 10);
                    arrayB[7] = (int)(Math.random() * 10);
                    arrayB[8] = (int)(Math.random() * 10);
                    arrayB[9] = (int)(Math.random() * 10); 

                    System.out.println("");
                    System.out.println("Los datos del array son:");
                    imprimirArreglo(arrayB); //Imprimimos el Array

                    System.out.println("Método QuickSort");
                    QuickSort(arrayB, 0, 9); //Llamamos a QuickSort para ordenarlo

                    System.out.println("Impresión del nuevo array");
                    imprimirArreglo(arrayB); //Imprimimos el nuevo Array

                    int dato0 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dato a buscar: "));

                    int busqueda0 = BusquedaBinaria(arrayB, dato0);

                    if (busqueda0 != -1) {
                        JOptionPane.showMessageDialog(null, "El dato se encuentra en la posición " + busqueda0);
                    } else {
                        JOptionPane.showMessageDialog(null, "El dato no se encuentra");
                    }

                    break;
            }
            
        } while (op == 3);
    }
    //Método de la Búsqueda Secuencial
    private static int BusquedaSecuencial(int array[], int dato) { 
        System.out.println("");
        for (int i = 0; i < 10; i++){
            if(dato == array[i]) {
                return i;
            }
        }
        return -1;
    }
    
    //Método de la Búsqueda Binaria
    private static int BusquedaBinaria(int array[], int dato) {
        int centro, primero, ultimo, valorCentro;
        primero = 0;
        ultimo = array.length-1;
        
        System.out.println("");
        
        while (primero <= ultimo) {
            centro = (primero + ultimo) / 2;
            valorCentro = array[centro];
               
            if (dato == valorCentro) {
                return centro;
            } else if (dato < valorCentro) {
                ultimo = centro -1; //Nos deplazamos a la izquierda
            } else {
                primero = centro +1; //Nos deplazamos a la derecha
            }       
         }
        return -1;
    }
    
    //Método para imprimir el array
    public static void imprimirArreglo(int array[]){
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("");
    }
    
    //Método QuickSort
    public static void QuickSort(int array[], int izq, int der) {
        int piv = array[izq];
        
        int i = izq;
        int j = der;
        int swap;
                      
        while (i < j) {
            while (array[i] <= piv && i < j) {
                i++;
            }
            while (array[j] > piv) {
                j--;
            }
            
            if (i < j) {
                swap = array[i];
                array[i] = array[j];
                array[j] = swap;
                
                imprimirArreglo(array);
            } 
        }
        array[izq] = array[j];
        array[j] = piv;
        
        if (izq < j -1) {
            QuickSort(array, izq, j -1);
        }
        if (j + 1 < der) {
            QuickSort(array, j + 1, der);
        }
        
    }

}