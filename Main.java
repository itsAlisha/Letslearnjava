class Main0 {
    public static void main(String[] args) {
        int [] nums=new int[5];
        try{
            System.out.println("In try 1");
            nums[10]=35;
            System.out.println("In try 2");
        }
        catch(Exception ex)
        {
            System.out.println("In catch");
        }
        System.out.println("rest of program");
    }
}
