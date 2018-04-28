import java.util.Scanner;
import java.math.BigInteger;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 0 || n == 1)
        {
          System.out.println(n);
          System.exit(0);
        }
        BigInteger[] F = new BigInteger[n+1];
        F[0] = BigInteger.ZERO;
        F[1] = BigInteger.ONE;
      //  System.out.print(F[0] + " ");
        //System.out.print(F[1] + " ");
        for(int i = 2;i <= n; i++)
        {
          F[i] = (F[i-1].add(F[i- 2]));

        }
        System.out.println(F[n] + " ");



    }
}
