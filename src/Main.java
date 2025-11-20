import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("¿Cuantos popochos tienes en casa?");
        int popocho = scan.nextInt();

        if (popocho==0) {
            System.out.println("Debes conseguir uno");
        } else if (popocho==1) {
            System.out.println("Ese popocho está muy mimado");
        } else if (popocho>=2 && popocho<=3) {
            System.out.println("La familia de popochos está muy equilibrada");
        } else if (popocho>3) {
            System.out.println("Hay demasiados popochos y que no quedará espacio en la cama");
        }

        for (int i= 0;i<popocho;i++) {
            System.out.println("Zzz...");
        }
        System.out.println("Todos los popochos están durmiendo");
    }
}