import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemsIV {

    //QUESTION1:FROM A GIVEN STRING SKIP THE REQUIRED CHARACTERS AND MAKE A NEW STRING 
    public static void main(String[] args) {
        // skip("", "baccad");
        // System.out.println(skip("baccad"));
        // System.out.println(skipApple("baccdapple"));
        // System.out.println(skipAppNotApple("baccdappld"));
        // subSeq("", "abc");
        // System.out.println(subSeqRet("", "abc"));

        //getting ascii val of char
        // char ch='a';
        // System.out.println(ch+0);

        //subSeqAscii("", "abc");
        //System.out.println(subSeqRetAscii("", "abc"));
        // int[] arr={1,2,3};
        // List<List<Integer>> ans=subset(arr);
        // for (List<Integer> list : ans) {
        //     System.out.println(list);
        // }    
        int[] arr={1,2,2};
        List<List<Integer>> ans=subsetDuplicate(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        } 
    }

    // //METHOD 1:TAKING 2 ARGUMENTS
    // public static void skip(String p,String up){        //taking 2 str processed and unprocessed as an arg
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }

    //     char ch=up.charAt(0);
    //     if(ch=='a'){
    //         skip(p,up.substring(1));
    //     }else{
    //         skip(p+ch,up.substring(1));
    //     }
    // }

    // //METHOD 2:TAKING STRING AS RETURN
    // public static String skip(String up){        
    //     if(up.isEmpty()){
    //         return "";
    //     }

    //     char ch=up.charAt(0);
    //     if(ch=='a'){
    //         return skip(up.substring(1));
    //     }else{
    //         return ch+skip(up.substring(1));
    //     }
    // }

    // //QUESTION2:SKIP A STRING
    // public static String skipApple(String up){       
    //     if(up.isEmpty()){
    //         return "";
    //     }

    //     if(up.startsWith("apple")){
    //         return skipApple(up.substring(5));
    //     }else{
    //         return up.charAt(0)+skipApple(up.substring(1));
    //     }
    // }

    // //QUESTION3:SKIP A STRING IF IT IS NOT THE REQUIRED ONE SKIP APP WHEN IT IS NOT EQUAL TO APPLE
    // public static String skipAppNotApple(String up){        //taking 2 str processed and unprocessed as an arg
    //     if(up.isEmpty()){
    //         return "";
    //     }

    //     if(up.startsWith("app") && !up.startsWith("apple")){
    //         return skipAppNotApple(up.substring(3));
    //     }else{
    //         return up.charAt(0)+skipAppNotApple(up.substring(1));
    //     }
    // }
    
    //QUESTION4:SUBSEQUENCE
    // public static void subSeq(String p,String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }

    //     char ch=up.charAt(0);

    //     subSeq(p+ch, up.substring(1));
    //     subSeq(p, up.substring(1));
    // }

    // //QUESTION5:RETURNING AN ARRAYLIST OF STR
    // public static ArrayList<String> subSeqRet(String p,String up){
    //     if(up.isEmpty()){
    //         ArrayList<String> list=new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }

    //     char ch=up.charAt(0);

    //     ArrayList<String> left=subSeqRet(p+ch, up.substring(1));
    //     ArrayList<String> right=subSeqRet(p, up.substring(1));
    //     left.addAll(right);
    //     return left;
    // }

    // QUESTION6:PRINT ASCII VALUE OF CHARACTER
    // public static void subSeqAscii(String p,String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }

    //     char ch=up.charAt(0);

    //     subSeqAscii(p+ch, up.substring(1));
    //     subSeqAscii(p, up.substring(1));
    //     subSeqAscii(p+(ch+0), up.substring(1));//making one more call to get the ascii val

    // }

    // //QUESTION7:ASCII VALUE IN ARRAYLIST
    // public static ArrayList<String> subSeqRetAscii(String p,String up){
    //     if(up.isEmpty()){
    //         ArrayList<String> list=new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }

    //     char ch=up.charAt(0);

    //     ArrayList<String> first=subSeqRetAscii(p+ch, up.substring(1));
    //     ArrayList<String> second=subSeqRetAscii(p, up.substring(1));
    //     ArrayList<String> third=subSeqRetAscii(p+(ch+0), up.substring(1));

    //     first.addAll(second);
    //     first.addAll(third);

    //     return first;
    // }

    //QUESTION8:ITERATIVE PROGRAM FOR SUBSEQUENCE
    // public static List<List<Integer>> subset(int[] arr){
    //     List<List<Integer>> outer=new ArrayList<>();
    //     outer.add(new ArrayList<>());

    //     for(int num:arr){
    //         int n=outer.size();
    //         for (int i = 0; i < n; i++) {
    //             List<Integer> internal=new ArrayList<>(outer.get(i));
    //             internal.add(num);
    //             outer.add(internal);
    //         }
    //     }

    //     return outer;
    // }

    //TIME COMPLEXITY FOR THE PROBLEM IS:O(N*2^N)   BECAUSE N ELE COPIED AT EVERY LEVEL AND AT EVERY LEVEL SUBSET GETS DOUBLED(2^N,N=>NO OF SUBSETS)

    //SPACE COMPLEXITY:O(2^N*N) TOTAL SUBSETS*SPACE TAKEN BY EACH SUBSET=>O(N)

    //QUESTION9:SUBSEQUENCE OF ELE WITH DUPLICATE ELE
    //when you find a duplicate ele,only add it in the newly created subset of previous step
    //this above point works only when duplicates together otherwise tough to recognize duplicates
    //soln=>sort arr

    public static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        int start=0;
        int end=0;

        for(int i=0;i<arr.length;i++){
            start=0;
            //if curr and prev ele same,s=e+1
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
