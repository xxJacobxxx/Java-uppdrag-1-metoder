import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ritaRektang(4, 5);
    }

    static void ritaRektang (int längd, int höjd){
        for (int i=0; i<höjd;i++){
            System.out.println();
            for (int j=0; j<längd;j++){
                System.out.print("*");
            }
        }
    }
    
}
