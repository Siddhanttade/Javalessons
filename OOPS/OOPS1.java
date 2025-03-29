public class OOPS1{
    public static void main(String[] args) {
        //store 5 roll nos
        int[] numbers=new int[5];

        //store 5 names
        String[] names=new String[5];

        //data of 5 students
        int[] rno=new int[5];
        String[] name=new String[5];
        float[] marks=new float[5];

        Student[] students=new Student[5];//if we print student then it woukd give an arr containing 5 null values as the variable student is string and it initially points towards null value

        // Student Siddhant;//declaration of object
        // //System.out.println(Siddhant.rno);  this would say siddhant not initialized
        // Siddhant=new Student(); //initializing object
        Student Siddhant=new Student();
        System.out.println(Siddhant.rno);//gives 0
        System.out.println(Siddhant.marks);//gives 0.0
        System.out.println(Siddhant.name);//gives null
        //if we use the dot operator
        Siddhant.marks=90f;
        System.out.println(Siddhant.marks);//gives 90
        //Siddhant.salary=20000;this cannot be done becoz salary is not present in class 

        //Student() from the above statement is a constructor(it defines what happens when your object is created)(it is a special type of function in class that runs when you create an object and it allocates some variable) 

        Siddhant.greeting();//gives my name is Siddhant
        Siddhant.changeName("proboy");//changes name to proboy and if we cal greeting now then gives my name is proboy

        Student random=new Student(Siddhant);
        System.out.println(random.name);//gives Siddhant tade;

        Student random2=new Student();
        System.out.println(random2.name);//gives default

        Student one=new Student();
        Student two=one; //thus the changes done in one will reflect in two as well 
        one.name="play";
        System.out.println(two.name);//gives play
    }
    }
    //creation of class
    //for every single student
    class Student{
        int rno;
        String name;
        float marks;

        void greeting(){
            System.out.println("my name is"+this.name);
        }

        void changeName(String name){
            this.name=name;
        }

        //this constructor helps access  the above properties using one keyword i.e "this"
        //constructors dont have return type the return type of class is what they return
        // Student() {
        //     this.rno=13;
        //     this.name="Siddhant tade";
        //     this.marks=86f;
        // }

        //Calling a constructor from another constructor
        Student(){
            //internally:new Student(13,"default",100.0f)
            this(13,"default",100.0f);
        }

        Student(int rno,String name,float marks){
            this.rno=rno;
            this.name=name;
            this.marks=marks; //here we can use diff variables also while passing the arguments
        }

        //now if we want to create a constructor from taking value another object 
        Student(Student other){
            this.name=other.name;
            this.marks=other.marks;
            this.name=other.name;
        }

        //Why cant we use new keyword with primitive datatype?
        //in java primitive datatype arent object thus they are stored in stack unlike object stored in heap
    }