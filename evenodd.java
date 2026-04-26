import java.util.Scanner;

public class main{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(num % 2==0){
      System.out.println("Even");
    }
    else{ System.out.println("odd");
  }
  sc.close();
  
}
}


/////////////////////////////////////////////////////////////////////////


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
        sc.close();
    }
}
