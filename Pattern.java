/*
Problem
Input : An Integer  (range 1-26)
Output : print a pattern

if I/p: 1
o/p : A


I/p :2
o/p : ABA
      A A
      
      
i/p :3 
o/p: ABCBA
     AB BA
     A   A
     
     
*/




import java.util.*;

public class Pattern{

     public static void main(String []args)
     {
         
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to get the pattern ")
        int n=sc.nextInt();
        int space =-1,start=65;
        for(int i=0;i<n;i++)
        {
            get_pat(i,n,start,space);
            System.out.println();
            space=space+2;
        }
        
     }
     
     static void get_pat(int i,int n,int start,int space)
     {
         if(i==0 && n==1)
         {
             System.out.print((char)start);
             return;
         }
         
         if(i!=0 && (i-n)==0)
         {
             for(int q=0;q<space;q++)
             {
                 System.out.print(" ");
             }
             return;
         }
        
         if(n!=1)
         {
             System.out.print((char)start);
             get_pat(i,n-1,start+1,space);
             System.out.print((char)start);
         }
     }
}
