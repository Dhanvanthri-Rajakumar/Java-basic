public class lineaar {
    static int linearseaarch(int[] arr,int target){
        if(arr.length<=0){
            return -1;
        }
        for (int intex = 0 ;intex < arr.length; intex++ ){
            int element = arr[intex];
            if(target == element){
                return intex;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] num = { 1 , 34, 56 , 78, 98, 90,56 };
        int target = 90;
        int ans = linearseaarch(num , target);
        System.out.println(ans);

    }
}
