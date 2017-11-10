class StaticMemberInterfaceTest 
            implements StaticMemberInterface.StaticInterface{
 
    public void implementMe(){
        System.out.println(" implemented a static member interface");
    }
     
    public static void main(String a[]){
        StaticMemberInterfaceTest msi = new StaticMemberInterfaceTest();
        msi.implementMe();
    }
}
 
class StaticMemberInterface{
     
    public static interface StaticInterface{
        public void implementMe();
    }
}