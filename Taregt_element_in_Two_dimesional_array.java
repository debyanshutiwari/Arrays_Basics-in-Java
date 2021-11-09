package debyanshu;

public class Taregt_element_in_Two_dimesional_array {
    public static void main(String[] args) {
        int a[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.println(number(a,3));

    }
    static int  number(int a[][],int target){
        for (int Row = 0; Row <a.length ; Row++) {
            for (int Column = 0;  Column <a.length ;  Column++) {
                if(a[Row][ Column]==target) {
                    return a[Row][ Column];

                }
            }
        }
        return -1;
    }

}
