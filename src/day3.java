import java.util.Scanner;
public class day3 {
    public static void  main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个成绩");
        int score = input.nextInt();
        if (score>90) {
            System.out.println("A");
        }else if (score<90 && score>=80){
            System.out.println("B");
        }else if (score<80 && score>=70){
            System.out.println("C");
        }else if (score<70){
            System.out.println("E");
        }
    }
}
