import java.util.Scanner;

public class h{
    public static void main(String[]args){
       int a[]={1,2,3,4,5};
       System.out.println("enter the no");
       Scanner sc=new Scanner(System.in);
       int b=sc.nextInt();

        for( int i=0;i<a.length;i++){
          if(b==a[i]){
            System.out.println("its present");
            break;
          }
          if(b!=a[i]){
            System.out.println("not present");
            break;
          }
        }
}
}