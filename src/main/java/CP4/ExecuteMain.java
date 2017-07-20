package CP4;

import sun.font.TrueTypeFont;

import java.util.Random;

/**
 * Created by Mazexal on 2017/7/20.
 */
public class ExecuteMain {
    public static void main(String[] args) {

        //practise_104();
        //practise_104_2();
        practise_104_4();
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
            if (re > temp) {
                System.out.println(re + " 大于 " + temp);
            } else if (re == temp) {
                System.out.println(re + " 等于 " + temp);
            } else {
                System.out.println(re + " 小于 " + temp);
            }
            temp = re;
        }
    }

    public static void practise_104_3() {
        int temp = 0;
        Random random = new Random();
        while (true) {
            int re = random.nextInt(100);
            if (re > temp) {
                System.out.println(re + " 大于 " + temp);
            } else if (re == temp) {
                System.out.println(re + " 等于 " + temp);
            } else {
                System.out.println(re + " 小于 " + temp);
            }
            temp = re;
        }
    }



    public static void practise_104_4() {
        for(long i=2;i<100;i++){
            if(primeCheck(i)){
                System.out.println(i);
            }
        }
    }



    //高效素数探测 遍历只到开根号,
    public static boolean primeCheck(long input) {
        double end = Math.sqrt(new Double(input));

        if (input < 3) {
            return true;
        } else {
            for (double i = 2; i <= end; i++) {
                double res = input % i;
                if (res == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
