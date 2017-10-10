import java.util.Scanner;

/**
 * Created by golov on 10.10.2017.
 */
public class Asterisk {
    public static void main(String[] args) {
        System.out.print("Скільки рядків має мати піраміда? ");
        Scanner rowInut = new Scanner(System.in);
        int i,j,row;
        row = rowInut.nextInt();


//Рішення знайшов, але не до кінця розібрався як воно працює)))
        for(i=0;i<row;i++)
        {
            for(j=1; j<=row-i; j++)
                System.out.print(" ");
            for(j=1; j<=2*i-1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
