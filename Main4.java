class Main4 {
    public static void main(String[] args) {
        int [] numer={4,8,16,32};
        int [] denom={2,0,4,4};
        for(int i=0;i<numer.length;i++)
        {
            try{
                System.out.println(numer[i]/denom[i]);
            }
            catch(ArithmeticException e)
            {
                System.out.println("You can't divide by 0");
            }
        }
    }
}
