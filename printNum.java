public class printNum {
    public static void printNumber(int n){
        //BASE CASE / BASE CONDITION
        if(n==0){
            return;
        }
        //One step taken by us that is to print n
        System.out.println(n);

        //recursion ... ab saara kaam inner fun krega
        printNumber(n-1);
    }
    public static void main(String[] args){
        int n = 5;
        printNumber(n);
    }
}

// to print this numbers in 1 to 5 ke order me to BASE CASE me n==6 krna hai aur recursion call me n+1 krna bs.