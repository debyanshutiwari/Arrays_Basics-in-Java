// printing String in form of array
package debyanshu;

public class String_printing {
    public static void main(String[] args) {

     String a[]={"Debyanshu","Tiwari","From","Uttar Pradesh"};
     string(a);
    }
    static void string(String arr[]){
        for (String a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
