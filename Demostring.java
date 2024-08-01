class Demostringbuilder
{
public static void main(String A[])
{
StringBuilder sb=new StringBuilder("Hello world");
System.out.println(sb);
System.out.println(sb.length());
System.out.println(sb.indexOf("o"));
String s=sb.toString();
System.out.println(s);
StringBuffer str=new StringBuffer(sb);
System.out.println(str);
}
}