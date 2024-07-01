import java.util.Scanner;
class Changestring {
	//Method to replace the characters with 'x' except last 4
      String replace(String s) {
        char arr[]=new char[s.length()];
        arr=s.toCharArray();
        for(int i=0;i<arr.length-4;i++) {
        arr[i]='X';
        }
        String str=new String(arr);
        return str;
        
	}
      public static void main(String[] args) {
  		String s1;
  		Scanner sc=new Scanner(System.in);
  		System.out.println("Enter your mobile number");
          s1=sc.nextLine();
          Changestring cs=new Changestring();
          System.out.println(cs.replace(s1));
}
}

