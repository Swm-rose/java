import javax.swing.*;

public class day5 {
    public static void main(String[] args) {
        //（1）标准写法
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;       //跳过循环进入下一次循环
            }
            //System.out.println(i);
        }
        //（2）表达式1省略，但在外部声明
        int j = 0;
        for (; j < 10; j++) {
            //System.out.println(j);
        }
        //(3)表达式2可以省略，死循环(没有判断条件）
        //for (int t=0;;t++){
        //  System.out.println(t);
        //}

        //（4）
        for (int q = 0; q < 10; ) {
            //System.out.println(q);
            q++;
        }
        //(5)
        int x=0;
        for (;x<10;){
            System.out.println(x);
            x++;
        }
    }
}