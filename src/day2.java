import java.security.AlgorithmConstraints;
import  java.util.Scanner;
public class day2 {
    public static void main (String [] args){
        System.out.println("请输入一个成绩:");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
            //String 不是基本类型
        String s = score>=60?"及格":"挂科";
        System.out.println(s);
    }
}