import java.util.Scanner;

public class g_types_of_traingle {
    public static void main(String[] args) {
        Scanner cs =new Scanner(System.in);
        System.out.println("Enter the 1st side of a traingle:");
        int side1=cs.nextInt();
        System.out.println("Enter the 2nd side of a traingle:");
        int side2=cs.nextInt();
        System.out.println("Enter the 3rd side of a traingle:");
        int side3=cs.nextInt();
        if(side1==side2 && side2==side3)
        {
            System.out.println("It is a Eqilateral Triangle.");
        }
        else if(side1==side2 || side2==side3 ||side3==side1)
            {
                System.out.println("It is a Isosceles Triangle.");
            }
            else{
                System.out.println("It is a Scalene Triangle.");
            }
        cs.close();
        }
    }