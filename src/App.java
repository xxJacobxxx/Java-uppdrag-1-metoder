import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ge mig en diameter på en cirkl");
        Scanner tb = new Scanner(System.in);
        double radie = tb.nextInt();
        System.out.println("Omkretsen är "+omkretsCirkel(radie) );
    }
    static double omkretsCirkel(double radie){
        double omkrets = 3.1415*radie*2;
        return omkrets;
    }
}
