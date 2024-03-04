class A {    
    int a = 2;    
     int getA() {        
             return a;    
      }
}

class B {    
         int b = 5;    
         int getB() {        
              return b;    
          }
  }

class Main {    
    public static void main(String args[]) {        
                A obj = new B();        
               System.out.println(obj.getB()+1);    
                 }
        }