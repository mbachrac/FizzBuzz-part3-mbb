package hw;

public class Main {

    public static void main(String[] args)
    {
        int number = Integer.parseInt(args[0]);
        String[] FBA = Main.fizzBuzzArray(number);
        for (int n = 0; n < FBA.length; n++)
            System.out.println(FBA[n]);
    }


    public static String[] fizzBuzzArray(final int n)
    {
        String[] FizzBuzz;
        if (n < 1)
        {
            FizzBuzz=new String[1];
            FizzBuzz[0]="Your number is not a valid array length.";
        }
        else
        {
            FizzBuzz = new String[n];
            for (int i = 1; i <= n; i++) {
                if ((i % 3 == 0) && (i % 5 == 0))
                    FizzBuzz[i - 1] = "Fizz Buzz";
                else if (i % 3 == 0)
                    FizzBuzz[i - 1] = "Fizz";
                else if (i % 5 == 0)
                    FizzBuzz[i - 1] = "Buzz";
                else
                    FizzBuzz[i - 1] = Integer.toString(i);
            }
        }
        return FizzBuzz;
    }
}