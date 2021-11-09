package debyanshu;

public class Array_is_sorted_or_not {
    public static void main(String[] args) {
        int a[]={1,5,44,156,175};
        System.out.println(number(a));
    }
    static boolean number(int a[]){
        for (int i = 0; i <a.length-1 ; i++) {
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }
}
