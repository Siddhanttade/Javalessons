public class OOPS3 {
    //package:they are folder in which classes are stored in hieracrchial manner
    //in java while using packages we can use different ,methods in different class because we use import statement

    //how does java look for the path of package?
    //all the methods written in public would be available for use in different packages using import
    //if everything present in same folder no need to import 

    //Static:the properties independent of object are known as static
    //we can directly use the class name to access static variable instead of using 'this' it works with 'this' keyword also
    //convention is to put class name
    //when a member is declared static it can be accessed before any of the obj of the class is being created without referring to obj
    //both function and variables can be declared as static

    //why main is declared as static?
    //because we need to run main without the creation of any obj and also main needs to run first
    //static methods and variables belong to class and not object
    //inside static we cant use non static because it belongs to object and static belong to class 
    //static member can be accessed from non static member
    //we cant acces non static stuff without referencing their instances in a static context
    //an object for non static stuff is automatically created becoz at end everything is called from main
    //'this' keyword cant be used in static 

    //inititalization of static variable
    //we can use static block to perform tasks with static var it would get executed exactly once when the class is loaded
    static int a=4;
    static int b;
    
    //runs only once when 1st obj is created and class is loaded 
    static{
        System.out.println("this is static block");
        b=a*5;
    }

    public static void main(String[] args) {
        OOPS3 obj=new OOPS3();
        System.out.println(OOPS3.a+" "+OOPS3.b);

        OOPS3.b +=3;
        System.out.println(OOPS3.a+" "+OOPS3.b);
        OOPS3 obj2=new OOPS3();
        System.out.println(OOPS3.a+" "+OOPS3.b);

    }
    //order of above prog 1st class is loaded variables are set a=4 b declared  staticblock runs

}
