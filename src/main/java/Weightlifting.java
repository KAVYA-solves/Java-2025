import java.util.*;
import java.lang.*;
import java.io.*;

class weightlifting 
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc  =new Scanner(System.in);
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int B1 = sc.nextInt();
        int B2 = sc.nextInt();
        int C1 = sc.nextInt();
        int C2 = sc.nextInt();

        int m = Math.max(A1,A2);
        int a = Math.max(B1,B2);
        int x = Math.max(C1,C2);

        System.out.println((m+a+x));

    }
}
