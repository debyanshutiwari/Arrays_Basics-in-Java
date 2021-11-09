package debyanshu;

import java.util.Arrays;

public class Descending_order_in_Arrays {
    public static void main(String[] args) {
        int a[]={1,7,5,7,4,5,0
        };
        Number(a);
        System.out.println(Arrays.toString(a));

    }
    static void Number(int a[]){
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]<a[j]){
                    int tem=a[i];
                    a[i]=a[j];
                    a[j]=tem;
                }
            }
        }
    }
}
