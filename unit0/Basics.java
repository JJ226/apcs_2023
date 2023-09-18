public class Basics
{
    public static void main(String[] args)
    {
        for (int i=0; i<10; i++)
        {
            if (i%2 == 0)
                System.out.println("even");
            else if (i == 7)
                System.out.println ("lucky");
            else
                System.out.println(i);
        }
    }
}