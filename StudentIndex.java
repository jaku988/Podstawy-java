import java.util.Arrays;
import java.util.Scanner;

public class StudentIndex {

    private String nazwisko;
    private int ile_przedmiotow;
    int[] oceny;

    StudentIndex(String n, int i){

        if(i > 0) {
            nazwisko = n;
            ile_przedmiotow = i;
            oceny = new int[ile_przedmiotow];
        }
    }

    public void pobierzOceny(){

        Scanner scan = new Scanner(System.in);

        for(int i=0; i<ile_przedmiotow; i++){

            int a = scan.nextInt();
            oceny[i] = a;
        }
    }

    public void wypiszOceny(){

        System.out.println("Nazwisko " + nazwisko);

        System.out.println("Oceny: ");
        for(int i=0; i<oceny.length; i++){

            String a = switch(oceny[i]){
                case 2: yield "niedostateczny";
                case 3: yield "dostateczny";
                case 4: yield "dobry";
                case 5: yield "bardzo dobry";
                default:
                    yield "blad";
            };
            System.out.print(a+" ");
        }
    }

    public String najwyzszaOcena(){
        int[] temp_oceny = oceny;

        Arrays.sort(oceny);

        int res = oceny[oceny.length-1];
        oceny = temp_oceny;

        String a = switch(res){
            case 2: yield "niedostateczny";
            case 3: yield "dostateczny";
            case 4: yield "dobry";
            case 5: yield "bardzo dobry";
            default:
                yield "blad";
        };

        return a;
    }

    public void wypiszNieotyrzymane(){

        for(int o=2; o<=5; o++){

            for(int i=0; i<oceny.length; i++){

                if(oceny[i] == o){
                    break;
                }
                if(i == oceny.length-1){
                    String a = switch(o){
                        case 2: yield "niedostateczny";
                        case 3: yield "dostateczny";
                        case 4: yield "dobry";
                        case 5: yield "bardzo dobry";
                        default:
                            yield "blad";
                    };
                    System.out.print(a + " ");
                }
            }
        }
    }

}
