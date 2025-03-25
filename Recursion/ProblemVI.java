import java.util.ArrayList;
import java.util.Arrays;

public class ProblemVI {
        public static void main(String[] args) {
           //System.out.println(count(3, 3));
           //path("",3,3);
           //System.out.println(pathRet("", 3, 3));
           //System.out.println(pathRetDig("", 3, 3));
           boolean[][] board={
            {true,true,true},
            {true,true,true},
            {true,true,true}
           };
           //pathObsta("", board, 0, 0);
           //pathRest("", board, 0, 0);
           int[][] path=new int[board.length][board[0].length];
           pathPrint("", board, 0, 0, path, 1);
        }
        //MAZE
        //QUESTION1:COUNTING PATHS USING RIGHT AND DOWN ONLY
        public static int count(int r,int c){
            if(r==1 || c==1){
                return 1;
            }
            int left=count(r-1,c);
            int right=count(r,c-1);
            return left+right;
        }
        //QUESTION2:PRINTING THE PATH
        public static void path(String p,int r,int c){
            if(r==1 && c==1){
                System.out.println(p);
                return;
            }
            if(r>1){
                path(p+'D', r-1, c);
            }
            if(c>1){
                path(p+'R',r,c-1);
            }
        }
        //QUESTION3:RETURNING AN ARRAYLIST
        public static ArrayList<String> pathRet(String p,int r,int c){
            if(r==1 && c==1){
                ArrayList<String> list=new ArrayList<>();
                list.add(p);
                return list;
            }

            ArrayList<String> list=new ArrayList<>();

            if(r>1){
                list.addAll(pathRet(p+'D', r-1, c));
            }
            if(c>1){
                list.addAll(pathRet(p+'R', r, c-1));
            }
            return list;
        }

        //QUESTION4:DIAGONAL IS POSSIBLE
        public static ArrayList<String> pathRetDig(String p,int r,int c){
            if(r==1 && c==1){
                ArrayList<String> list=new ArrayList<>();
                list.add(p);
                return list;
            }

            ArrayList<String> list=new ArrayList<>();

            if(r>1){
                list.addAll(pathRetDig(p+'V', r-1, c));
            }
            if(r>1 && c>1){
                list.addAll(pathRetDig(p+'D', r-1, c-1));
            }
            if(c>1){
                list.addAll(pathRetDig(p+'H', r, c-1));
            }
            return list;
        }
        //QUESTION5:MAZE WITH OBSTACLES
        public static void pathObsta(String p,boolean maze[][],int r,int c){
            if(r==maze.length-1 && c==maze[0].length-1){
                System.out.println(p);
                return;
            }
            if(maze[r][c]==false){
                return;
            }   
            if(r<maze.length-1){
                pathObsta(p+'D',maze, r+1, c);
            }
            if(c<maze[0].length-1){
                pathObsta(p+'R',maze,r,c+1);
            }
        }

        //QUESTION5:FIND PATH FROM A TO B BUT ALL DIRECTIONS ALLOWED
        public static void pathRest(String p,boolean maze[][],int r,int c){
            if(r==maze.length-1 && c==maze[0].length-1){
                System.out.println(p);
                return;
            }
            if(maze[r][c]==false){
                return;
            }   

            //considering this block in path
            maze[r][c]=false;


            if(r<maze.length-1){
                pathRest(p+'D',maze, r+1, c);
            }
            if(c<maze[0].length-1){
                pathRest(p+'R',maze,r,c+1);
            }
            if(r>0){
                pathRest(p+'U',maze,r-1,c);
            }
            if(c>0){
                pathRest(p+'L',maze,r,c-1);
            }
            //this line is where the function will be over
            //so before function gets removed also remove the changes made by that function
            maze[r][c]=true;
        }

        // QUESTION6:PRINT MATRIX AND PATH
        public static void pathPrint(String p,boolean maze[][],int r,int c,int[][] path,int step){
            if(r==maze.length-1 && c==maze[0].length-1){
                path[r][c]=step;
                for (int[] arr : path) {
                    System.out.println(Arrays.toString(arr));
                }
                System.out.println(p);
                System.out.println();
                return;
            }
            if(maze[r][c]==false){
                return;
            }   

            //considering this block in path
            maze[r][c]=false;
            path[r][c]=step;

            if(r<maze.length-1){
                pathPrint(p+'D',maze, r+1, c,path,step+1);
            }
            if(c<maze[0].length-1){
                pathPrint(p+'R',maze,r,c+1,path,step+1);
            }
            if(r>0){
                pathPrint(p+'U',maze,r-1,c,path,step+1);
            }
            if(c>0){
                pathPrint(p+'L',maze,r,c-1,path,step+1);
            }
            //this line is where the function will be over
            //so before function gets removed also remove the changes made by that function
            maze[r][c]=true;
            path[r][c]=0;
        }

    }

