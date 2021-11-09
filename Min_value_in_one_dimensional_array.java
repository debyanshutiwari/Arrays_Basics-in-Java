package debyanshu;

public class Min_value_in_one_dimensional_array {
    public static void main(String[] args) {
        int a[]={45,5,-1,45,15,20};
        System.out.println(amit(a));
    }
    static int amit(int array[]){
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] < min){
                min= array[i];
            }
        }
        return min;
    }
}

