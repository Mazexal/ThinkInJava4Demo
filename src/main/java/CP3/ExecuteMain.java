package CP3;

import java.util.Random;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by Mazexal on 2017/7/19.
 */
public class ExecuteMain {
    public static void main(String[] args) {
//        practise_79();
//        practise_80();
       // practise_84();
        practise_87();
    }

    //76
    public static void practise_76() {
        System.out.println("full print");
        print("simple print");
    }

    //79
    public static void practise_79() {
        Tank t1 = new Tank();
        Tank t2 = t1;
        t1.attack = 1.11f;
        System.out.println(t2.attack);
    }

    public static void practise_80() {
        Letter letter = new Letter();
        letter.f = 0.9f;
        PassObject(letter);
        System.out.println(letter.f);
    }

    public static void practise_82() {
        float speed = 1.1f;
        float distance = 200f;
        System.out.println(distance / speed);

    }

    public static void practise_84() {
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff";
        Dog dog2 = new Dog();
        dog2.name = dog1.name;
        dog2.says = dog1.says;
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
    }

    public static void practise_85()
    {
        Random random=new Random();
        System.out.println(random.nextBoolean());
    }

    public  static void practise_87(){

        long a=0x111;
        long b=0177;
        System.out.println(Long.toBinaryString(a));
        System.out.println(Long.toBinaryString(b));
    }




    public static void PassObject(Letter letter) {
        letter.f = 1.2f;
    }


}
