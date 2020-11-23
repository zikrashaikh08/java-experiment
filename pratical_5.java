/*COURSE NAME: SBCL(Skill Based Course Lab).
NAME: ZIKRA MEHZABEEN PARVEZ SAMI SHAIKH
ROLLNO: 19CO08
Practical no:05-> WAP to understand creation of classes and
methods.
Thoeory:
Class: A Class in Java is simply a template that defines the attribute and
behaviour that objects constructed from it can exhibit.
Method:It is a collection of statements that are grouped together to
perform an operation.
*/
import java.util.*;
public class pratical_5 {
    void add(int a,int b) //method with 2 parameters and void return type
    {
        int res=a+b;
        System.out.println("Addition of "+a+"and"+b+" is "+res);
    }
    void substract(int a,int b)
    {
        int res=a-b;
        System.out.println("Substraction of "+a+" and "+b+" is "+res);
    }
    int multiplication(int a,int b) //e.g of method with int return type
    {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        pratical_5 ob=new pratical_5(); //creating object
        ob.add(a,b); //calling method
        ob.substract(a,b);
        int multi=ob.multiplication(a,b);
        System.out.println("Multiplication of "+a+" and "+b+" is "+multi);
        sc.close();
    }
}
