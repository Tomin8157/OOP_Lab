/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author sjcet
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    int m1,m2,m3;
    Student(int a,int b,int c)
    {
        m1=a;
        m2=b;
        m3=c;
    }
    public void sum()
    {
        int s=m1+m2+m3;
        System.out.println("total: "+s);
    }
    public void percentage()
    {
       int s=m1+m2+m3;
       int p=((s/300)*100);
        System.out.println("percentage:"+p);
        
    }
    public static void main(String[] args) {
       Student s1=new Student(60,70,90);
       Student s2=new Student(50,75,85);
        s1.sum();
        s1.percentage();
        
        s2.sum();
        s2.percentage();
    }
    
}
