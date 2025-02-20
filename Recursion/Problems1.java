package Recursion;

public class Problems1 {

    //  QUESTION1:PRINT ALL THE NUMBERS FROM N TILL 1
    // public static void main(String[] args) {
    //     // fun(5);
    //     // funRev(5);
    //     funBoth(5);
    // }

    // public static void fun(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     fun(n-1); 
    // }

    // public static void concept(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     concept(n--); //this would give infinite loop because val of n is passed first then subtracted 
    //     concept(--n); //this would give dec order because val of n is subtracted and then passed
    // }

    // //QUESTION2: 1TO N NO PRITING
    // public static void funRev(int n){
    //     if(n==0){
    //         return;
    //     }
    //     funRev(n-1);
    //     System.out.println(n);
    // }

    // //QUESTION3: PRINT BOTH
    // public static void funBoth(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     funBoth(n-1);
    //     System.out.println(n);
    // }

    // QUESTION4:FACTORIAL
    // public static void main(String[] args) {
    //     int ans=fact(5);
    //     System.out.println(ans);
    // }

    // public static int fact(int n){
    //     if(n<=1){
    //         return 1;
    //     }
    //     return n*fact(n-1); //in the above ex we were only printing so there was no value to be returned here val is returned so it needs to be stored
    // }

    // public static int sum(int n){
    //     if(n<=1){
    //         return 1;
    //     }

    //     return n+sum(n-1);
    // }

    //QUESTION5:SUM OF DIGITS N=1342 sum=1+3+4+2
    // public static void main(String[] args) {
    //     int ans=digSum(1342);
    //     System.out.println(ans);
    // }

    // public static int digSum(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     return (n%10)+digSum(n/10);
    // }
    // //for taking product of the digits in given no
    // public static int digProd(int n){
    //     if(n%10==n){  //because if 0 is returned here we only get 0 as product 
    //         return n;
    //     }
    //     return (n%10)*digProd(n/10);
    // }

    //QUESTION6:REVERSE A NUMBER N=1842=>2481
    // static int sum=0;
    // public static void rev1(int n){
    //     if(n==0){
    //         return;
    //     }
    //     int rem=n%10;
    //     sum=sum*10+rem;
    //     rev1(n/10);
    // }

    // public static void main(String[] args) {
    //     rev1(1423);
    //     System.out.println(sum);
    //     System.out.println(rev2(1423));
    // }

    // public static int rev2(int n){
    //     //sometimes you might need some additional variables in the argument in that case make another function
    //     int digits=(int)(Math.log10(n))+1;
    //     return helper(n,digits);
    // }

    // private static int helper(int n,int digits){
    //     if(n%10==n){
    //         return n;
    //     }
    //     int rem=n%10;
    //     return rem*(int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
    // } 
//     ### **Difference Between `rev1` and `rev2`**  
// Both `rev1` and `rev2` are recursive methods to reverse a number, but they use different approaches.

// ---

// ### **1️⃣ `rev1` – Using Global Variable (`sum`)**
// 🔹 `rev1` uses a global variable (`sum`) to store the reversed number dynamically.  

// #### **Example Code for `rev1` (Not in Your Code, but Assuming)**
// ```java
// static int sum = 0;

// public static void rev1(int n) {
//     if (n == 0) {
//         return;
//     }
//     int rem = n % 10;  // Extract last digit
//     sum = sum * 10 + rem;  // Append last digit to sum
//     rev1(n / 10);  // Recursive call with remaining digits
// }
// ```

// #### **Execution for `rev1(1423)`**
// | Step | `n`   | `rem = n % 10` | `sum = sum * 10 + rem` |
// |------|-------|---------------|-------------------------|
// | 1    | 1423  | 3             | 0 * 10 + 3 = 3         |
// | 2    | 142   | 2             | 3 * 10 + 2 = 32        |
// | 3    | 14    | 4             | 32 * 10 + 4 = 324      |
// | 4    | 1     | 1             | 324 * 10 + 1 = 3241    |
// | 5    | 0     | -             | Recursion ends         |

// ✅ **Final Output:** `sum = 3241`

// ---

// ### **2️⃣ `rev2` – Using Recursive Return with `digits`**
// 🔹 `rev2` does **not** use a global variable.  
// 🔹 It calculates the **position of each digit using `digits`** and returns the reversed number.

// #### **Example Code for `rev2`**
// ```java
// public static int rev2(int n) {
//     int digits = (int) (Math.log10(n)) + 1;  // Count number of digits
//     return helper(n, digits);
// }

// private static int helper(int n, int digits) {
//     if (n % 10 == n) { // Base case: single-digit number
//         return n;
//     }
//     int rem = n % 10; // Get last digit
//     return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
// }
// ```

// #### **Execution for `rev2(1423)`**
// | Step | `n`   | `digits` | `rem = n % 10` | Computation |
// |------|-------|---------|---------------|-------------|
// | 1    | 1423  | 4       | 3             | `3 * 1000 + helper(142, 3)` |
// | 2    | 142   | 3       | 2             | `2 * 100 + helper(14, 2)`  |
// | 3    | 14    | 2       | 4             | `4 * 10 + helper(1, 1)`  |
// | 4    | 1     | 1       | 1             | **Base Case, returns 1** |

// Final Calculation:  
// ```
// 3 * 1000 + 2 * 100 + 4 * 10 + 1 = 3241
// ```
// ✅ **Final Output:** `3241`

// ---

// ### **Key Differences Between `rev1` and `rev2`**
// | Feature        | `rev1` (Global Variable) | `rev2` (Recursive Return) |
// |---------------|------------------------|---------------------------|
// | **Approach**  | Uses a global variable `sum` | Uses function return values |
// | **Mathematical Trick** | Multiplies `sum` by `10` and adds the last digit | Uses `digits` to place digits at correct positions |
// | **Extra Arguments** | No extra parameters needed | Needs `digits` count |
// | **Global State** | Uses `static int sum` | No global state, pure recursion |
// | **Mutability** | Modifies `sum` directly | Uses return values, more functional |
// | **Flexibility** | Less flexible, relies on `sum` being reset | More flexible, avoids side effects |

// ---

// ### **When to Use Which?**
// - ✅ **Use `rev1`** when modifying a global variable is acceptable and you prefer **simpler logic**.  
// - ✅ **Use `rev2`** when you want a **pure recursive function** without global variables (better for **functional programming** and thread safety).

// ---

// ### **Final Verdict**
// Both approaches **work correctly**, but `rev2` is **more structured** and avoids side effects, making it a **better recursive design**.
    
    //QUESTION8:CHECKING NUM IS PALINDROME OR NOT
    // public static void main(String[] args) {
    //     System.out.println(palin(1234321));
    // }

    // public static boolean palin(int n){
    //     return n==rev(n);
    // }

    // QUESTION9:COUNT ZEROES IN A NUM
    // public static void main(String[] args) {
    //     System.out.println(count(30210));
    // }

    // public static int count(int n){
    //     return helper(n,0);
    // }

    // //special pattern of returning the same value to above calls
    // private static int helper(int n,int c){
    //     if(n==0){
    //         return c;
    //     }
    //     int rem=n%10;
    //     if(rem==0){
    //         return helper(n/10,c+1);
    //     }
    //     return helper(n/10,c);
    // }

    //QUESTION10:COUNT THE NUM OF STEPS TO MAKE A NUM ZERO
    public static void main(String[] args) {
        System.out.println(countSteps(14));
    }

    public static int countSteps(int n){
        return helper(n,0);
    }

    private static int helper(int n,int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return helper(n/2, steps+1);
        }
        return helper(n-1, steps+1);
    }
    
}