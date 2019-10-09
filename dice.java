import java.util.Scanner;

class dice {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        String y = "y";

        while(y.equals("y")){

        System.out.println("How many dice do you want to roll");
        int total = sc.nextInt();
        System.out.println("How many sides do you want on your dice");
        int sides = sc.nextInt();
        
        for(int x = 1; x <= total; x++){

            int a = roll(sides);
            sum = sum + a;
            System.out.print(a + ",");
            System.out.println(" ");
        }    
       System.out.println("Your sum is " + sum);

       System.out.print("Again? [y/n] ");

       y = sc.next();
    }
    System.out.println("Bye");
    }
    
    public static int roll(int n){
        return (int)(Math.random()*n+1);
    }
}
