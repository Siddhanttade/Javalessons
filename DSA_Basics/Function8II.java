import java.util.Arrays;

public class Function8II {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name="sid";
        changeName(name);
        System.out.println(name);
        // greet(name);
        swap(a, b);
        int[] arr={1,2,3,4,5,6};
        changeVal(arr);
        System.out.println(Arrays.toString(arr));
    }

    // public static void greet(String naam){
    //     System.out.println(naam);
    // }
    
    public static void changeName(String naam){
        naam="sid"; //object is not being changed a new object is being created
    }

    public static void swap(int a,int b){
        int temp=a; //no swapping because value of copies is being changed
        a=b;
        b=temp;
    }

    public static void changeVal(int[] num){
        num[0]=99;
    }


}
