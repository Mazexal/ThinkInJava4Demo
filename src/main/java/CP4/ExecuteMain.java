package CP4;

import sun.font.TrueTypeFont;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by Mazexal on 2017/7/20.
 */
public class ExecuteMain {
    public static void main(String[] args) {

        //practise_104();
        //practise_104_2();
        //practise_104_4();
       // practise_115_1();
        practise_115_2();

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

    //Fibonacci
    public static void practise_115_1(){

        int input=10;//length
        int[] ints=new int[input];
        ints[0]=1;
        ints[1]=1;
        for(int i=2;i<10;i++){
            ints[i]=ints[i-1]+ints[i-2];
        }
        for(int i:ints){
            System.out.println(i);
        }

    }

    //吸血鬼函数
    public static void practise_115_2(){
        String[] targetNum = null;
        String[] gunNum=null;   //目标数字和枪数字（即对比数字）
        int sum = 0;   //吸血鬼数字的总个数
        int count=0;   //有效判断次数，那些乘积不是4位数的就排除了
        for (int i = 10; i < 100; i++) {
            for (int j = i+1; j < 100; j++) {   //没有哪个两位数满足ab*ab=abab（不信可以编程验证），所以这里j从i+1开始就可以了
                int i_target = i * j;
                if (i_target < 1000 || i_target > 9999)
                    continue; // 积不是4位数则跳过
                count++;
                targetNum = String.valueOf(i_target).split("");  //将其转换为一个字符串数组
                gunNum = (String.valueOf(i) + String.valueOf(j)).split("");
                java.util.Arrays.sort(targetNum);   //升序排列，因为只有排列了再比较才能保证不遗漏abcd=ba*dc这样的情况
                java.util.Arrays.sort(gunNum);
                if (java.util.Arrays.equals(targetNum, gunNum)) {
                    // 排序后比较,为真则找到一组
                    sum++;
                    System.out.println("第" + sum + "个: " +  i_target+"="+i + "*" + j);
                }
            }
        }
        System.out.println("共进行了"+count+"次判断，找到" + sum + "个吸血鬼数字。");

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
