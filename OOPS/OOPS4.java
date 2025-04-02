public class OOPS4 {
    static class test{  //this test class cant be non staic otherwise it would be dependent on the outer class if it is present outside the class then no prob
        //here it is independent of the objects of OOPS4 but it can have relevance to main
        //static stuff are resolved at run time becoz they are independent of obj
        String name;
        public test(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        test a=new test("sid");
        test b=new test("bro");

        System.out.println(a.name);
        System.out.println(b.name);
    }
    //this would give output as
    //sid 
    //bro
    //if 
    // class test{
    //     String name;
    //     public test(String name){
    //         this.name=name;
    //     }
    // } this was present outside the class
    //output
    //bro
    //bro
}
