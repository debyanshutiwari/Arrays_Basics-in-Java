package debyanshu;

import java.util.Arrays;

public class Arrays_in_Ascending_order {
    public static void main(String[] args) {
    int a[]={1,7,2,8,9};
    Number(a);
        System.out.println(Arrays.toString(a));
    }
    static void Number(int a[]){

        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
    }
}
