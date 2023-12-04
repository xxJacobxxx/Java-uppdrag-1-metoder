import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Droppa ett tal som är negativt eller positivt");
        System.out.println(tal_positiv(tb.nextInt()));
        
    }

    static boolean tal_positiv (double tal){
       double summa = tal+tal;
       if (summa<=0){
        return false;
       }
       else{
        return true;
       }
    }
    
}
