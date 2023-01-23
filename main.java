import java.util.Scanner;
public class main{
    private Player p1;
    private Player p2;
    public static void main(String[]args){

    int [][] board = {{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0}};

    
        for(int[]b:board){
            for(int a:b){
                System.out.print(a+" ");

            }
            System.out.println();
        }


    

Scanner sc = new Scanner(System.in);
System.out.println("What is player1's name?: ");
String name = sc.nextLine();
Player p1 = new Player(name);

System.out.println("What is player2's name?: ");
String name2 = sc.nextLine();
Player p2 = new Player(name2);
    }
}
