public class Triangle {

    private double bokA;
    private double bokB;
    private double bokC;

    public Triangle(double a, double b, double c){

        if(a < b+c && b < a+c && c < a+b) {

            bokA = a;
            bokB = b;
            bokC = c;
        }
        else{
            bokA = -1;
        }
    }

    public double getPole(){

        double p = (bokA + bokB + bokC) / 2;
        return Math.sqrt(p * (p - bokA) * (p-bokB) * (p-bokC));

    }

    public double getObwod(){

        return bokA + bokB + bokC;
    }

    public String getTyp(){

        double a = (Math.pow(bokB, 2) + Math.pow(bokC, 2) - Math.pow(bokA, 2)) / (2 * bokC * bokB);
        double b = (Math.pow(bokA, 2) + Math.pow(bokC, 2) - Math.pow(bokB, 2)) / (2 * bokC * bokA);
        double c = (Math.pow(bokA, 2) + Math.pow(bokB, 2) - Math.pow(bokC, 2)) / (2 * bokB * bokA);

        if(a < 0 || b < 0 || c < 0){
            return "Rozwartokatny";
        }
        else if(a == 0 || b == 0 || c == 0){
            return "Prostokatny";
        }

        return "Ostrokatny";
    }

    public double getBokA(){

        return bokA;
    }

    public double getBokB(){

        return bokB;
    }

    public double getBokC(){

        return bokC;
    }
}
