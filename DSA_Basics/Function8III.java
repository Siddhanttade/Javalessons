public class Function8III {
    public static void main(String[] args) {
        int a=10;
        int b=303;
        {//    int a=78; not possible because already intitalized

            a=78; //modification possible og ref var is reassigned to another variable
            //outer var can be used and modified in this block also
            int c=5683;
            //Block scope:values intialized in this block will remain here only
        }
        System.out.println(a);
    }
}
//anything initialized outside the block can be used inside and they can be modified also but they can't be initialized again while the things initialized inside can't be used outside