
//     -----------Name:- Rajeev Chaudhary --------Univ. Roll No:- 2215001417 ----------

import java.util.Scanner;

public class table {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
