//输出被7整除但是不能被4整除，且小于200的所有整数

public class test6 {
    public static void main(String[] args) {
    int q=0;
    for (;q<200;q++){
        if (q%7==0 && q%4!=0)
        System.out.println(q);
    }
    }

}
