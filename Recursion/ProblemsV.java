import java.util.ArrayList;

public class ProblemsV {
    public static void main(String[] args) {
        
        // numPad("","12");
        // System.out.println(numPadRet("", "12"));
        // System.out.println(numPadRet("", "12").size());
        // System.out.println(numPadCount("", "12"));
        // dice("", 4);
        // System.out.println(diceRet("", 4));
        diceFace("", 6, 7);
        System.out.println(diceFaceRet("", 6, 7));

    }

    //QUESTION1:LETTER COMBINATION OF A PHONE NUMBER
    public static void numPad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';     //converts char to integer 

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch=(char)('a'+i);
            numPad(p+ch,up.substring(1));
        }
    }

    //ARRAYLIST METHOD
    public static ArrayList<String> numPadRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';     //converts char to integer 
        ArrayList<String> list=new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch=(char)('a'+i);
            list.addAll(numPadRet(p+ch,up.substring(1)));
        }
        return list;
    }

    //RETURNING COUNT
    public static int numPadCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=up.charAt(0)-'0';     //converts char to integer 

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch=(char)('a'+i);
            count=count+numPadCount(p+ch,up.substring(1));
        }
        return count;
    }

    //QUESTION2:NUMBER OF DICE ROLLS WITH TARGET SUM
    public static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i<=target; i++) {
            dice(p+i,target-i);
        }
    }

    public static ArrayList<String> diceRet(String p,int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list=new ArrayList<>();

        for (int i = 1; i <= 6 && i<=target; i++) {
            list.addAll(diceRet(p+i,target-i));
        }
        return list;
    }

    //FOR DICE WITH CUSTOM FACE
    public static void diceFace(String p,int target,int face){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i<=target; i++) {
            diceFace(p+i,target-i,face);
        }
    }

    public static ArrayList<String> diceFaceRet(String p,int target,int face){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list=new ArrayList<>();

        for (int i = 1; i <= face && i<=target; i++) {
            list.addAll(diceFaceRet(p+i,target-i,face));
        }
        return list;
    }

}
