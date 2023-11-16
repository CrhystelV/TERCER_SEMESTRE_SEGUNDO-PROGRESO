import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
        //forma uno de declaraciòn
        //String productos[]= new String [7];
        //forma dos de declaracion
        String[] productos = {"KP64GB", "SGalS9", "hd ss", "vaina3", "vaina4", "vaina5"};

        //matriz con productos tipo string
        //length magnitud de productos
        int total = productos.length;
        //Bucle for
        for (int i = 0; i < total; i++) {
            System.out.println("Indice " + i + " : " + productos[i]);
        }
        System.out.println("\n");
        //importa java class
       /* Arrays.sort(productos);
        System.out.println("\n");
        for (int i=0; i<total; i++){
            System.out.println("Indice " + i + " : "+ productos[i] );
        }*/
        //ordenamiento con mètodo burbuja
        int contador = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                //ordenar de menor a mayor
                if (productos[i].compareTo(productos[j]) > 0)
                {
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("interaciones " + contador);
        for (int i = 0; i < total; i++) {
            System.out.println("I " + i + " : " + productos[i]);
        }
    }
}
