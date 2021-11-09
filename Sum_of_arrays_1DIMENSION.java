//Sum of number of arrays
package debyanshu;

public class Sum_of_arrays_1DIMENSION {
    public static void main(String[] args) {
        int a[]={1,4,5,7,8,10};
        number(a);
    }
    static void number(int a[]){
        int sum=0;
        for(int number:a){
            sum+=number;
        }
        System.out.println(sum);
    }
}
