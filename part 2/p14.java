class BasicStaticMemberClass {
 
    public static class StaticMemberExampleClass {
 
        public void printStatus() {
            System.out.println("Inside static member class");
        }
    }
 
    public static void main(String a[]) {
        StaticMemberTestClass smt = new StaticMemberTestClass();
        smt.testMemberClass();
    }
}

class StaticMemberTestClass {
 
    public void testMemberClass() {
        BasicStaticMemberClass.StaticMemberExampleClass msme 
                    = new BasicStaticMemberClass.StaticMemberExampleClass();
        msme.printStatus();
    }
}