package algoritmosordenamiento;

public class AlgoritmoOrdenamiento {

    public static void main(String[] args) {
        int arreglo[] = {21, 40, 4, 9, 10, 35};
        int temporal = 1;
        int contador = 0;
        int contador2 = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {

                System.out.println(" Se cambia el " + arreglo[j] + " por el " + arreglo[j + 1] );
                
                 System.out.println("");

                if (arreglo[j] > arreglo[j + 1]) {

                    temporal = arreglo[j];

                    arreglo[j] = arreglo[j + 1];

                    arreglo[j + 1] = temporal;
                    
                    for (int k = 0; k < arreglo.length; k++) {
                    for (int h = 0; h < arreglo.length ; h++) {

                    }
                
                }
 
                }

            }

        }

        System.out.println(" ");
    


        System.out.println("Arreglo ordenado");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {

            }
            if (i + 1 < arreglo.length) {
                System.out.print(arreglo[i] + " --> ");
            } else {
                System.out.print(arreglo[i]+" ");
            }

        }
    

}
}