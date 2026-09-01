import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("hvor mye du tjener i bruttolønn: ");
        double brutto = in.nextDouble();
        double skatt = 0;


        if (brutto <= 217400) {
            System.out.println("Du tjener ikke nok til å betale skatt.");
            return;
        }
        if (brutto > 217400) {
            skatt += (Math.min(brutto, 318300) - 217400) * 0.017;
        }
        if (brutto > 318301) {
            skatt += (Math.min(brutto, 725050) - 318301) * 0.04;
        }
        if (brutto > 725050) {
            skatt += (Math.min(brutto, 980100) - 725050) * 0.137;
        }
        if (brutto > 980101) {
            skatt += (Math.min(brutto, 1467201) - 980101) * 0.168;
        }
        if (brutto > 1467200){
            skatt += (brutto - 1467200) * 0.178;
        }
        System.out.println("din bruttolønn er: " + brutto);
        System.out.println("din skatt er: " + skatt);
        System.out.println("Din Nettoinntekt er: " + (brutto-skatt));
    }
}