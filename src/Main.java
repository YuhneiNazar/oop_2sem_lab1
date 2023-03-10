import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("3.1\n");
        fun1();
       System.out.print("4.1\n");
        fun2();
        System.out.print("4.2\n");
      fun3();
    }

    public static void fun1 () {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter x: ");
         double x = scan.nextDouble();
       double A=4.95*pow(x,2);
       double B;
       if (x<-3.5)
       {
           B=4+pow(x,2);
        }
        else
        {
            if (x>=1)
            {
                B=sin(3)*x-cos(x);
            }
           else
            {
                B = tan((3.5+x)/5);
           }
        }
        double y = A + B;
       System.out.print("y = ");
       System.out.printf("%.2f\n",y);
    }

    public static void fun2 () {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter N: ");
        double N = scan.nextDouble();
        double i = N;
        double y=1;
        while (i<=16)
        {
            y =((i*N)/(pow(i,2)+pow(N,2)));
            i++;
        }
        System.out.print("y = ");
        System.out.printf("%.2f\n",y);
        i = N;
        y = 1;
        do
        {
            y = ((i*N)/(pow(i,2)+pow(N,2)));
            i++;

        } while (i<=16);
        System.out.print("y = ");
        System.out.printf("%.2f\n",y);

        y = 1;
        for (i =N;i<=16;i++)
        {
            y =((i*N)/(pow(i,2)+pow(N,2)));
        }
        System.out.print("y = ");
        System.out.printf("%.2f\n",y);

        y = 1;
        for (i = N; i>=16; i--)
        {
            y =((i*N)/(pow(i,2)+pow(N,2)));
        }
        System.out.print("y = ");
        System.out.printf("%.2f\n",y);
    }
    public static void fun3 () {
        Scanner scan=new Scanner(System.in);
                double x, xp, xk, dx, A, B, y;
        System.out.println("xp = ");
        xp = scan.nextDouble();
        System.out.println("xk = ");
        xk = scan.nextDouble();
        System.out.println("dx = ");
        dx = scan.nextDouble();
        System.out.println("---------------------------");
        System.out.print("|  x  |");
        System.out.println("     y   |");
        System.out.println("---------------------------");
        x = xp;
        while (x <= xk)
        {
            A = 4.95*pow(x,2);
            if (x<-3.5)
                B=4+pow(x,2);
            else
                if (x>=1)
                    B=sin(3)*x-cos(x);
            else B = tan((3.5+x)/5);
            y = A + B;
            y=round(y);
            System.out.println("|"+x+"|"+"    "+y+"|");
            x += dx;
        }
        System.out.println("---------------------------" );
    }
}