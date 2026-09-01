import java.util.Scanner;

public class O3 {
    //Lag et program som leser inn et heltall n > 0, beregner verdien n! (n fakultet) og skriver verdien til n! ut på skjermen, der n! = 1*2*3* … *(n-1)*n.
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("skriv inn n: ");
        int n = in.nextInt();
        if (n < 0){
            System.out.println("tallet er ikke heltall");
        } else {
            int fakultet = 1;

            for (int i = 1; i <= n; i++) {
                fakultet = fakultet * i;
            }
            System.out.println(n + "! = " + fakultet);
        }
    }
}
