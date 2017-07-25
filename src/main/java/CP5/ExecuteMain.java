package CP5;

/**
 * Created by Mazexal on 2017/7/20.
 */
public class ExecuteMain {

    public static void main(String[] args) {
        // practise_117_1();
        practise_123_1();

    }

    public static void practise_117_1() {
        StringInit init = new StringInit();
        System.out.println(init.a == null);
    }

    public static void practise_123_1() {
        DefaultPrint defaultPrint = new DefaultPrint();
    }


    public static void pracitise_123_2() {
        DefaultPrint2 defaultPrint = new DefaultPrint2("a");
    }

    public static void pracitise_123_3() {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
    }

    public static void practise_146() {
        Money.One.getIndex();
    }

}


