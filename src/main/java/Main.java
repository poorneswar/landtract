
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author prudvi
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LandTract[] arr = new LandTract[3];
        System.out.println("enter the length of Tra1");

        int l1 = sc.nextInt();

        System.out.println("enter the width of Tra1:");
        int w1 = sc.nextInt();
        arr[0] = new LandTract(l1, w1);
        System.out.println("enter the length of Tra2:");
        int l2 = sc.nextInt();
        System.out.println("enter the width of Tract2:");
        int w2 = sc.nextInt();
        arr[1] = new LandTract(l2, w2);

        System.out.println("enter the length of Tract3:");
        int l3 = sc.nextInt();

        System.out.println("enter the width of Tract3:");
        int w3 = sc.nextInt();
        arr[2] = new LandTract(l3, w3);

        System.out.println(" LandTract 1:");
        System.out.println(arr[0].toString());
        System.out.println(" LandTract 2:");
        System.out.println(arr[1].toString());

        System.out.println(" LandTract 3:");
        System.out.println(arr[2].toString());
        boolean a1 = arr[0].equals(arr[0], arr[1]);
        boolean a2 = arr[1].equals(arr[1], arr[2]);
        boolean a3 = arr[2].equals(arr[0], arr[2]);
        if (a1 && a2 && a3) {
            System.out.print("All the three are same.");
        } else if (a1) {
            System.out.print("The 1st and 2nd tracts are same.");

        } else if (a2) {
            System.out.print("The 2nd  and 3rd tracts are same.");

        } else if (a3) {
            System.out.print("The 1st  and 3rd tracts are same.");

        }

    }
}
