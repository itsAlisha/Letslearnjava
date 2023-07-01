class OwnException {
    public static void main(String[] args) {
        try
        {
            throw new myException(55);  //khud ki exception create ki --    1)
        }
        catch(Exception e)
        {
            System.out.println(e);   //catch calls function toString created
        }
    }
}
class myException extends Exception  //inherited class of our own created exception
{
    int a;
    myException(int c)  //constructor called from --   1)
    {
        a=c;
    }
    public String toString()
    {
        return("Exception number = "+a);
    }
}
