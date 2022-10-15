import java.util.*;
class Triangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double s=(a+b+c)*(0.5);
        double area=(s*(s-a)*(s-b)*(s-c));
        area = Math.sqrt(area);
        System.out.println(String.format("%.2f",area));
    }
}