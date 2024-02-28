package quicksort;

public class MergeSort {
    
    private static int conPasosM = 0;
    private static int conCiclosM = 0;

    public static void mergeSort(int[] arr) {
        conCiclosM++; // se le suma al contador de ciclos 
        if (arr.length > 1) {
            int mitad = arr.length / 2;
            int[] arrIzquierda = new int[mitad];
            int[] arrDerecha = new int[arr.length - mitad];

            System.arraycopy(arr, 0, arrIzquierda, 0, mitad);
            System.arraycopy(arr, mitad, arrDerecha, 0, arr.length - mitad);

            mergeSort(arrIzquierda);
            mergeSort(arrDerecha);

            merge(arr, arrIzquierda, arrDerecha);
            
            conPasosM += 8;
        }
        conPasosM += 1;
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            conCiclosM++;
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
                conPasosM += 2;
            } 
            else {
                arr[k++] = right[j++];
                conPasosM += 2;
            }
        }
            
        while (i < left.length) {
            conCiclosM++;
            arr[k++] = left[i++];
            conPasosM += 2;
        }
            
        while (j < right.length) {
            conCiclosM++;
            arr[k++] = right[j++];
            conPasosM += 2;
        }
    }
    
    //Reinicia los contadores del ordenamiento
    public void resetContadores() {
        conPasosM = 0;
        conCiclosM = 0;
    }

    
    public void imprimirArreglo(int array[], String nombre){
        System.out.println("El tamano del arreglo " + nombre + " es: " + array.length);
        System.out.println("El numero de ciclos de MergeSort es: " + conCiclosM);
        System.out.println("El numero de pasos de MergeSort es: " + conPasosM + "\n");
        
        /*DESCOMENTAR SI SE QUIERE VER EL ARREGLO ORDENADO
        System.out.println("El arreglo ordenado por MergeSort es: ");
        for (int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }*/
    }
    
}
