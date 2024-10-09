public class App {
     public static void main(String [] args){
    /*for(int number = 1; number<= 5; number++){
        for(int counter =1; counter <= 4; counter++){
            System.out.print(number);
        }
        System.out.println();
    }*/


    /*for(int number = 1; number<= 5; number++){
            for(int counter = 1; counter<= number; counter++){
                System.out.print(number);
            }
            System.out.println();
        }*/

    for(int i = 1; i<= 5; i++){
        for(int x = i; x <= 4; x++){
            System.out.print(".");
        }
        for(int x =1; x<=i; x++){
            System.out.print(i);
        }
        System.out.println();
    }
    System.out.println();

    for(int i = 1; i<= 5; i++){
        for(int x = i; x <= 4; x++){
            System.out.print(".");
        }
        System.out.print(i);
        for(int x =1; x<i; x++){
            System.out.print(".");
        }
        System.out.println();
    }
    System.out.println();
    


     }
    }




