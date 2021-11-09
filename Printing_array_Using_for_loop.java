package debyanshu;

public class Printing_array {
    public static void main(String[] args) {
        int a[]={1,7,8,3,5,7};
        number(a);
    }
    static void number(int a[]){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
