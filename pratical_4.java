/*COURSE NAME: SBCL(Skill Based Course Lab).
NAME:ZIKRA MEHZABEEN PARVEZ SAMI SHAIKH
ROLLNO: 19CO08
Practical no:04->WAP to understand arrays
Theory: Java array is an object which contains elements of similar data
type. Additionally, the elements of an array are stored in a contiguous
memory location.
*/
//E.g:searching an element in array
import java.util.*;
public class pratical_4 {
    public static void main(String[] args) {
        int n;
        int i;
        int sn;
        int check=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("size of array:");
        n=sc.nextInt();
        int arr[]=new int[n]; //declaring array
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); //storing elements in array
        }
        System.out.println("enter number"); //no to be searched
        sn=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==sn)
            {
                System.out.println(sn+"is at index"+i);
                check=1;
            }
        }
        if(check==0)
        {
            System.out.println("number not found");
        }
        sc.close();
    }
}
