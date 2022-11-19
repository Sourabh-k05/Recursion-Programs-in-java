public class towerOfHanoi {
    public static void Hanoi(int n, String src, String helper, String desti){
        //BASE CASE
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+desti);
            return;
        }
        //Kaam
        Hanoi(n-1, src, desti, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+desti);
        Hanoi(n-1, helper, src, desti);
    }
    public static void main(String args[]){
        int n = 3;
        Hanoi(n, "Source", "Helper", "Destination");
    }
}
