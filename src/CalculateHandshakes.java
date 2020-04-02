import java.util.Scanner;

public class CalculateHandshakes {


        public static void main(String[] args)
        {
            int num;
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            int total = num * (num-1) / 2; // Combination nC2
            System.out.print(total);
        }
    }

