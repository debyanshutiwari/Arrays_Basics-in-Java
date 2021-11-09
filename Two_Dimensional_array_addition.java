// addition of 2D array 
package debyanshu;

public class Two_Dimensional_array_addition {
    public static void main(String[] args) {
        int a[][]={
                {1,2,3},
                {4,5,6},
        };
        int a1[][]={
                {7,8,9},
                {10,11,12},
        };
        int result[][]={// for store result 
                {0,0,0},
                {0,0,0},
        };
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                result[i][j]=a[i][j]+a1[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
