class AutoboxingWidening{  
  static void m(int i){System.out.println("int");}  
  static void m(Integer i){System.out.println("Integer");}  
  
  public static void main(String args[]){  
   short s=30;  
   m(s);  
   m(new Integer(30));
 }   
}  