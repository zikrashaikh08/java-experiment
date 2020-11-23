/*COURSE NAME: SBCL(Skill Based Course Lab).
NAME:   ZIKRA MEHZABEEN PARVEZ SAMI SHAIKH
ROLLNO: 19CO08
Practical no:08-> WAP to implement Inheritance.
Thoeory:
Inheritance: When 1 or more child class inherits the properties of parent
class using extends keyword it is called as inheritance.
Types:
1.Single Inheritance
2.Multi level Inheritance
3.Hierarchical Inheritance
4.Multiple Inheritance(Not in java because of Deadly Diamond Of Death
Problem).
5.Hybrid
*/
class Employee
{
    public String name= "John";
    public double salary=40000;
    public double bonus=10000;
    void display()
    {
        System.out.println("Employee Details:\nName:"+name+" \nSalary:"+salary+" \nBonus: "+bonus);
    }
}
class Total extends Employee
{
    void income()
    {
        System.out.println("Total income of "+name+" is "+(salary+bonus));
    }
}
public class pratical_8 {
    public static void main(String[] args) {
        Total ob = new Total();
        ob.display();
        ob.income();
    }
}
