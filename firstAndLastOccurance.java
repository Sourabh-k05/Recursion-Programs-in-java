public class firstAndLastOccurance {
    public static int First = -1;
    public static int Last = -1;

    public static void findOccurance(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(First);
            System.out.println(Last);
            return;
        }

        char curChar = str.charAt(idx);
        if(curChar == element){
            if(First == -1){
                First = idx;
            }
            else{
                Last = idx;
            }
        }

        findOccurance(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaab";
        findOccurance(str, 0, 'b');
    }
}
