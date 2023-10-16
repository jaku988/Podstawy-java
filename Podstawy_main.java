import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void Podstawy_main(String[] agrs){

        Bicycle b = new Bicycle(3);
        Bicycle b1 = b;
        Object a = new Object();
        Integer i = 5;

        //equals dla klas porównuje adresy pamięci (jeżeli b i b1 będą oddzielnie stworzone to zroci false)
        if(b.equals(b1)){
            System.out.println("true");
        }

        //do pobrania wartosci z klawiatury tworzymy Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj x: ");
        int x = scanner.nextInt();
        scanner.nextLine();

        //skladnia switcha, yield 3 przypisuje wartosci y 3
        int y = switch(x){

            case 1: yield 3;
            case 2: yield 7;
            case 3: yield 9;
            default: yield 12;
        };

        System.out.println("y = " + y);

        //skladnia tworzenia i wypisywania tablic
        int[] tab = new int[90];
        int[] tab2 = {4, 5, 6, 1, 7, -4, 0};
        Bicycle tab3[] = new Bicycle[3];

        Arrays.sort(tab2);
        for(int o=0; o<tab2.length; o++) {
            System.out.println(tab2[o]);
        }

        for(int j=0; j<tab3.length; j++){

            tab3[j] = new Bicycle(j+5);
        }

        double num = 0.6666;
        System.out.format("%.2f", num); //zaokrąglenie do 2 miejsc po przecinku
    }
}
