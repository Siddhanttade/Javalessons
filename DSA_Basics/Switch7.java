import java.util.*;
public class Switch7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // String fruit=in.next();

        // switch(fruit){
        //     case "mango":
        //     System.out.println("king");
        //     break;
        //     case "apple":
        //     System.out.println("red");
        //     break;
        //     case "grape":
        //     System.out.println("round");
        //     break;
        //     case "orange":
        //     System.out.println("sour");
        //     default:
        //     System.out.println("invalid fruit");
        // }
        // //enhanced sitch case
        // switch(fruit){
        //     case "banana"->System.out.println("long");
        //     case "cherry"->System.out.println("sweet");
        //     default ->System.out.println("invalid");
        // }

        // int day=in.nextInt();
        // //enhanced
        // switch(day){
        //     case 1,2,3,4,5->System.out.println("weekday");
        //     case 6,7->System.out.println("weekend");
        // }
        // //traditional
        // switch(day){
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:{
        //         System.out.println("weekday");
        //     break;}
        //     case 6:
        //     case 7:{System.out.println("weekend");
        //     break;}
        // }

        //Nested switch case
        int empId=in.nextInt();
        String department=in.next();

        switch(empId){
            case 1->System.out.println("siddhant");
            case 2->System.out.println("madan");
            case 3->{
                System.out.println("emp 3 Rahul");
                switch(department){
                    case "IT"->System.out.println("IT dept");
                    case "Mech"->System.out.println("mech dept");
                    default->System.out.println("proper dept needed");
                }
        }
        default->System.out.println("invalid credentials");

    }
    }
}
