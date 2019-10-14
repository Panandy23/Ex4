import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c;

        Scanner scaner = new Scanner(System.in);

        System.out.println("Podaj długość boku a: ");
        a = scaner.nextInt();
        System.out.println("Podaj długość boku b: ");
        b = scaner.nextInt();
        System.out.println("Podaj długość boku c: ");
        c = scaner.nextInt();


        if ((a*a + b*b) == c*c){
            System.out.println("Z tych boków można zbudować trójkąt prostokątny");

        } else{
            System.out.println("Z tych boków trójkąta prostokątnego nie zbudujesz");
        }



    }
}
