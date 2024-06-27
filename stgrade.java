
import java.util.Scanner;
public class stgrade {
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the mark of subject 1:");
    int s1= sc.nextInt();

    System.out.println("enter the mark of subject 2:");
    int s2= sc.nextInt();
    
    System.out.println("enter the mark of subject 3:");
    int s3= sc.nextInt();
    
    System.out.println("enter the mark of subject 4:");
    int s4= sc.nextInt();
    
    System.out.println("enter the mark of subject 5:");
    int s5= sc.nextInt();
     
    int total;
    total=s1+s2+s3+s4+s5;
    System.out.println("Total:"+ total);
    int average;
    average =total/5;
    System.out.println("Average:"+average);
    double avgpercentage;
    avgpercentage=(total/500.0)*100;
    System.out.println("Average percentage:" +avgpercentage + "%") ;
    
 if (avgpercentage>=90)
{
        System.out.println("Grade:A");
}
else if (avgpercentage>=80)
{
    System.out.println("Grade:B");
}

else if (avgpercentage>=70)
{
    System.out.println("Grade:C");
}

else if (avgpercentage>=60)
{
    System.out.println("Grade:D");
}

else if (avgpercentage>=50)
{
    System.out.println("Grade:E");
}
else
 {
    System.out.println("Grade:Fail");
}
    }
}
