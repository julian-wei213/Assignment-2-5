import java.util.Scanner;

class DisplayBox{
   
    public static void dimension(int x,int y){
        
        for (int i=1;i<=y;i++){
            for(int j=1;j<=x;j++){
            System.out.print("$");
        }
            System.out.println(" ");
        }
    }
    public static void main(){ 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Display box , Please input your length");
        int a = sc.nextInt();
        System.out.println("Please input your height");
        int b = sc.nextInt();
        
        dimension(a,b);
        
    }
    
}
