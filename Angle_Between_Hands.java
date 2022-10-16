import java.util.*;
class Modulus
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[] time=a.split(":");
        int hour=Integer.parseInt(time[0]);
        int minute=Integer.parseInt(time[1]);
        double min_angle=minute*6;
        double hou_angle=(0.5)*((hour*60)+minute);
        double angle=Math.abs(hou_angle-min_angle);
        double sweety=Math.min(angle,360-angle);
        System.out.println(sweety);
    }
}