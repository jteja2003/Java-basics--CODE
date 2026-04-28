import java.util.Scanner;

public class main{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
    int max=a;
    if(b>max){
      max=b;
    }
    if(c>max){
      max=c;
    }
    System.out.println(max);

  }
}

////////////////////////////////////////////////////////////////////////////

   int max=Math.max(a,Math.max(b,c));
