
package quicksort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controlador {

    public static void main(String[] args) {
        List<Integer> numbersCien = new ArrayList<>();
        List<Integer> numbersMil = new ArrayList<>();
        List<Integer> numbersDiezMil = new ArrayList<>();
        List<Integer> mejorCasoCiens = new ArrayList<>();
        List<Integer> mejorCasoMils = new ArrayList<>();
        List<Integer> mejorCasoDiezMils = new ArrayList<>();
        List<Integer> peorCasoCiens = new ArrayList<>();
        List<Integer> peorCasoMils = new ArrayList<>();
        List<Integer> peorCasoDiezMils = new ArrayList<>();


        // Rutas relativas de los tres archivos
        String filePath1 = "./src/quicksort/DataCien.txt";
        String filePath2 = "./src/quicksort/DataMil.txt";
        String filePath3 = "./src/quicksort/DataDiezMil.txt";
        String filePath4 = "./src/quicksort/PeorCasoCien.txt";
        String filePath5 = "./src/quicksort/PeorCasoMil.txt";
        String filePath6 = "./src/quicksort/PeorCasoDiezMil.txt";
        String filePath7 = "./src/quicksort/MejorCasoCien.txt";
        String filePath8 = "./src/quicksort/MejorCasoMil.txt";
        String filePath9 = "./src/quicksort/MejorCasoDiezMil.txt";



        // -----------------LECTURA DE LOS CIEN DATOS-----------------------
        try {
            File file = new File(filePath1);
            BufferedReader br = new BufferedReader(new FileReader(file));
            // Leer el archivo línea por línea
            String line;
            while ((line = br.readLine()) != null) {
                // Convierte la línea a número y añádelo a la lista
                int numberCien = Integer.parseInt(line);
                // Agregar cada línea al ArrayList
                numbersCien.add(numberCien);
            }

            br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir a número: " + e.getMessage());
        }

        // Convertir la lista con los CIEN DATOS a un arreglo de enteros
        int[] numbersArrayCien = new int[numbersCien.size()];
        for (int i = 0; i < numbersCien.size(); i++) {
            numbersArrayCien[i] = numbersCien.get(i);
        }
        // -----------------LECTURA DE LOS MIL DATOS-----------------------
        try {
            File file = new File(filePath2);
            BufferedReader br = new BufferedReader(new FileReader(file));
            // Leer el archivo línea por línea
            String line;
            while ((line = br.readLine()) != null) {
                // Convierte la línea a número y añádelo a la lista
                int numberMil = Integer.parseInt(line);
                // Agregar cada línea al ArrayList
                numbersMil.add(numberMil);
            }

            br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir a número: " + e.getMessage());
        }

        // Convertir la lista de los MIL DATOS a un arreglo de enteros
        int[] numbersArrayMil = new int[numbersMil.size()];
        for (int i = 0; i < numbersMil.size(); i++) {
            numbersArrayMil[i] = numbersMil.get(i);
        }

        // -----------------LECTURA DE LOS DIEZ MIL DATOS-----------------------
        try {
            File file = new File(filePath3);
            BufferedReader br = new BufferedReader(new FileReader(file));
            // Leer el archivo línea por línea
            String line;
            while ((line = br.readLine()) != null) {
                // Convierte la línea a número y añádelo a la lista
                int numberDiezMil = Integer.parseInt(line);
                // Agregar cada línea al ArrayList
                numbersDiezMil.add(numberDiezMil);
            }

            br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir a número: " + e.getMessage());
        }

        // Convertir la lista de los DIEZ MIL DATOS a un arreglo de enteros
        int[] numbersArrayDiezMil = new int[numbersDiezMil.size()];
        for (int i = 0; i < numbersDiezMil.size(); i++) {
            numbersArrayDiezMil[i] = numbersDiezMil.get(i);
        }
        
        
        // -----------------LECTURA DE MEJOR CASO CIEN-----------------------
        try {
            File file = new File(filePath7);
            BufferedReader br = new BufferedReader(new FileReader(file));
            // Leer el archivo línea por línea
            String line;
            while ((line = br.readLine()) != null) {
                // Convierte la línea a número y añádelo a la lista
                int mejorCasoCien = Integer.parseInt(line);
                // Agregar cada línea al ArrayList
                mejorCasoCiens.add(mejorCasoCien);
            }

            br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir a número: " + e.getMessage());
        }

        // Convertir la lista a un arreglo de enteros
        int[] arrayMejorCasoCien = new int[mejorCasoCiens.size()];
        for (int i = 0; i < mejorCasoCiens.size(); i++) {
            arrayMejorCasoCien[i] = mejorCasoCiens.get(i);

        }
        
        // -----------------LECTURA DE MEJOR CASO MIL-----------------------

        try {
            File file = new File(filePath8);
            BufferedReader br = new BufferedReader(new FileReader(file));
            // Leer el archivo línea por línea
            String line;
        while ((line = br.readLine()) != null) {
            // Convierte la línea a número y añádelo a la lista
            int mejorCasoMil = Integer.parseInt(line);
            // Agregar cada línea al ArrayList
            mejorCasoMils.add(mejorCasoMil);
        }

        br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
             System.err.println("Error al convertir a número: " + e.getMessage());
        }

        // Convertir la lista a un arreglo de enteros
        int[] arrayMejorCasoMil = new int[mejorCasoMils.size()];
        for (int i = 0; i < mejorCasoMils.size(); i++) {
            arrayMejorCasoMil[i] = mejorCasoMils.get(i);
        }

// -----------------LECTURA DE MEJOR CASO DIEZ MIL-----------------------

        try {
            File file = new File(filePath9);
            BufferedReader br = new BufferedReader(new FileReader(file));
            // Leer el archivo línea por línea
            String line;
        while ((line = br.readLine()) != null) {
            // Convierte la línea a número y añádelo a la lista
            int mejorCasoDiezMil = Integer.parseInt(line);
            // Agregar cada línea al ArrayList
            mejorCasoDiezMils.add(mejorCasoDiezMil);
        }

        br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir a número: " + e.getMessage());
        }

        // Convertir la lista a un arreglo de enteros
        int[] arrayMejorCasoDiezMil = new int[mejorCasoDiezMils.size()];
        for (int i = 0; i < mejorCasoDiezMils.size(); i++) {
            arrayMejorCasoDiezMil[i] = mejorCasoDiezMils.get(i);
        }

        
        // -----------------LECTURA DE PEOR CASO CIEN-----------------------
        try {
            File file = new File(filePath4);
            BufferedReader br = new BufferedReader(new FileReader(file));
            // Leer el archivo línea por línea
            String line;
            while ((line = br.readLine()) != null) {
                // Convierte la línea a número y añádelo a la lista
                int peorCasoCien = Integer.parseInt(line);
                // Agregar cada línea al ArrayList
                peorCasoCiens.add(peorCasoCien);
            }

            br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir a número: " + e.getMessage());
        }

        // Convertir la lista a un arreglo de enteros
        int[] arrayPeorCasoCien = new int[peorCasoCiens.size()];
        for (int i = 0; i < peorCasoCiens.size(); i++) {
            arrayPeorCasoCien[i] = peorCasoCiens.get(i);
        }
        
        
       // -----------------LECTURA DE PEOR CASO MIL-----------------------


        try {
            File file = new File(filePath5);
            BufferedReader br = new BufferedReader(new FileReader(file));
            // Leer el archivo línea por línea
        String line;
        
        while ((line = br.readLine()) != null) {
            // Convierte la línea a número y añádelo a la lista
            int peorCasoMil = Integer.parseInt(line);
            // Agregar cada línea al ArrayList
            peorCasoMils.add(peorCasoMil);
        }

        br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir a número: " + e.getMessage());
        }

        // Convertir la lista a un arreglo de enteros
        int[] arrayPeorCasoMil = new int[peorCasoMils.size()];
        for (int i = 0; i < peorCasoMils.size(); i++) {
            arrayPeorCasoMil[i] = peorCasoMils.get(i);
        }
        
        
        // -----------------LECTURA DE PEOR CASO DIEZ MIL-----------------------


        try {
            File file = new File(filePath6);
            BufferedReader br = new BufferedReader(new FileReader(file));
            // Leer el archivo línea por línea
            String line;
        while ((line = br.readLine()) != null) {
            // Convierte la línea a número y añádelo a la lista
            int peorCasoDiezMil = Integer.parseInt(line);
            // Agregar cada línea al ArrayList
            peorCasoDiezMils.add(peorCasoDiezMil);
        }
        
        br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir a número: " + e.getMessage());
        }

        // Convertir la lista a un arreglo de enteros
        int[] arrayPeorCasoDiezMil = new int[peorCasoDiezMils.size()];
        for (int i = 0; i < peorCasoDiezMils.size(); i++) {
            arrayPeorCasoDiezMil[i] = peorCasoDiezMils.get(i);
        }
        
        //EJECUCION DE ALGORITMOS
        
        //QUICKSORT
        
        //Creo objeto para utilizar el ordenamiento quicksort en la clase quicksort
        QuickSort quicksort = new QuickSort();
        
        quicksort.quicksort(arrayMejorCasoCien, 0, (arrayMejorCasoCien.length) - 1);
        quicksort.imprimirArreglo(arrayMejorCasoCien, "'arrayMejorCasoCien'");
        quicksort.resetContadores();
        
        quicksort.quicksort(arrayMejorCasoMil, 0, (arrayMejorCasoMil.length) - 1);
        quicksort.imprimirArreglo(arrayMejorCasoMil, "'arrayMejorCasoMil'");
        quicksort.resetContadores();
        
        quicksort.quicksort(arrayMejorCasoDiezMil, 0, (arrayMejorCasoDiezMil.length) - 1);
        quicksort.imprimirArreglo(arrayMejorCasoDiezMil, "'arrayMejorCasoDiezMil'");
        quicksort.resetContadores();
        
        quicksort.quicksort(arrayPeorCasoCien, 0, (arrayPeorCasoCien.length) - 1);
        quicksort.imprimirArreglo(arrayPeorCasoCien, "'arrayPeorCasoCien'");
        quicksort.resetContadores();
        
        quicksort.quicksort(arrayPeorCasoMil, 0, (arrayPeorCasoMil.length) - 1);
        quicksort.imprimirArreglo(arrayPeorCasoMil, "'arrayPeorCasoMil'");
        quicksort.resetContadores();
        
        quicksort.quicksort(arrayPeorCasoDiezMil, 0, (arrayPeorCasoDiezMil.length) - 1);
        quicksort.imprimirArreglo(arrayPeorCasoDiezMil, "'arrayPeorCasoDiezMil'");
        quicksort.resetContadores();
        
        quicksort.quicksort(numbersArrayCien, 0, (numbersArrayCien.length) - 1);
        quicksort.imprimirArreglo(numbersArrayCien, "'numbersArrayCien'");
        quicksort.resetContadores();
        
        quicksort.quicksort(numbersArrayMil, 0, (numbersArrayMil.length) - 1);
        quicksort.imprimirArreglo(numbersArrayMil, "'numbersArrayMil'");
        quicksort.resetContadores();
        
        quicksort.quicksort(numbersArrayDiezMil, 0, (numbersArrayDiezMil.length) - 1);
        quicksort.imprimirArreglo(numbersArrayDiezMil, "'numbersArrayDiezMil'");
        quicksort.resetContadores();
               
        //MERGESORT
        
        //Creo objeto para utilizar el ordenamiento mergesort en la clase quicksort

        MergeSort mergesort = new MergeSort();
        
        mergesort.mergeSort(numbersArrayCien);
        mergesort.imprimirArreglo(numbersArrayCien, "'numbersArrayCien'");
        mergesort.resetContadores();
        
        mergesort.mergeSort(numbersArrayMil);
        mergesort.imprimirArreglo(numbersArrayMil, "'numbersArrayMil'");
        mergesort.resetContadores();
        
        mergesort.mergeSort(numbersArrayDiezMil);
        mergesort.imprimirArreglo(numbersArrayDiezMil, "'numbersArrayDiezMil'");
        mergesort.resetContadores();
        
        
    } 
    
}
