public class test9 {
    public static   void main(String[] args){
        //外循环控制行数
        for (int i=1;i<=9;i++){
            //内循环控制列数
            for (int j=1;j<=i;j++){
                System.out.print(j+"x"+i+"="+(j*i)+"\t");
            }
                System.out.println();
        }
    }
}
