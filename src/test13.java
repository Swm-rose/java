import java.util.Scanner;
public class test13 {
    public  static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要打印的行数：");
        int num = input.nextInt();
        //在调用参数时传入的参数，称为实参
        printStar(num);
    }
    /**
     带参数的方法
     形参：在方法定义时的参数称为形参

     这里是把num这个参数的值赋值给line
     */
    public static void printStar(int line){
        //外循环控制行数
        for(int i=1;i<line;i++){
            //内循环控制列数
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
