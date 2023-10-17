import java.util.Scanner;

public class MyThirdProgram {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String imie = scan.nextLine();
        int ilosc = scan.nextInt();
        scan.nextLine();


        StudentIndex student = new StudentIndex(imie, ilosc);
        student.pobierzOceny();
        student.wypiszOceny();
        System.out.println("\nNajwyzsza ocena: " + student.najwyzszaOcena());
        System.out.print("Student nie ma ocen: " );
        student.wypiszNieotyrzymane();

    }          
}