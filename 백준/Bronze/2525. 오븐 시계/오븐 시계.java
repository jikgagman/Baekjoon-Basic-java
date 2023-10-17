import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,m, time;
        h = sc.nextInt();
        m = sc.nextInt();
        time = sc.nextInt();

        if(m + time >= 60) {
            int temp = m + time;
            m = temp % 60;
            h = h + temp / 60;
            if(h > 23) {
                h = h - 24;
            }
        }
        else {
            m = m + time;
        }
        System.out.printf("%d %d", h, m);
    }
}