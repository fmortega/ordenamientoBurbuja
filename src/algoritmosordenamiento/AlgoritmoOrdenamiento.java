package algoritmosordenamiento;

public class AlgoritmoOrdenamiento {

    public static void main(String[] args) {
        int arreglo[] = {21, 40, 4, 9, 10, 35};
        int temporal = 0;

        for (int i = 0; i < arreglo.length; i++) {

            for (int j = 0; j < arreglo.length - 1; j++) {

                //  System.out.println(" Se cambia el " + arreglo[j] + " por el " + arreglo[j + 1]);
                if (arreglo[j] > arreglo[j + 1]) {

                    for (int k = 0; k < arreglo.length; k++) {
////                      if (i == 0 && j == 0) {
////                            System.out.print(" " + arreglo[k]);
////                      }else{
//                      break;
                        //                   }
                        for (int h = 0; h < arreglo.length - 1; h++) {

                        }

                        System.out.print(" " + arreglo[k]);
                    }

                    System.out.println(" <-- Se cambia el " + arreglo[j] + " por el " + arreglo[j + 1]);

                    System.out.println("");
                    temporal = arreglo[j];

                    arreglo[j] = arreglo[j + 1];

                    arreglo[j + 1] = temporal;

                }

            }

        }

        System.out.println(" ");

        System.out.println("           Arreglo ordenado");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {

            }
            if (i + 1 < arreglo.length) {
                System.out.print(arreglo[i] + " --> ");
            } else {
                System.out.print(arreglo[i] + " ");
            }

        }

    }
}
