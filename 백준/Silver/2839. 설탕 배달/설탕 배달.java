import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max5 = N / 5;
        for(int i = 0 ; i <= max5 ; i++) {
            int reSugar = N - (5*i);
            if((reSugar % 3) == 0) {
                int cur = i + (reSugar / 3);
                min = Math.min(min,cur);
            }
        }
        if(min == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(min);
    }
}