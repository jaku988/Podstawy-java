import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] agrs){

        int wybor;
        Scanner scanner = new Scanner(System.in);
        int bokA, bokB, bokC;

        do{

            System.out.print("A: ");
            bokA = scanner.nextInt();

            System.out.print("B: ");
            bokB = scanner.nextInt();

            System.out.print("C: ");
            bokC = scanner.nextInt();

            Triangle t = new Triangle(bokA, bokB, bokC);

            if(t.getBokA() == -1){
                break;
            }

            System.out.println("1. pole");
            System.out.println("2. obwod");
            System.out.println("3. Typ");
            System.out.println("4. Wyjscie");
            System.out.println("Wybor: ");

            wybor = scanner.nextInt();

            switch(wybor){

                case 1: System.out.println(t.getPole()); break;
                case 2: System.out.println(t.getObwod()); break;
                case 3: System.out.println(t.getTyp()); break;
                default: break;
            }


        }while(wybor != 4);
        scanner.close();
    }
}