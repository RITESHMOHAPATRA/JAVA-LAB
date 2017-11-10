class StatMemClassAcsVars {
     
    public static String staticVar = "You can access me!!!";
    private String privVar = "You cannot access me";
     
    public static class ChildClass{
         
        public void myMethod(){
            //you can access all static members of 
            //top level class
            System.out.println(staticVar);
            //you cannot access instance members of
            //top level class
            //below line gives compile error
            //System.out.println(privVar);
        }
    }
     
    public static void main(String a[]){
        StatMemClassAcsVars.ChildClass cc = new StatMemClassAcsVars.ChildClass();
        cc.myMethod();
    }
}