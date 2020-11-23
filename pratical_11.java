/*COURSE NAME: SBCL(Skill Based Course Lab).
NAME: ZIKRA MEHZABEEN PARVEZ SAMI SHAIKH
ROLLNO: 19CO08
Practical no:11-> WAP to implement Multi threading
Multi threading:
Multithreading is a Java feature that allows concurrent execution of two or
more parts of a program for maximum utilization of CPU. Each part of such
program is called a thread. So, threads are light-weight processes within a
process.
Threads can be created by using two mechanisms :
1. Extending the Thread class
2. Implementing the Runnable Interface
*/
class Mythread extends Thread
{
    public void run()
    {
        for(int i = 1;i<=5;i++)
        {
            System.out.print("$");
            try
            {
                sleep(1000);
            }
            catch(Exception e)
            {}
        }
    }
}
class Secondtheard extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.print("*");
            try
            {
                sleep(500);
            }
            catch(Exception e)
            {}
        }
    }
}
public class pratical_11 {
    public static void main(String[] args) {
        Mythread ob = new Mythread();
        Secondtheard ob2 = new Secondtheard();
        ob.start();
        ob2.start();
        }
}
