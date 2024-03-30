import java.io.*;  
import java.util.*;  
public class Main{  
    public static void main(String[] args)throws IOException{  
        //Fill your code here  
        List<Hall> l=new ArrayList<Hall>();  
        Hall it=new Hall();  
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the number of halls:");  
        int T=sc.nextInt();  
        sc.nextLine();  
        for(int i=0;i<T;i++)  
        {  
            String S[]=sc.nextLine().
      split(",");  
   l.add(new Hall(S[0],Double.parseDouble(S[1]),S[2]));  
        }  
        System.out.format("%-15s %-10s %s\n","Name","Cost","Owner");  
        l.stream().sorted((a,b)->a.getOwner().
compareTo
(b.getOwner())).forEach(x->System.out.format("%-15s %-10s %s\n",x.getName(),x.getCostPerDay(),x.getOwner()));  
    }      
} 