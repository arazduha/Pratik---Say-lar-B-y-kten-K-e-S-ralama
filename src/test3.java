import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
            int s1,s2,s3;
             Scanner input = new Scanner(System.in);
                System.out.print("1.sayiyi giriniz: ");
                s1 = input.nextInt();

                System.out.print("2.sayiyi giriniz: ");
                s2 = input.nextInt();

                System.out.print("3.sayiyi giriniz: ");
                s3 = input.nextInt();
                System.out.println("kucukten buyuge siralama");
                // abc acb bac bca cab cba
                 if ((s1<s2) && (s2<s3)){
                     System.out.println("a < b < c");
                 } else if ((s1<s3) && (s3<s2)) {
                     System.out.println("a < c < b");
                 } else if ((s2<s1) && (s1<s3)) {
                     System.out.println("b < a < c");
                 } else if ((s2<s3) && (s3<s1)) {
                     System.out.println("b < c < a");
                 } else if ((s3<s1) && (s1<s2)) {
                     System.out.println("c < a < b");
                 } else if ((s3<s2) && (s2<s1)) {
                     System.out.println("c < b < a");
                 }
    }
}



