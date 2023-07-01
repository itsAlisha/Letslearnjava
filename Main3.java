class Main3 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        try {
            System.out.println("In try 1");
            errorMethod(nums);
            System.out.println("In try 2");
        }
        catch(Exception e)
        {
            System.out.println("In catch");
        }
        System.out.println("Rest of Program");
    }
    public static void errorMethod(int [] nums)
    {
        nums[10]=35;
    }
}
