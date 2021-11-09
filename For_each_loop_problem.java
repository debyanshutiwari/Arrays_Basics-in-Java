// average of physic marks
package debyanshu;

public class For_each_loop_problem {
    public static void main(String[] args) {
        int physic[]={75,57,78,80,15,88,90,99,98};
        number(physic);
    }
    static void number(int a[]){
        int sum=0;
        for(int b:a){
            sum+=b;
        }
        System.out.println(sum/a.length);
    }
}
