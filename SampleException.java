
public class SampleException {
    static void avg()
    {
        try
        {
            System.out.println("Dekhlo");
            throw new ArithmeticException("Demo dekhlo"); //zabardasti exception throw krna
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught");
        }
        System.out.println("Normal program");
    }
    public static void main(String[] args) {
        avg();
    }
}

