public class Function8IV {
    static int x=90; //this will be shadowed at line 5
    public static void main(String[] args) {
        System.out.println(x); //90
        int x;   //the class variable at line 2 would be shadowed by this var
        // System.out.println(x); scope begins only when value is intialized
        x=40;
        System.out.println(x);//40 this value woukd be shadowing the value which we have earlier
        fun();//90
    }

    public static void fun(){
        System.out.println(x);
    }
}
