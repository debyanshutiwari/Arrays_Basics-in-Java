package debyanshu;

public class Maximum_value_in_Array {
    public static void main(String[] args) {
        int a[]={45,21,45,85,75,100,101010};
        System.out.println(max(a));
    }
    static int max(int a[]){
        int max=a[0];
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>a[0]){
                max=a[i];
            }
        }
        return max;
    }
}
