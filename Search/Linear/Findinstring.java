package Search.Linear;

public class Findinstring {
    public static void main(String[] args) {
        String name="Deepthi";
        boolean ans=find(name, 'i');
        System.out.println(ans);
    }
    static boolean find(String val,char target){
        if(val.length()==0){
            return false;
        }
        for(int i=0;i<val.length();i++){
            if(target==val.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
