package debyanshu;

public class Reversing_a_Array_1Dimesional {
    public static void main(String[] args) {
        int a[]={1,7,8,9,5};
        number(a);
    }
    static void number(int a[]){
        for (int i = a.length-1; i>=0 ; i--) {
            System.out.print(a[i]+" ");// i will go till size

        }
    }
}
