// calcuationg sum of float of array
package debyanshu;

public class Caclute_sum_of_array_of_float {
    public static void main(String[] args) {
        float a[]={12.5f,45.5f,45,54.45f,152.0f};
        number(a);
    }
    static void number(float a[]){
        int sum=0;
        for(float b:a){
            sum+=b;
        }
        System.out.println(sum);
    }
}
