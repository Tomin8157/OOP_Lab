/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sjcet
 */
public class employee {

    /**
     * @param args the command line arguments
     */
    int empid;String empname; int salary; float TS;
   employee(int a,String b,int c)
   {
       empid = a;
       empname=b;
       salary=c;
   }
       public void salary() {
         TS= salary+((salary*20)/100);
        System.out.println("id:"+empid);
        System.out.println("Name:"+empname);
        System.out.println("total salary is:"+TS);
           
           
    
}
    public static void main(String[] args) {
        employee s1=new employee(143,"Tomin",100000);
        employee s2=new employee(146,"Anandhu",200000);
        s1.salary();
        
        s2.salary();
        
      
    }
    
}
