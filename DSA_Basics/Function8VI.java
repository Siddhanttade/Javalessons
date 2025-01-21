import java.util.Arrays;

public class Function8VI {
    public static void main(String[] args) {
        fun(9);
        fun("sid");
        demo(1,2,3,4,5,5);
        demo("args","sid","sam");
        //demo(); this would give ambiguity thus no empty call could be possible
    }
    //it decides at the compile time which function to run
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
