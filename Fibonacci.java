import java.util.Scanner;       //Fibonacci Series
public class Demodowhile
{
public static void main(String A[])
{
int num1,num2,num3,range,i;
Scanner sc=new Scanner(System.in);
range=sc.nextInt();
System.out.println("0");
System.out.println("1");
num1=0;num2=1;i=0;
while(i+2<range)
{
num3=num1+num2;
System.out.println(num3);
num1=num2;
num2=num3;
i++;
}
}
}