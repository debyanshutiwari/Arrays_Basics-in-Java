package debyanshu;

public class Element_presemnt_or_not_in_one_dimensional {
    public static void main(String[] args) {
        int b[]={12,15,20,55,45,75,88};
        System.out.println(number(b,55));
    }
  private   static int number(int a[],int target){
        for (int i = 0; i <a.length ; i++) {
            for (int element :a){
                if(element==target){
                    return target;
                }
            }
        }
        return -1;
    }
}
