import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
    }
}