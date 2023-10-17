import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ,b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a == b && b == c) {
            System.out.println(a*1000 + 10000);
        }
        else if((a == b && b != c) || (a == c && b != c)){
            System.out.println(a*100 + 1000);
        }
        else if(c == b && a != c) {
            System.out.println(b*100 + 1000);
        }
        else {
            if(a>b && a>c) {
                System.out.println(a*100);
            }
            else if(b>a && b>c) {
                System.out.println(b*100);
            }
            else {
                System.out.println(c*100);
            }
        }
    }
}