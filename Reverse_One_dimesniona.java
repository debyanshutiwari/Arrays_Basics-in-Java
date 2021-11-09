// Reverse 1-dimesional Arrays
package debyanshu;

public class Reverse_One_dimesniona {
    public static void main(String[] args) {
        int a[]={1,7,8,78,5454};
        number(a);
    }
    static void number(int a[]){

        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
