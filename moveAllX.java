public class moveAllX{
    public static void moveX(String str, int idx, int count, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char curChar = str.charAt(idx);
        if(curChar=='x'){
            count++;
            moveX(str, idx+1, count, newString);
        }else{
            newString += curChar;
            moveX(str, idx+1, count, newString);
        }
    }
    public static void main(String args[]){
        String str = "axxbxcxxd";
        moveX(str, 0, 0, "");
    }
}
