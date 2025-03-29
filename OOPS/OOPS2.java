// public class OOPS2 {
//     public static void main(String[] args) {
//         //int a=10;
//         //in the methods be;low it is being created as an object
//         //which is a wrapper class
//         // Integer num=new Integer(45);
//         // Integer num=45;

//         //here we are passing a reference variable but still it wont swap becoz Integer wrapper class is Final class
//         //Final=> it prevents the content to be modified only if the instance variables are primitive,these variables cant be used directly they need to be initialized when declared,if instance var of reference datatype has final behind it then it would refer to same object but the value of object can be changed
//         //syntax
//         //final int INCREASE=2;
//         //e.g of above theory
//         final Student Siddhant=new Student();
//         //Siddhant.name="new"; value can be changed this is true
//         //Siddhant=new Student("new"); but it cant be reassigned so this isnt possible
//          Integer a=10;
//          Integer b=20;

//          swap(a, b);
//          System.out.println(a+" "+b);

//         // final A sid=new A("sid boy");
//          //sid.name="player";possible
//          //sid=new A("player"); not possible

//          A obj;

//          //here obj would be pointing to diff refrences everytime and garbage collection would be done
//         //  for (int i = 0; i < 1000000; i++) {
//         //     obj=new A("random name");
//         //  }
//     }

//     public static void swap(Integer a,Integer b){
//         int temp=a;
//         a=b;
//         b=temp;
//     }

//     class A{
//         final int nu=10;
//         String name;

//         public A(String name){
//             this.name=name;
//         }
//         @Override
//         protected void finalize() throws Throwable {
//             // TODO Auto-generated method stub
//             System.out.println("obj dest");        
//         }
//     }
//     //in java garbage collection is automatic but to handle it some provision are present that  you can tell java what to do when obj is being destroy but you cant manually do garbage collection
// }
