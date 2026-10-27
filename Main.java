import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Java Marks: ");
        int jmarks = sc.nextInt();
        System.out.print("Enter SQL Marks: ");
        int smarks = sc.nextInt();
        System.out.print("Enter GIT Marks: ");
        int gitmarks = sc.nextInt();
        int total = jmarks + smarks + gitmarks;
        double averagemarks = total / 3.0;
        System.out.println("Total Marks: "+total);
        System.out.println("Average Marks: "+averagemarks);
        sc.close();
    }
}


//Enter Java marks: 80
//Enter SQL marks: 70
//Enter Git marks: 90
//Total Marks: 240
//Average Marks: 80.0