package CP2;

/**
 * Created by Mazexal on 2017/7/19.
 */
public class ExecuteMain {

    public static void main(String[] args) {
        practise1();
        practise2();
        practise3();
        practise4();
        practise5();
        practise6();
        practise7();
        practise8();
        practise9();

    }



    //Page 37
    public static void practise1()
    {
        classInit classInit = new classInit();
        System.out.println("a:");
        System.out.print(classInit.a);
        System.out.println();
        System.out.println("b:");
        System.out.print(classInit.b);
    }


    public static void practise2()
    {
        System.out.println("Hello World");
    }


    public  static void practise3()
    {
        ATypeName aTypeName=new ATypeName();
    }

    public static void practise4()
    {
        DataOnly dataOnly=new DataOnly();
        System.out.println(dataOnly.b);
        System.out.println(dataOnly.d);
        System.out.println(dataOnly.i);
    }

    private static void practise5() {
        DataOnly dataOnly=new DataOnly();
        System.out.println(dataOnly.b);
        System.out.println(dataOnly.d);
        System.out.println(dataOnly.i);
    }


    private static void practise6() {
       DataOnly dataOnly=new DataOnly();
       dataOnly.storage("223");
    }


    private static void practise7() {
        Incrementable incrementable=new Incrementable();
        Incrementable.increment();
    }


    private static void practise8() {
        Incrementable incrementable=new Incrementable();
        Incrementable.increment();
    }


    private static void practise9() {
        int a=new Integer(1);
    }

}
