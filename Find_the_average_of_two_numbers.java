import java.util.*;
class Average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=(a+b)/2.0;
        System.out.println(String.format("%.4f",c));
    }
}