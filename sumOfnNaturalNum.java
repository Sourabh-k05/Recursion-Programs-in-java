public class sumOfnNaturalNum {
    // i = starting number, n = end num, sum = to print sum
    public static void sumNaturalNum(int i, int n, int sum){
        //BASE CASE
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        // one step taken by us
        sum += i;
        //all work done by inner recursion fun
        sumNaturalNum(i+1, n, sum);
    }
    public static void main(String args []){
        sumNaturalNum(1, 5, 0);
    }
}
