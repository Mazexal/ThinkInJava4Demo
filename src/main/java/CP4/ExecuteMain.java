package CP4;

import java.util.Random;

/**
 * Created by Mazexal on 2017/7/20.
 */
public class ExecuteMain {
    public static void main(String[] args) {

        //practise_104();
        practise_104_2();
    }

    public static void practise_104() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void practise_104_2() {
        int temp = 0;
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            int re = random.nextInt(100);
            if(re>temp){
                System.out.println(re +" 大于 " +temp);
            }else if(re==temp){
                System.out.println(re +" 等于 " +temp);
            }else{
                System.out.println(re +" 小于 " +temp);
            }
            temp = re;
        }
    }


}
