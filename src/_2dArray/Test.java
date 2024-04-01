package _2dArray;

import java.util.Scanner;

public class Test {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of three subjects ");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        //double p=(double) ((m1+m2+m3)/300)*100);
        double p = (((double)(m1 + m2 + m3) / 300) * 100);
        if(p>75)
            System.out.println("Grade is A");
        else
        if(p>=60&&p<=75)
            System.out.println("Grade is B");
        else
        if (p>=50&&p<=60)
            System.out.println("Grade is C");
        else
            System.out.println("Grade is E");
    }
}
