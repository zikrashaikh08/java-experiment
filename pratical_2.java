/*COURSE NAME: SBCL(Skill Based Course Lab).
NAME: ZIKRA MEHZABEEN PARVEZ SAMI SHAIKH
ROLLNO: 19CO08
*/
/* Practical no:02->WAP to understand implementation of loops
Theory: Loops are used to execute a set of statements repeatedly until a
particular condition is satisfied. In Java we have three types of basic loops:
for, while and do-while.
*/
//e.g:To check whether the entered no is Armstrong or not
import java.util.*;

public class pratical_2 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp;
        int rem;
        int sum=0;
        temp=n;
        while(n!=0)
            {
                rem=n%10;
                sum=sum+rem*rem*rem;
                n=n/10;
            }
            if(sum==temp)
            {
                System.out.println(+temp+ " is an Armstrong number");
            }
            else
            {
                System.out.println(+temp+ " is not an Armstrong number");
            }
        sc.close();
    }   
}

