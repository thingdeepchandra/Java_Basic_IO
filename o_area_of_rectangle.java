import java.util.Scanner;

public class o_area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of a rectangle:");
        int l=sc.nextInt();
        System.out.println("Ebter theh breadth of a rectangle:");
        int b=sc.nextInt();
        int area=l*b;
        System.out.println("The area of rectangle is ="+area);
        sc.close();
        }
    
}
