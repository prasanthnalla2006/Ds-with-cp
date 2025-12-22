// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int a=4;
        
        // static d&i
        
        int[] n={1,3,5,7};
        System.out.println(n[3]);
        System.out.println(n.length);
        
        for(int i=0;i<n.length;i++){
           System.out.println(n[i]);
        }
        
        
        // using new key word 
        int[] n1= new int[]{1,3,5,7,5,7,8};
        System.out.println(n1[3]);
        System.out.println(n1.length);
        
        for(int i=0;i<n1.length;i++){
           System.out.println(n1[i]);
        }
        
        // dynamic allocation 
         int[] n2= new int[10];
         n2[0]=40;
      n2[1]=100;
      n2[n2.length-1]=900;
      
      
      for(int i=0;i<n2.length;i++){
           System.out.println(n2[i]);
        }
        
    }

}

