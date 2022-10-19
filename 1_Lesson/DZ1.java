import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        System.out.println("Введите N");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //System.out.println(n);
        for(int i = 1; i < n+1; i++) {
            int t = (i * (i + 1)) / 2;
            System.out.println(t);

         }

    }
    
}
