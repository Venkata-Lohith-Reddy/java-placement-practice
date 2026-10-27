
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if(marks >= 75 && marks <= 89 ){
            System.out.println("Grade B");
        }else if(marks <=74 && marks >=40){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        sc.close();
    }
}


//- Marks 90 or above → Grade A
//- Marks 75 to 89 → Grade B
//- Marks 40 to 74 → Pass
//- Marks below 40 → Fail