// printing Multidimensional array

package debyanshu;

public class Multidimesnional_Array {
    public static void main(String[] args) {
    int a[][]={
            {4,5,7},
            {77,88,99},
            {17,888,900},
    };
    dimensional(a);

    }
    static void dimensional(int a[][]){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j]+" ");


            }
            System.out.println();
        }
    }


}
