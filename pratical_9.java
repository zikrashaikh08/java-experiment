/*COURSE NAME: SBCL(Skill Based Course Lab).
NAME: ZIKRA MEHZABEEN PARVEZ SAMI SHAIKH
ROLLNO: 19CO08
Practical no:09-> WAP to implement method overriding
Thoeory:
Method Overriding:
When a child class inherits method from parent class and modifies it then
it is callled as Method Overridng.
Note:
1.The method must have the same name as in the parent class
2.The method must have the same parameter as in the parent class
3.While overriding any method from parent,child class can give same
access specifier or strong access specifier but not weak one.
*/
class Student
{
    String name="Roy";
    int marks=80;
}
class Result extends Student
{
    public void result()
    {
        if(marks>32)
            System.out.println("Student Result:\n"+name+"has passed exam with"+marks+" marks");
    }
}
class Second_Result extends Result{
    public void result(){
        if (marks>70)
            System.out.println("Student Result:\n"+name+" has passed exam with"+marks+" marks");

        System.out.println("Congratulations");
    }
}
public class pratical_9 {
    public static void main(String[] args) {
        Second_Result ob = new Second_Result();
        ob.result();
    }
}
