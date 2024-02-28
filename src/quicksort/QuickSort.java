package quicksort;

public class QuickSort {

    private static int conPasosQ = 0;
    private static int conCiclosQ = 0;
    
   public static int particion(int array[], int iniarray, int finarray){
        int pivote = array[finarray];
        int menor = (iniarray - 1);
        conPasosQ += 2; // Se asignan los valores a pivote y menor
        
        //Recorre todo el arreglo buscando el menor y lo cambia
        for (int i = iniarray;  i < finarray; i++){
            conCiclosQ++;
            if (array[i] <= pivote){
                menor++;
                int temp = array[menor];
                array[menor] = array[i];
                array[i] = temp;
                conPasosQ += 5; // Se incrementa en 5 por las operaciones dentro del if
            }
            conPasosQ += 1; // Se incrementa en 1 por la operación de comparación
        }

        int temp = array[menor + 1];
        array[menor + 1] = array[finarray];
        array[finarray] = temp;
        conPasosQ += 4; // Se incrementa en 4 por las operaciones de asignación y cambio de valores

        return menor + 1;
        
    }

    public void quicksort(int array[], int iniarray, int finarray){
        conPasosQ++; // Se incrementa en 1 por la operación de comparación
        if (iniarray < finarray) {
            int pivote = particion(array, iniarray, finarray);
            quicksort(array, iniarray, pivote - 1);
            quicksort(array, pivote + 1, finarray);
            conPasosQ += 4; // Se incrementa en 4 por las operaciones de asignación y las llamadas a quicksort
        }
    }
    
    //Reinicia los contadores del ordenamiento
    public void resetContadores() {
        conPasosQ = 0;
        conCiclosQ = 0;
    }

    public void imprimirArreglo(int array[], String nombre){
        System.out.println("El tamano del arreglo " + nombre + " es: " + array.length);
        System.out.println("El numero de ciclos de QuickSort es: " + conCiclosQ);
        System.out.println("El numero de pasos de QuickSort es: " + conPasosQ + "\n");
        
        /* DESCOMENTAR SI SE QUIERE VER EL ARREGLO ORDENADO
        System.out.println("El arreglo ordenado por QuickSort es: ");
        for (int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }*/
    }
}
