// value is present or not in array
package debyanshu;

import java.util.Scanner;

public class Number_is_present_or_not {
    public static void main(String[] args) {
        int a[]={4,5,7,8,9};
        System.out.println(number(a));
    }
    static boolean number(int a[]){
        int b=4;// here what value we want to check
        for(int num:a){
            if(b==num){
                System.out.println("Value is Present ");
                return  true;
            }

        }
        System.out.println("Value is not Present");
        return false;
    }
}

