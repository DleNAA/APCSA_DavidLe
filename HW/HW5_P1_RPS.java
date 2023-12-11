package HW;
import java.util.*;
// rock beats scissors beats paper beats rock

public class HW5_P1_RPS {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 0; i < best_of(); i++) {
            
        }
    }
    static int best_of() {
        String input = s.nextLine();
        try {
            System.out.println("How many games (1, 3, 5): ");
            int bo = Integer.parseInt(input);
            switch (bo) {
                case 1:
                    return 1;
                case 3:
                    return 3;
                case 5:
                    return 5;
                default:
                    throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Invalid # of rounds!");
        }
    
    }
}
