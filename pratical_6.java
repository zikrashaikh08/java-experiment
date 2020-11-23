/*COURSE NAME: SBCL(Skill Based Course Lab).
NAME: ZIKRA MEHZABEEN PARVEZ SAMI SHAIKH
ROLLNO: 19CO08
Practical no:06-> WAP to implement method overloading
Thoeory:
Method Overloading:
Methods of same class having same name but differing in number of
parameters or type of parameter.
Note: Return type has nothing to do with method overloading.
*/
import java.util.*;
public class pratical_6 {
    void sum(int a,int b)
    {
        System.out.println("Addition of "+a+"and"+b+" is: "+(a+b));
    }
    void sum(int a,int b,int c)
    {
        System.out.println("Addition of "+a+","+b+" and "+c+" is: "+(a+b+c));
    }
    void sum(int a,double d)
    {
        System.out.println("Addition of "+a+" and "+d+" is: "+(a+d));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter four numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d=sc.nextDouble();
        pratical_6 cal = new pratical_6();
        cal.sum(a,b);
        cal.sum(a,b,c);
        cal.sum(c,d);   
    }
}
