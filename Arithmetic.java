import java.io.*;

class Arithmetic
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Arithmetic Operators");
        System.out.println("--------------------");

        System.out.println("Enter the first number");
        String s1 = br.readLine();
        int a = Integer.parseInt(s1);

        System.out.println("Enter the second number");
        String s2 = br.readLine();
        int b = Integer.parseInt(s2);

        System.out.println("Report");

        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + (a / b));
        System.out.println("Modulus : " + (a % b));
    }
}