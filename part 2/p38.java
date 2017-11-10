class Test
{
    // Instance variable or member variable
    private int value = 10; 
 
    void method()
    {
        // This local variable hides instance variable
        int value = 40;
 
        System.out.println("Value of Instance variable using this :"
                            + this.value);
        System.out.println("Value of Local variable :"
                            + value);
    }
}
 
class InstanceVariableHiding
{
    public static void main(String args[])
    {
        Test obj1 = new Test();
        obj1.method();
    }
}