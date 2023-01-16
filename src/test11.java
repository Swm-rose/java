import javax.swing.plaf.synth.SynthTextAreaUI;

public class test11 {
    public static void  main(String[] args){
        //外循环控制行数
        for (int i=1;i<=5;i++){
            //内循环打印空格
            for (int j=i;j<=5;j++){
                System.out.print(" ");
            }
            //内循环打印*
            for (int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
                System.out.println();
        }


    }
}
