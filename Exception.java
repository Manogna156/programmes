import java.io.*;
class Exception
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int a,b,c;
System.out.println("Enter a number");
a=Integer.parseInt(br.readLine());
System.out.println("Enter a number");
b=Integer.parseInt(br.readLine());
}
try
c=a/b;
catch(ArithmeticException E)
{
do
{
System.out.println(E.getMessage());
System.out.println("Enter a number");
b=Integer.parseInt(args[1]);
}while(b==0);
c=a/b;
}
System.out.println("Quotient:"+c);
}
}