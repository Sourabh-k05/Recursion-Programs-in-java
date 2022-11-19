//Iss program ka main purpose ye hai ki jb variable memory me store hoga to stack ki height logn hogi.
public class printXpowerNpart2 {
    public static int calcPow(int x, int n){
        //BASE CASE 1
        if(n==0){
            return 1;
        }
        //BASE CASE 2
        if(x==0){
            return 0;
        }
        //if n even
        if(n%2==0){
            return calcPow(x, n/2)*calcPow(x, n/2);
        }else{ //n is odd
            return calcPow(x, n/2)*calcPow(x, n/2)*x;
        }
    }
    public static void main(String args[]){
        int x = 2;
        int n = 5;
        
        int ans = calcPow(x, n);
        System.out.println(ans);

    }
}