import java.util.*;

public class Problem50 {

    public static boolean canWin(int leap, int[] game) {
        
        int i = 0;
        try
        {
            for(i = 0; i < game.length; i++)
            {
                System.out.println(i);
                if(game[i+1] == 0)
                    continue;
                else if(game[i+leap] == 0){
                    i+=(leap-1);
                    continue;
                }
                else if((i != 0) && (game[i-1] == 0)){
                    i-=2;
                    continue;
                }
                else if((i >= leap) && (game[i-leap] == 0)){
                    i-=(leap+1);
                    continue;
                }
                else{
                    break;
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            return true;
        }
        if(i < game.length-1)
            return (false);
        else
            return (true);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}