import java.util.*;

public class Arreglo4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int edad;
        int edadMayor = 0;
        int edadMenor = 100;

        for (int i = 20; i >= 1; i--) {

            System.out.print("Ingrese su edad: ");
            edad = teclado.nextInt();

            if (edad > edadMayor) {
                edadMayor = edad;
            }

            if (edad < edadMenor) {
                edadMenor = edad;
            }

        }

        System.out.println("La persona con mas edad tiene: "+edadMayor);
        System.out.println("La persona con menos edad tiene: "+edadMenor);
        
    }
}