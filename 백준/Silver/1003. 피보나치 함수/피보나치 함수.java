import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        int[] testCase = new int[T];
        for (int i = 0 ; i <T ; i++){
            testCase[i] = sc.nextInt();
        }

        for(int i = 0 ; i < T ; i++){
            int ex = testCase[i];
            int[] cnt_0 = new int[ex+2];
            int[] cnt_1 = new int[ex+2];
            cnt_0[0] = 1;
            cnt_1[0] = 0;
            cnt_0[1] = 0;
            cnt_1[1] = 1;
            for (int index = 2 ; index <= ex ; index++){
                cnt_0[index] = cnt_0[index-1]+cnt_0[index-2];
                cnt_1[index] = cnt_1[index-1]+cnt_1[index-2];
            }
            System.out.println(cnt_0[ex]+" "+cnt_1[ex]);
        }


    }
}