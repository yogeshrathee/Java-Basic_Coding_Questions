import java.util.*;
public class Butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();


        //1st part
        for(int i=1;i<=num;i++){
            // print star
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            //space
            for(int j =1;j<=2*(num-i);j++){
                System.out.print(" ");
            }
            //after space print star
            for(int j=i;j>=1;j--) {
                System.out.print("*");
            }


            System.out.println();
        }

        //inverted
        for(int i=num;i>=1;i--){
            // star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //space
            for(int j =1;j<=2*(num-i);j++){
                System.out.print(" ");
            }
            //after space print star
            for(int j=i;j>=1;j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


//output:-

//10
//
//
//        *                  *
//        **                **
//        ***              ***
//        ****            ****
//        *****          *****
//        ******        ******
//        *******      *******
//        ********    ********
//        *********  *********
//        ********************
//        ********************
//        *********  *********
//        ********    ********
//        *******      *******
//        ******        ******
//        *****          *****
//        ****            ****
//        ***              ***
//        **                **
//        *                  *









