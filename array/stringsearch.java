public class stringsearch {
    public static void main(String[] args) {
        String name = "Dhan";
        char target = 'n';
        boolean ans = stringsearch1(name,target);
        System.out.println(ans);
    }
    static boolean  stringsearch1(String na , char ch){
        if(na.length() <= 0){
            return false;
        }
        for (int i = 0; i < na.length(); i++) {
            if(na.charAt(i)==ch){
                return true ;
            }
        }
        return false;

    }
}
