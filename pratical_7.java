/*COURSE NAME: SBCL(Skill Based Course Lab).
NAME: ZIKRA MEHZABEEN PARVEZ SAMI SHAIKH
ROLLNO: 19CO08
Practical no:07-> WAP to implement constructor.
Thoeory:
Constructor:
A constructor is a special type of method which does not have return type
and it is used to instantitate objects. Its name is exactly same as that of
class.
Types:
1.Default
2.Parameterized
3.Copy
->If there is no constructor in a class, compiler automatically creates a
default constructor.
*/
class Cons{
    Cons() //default constructor
    {
    System.out.println("This is my constructor");
    }
    void m1() //All other methods should be after constructor
    {
    System.out.println("I am in m1 method");
    }
}
class Cons2{
    Cons2(int i) //parameterized constructor
    {
        System.out.println("value of i : "+i);
    }
}
public class pratical_7 {
    public static void main(String[] args) {
        Cons ob=new Cons();
        Cons2 obj=new Cons2(5);
        ob.m1();
    }
}
